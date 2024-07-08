package OS1.Concurrency.NumberPrinterUsingPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args){
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        for (int i =1;i<=100;i++){
            NumberPrinterPool numberPrinterPool=new NumberPrinterPool(i);
            executorService.execute(numberPrinterPool);
        }
    }
}
