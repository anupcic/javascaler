package OS1.Concurrency.HelloWorldExample;

import multithreading.HelloWorldThread;

public class Client {
    public static void main(String[] args){
        HelloWorldPrinter helloWorldPrinter=new HelloWorldPrinter();
        Thread t1=new Thread(helloWorldPrinter);
        t1.start();
    }
}
