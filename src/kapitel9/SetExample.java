package kapitel9;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        Set students = new TreeSet();

        students.add("Zeus");
        students.add("Klaus");
        students.add("Gabi");
        students.add("Michael");
        students.add("Friederike");
        students.add("Gabi");


        String text1 = "Gabi";
        String text2 = "Klaus";



        System.out.println("Anzahl Studierende: " + students.size());

        System.out.println("Ausgabe Iterator:");
        Iterator i = students.iterator();
        while(i.hasNext()){
            String student = (String)i.next();
            System.out.println(student);
        }

        students.remove("Michael");


        System.out.println("Ausgabe For-Each:");
        for(Object o : students){
            String student = (String)o;
            System.out.println(student);
        }


        System.out.println(text1.compareTo(text2));
    }
}
