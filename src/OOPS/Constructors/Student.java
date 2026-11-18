package OOPS.Constructors;

class Student {

        String name;
        int age;

        // No-argument constructor
        Student() {
            name = "Unknown";
            age = 0;
        }

        // Parameterized constructor
        Student(String n, int a) {
            name = n;
            age = a;
        }

        void display() {
            System.out.println(name + " " + age);
        }

        public static void main(String[] args) {

            Student s1 = new Student();
            Student s2 = new Student("Rajasulochana", 23);

            s1.display();
            s2.display();
        }
}