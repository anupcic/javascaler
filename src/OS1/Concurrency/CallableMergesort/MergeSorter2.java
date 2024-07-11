package OS1.Concurrency.CallableMergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter2 implements Callable<List<Integer>> {

    List<Integer> arrayToSort;
    ExecutorService executorService;
    public MergeSorter2(List<Integer> list, ExecutorService executorService1){
        arrayToSort=list;
        executorService=executorService1;
    }

    @Override
    public List<Integer> call() throws Exception {

        if(arrayToSort.size()<=1){
            return arrayToSort;
        }
        else{
            int mid=arrayToSort.size()/2;

            List<Integer> leftArray=new ArrayList<>();
            List<Integer> rightArray=new ArrayList<>();

            for(int i=0;i<mid;i++){
                leftArray.add(arrayToSort.get(i));
            }
//
            for (int i = mid; i < arrayToSort.size(); i++) {  // Corrected line
                rightArray.add(arrayToSort.get(i));
            }

            MergeSorter2 leftSorter=new MergeSorter2(leftArray,executorService);
            MergeSorter2 rightSorter=new MergeSorter2(rightArray,executorService);

            Future<List<Integer>> leftSortedArray=executorService.submit(leftSorter);
            Future<List<Integer>> rightSortedArray=executorService.submit(rightSorter);
            List<Integer> sortedArray=new ArrayList<>();
            int i =0;
            int j=0;

            while(i<leftSortedArray.get().size() && j<rightSortedArray.get().size()){
                if(leftSortedArray.get().get(i)<=rightSortedArray.get().get(j)){
                    sortedArray.add(leftSortedArray.get().get(i));
                    i++;
                }
                else{
                    sortedArray.add(rightSortedArray.get().get(j));
                    j++;
                }
            }
            while(i<leftSortedArray.get().size()){
                sortedArray.add(leftSortedArray.get().get(i));
                i++;

            }
            while(j<rightSortedArray.get().size()){
                sortedArray.add(rightSortedArray.get().get(j));
                j++;

            }
            return sortedArray;



        }

    }
}
