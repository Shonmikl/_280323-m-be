package org.example._2023_09_08.streamHelper.ex3;

import java.util.*;
import java.util.stream.Collectors;

public class CollectAndStreamMethods {
    public static void main(String[] args) {
        // Создаем коллекцию сотрудников
        List<Employee> employees = Arrays.asList(
                new Employee("John", "Doe", 5000),
                new Employee("Alice", "Smith", 6000),
                new Employee("Bob", "Johnson", 4000),
                new Employee("Jane", "Williams", 5500),
                new Employee("Michael", "Brown", 7000)
        );

        // Пример использования Collectors.groupingBy() - группировка сотрудников по
        // диапазону заработной платы
        Map<String, List<Employee>> groupedBySalary = employees.stream()
                .collect(Collectors.groupingBy(employee -> {
                    if (employee.getSalary() < 5000) {
                        return "Low";
                    } else if (employee.getSalary() < 6000) {
                        return "Medium";
                    } else {
                        return "High";
                    }
                }));
        System.out.println("Пример использования Collectors.groupingBy():");
        for (Map.Entry<String, List<Employee>> entry : groupedBySalary.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Пример использования Collectors.mapping() - преобразование сотрудников в список их имен
        List<String> names = employees.stream().map(Employee::getFirstName).collect(Collectors.toList());
        System.out.println("\nПример использования Collectors.mapping():");
        System.out.println(names);

        // Пример использования Collectors.toSet() - преобразование сотрудников в множество
        Set<Employee> employeeSet = new HashSet<>(employees);
        System.out.println("\nПример использования Collectors.toSet():");
        System.out.println(employeeSet);
    }

    static class Employee {
        private String firstName;
        private String lastName;
        private int salary;

        public Employee(String firstName, String lastName, int salary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.salary = salary;
        }

        public String getFirstName() {
            return firstName;
        }

        public int getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + " (" + salary + ")";
        }
    }
}
