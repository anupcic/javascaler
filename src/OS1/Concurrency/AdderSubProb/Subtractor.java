package OS1.Concurrency.AdderSubProb;

public class Subtractor  implements  Runnable{

    Count count;
    public Subtractor(Count count1){
        count=count1;
    }

    @Override
    public void run() {
        for(int i = 1; i <=100; i++){
            count.value -= i;
        }

    }
}
