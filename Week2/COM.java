class Student1 {
  int id;
  String name, dept;
  public void show() {
    System.out.println(&quot;Name is &quot; + name + &quot; bearing ID &quot; + id + &quot; in Department &quot; + dept);
   
  }
}
public class CMethod {
  public static void main(String[] args) {
    Student1 s = new Student1();
    s.id = 27;
    s.name = &quot;ABC&quot;;
    s.dept = &quot;CSE&quot;;
    s.show();
  }
}
