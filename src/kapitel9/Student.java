package kapitel9;

public class Student implements Comparable<Student>{

    private int studentId;
    private String name;
    private String familyName;
    private int age;

    public Student(int studentId, String name, String familyName, int age) {
        this.studentId = studentId;
        this.name = name;
        this.familyName = familyName;
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.getStudentId() - o.getStudentId();
    }

    @Override
    public boolean equals(Object obj) {

        // Alias Check
        if(this == obj){
            return true;
        }

        // Null check
        if(obj == null){
            return false;
        }

        // type check
        if(this.getClass() != obj.getClass()){
            return false;
        }

        // compare Attributes
        Student student = (Student)obj;

        if(this.getStudentId() != student.getStudentId()){
            return false;
        }

        /* --> Adoption to be consistent with compareTo()
        if(!this.getFamilyName().equals(student.getFamilyName())){
            return false;
        }

        if(!this.getName().equals(student.getName())){
            return false;
        }

        if(this.getAge() != student.getAge()){
            return false;
        }
        */

        return true;

    }

    @Override
    public int hashCode() {
        int hc = 25;
        int multiply = 59;

        hc = hc * multiply + this.getStudentId();

        /*
        // do for each attribute from equals!
        hc = hc * multiply + (this.getFamilyName() == null ? 0 : this.getFamilyName().hashCode() );
        */

        return hc;
    }
}
