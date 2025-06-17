package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает пользователя банковской системы
 * @author Tayirov bakhtiyar
 * @version 1.0
 */
public class User {

    /** Номер паспорта пользователя */
    private String passport;

    /** Имя пользователя */
    private String username;

    /**
     * Конструктор для создания нового пользователя
     *
     * @param passport номер паспорта пользователя
     * @param username имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Возвращает номер паспорта пользователя
     *
     * @return номер паспорта
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Устанавливает новый номер паспорта пользователя.
     *
     * @param passport новый номер паспорта
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Возвращает имя пользователя.
     *
     * @return имя пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Устанавливает новое имя пользователя.
     *
     * @param username новое имя пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Сравнивает данный объект с указанным объектом на равенство
     * Два пользователя считаются равными, если у них одинаковые номера паспортов.
     *
     * @param o объект для сравнения
     * @return true, если объекты равны; false в противном случае
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    /**
     * Возвращает хеш-код для данного объекта.
     * Хеш-код вычисляется на основе номера паспорта пользователя.
     *
     * @return хеш-код объекта
     */
    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
