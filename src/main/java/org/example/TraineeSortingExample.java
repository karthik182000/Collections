package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Trainee {
    private String name;
    private int age;

    public Trainee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Trainee{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}

public class TraineeSortingExample {

    public static void main(String[] args) {
        List<Trainee> traineeList = new ArrayList<>();
        traineeList.add(new Trainee("karthik", 23));
        traineeList.add(new Trainee("nandu", 22));
        traineeList.add(new Trainee("charan", 24));

        // Sorting based on age using comparator
        traineeList.sort(Comparator.comparingInt(Trainee::getAge));

        // Printing the sorted list
        System.out.println("Sorted trainee list based on age:");
        traineeList.forEach(System.out::println);
    }
}

