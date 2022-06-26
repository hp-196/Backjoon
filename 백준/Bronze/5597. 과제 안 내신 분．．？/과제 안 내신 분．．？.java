import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[31];

        for (int i=1; i<29; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }

        for (int i=1; i<31; i++) {
            if (arr[i] == 0) {
                System.out.println(i);
            }
        }

    }
}