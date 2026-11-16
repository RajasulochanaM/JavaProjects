package org.example;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {

        Student student = new Student(
                101,
                "Raja",
                "Computer Science"
        );

        Gson gson = new Gson();

        String json = gson.toJson(student);

        System.out.println("Java Object to JSON:");
        System.out.println(json);

        Student newStudent = gson.fromJson(json, Student.class);

        System.out.println("\nJSON to Java Object:");
        System.out.println("ID: " + newStudent.id);
        System.out.println("Name: " + newStudent.name);
        System.out.println("Department: " + newStudent.department);
    }
}

