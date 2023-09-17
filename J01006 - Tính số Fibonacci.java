import java.util.Scanner;

public class Test {
    static Long[] Fibo= new Long[93];

    public static void fibo() {
        Fibo[0] = 0L;
        Fibo[1] = 1L;
        for(int i = 2; i <= 92; i++)
        {
            Fibo[i] = Fibo[i - 1] + Fibo[i - 2];
        }
    }
    public static void main(String[] args) {
        fibo();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0)
        {
            int n = sc.nextInt();
            System.out.println(Fibo[n]);
        }
    }
}
