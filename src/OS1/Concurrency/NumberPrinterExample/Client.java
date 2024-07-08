package OS1.Concurrency.NumberPrinterExample;

import java.util.concurrent.ExecutorService;

public class Client {
    public static void main(String[] args){
        for(int i=0;i<=100;i++){
            NumberPrinter numberPrinter=new NumberPrinter(i);
            Thread t1=new Thread(numberPrinter);
            t1.start();

        }
    }
}
