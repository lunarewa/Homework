package org.example;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private final HashMap<String, ArrayList<String>> items = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add(phoneNumber);
        items.put(surname, arr);
    }

    public void get(String surname) {
        System.out.println(surname);
        System.out.println(items.get(surname));
    }
}
