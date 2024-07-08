package OS1.Concurrency.NumberPrinterUsingPool;

public class NumberPrinterPool implements Runnable{
    int threadnumberPrintPool;
    public NumberPrinterPool(int i){
        threadnumberPrintPool=i;
    }

    @Override
    public void run() {
        System.out.println(" Number being printed :"+threadnumberPrintPool+ " " + Thread.currentThread().getName());

    }
}
