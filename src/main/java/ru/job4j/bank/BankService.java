package ru.job4j.bank;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void deleteUser(String passport) {
        for (User user : users.keySet()) {
            if (user.equals(findByPassport(passport))) {
                users.remove(user);
                break;
            }
        }
    }

    public void addAccount(String passport, Account account) {
        User newUser = findByPassport(passport);
        if (newUser != null) {
            List<Account> listAccount = getAccounts(newUser);
            if (!listAccount.contains(account)) {
                listAccount.add(account);
                for (User user : users.keySet()) {
                    if (user.equals(newUser)) {
                        users.replace(user,  listAccount);
                        break;
                    }
                }
            }

        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (Objects.equals(user.getPassport(), passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        List<Account> accountList = null;
        if (user != null) {
            accountList = getAccounts(user);
            for (Account account : accountList) {
                if (Objects.equals(account.getRequisite(), requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        boolean result = false;
        User destUser = findByPassport(destinationPassport);
        List<Account> accountList = getAccounts(destUser);
        Account sourceAccount = findByRequisite(sourcePassport, sourceRequisite);
        Account destAccount = findByRequisite(destinationPassport, destinationRequisite);
        if (sourceAccount != null && sourceAccount.getBalance() >= amount && destAccount != null) {
            sourceAccount.setBalance(sourceAccount.getBalance() - amount);
            destAccount.setBalance(amount + destAccount.getBalance());
            for (Account account : accountList) {
                if (account.equals(destAccount)) {
                    accountList.remove(account);
                    accountList.add(destAccount);
                    result = true;
                    break;
                }
            }
            users.putIfAbsent(destUser, accountList);
        }
        return result;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
