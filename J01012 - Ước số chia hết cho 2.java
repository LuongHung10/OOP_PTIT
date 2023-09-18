import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0)
        {
             int n = sc.nextInt(), i = 1, cnt = 0;
             while(i <= n / i)
             {
                 if(n % i == 0 && i % 2 == 0) cnt++;
                 if(n % i == 0 && n / i % 2 == 0) cnt++;
                 if(i * i == n && n % 2 == 0) cnt --;
                 i++;
             }
             System.out.println(cnt);
        }
    }
}
