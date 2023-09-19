import java.util.Scanner;

public class Test {
    public static Boolean solve(int[] a, int n) {
        int l = 0, r = n - 1;
        while(l <= r)
        {
            if(a[l++] != a[r--])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
            if(solve(arr, n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
