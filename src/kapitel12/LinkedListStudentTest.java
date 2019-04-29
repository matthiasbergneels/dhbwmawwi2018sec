package kapitel12;

import kapitel9.Student;

public class LinkedListStudentTest {

    public static void main(String[] args) {

        LinkedListStudent studentList = new LinkedListStudent();

        studentList.add(new Student(1234, "Gabi", "Mueller", 25));
        studentList.add(new Student(2345, "Hans", "Franz", 25));
        studentList.add(new Student(3456, "Hugo", "Franz", 25));

        System.out.println("Anzahl Studierende: " + studentList.size());

        studentList.remove(2345);
        studentList.remove(9999);

        System.out.println("Anzahl Studierende: " + studentList.size());
    }
}
