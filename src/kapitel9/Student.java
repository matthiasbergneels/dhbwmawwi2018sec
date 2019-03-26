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
}
