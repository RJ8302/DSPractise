public class CountingSort {
    public static void countingSort(int arr[]){
        //finding largest
        int largest =  Integer.MIN_VALUE; 
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        int count[] = new int[largest+1];
        //filling counting array
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //Sorting 
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                System.out.print(i +" ");
                count[i]--;
            }
        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,1,5,1,6,1,5,1,5,1,2,6,5,5,1,5,5,8,9,8,9,5,9,4,1,9,4,9,7}; 
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nAfter Counting Sort");
        countingSort(arr);
    }
}
    
