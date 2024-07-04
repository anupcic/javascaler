package oop2accessModifier.pkg2;

import oop2accessModifier.pkg1.Student;

public class StudentChild extends Student {
    public static void main(String[] args){
        StudentChild studentChild=new StudentChild();
        studentChild.psp=90;
        studentChild.universityName="new u niversity";
        studentChild.name="ARD";
        studentChild.age=40;


        Student student=new Student();
        student.universityName="trial";
        student.name=10;

    }


}
