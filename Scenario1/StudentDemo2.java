package lab.Lab7.Scenario1;

public class StudentDemo2 {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.printStudentInfo();
        System.out.println("----------------");
        Student2 ss = new Student2("Ali", 20);
        ss.printStudentInfo();
    }
}

/*Why did you get an error or not in the main method?
I did not get any error. Because I defined 2 constructors. One is default, another is parameterized. Java selects the correct one automatically.
*/