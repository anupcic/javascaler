package OS1.Concurrency.CallableMergesort;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) throws Exception {
        //ExecutorService executorService= Executors.newCachedThreadPool();
        List<Integer> list= Arrays.asList(7,1,4,6,8,5);
        MergeSorter mergeSorter=new MergeSorter(list);
        List<Integer> sortedArraylist=mergeSorter.call();
        System.out.println(sortedArraylist);

    }
}
