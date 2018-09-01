public class Partition{
    public Partition(){

    }
    public void QuickSort(int[] test,int low,int high){
        if(test.length>0){
            if(low<high){
                int partition=part(test, low, high);
                QuickSort(test, low, partition-1);
                QuickSort(test, partition+1, high);
            }
        }

    }

    public int part(int[] test,int low,int high){
        int index=-1;
        int temp=-1;
        int len=test.length;
        if(test.length>0){
            int tag=test[low];
            while(low<high){
                while(low<high&&test[high]>=tag){
                    high--;
                }
                temp=test[low];
                test[low]=test[high];
                test[high]=temp;
                while(low<high&&test[low]<=tag){
                    low++;
                }
                temp=test[low];
                test[low]=test[high];
                test[high]=temp;
            }
        }
        index=low;
        return index;
    }

}