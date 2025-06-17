package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс, представляющий банковский счет
 * Содержит иноформацию о реквизитах счета и его балансе.
 *
 * @author Tayirov Bakhtiyar
 */
public class Account {
    /** реквизизиты банкского счета */
    private String requisite;

    /** баланс счета */
    private double balance;

    /**
     * Конструктор для создания нового банковского счета
     * @param requisite ревизиты счета
     * @param balance баланс счета
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Возвращает реквизиты счета
     *
     * @return реквизыты счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     *  Устанавливает новые реквизиты счета
     *
     * @param requisite
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     *  Возвращает баланс счета
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Устанвливает новый баланс счета.
     *
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Сравнивает данный объект с указанным объектом на равенство.
     * Два счета считаются равными, если у них одинаковые реквизиты.
     * @param o объект для сравнения
     * @return true, если объекты равны, false в противном случае
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Возвращает хеш-код для данного объекта.
     * Хеш-код вычисляется на основе реквизитов счета
     * @return хеш-код объекта
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
