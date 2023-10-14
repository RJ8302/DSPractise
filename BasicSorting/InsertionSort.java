public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length ; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void main(String args[]){
        int arr[] = {254,154,11649,71454,54,5489,131,54,164654,654,1654,551,14,156,6548,498,634,94,145}; 
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nAfter Insertion Sort");
        insertionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}