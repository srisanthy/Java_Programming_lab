import java.util.Scanner;
public class QuadRoot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(&quot;Enter x^2 co-efficient: &quot;);
        double a = s.nextDouble();
        System.out.print(&quot;Enter x co-efficient: &quot;);
        double b = s.nextDouble();
        System.out.print(&quot;Enter constant: &quot;);
        double c = s.nextDouble();
        if(a == 0) {
            System.out.print(&quot;x^2 co-efficient should not be empty&quot;);
            s.close();
            return;
        }
        double d = (Math.pow(b, 2) - (4 * a * c));
        if(d &gt; 0) {
            double root1 = ((-b + Math.sqrt(d)) / (2 * a));
            double root2 = ((-b - Math.sqrt(d)) / (2 * a));
            System.out.println(&quot;Roots are real and distinct&quot;);
            System.out.println(&quot;Root 1 is: &quot; + root1);
            System.out.println(&quot;Root 2 is: &quot; + root2);
        } else if(d == 0) {

Shek Nowshik 255335A0527

6

            double root = ((-b + Math.sqrt(d)) / (2 * a));
            System.out.println(&quot;Roots are real and same&quot;);
            System.out.println(&quot;Root is: &quot; + root);
        } else {
            System.out.println(&quot;The roots are complex and imaginary.&quot;);
        }
        s.close();
    }
}
