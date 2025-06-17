package ru.job4j.bank;

import java.util.*;

/**
 * Класс для управления банковскими операциями
 * Предоставляет функциональность для работы с пользователями и их счетами
 * включая добавление/удаление пользователей, управление счетами и переводы между счетами
 */
public class BankService {
    /**
     * Карта пользователей и их счетов
     * Ключ - объект пользователя, значение - список его банковский счетов.
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     *  Добавляет нового пользователя в банковскую систему.
     *  Если пользователь существует, операцию игнорируется.
     *  Новому пользователю пустой список счетов.
     *
     * @param user пользователь для добавления
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Удаляет пользователя из банковской системы по номеру паспорта.
     * Удаляет также все счета пользователя
     *
     * @param passport номер паспорта пользователя для удаления
     */
    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    /**
     * Добавляет новый счет пользователя с указанным паспортом.
     * Если пользователь не найден или счет уже существует, операция игнорируется
     *
     * @param passport номер паспорта пользователя
     * @param account счет для добавления
     */
    public void addAccount(String passport, Account account) {
        User newUser = findByPassport(passport);
        if (newUser != null) {
            List<Account> listAccount = getAccounts(newUser);
            if (!listAccount.contains(account)) {
                listAccount.add(account);
            }

        }
    }

    /**
     * Находит пользователя по номеру паспорта.
     *
     * @param passport номер паспорта для поиска
     * @return объект пользователя, если найден; null в противном случае
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (Objects.equals(user.getPassport(), passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Находит банковский счет по номеру паспорта пользователя и реквизитам счета.
     *
     * @param passport номер паспорта пользователя
     * @param requisite реквизиты счета
     * @return объект счета, если найден; null в противном случае
     */
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

    /**
     * Переводит деньги между двумя банковскими счетами.
     * Операция выполняется только при выполнении всех условий:
     * - исходный счет существует и имеет достаточный баланс
     * - счет получателя существует
     *
     * @param sourcePassport номер паспорта отправителя
     * @param sourceRequisite реквизиты счета отправителя
     * @param destinationPassport номер паспорта получателя
     * @param destinationRequisite реквизиты счета получателя
     * @param amount сумма для перевода
     * @return true, если перевод выполнен успешно; false в противном случае
     */
    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        boolean result = false;
        Account sourceAccount = findByRequisite(sourcePassport, sourceRequisite);
        Account destAccount = findByRequisite(destinationPassport, destinationRequisite);
        if (sourceAccount != null && sourceAccount.getBalance() >= amount && destAccount != null) {
            sourceAccount.setBalance(sourceAccount.getBalance() - amount);
            destAccount.setBalance(amount + destAccount.getBalance());
            result = true;
        }
        return result;
    }

    /**
     * Возвращает список всех счетов указанного пользователя
     *
     * @param user пользователь чье счета нужно получить
     * @return список счетов пользователя
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
