import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int[] arr = new int[26];
      for (int i=0; i<26; i++) {
        arr[i] = -1;
      }

      String str = br.readLine();

      for (int i=0; i<str.length(); i++) {
        char c = str.charAt(i);
        if (arr[c-97] == -1) {
          arr[c-97] = i; 
        }
      }

      for (int a:arr) {
        System.out.print(a+" ");
      }
    
  }
}