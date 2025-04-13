package org.example;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
//1 Задание
        public static void main(String[] args) {
            Student Ur = new Student("Юрий", "1", 2, new int[] { 5, 4, 3, 5, 5 });
            Student An = new Student("Андрей", "3", 3, new int[] { 2, 2, 2, 3, 3 });
            Student Tim = new Student("Тимофей", "2",1, new int[] { 3, 4, 3, 2, 5 });
            Student Al = new Student("Алексей", "1", 2, new int[] { 5, 4, 3, 3, 5 });
            Student Mix = new Student("Михаил", "3", 3, new int[] { 2, 5, 5, 2, 4 });
            Student Jor = new Student("Джордж", "2", 1, new int[] { 5, 5, 5, 4, 5 });
            ArrayList<Student> studentsList = new ArrayList<Student>(Arrays.asList(Ur,An,Tim,Al,Mix,Jor));

            System.out.println("Задание 1:");
            Student.deleteStudents(studentsList);
            Student.print(studentsList);
            Student.printStudents(studentsList, 3);

//2 Задание
            System.out.println("Задание 2:");
            PhoneBook book = new PhoneBook();
            book.add("Котов", "8 908 457 88 77");
            book.add("Ленин", "8 904 111 18 77");
            book.add("Медведев", "8 908 555 77 11");
            book.add("Уткин", "8 952 787 87 87");
            book.add("Котов", "8 904 122 12 12");
            book.add("Уткин", "8 908 999 99 99");
            book.add("Дроздов", "8 904 111 41 41");
            book.get("Ленин");
            book.get("Котов");
        }
    }