package kapitel9;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;


class StudentTest {

    private Student s1, s2, s3, s4;
    private Student[] students;

    @Before
    public void setup(){
        s1 = new Student(62738, "Klaus", "Mueller", 26);
        s2 = new Student(62738, "Klaus", "Mueller", 26);
        s3 = new Student(62781, "Gabi", "Fritz", 21);
        s4 = s1;

        students = new Student[]{s1, s2, s3, s4};
    }

    @Test
    public void equalsCheck(){

        // Alias
        Assert.assertTrue(s1.equals(s4));

        // positiv - similar students
        Assert.assertTrue(s1.equals(s2));

        // negativ different students
        Assert.assertFalse(s1.equals(s3));

    }

    @Test
    public void genericEqualsListCheck(){
        for(Student s1 : students){
            for(Student s2 : students){
                // determine result
                boolean expectedResult = true;
                if(s1 != s2){
                    if(s1.getStudentId() != s2.getStudentId()){
                        expectedResult = false;
                    }
                }
                Assert.assertEquals(expectedResult, s1.equals(s2));
            }
        }
    }

    @Test
    public void equalsToHashCodeConsitency(){

        Assert.assertEquals(s1.equals(s2), (s1.hashCode() == s2.hashCode()));
        Assert.assertEquals(s1.equals(s3), (s1.hashCode() == s3.hashCode()));

    }

    @Test
    public void genericEqualsToHashCodeConsitencyListCheck(){

        for(Student s1 : students){
            for(Student s2 : students){
                Assert.assertEquals(s1.equals(s2), (s1.hashCode() == s2.hashCode()));
            }
        }
    }


    @Test
    public void checkCorrectOrderInSet(){
        Set<Student> studentSet = new TreeSet<Student>();

        studentSet.addAll(Arrays.asList(students));

        Student previousStudent = null;
        for(Student student : studentSet){
            if(previousStudent != null){
                Assert.assertTrue(previousStudent.getStudentId() < student.getStudentId());
            }
            previousStudent = student;
        }

    }
}