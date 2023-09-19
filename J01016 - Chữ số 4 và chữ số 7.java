import java.util.Scanner;

public class Test {
    public static Boolean solve(String s) {
        int cnt4 = 0, cnt7 = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '4') cnt4++;
            else if(s.charAt(i) == '7') cnt7++;
        }
        if(cnt7 + cnt4 == 4 || cnt7 + cnt4 == 7)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(solve(s)) System.out.println("YES");
        else System.out.println("NO");
    }
}
