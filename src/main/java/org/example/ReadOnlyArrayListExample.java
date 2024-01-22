package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnlyArrayListExample {

    public static void main(String[] args) {
        List<String> originalList = new ArrayList<>();
        originalList.add("karthik");
        originalList.add("nandu");
        originalList.add("charan");

        // Making the ArrayList read-only
        List<String> readOnlyList = Collections.unmodifiableList(originalList);
        try {
            readOnlyList.add("kishore");
        } catch (UnsupportedOperationException e) {
            System.out.println("UnsupportedOperationException: Cannot modify the read-only list.");
        }
        System.out.println("Read-only list elements: " + readOnlyList);
        //but we can create a new list from the read only array list to add elements
        List<String> newList = new ArrayList<>(readOnlyList);
        newList.add("Kishore");
        System.out.println("Modified list based on read-only list: " + newList);
    }
}
