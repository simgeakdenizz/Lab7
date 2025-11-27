package lab.Lab7.Scenario1;

public class Student2 {
    String name;
    int age;
    public Student2() {
        name = "Unknown";
        age = 0;
    }
    public Student2(String n, int a) {
        name = n;
        age = a;
    }
    public void printStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
}
