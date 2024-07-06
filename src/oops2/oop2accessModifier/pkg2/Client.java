package oops2.oop2accessModifier.pkg2;

import oops2.oop2accessModifier.pkg1.Student;

public class Client {
    public static void main(String[] args){
        Student student=new Student();
        student.universityName = "ALE"; // Public access
//        student.age=20; // Using setter method to set the age
//        student.psp = 90.0; // Protected access through i
    }
}
