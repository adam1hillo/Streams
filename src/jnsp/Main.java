package jnsp;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private List<String> skills;

    public Employee(String firstName, String lastName, int age, List<String> skills) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.skills = skills;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", skills=" + skills +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        List <Employee> employees = new ArrayList<>();
        employees.add(new Employee("Adam", "Hillo", 32, List.of("Java", "Python", "JavaScript")));
        employees.add(new Employee("Joanna", "Mikuta", 31, List.of("SAP", "Excel")));
        employees.add(new Employee("Ewa", "Mikuta", 83, List.of("Gmail")));
        employees.add(new Employee("John", "Deere", 19, List.of("JavaScript", "PHP", "Angular")));


        /*employees.stream()
                .map(Employee::getFirstName)
                .forEach(System.out::println);*/

        /*employees.stream()
                .map(employee -> employee.getFirstName() + " " + employee.getLastName())
                .forEach(System.out::println);*/

        /*List<String> allSkills = employees.stream()
                .map(Employee::getSkills)
                .flatMap(list -> list.stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(allSkills);*/

        /*employees.stream()
                .filter(employee -> employee.getFirstName().startsWith("A"))
                .forEach(System.out::println);*/

        /*employees.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .forEach(System.out::println);*/

        /*employees.stream()
                .sorted(Comparator.comparing(Employee::getLastName))
                .limit(2)
                .forEach(System.out::println);*/

        Integer i = employees.stream()
                .map(Employee::getAge)
                .reduce((a, b) -> Integer.max(a, b))
                .get();

        System.out.println(i);

        /*String s = employees.stream()
                .map(Employee::getFirstName)
                .reduce((name, name2) -> name + ", " + name2)
                .get();

        System.out.println(s);*/

        /*employees.stream()
                .peek(employee -> employee.setFirstName("Adam"))
                .forEach(System.out::println);*/

    }
}
