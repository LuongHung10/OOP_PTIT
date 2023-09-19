import java.util.Scanner;

public class Test {
    public static boolean solve(int n) {
        int x = (int)Math.sqrt(n);
        if(x * x == n)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0)
        {
            int n = sc.nextInt();
            if(solve(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
