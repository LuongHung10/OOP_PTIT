import java.util.Scanner;

public class Test {
    static long[] fibo = new long[94];
    public static void F() {
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i = 2; i <= 92; i++)
        {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
    }

    public static char solve(int n, long k) {
        if(n == 1) return '0';
        if(n == 2) return '1';
        if(k <= fibo[n-2]) return solve(n - 2, k);
        else return solve(n - 1, k- fibo[n-2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        F();
        while(t-- != 0)
        {
            int n = sc.nextInt();
            long k = sc.nextLong();
            System.out.println(solve(n, k));
        }
    }
}
