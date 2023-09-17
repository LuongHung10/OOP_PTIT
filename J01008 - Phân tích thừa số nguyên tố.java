import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int x = 1; x <= t; x++)
        {
            int n = sc.nextInt();
            System.out.print("Test " + t + ": ");
            for(int i = 2; i <= Math.sqrt(n); i++)
            {
                if(n % i == 0)
                {
                    int cnt = 0;
                    while(n % i == 0)
                    {
                        n /= i;
                        cnt++;
                    }
                    System.out.print(i + "(" + cnt + ") ");
                }
            }
            if(n > 1) System.out.print(n + "(1)");
            System.out.println();
        }
    }
}
