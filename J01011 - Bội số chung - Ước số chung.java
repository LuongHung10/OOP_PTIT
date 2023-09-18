import java.util.Scanner;

public class Test {
    public static long gcd(long a, long b) {
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0)
        {
            long a = sc.nextInt(), b = sc.nextInt();
            System.out.println((Long)a/ gcd(a,b) * b + " " + gcd(a,b));
        }
    }
}
