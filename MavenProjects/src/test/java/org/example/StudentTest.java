package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StudentTest {

        @Test
        void testStudentName() {

            Student student = new Student(
                    101, "Raja", "MCA"
            );

            Assert.assertEquals("Raja", student.name);
        }
}


