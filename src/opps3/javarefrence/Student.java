package opps3.javarefrence;

public class Student {

    int age=20;
    int psp=90;

    void doSomething(Student st){
        st.age=30;
        System.out.println("address-func "+ st);
        st=null;
        System.out.println("address-func nul "+ st);

    }
}
