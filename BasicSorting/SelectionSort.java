public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int max = 0;
            for(int j=1; j<arr.length-i-1; j++){
                if(arr[j] > arr[max]){
                   max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }

    public static void main(String args[]){
        int arr[] = {254,154,11649,71454,54,5489,131,54,164654,654,1654,551,14,156,6548,498,634,94,145}; 
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nAfter Selection Sort");
        selectionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
