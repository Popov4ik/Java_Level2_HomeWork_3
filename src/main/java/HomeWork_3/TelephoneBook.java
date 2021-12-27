package HomeWork_3;

import java.util.*;

public class TelephoneBook {

    Map<String, List<String>> TelephoneBook = new TreeMap<>();
    List<String> TelephoneList;

    public void add(String surname, String phone) {

        if (TelephoneBook.containsKey(surname)) {
            TelephoneList.add(phone);
            TelephoneBook.put(surname, TelephoneList);
        } else {
            TelephoneList = new ArrayList<>();
            TelephoneList.add(phone);
            TelephoneBook.put(surname, TelephoneList);
        }
    }

    public void get(String surname) {
        System.out.println("Номер(а) телефонов для Фамилии " + surname + ": " + TelephoneBook.get(surname));
    }

    public void get() {
        for (Map.Entry<String, List<String>> arr : TelephoneBook.entrySet()) {
            System.out.println(arr.getKey() + ": " + arr.getValue());
        }
        System.out.println();
    }
}

