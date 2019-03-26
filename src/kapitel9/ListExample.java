package kapitel9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> students = new ArrayList<String>();

        students.add("Klaus");
        students.add("Gabi");
        students.add("Michael");


        System.out.println("Anzahl Studierende: " + students.size());


        System.out.println("Ausgabe 1");
        for(int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }


        students.add(1, "Franz");
        students.add("Michael");

        students.remove(3);

        students.remove("Michael");

        System.out.println("Ausgabe 2");
        for(String student : students) {
            System.out.println(student);
        }


        System.out.println("Ausgabe 3");
        Iterator<String> i = students.iterator();

        while(i.hasNext()) {
            String student = i.next();
            System.out.println(i.next());
        }
    }
}
