package ru.job4j.pojo;

import java.time.LocalDate;
import java.time.Month;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("John Doe");
        student.setGroup("mit-0909");
        student.setAdmissionDate(LocalDate.of(2020, 9, 10));

        System.out.println("Student full name: " + student.getFullName() + System.lineSeparator()
        + "Group name " + student.getGroup() + System.lineSeparator()
        + "Admission Date " + student.getAdmissionDate());
    }
}
