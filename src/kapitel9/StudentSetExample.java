package kapitel9;

import java.util.Set;
import java.util.TreeSet;

public class StudentSetExample {

    public static void main(String[] args) {
        Set<Student> students = new TreeSet<Student>();


        students.add(new Student(567283, "Klaus", "Müller", 25));
        students.add(new Student(881091, "Gabi", "Mayer", 23));
        students.add(new Student(891924, "Karl-Heinz", "Freund", 36));
        students.add(new Student(892932, "Scheremy-Paskal", "Wollny", 19));
        students.add(new Student(567283, "Tschakeline-Chicago", "Müller", 28));


        System.out.println("Anzahl Studierende: " + students.size());

        for(Student student : students){
            System.out.println(student.getStudentId() + "; " + student.getFamilyName() + ", " + student.getName());
        }
    }
}
