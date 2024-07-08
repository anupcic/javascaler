//did myself
package multithreading;

public class HelloWorldRunnable implements Runnable{
    public void run(){
        System.out.println("Hello, World from Thread :"+ Thread.currentThread().getName());
    }
    public static void main(String[] args){
        System.out.println("Hello world from main thread");
        HelloWorldRunnable t1=new HelloWorldRunnable();
        HelloWorldRunnable t2=new HelloWorldRunnable();
        Thread thread1=new Thread(t1);
        Thread thread2=new Thread(t2);
        thread1.start();
        thread2.start();
    }
}
