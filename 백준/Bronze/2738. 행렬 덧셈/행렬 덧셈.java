import java.io.*;
import java.util.Scanner;


public class Main {

    int a = 3;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][]a = new int[n][m];
        int [][]b = new int[n][m];

        //값 입력
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }

        
       
    

    }
    
}