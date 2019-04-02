package kapitel9;

import java.util.*;

public class StudentSetExample {

    public static void main(String[] args) {
        Set<Student> students = new TreeSet<Student>();

        Student s1 = new Student(567283, "Klaus", "Müller", 25);
        Student s2 = new Student(567283, "Klaus", "Müller", 25);

        students.add(s1);
        students.add(new Student(881091, "Gabi", "Freund", 23));
        students.add(new Student(891924, "Karl-Heinz", "Freund", 36));
        students.add(new Student(892932, "Scheremy-Paskal", "Wollny", 19));
        students.add(s2);

        // == ==> .equals()
        System.out.println("s1.equals(s2): " + (s1.equals(s2)));

        System.out.println("Anzahl Studierende: " + students.size());

        System.out.println("Natürlich Ordnung: ");
        for(Student student : students){
            System.out.println(student.getStudentId() + "; " + student.getFamilyName() + ", " + student.getName());
        }


        Set<Student> students2 = new TreeSet<Student>(new CompareByNamesAndAge());
        students2.addAll(students);

        System.out.println("Zusätzlich Ordnung nach Name und Alter: ");
        for(Student student : students2){
            System.out.println(student.getStudentId() + "; " + student.getFamilyName() + ", " + student.getName());
        }


        List<Student> studentsList = new ArrayList<Student>();
        studentsList.addAll(students);

        Collections.sort(studentsList, new CompareByNamesAndAge());

        System.out.println("Liste - Zusätzlich Ordnung nach Name und Alter: ");
        for(Student student : studentsList){
            System.out.println(student.getStudentId() + "; " + student.getFamilyName() + ", " + student.getName());
        }

        Collections.sort(studentsList);
        System.out.println("Liste - natürliche Ordnung: ");
        for(Student student : studentsList){
            System.out.println(student.getStudentId() + "; " + student.getFamilyName() + ", " + student.getName());
        }





    }
}
