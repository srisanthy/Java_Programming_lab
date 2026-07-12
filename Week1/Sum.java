import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(&quot;Enter a number: &quot;);
        int a = s.nextInt();
        System.out.print(&quot;Enter a number: &quot;);
        int b = s.nextInt();
        System.out.println(&quot;Addition of &quot; + a + &quot; and &quot; + b + &quot; is &quot; + (a + b));
        s.close();
    }
}
