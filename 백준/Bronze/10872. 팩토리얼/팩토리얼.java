import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fac(n));
        
    }

    public static int fac(int a) {
        if (a<=1) return 1;
        return a*fac(a-1);
    }
}