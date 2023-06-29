package mvc_ee24;

public class MyModel {
    public Student getStudent(){
        Student student = new Student();
        student.setName("Max");
        student.setAge(22);
        return student;
    }
}
