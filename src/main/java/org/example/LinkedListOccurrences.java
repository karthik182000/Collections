package org.example;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListOccurrences {

    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("kar");
        linkedList.add("nandu");
        linkedList.add("charan");
        linkedList.add("kishore");
        linkedList.add("nandu");
        linkedList.add("kar");

        //Target element
        String targetElement = "kar";

        // Finding first and last occurrences
        int firstOccurrence = findFirstOccurrence(linkedList, targetElement);
        int lastOccurrence = findLastOccurrence(linkedList, targetElement);

        // Printing
        if (firstOccurrence != -1) {
            System.out.println("First occurrence of '" + targetElement + "' at index: " + firstOccurrence);
        } else {
            System.out.println("'" + targetElement + "' not found in the linked list.");
        }

        if (lastOccurrence != -1) {
            System.out.println("Last occurrence of '" + targetElement + "' at index: " + lastOccurrence);
        } else {
            System.out.println("'" + targetElement + "' not found in the linked list.");
        }
    }

    private static <T> int findFirstOccurrence(List<T> list, T target) {
        ListIterator<T> iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(target)) {
                return iterator.previousIndex();
            }
        }
        return -1; // Element not found
    }

    private static <T> int findLastOccurrence(List<T> list, T target) {
        ListIterator<T> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            if (iterator.previous().equals(target)) {
                return iterator.nextIndex();
            }
        }
        return -1; // Element not found
    }
}
