public class Student {
    String name;
    int rollno;

    public void introduceYourself() {
        System.out.println("Hello, my name is " + name + ". My rollno is " + rollno);
    }

    // constructors
    Student() {
        System.out.println("YAY, we got a new admission");
        name = "-";
        rollno = 1;
    }

    // parameterized constructor
    Student(String user_name, int user_rollno) {
        name = "-";
        rollno = 1;
    }
}
