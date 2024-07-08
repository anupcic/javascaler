package OS1.Concurrency.NumberPrinterExample;

public class NumberPrinter implements Runnable{
    int threadNumber;
    public NumberPrinter(int i){
        threadNumber=i;
    }

    @Override
    public void run() {
        System.out.println("Print the Thread Number :" + threadNumber);
    }
}
