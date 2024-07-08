package multithreading;

public class HelloWorldThread extends Thread{
     public void run(){
         System.out.println("Hello World from Thread :" + Thread.currentThread().getName());
     }
    public static void main(String[] args){
        System.out.println("Hello world from main thread");
        HelloWorldThread thread1=new HelloWorldThread();
        HelloWorldThread thread2=new HelloWorldThread();
         thread1.start();
         thread2.start();

    }
}
