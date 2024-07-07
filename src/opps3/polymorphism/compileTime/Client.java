package opps3.polymorphism.compileTime;
import java.util.Random;


public class Client {
    public static void main(String[] args){
//        A c=new C();
//        //a.doSomething
//        A b=new B();
//        c.print(c);
//        b.print(b);
        A a=doSomething();
        a.print(a);

    }
    public static A doSomething(){
        Random random=new Random();
        if(random.nextInt()%2==2){
            return new B();
        }
        else{
            return new C();
        }


    }
}
