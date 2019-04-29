package kapitel12;

import kapitel9.Student;

public class LinkedListStudentTest {

    public static void main(String[] args) {

        LinkedListStudent studentList = new LinkedListStudent();

        studentList.add(new Student(1234, "Gabi", "Mueller", 25));
        studentList.add(new Student(2345, "Hans", "Franz", 25));
        studentList.add(new Student(3456, "Hugo", "Franz", 25));

    }
}
