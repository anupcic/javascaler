package OS1.Concurrency.CallableMergesort;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client2 {
    public static void main(String[] args) throws  Exception{
        ExecutorService executorService= Executors.newCachedThreadPool();

        List<Integer> list= Arrays.asList(5,34,6,9,0,2,6);
        MergeSorter2 mergeSorter2=new MergeSorter2(list,executorService);

        Future<List<Integer>> sortedList=executorService.submit(mergeSorter2);
        System.out.println(sortedList.get());



    }
}
