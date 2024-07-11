package OS1.Concurrency.CallableMergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class MergeSorter implements Callable<List<Integer>> {
    List<Integer> arrayTosort;
    public MergeSorter(List<Integer> list){
        arrayTosort=list;

    }

    @Override
    public List<Integer> call() throws Exception {
        if(arrayTosort.size()<=1)
            return arrayTosort;
        else{
            int mid=arrayTosort.size()/2;
            List<Integer> leftArray=new ArrayList<>();
            List<Integer> rightArray=new ArrayList<>();
            for(int i=0;i<mid;i++) {
                leftArray.add(arrayTosort.get(i));
            }
            for(int i=mid;i<arrayTosort.size();i++){
                rightArray.add(arrayTosort.get(i));
            }
            MergeSorter leftSorter=new MergeSorter(leftArray);
            MergeSorter rightSorter=new MergeSorter(rightArray);

            List<Integer> leftSortedArray=leftSorter.call();
            List<Integer> rightSortedArray=rightSorter.call();
            List<Integer> sortedArray=new ArrayList<>();

            int i=0;
            int j=0;
            while(i<leftSortedArray.size() && j<rightSortedArray.size()){
                if(leftSortedArray.get(i)<=rightSortedArray.get(j)){
                   sortedArray.add(leftSortedArray.get(i));
                   i++;
                }
                else{
                    sortedArray.add(rightSortedArray.get(j));
                    j++;

                }
            }
            while(i<leftSortedArray.size()){
                sortedArray.add(leftSortedArray.get(i));
                i++;
            }
            while(j<rightSortedArray.size()){
                sortedArray.add(rightSortedArray.get(j));
                j++;
            }
            return  sortedArray;


        }

    }
}
