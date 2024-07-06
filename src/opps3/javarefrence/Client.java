package opps3.javarefrence;

public class Client {
    public static void main(String[] args){
        Student s1=new Student();
        s1.age=21;
        s1.psp=56;

        System.out.println("address1 "+ s1);
        s1.doSomething(s1);
        System.out.println("address2 "+ s1.age);
        System.out.println("addres3 "+ s1.psp);

    }
}
