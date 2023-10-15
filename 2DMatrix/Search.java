//package 2D Matrix;
import java.util.*;

public class Search {
    public static void search(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at index ("+i+","+j+")");  
                    return;
                }
            }
        }
        System.out.println("Key not found");
    }

    public static void main(String args[]){
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No. of Rows");
        n = sc.nextInt();
        System.out.println("Enter No. of Columns");
        m = sc.nextInt();
        int arr[][] = new int[n][m];

        System.out.println("Enter Elements of 2D array");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the key to find");
        int key = sc.nextInt();
        search(arr, key);
    }
}
