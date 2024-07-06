package oops2.constructors;

public class Student {
    int age;
    String name;

    public Student (int studentAge, String studentName){//parameterized constructor
        age=studentAge;
        name=studentName;

    }
    public Student (Student student){
        age=student.age;
        name=student.name;
    }
}
