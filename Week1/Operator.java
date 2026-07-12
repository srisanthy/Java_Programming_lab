public class Oper {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(&quot;Increment of &quot; + a + &quot; is &quot; + ++a);
        System.out.println(&quot;Decrement of &quot; + b + &quot; is &quot; + --b);
        System.out.println(&quot;Bitwise AND of &quot; + a + &quot; and &quot; + b + &quot; is &quot; + (a &amp; b));
        System.out.println(&quot;Bitwise OR of &quot; + a + &quot; and &quot; + b + &quot; is &quot; + (a | b));
        System.out.println(&quot;Bitwise EX-OR of &quot; + a + &quot; and &quot; + b + &quot; is &quot; + (a ^ b));
        System.out.println(&quot;Bitwise Right Shift of &quot; + a + &quot; is &quot; + (a &gt;&gt; 1));
        System.out.println(&quot;Bitwise Left Shift of &quot; + b + &quot; is &quot; + (b &lt;&lt; 1));
    }
}
