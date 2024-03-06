package student;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMinor;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMinor = age < 18;
    }

    public String getName() {
        return lastName + ", " + firstName;
    }

    public void increaseAge() {
        age++;
        isMinor = age < 18;
    }

    @Override
    public String toString() {
        String Agestatus = isMinor ? "minor" : "adult";
        return lastName + ", " + firstName + " - " + age + " - " + Agestatus;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter first name: ");
            String firstName = input.nextLine();
            System.out.print("Enter last name: ");
            String lastName = input.next();
            System.out.print("Enter age: ");
            int age = input.nextInt();
            System.out.println(); 
            
            System.out.print("Enter test case number: ");
            int testCase = input.nextInt();
            Student student = new Student(firstName, lastName, age);
            
            switch (testCase) {
                case 1 -> {          
                    System.out.println("Test Case 1: Student under 18");
                    System.out.println(student);
                }
                case 2 -> {
                    student.increaseAge();
                    System.out.println("Test Case 2: Increase age of student1");
                    System.out.println(student);
                }
                case 3 -> {
                    System.out.println("Test Case 3: Student over 18");
                    System.out.println(student);
                }
                default -> System.out.println("Invalid test case number.");
            }
            input.close();
        }
    }
}