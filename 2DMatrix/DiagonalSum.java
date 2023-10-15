public class DiagonalSum {
    public static int diagonalSum(int arr[][]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(i != arr.length-1-i){
                sum += arr[i][i];
            }
            //j = arr.length-1-i
            //In secondary diagonal (arr.length-1 = i+j)
            // imprimaary diagonal (i == j)
            sum += arr[i][arr.length-1-i];
        }
        return sum;
    }

    public static void main(String args[]){
        int arr[][] =  {{1,2,3},{4,5,6},{7,8,9}};
        System.out.print(diagonalSum(arr));
    }
}
