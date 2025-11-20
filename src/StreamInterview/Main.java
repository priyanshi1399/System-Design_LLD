package StreamInterview;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {


        List<Employee> employees = Arrays.asList(
                new Employee("Priya", new Department("Engineering", "Chennai"), 32, 60000),
                new Employee("Amit", new Department("Finance", "Pune"), 28, 45000),
                new Employee("John", new Department("Engineering", "Delhi"), 35, 75000),
                new Employee("Sara", new Department("HR", "Mumbai"), 40, 50000),
                new Employee("Vikram", new Department("Engineering", "Chennai"), 31, 90000),
                new Employee("Anjali", new Department("Finance", "Delhi"), 42, 95000),
                new Employee("Kiran", new Department("HR", "Pune"), 25, 38000)
        );

        //print the name of employees having age >30 and department of engineering.
        List<String> emp = employees.stream().filter(e -> e.getAge() > 30)
                .filter(e -> e.getDepartment().getDepartmentName().equals("Engineering")).map(e -> e.getName())
                .collect(Collectors.toList());

        System.out.println(emp);


        //highest paid salary of each department
        Map<String,Employee> highestPaid=employees.stream()
                .collect(Collectors.groupingBy(e-> e.getDepartment().getDepartmentName(),Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary)), Optional::get)
                ));


            highestPaid.entrySet().stream().forEach(entry-> System.out.println(entry.getKey()+ "->" +entry.getValue()));


    }
}
