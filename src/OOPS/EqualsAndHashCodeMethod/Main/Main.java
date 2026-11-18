package OOPS.EqualsAndHashCodeMethod.Main;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

    class Employee {

        private int id;
        private String name;

        public Employee(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) {
                return true;
            }

            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            Employee emp = (Employee) obj;

            return id == emp.id &&
                    Objects.equals(name, emp.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }

    public class Main {

        public static void main(String[] args) {

            Employee emp1 = new Employee(101, "Ravi");
            Employee emp2 = new Employee(101, "Ravi");

            System.out.println(emp1.equals(emp2));

            Set<Employee> employees = new HashSet<>();

            employees.add(emp1);
            employees.add(emp2);

            System.out.println("Set size: " + employees.size());
        }
    }
