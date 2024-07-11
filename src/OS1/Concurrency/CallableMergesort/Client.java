package OS1.Concurrency.CallableMergesort;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws Exception {
        ExecutorService executorService=Executors.newCachedThreadPool();
        List<Integer> list=Arrays.asList(7,2,3,1,5,9,8);
        //List<Integer> sortedArraylist=mergeSorter.call();

        MergeSorter mergeSorter=new MergeSorter(list);
        Future<List<Integer>> sortedArrayList=executorService.submit(mergeSorter);
        System.out.println(sortedArrayList.get());



//
//        ExecutorService executorService= Executors.newCachedThreadPool();
//        List<Integer> list= Arrays.asList(7,1,4,6,8,5);
//        MergeSorter mergeSorter=new MergeSorter(list);
//        Future<List<Integer>> sortedArrayList=executorService.submit(mergeSorter);
//        System.out.println(sortedArrayList.get());

    }
}
