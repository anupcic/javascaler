package oops2.constructors;

public class Client {
    public static void main (String[] args){
        Student student=new Student(21,"Anup");//call parameterized constructor
        Student copyconst=new Student(student);
        Student stud2=copyconst;



        System.out.println("Student details are "+ student.name+"" + student.age);
        System.out.println("Student details are "+ copyconst.name+":" + copyconst.age);

        System.out.println("Student details are "+ student+":" );
        System.out.println("Student details are "+ stud2);
        System.out.println("Student details are "+ copyconst);



    }
}
