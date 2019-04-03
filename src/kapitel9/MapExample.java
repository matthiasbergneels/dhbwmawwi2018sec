package kapitel9;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();

        Student s1 = new Student(567283, "Klaus", "Müller", 25);
        Student s2 = new Student(732839, "Gabi", "Mayer", 28);

        studentMap.put(s1.getStudentId(), s1);
        studentMap.put(s2.getStudentId(), s2);
        studentMap.put(89382, new Student(89382, "Hans", "Friedrich", 32));


        System.out.println(studentMap.get(567283).getStudentId());

        System.out.println(studentMap.size());

        studentMap.remove(732839);
        System.out.println(studentMap.size());

        Set<Integer> studentKeys = studentMap.keySet();

        Iterator<Integer> i = studentKeys.iterator();
        while(i.hasNext()){
            int key = i.next();

            Student student = studentMap.get(key);

            System.out.println(student.getStudentId() + ": " + student.getFamilyName());
        }




        // Container and simple Data types

        int a = 5;

        List<Integer> numbers = new ArrayList<Integer>();

        Integer objectA = new Integer(5);

        // autoboxing --> simple data type to complex data type
        numbers.add(5);


        // auto-unboxing --> complex data type to simple data type
        for(int number : numbers){

        }


    }
}
