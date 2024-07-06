package opps3.inheritance;

public class Client {
    public static void main(String args){
        Student student=new Student();
        student.psp=90.8;
        student.takeTest();
        student.userName="Abc";
        student.login();


        User user=new User();
        user.userName="NEW USER";
        user.login();


    }
}
