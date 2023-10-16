//package Arrays;

public class TrappingRainwater {
    public static int trappingRainwater(int arr[]){
        int left[] = new int[arr.length];
        int right[] = new int[arr.length];
        int trapWater = 0;

        for(int i=0; i<arr.length; i++){
            if(i==0){
                left[i] = arr[i];
                continue;
            }
            left[i] = Math.max(left[i-1], arr[i]);
        }

        for(int i=arr.length-1; i>=0; i--){
            if(i==arr.length-1){
                right[i] = arr[i];
                continue;
            }
            right[i] = Math.max(arr[i], right[i+1]);
        }

        for(int i=0; i<arr.length; i++){
            trapWater += Math.min(left[i], right[i]) - arr[i];
        }
        return trapWater;
    }

    public static void main(String args[]){
        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}; 
        System.out.print(trappingRainwater(arr));
    }
}
