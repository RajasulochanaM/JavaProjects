package org.example;

import com.google.gson.Gson;

public class App2 {
    public static void main(String[] args) {

            Gson gson = new Gson();

            Student student = new Student(
                    101, "Raja", "MCA"
            );

            String json = gson.toJson(student);

            System.out.println(json);
    }
}
