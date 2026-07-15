public class Student {
  int rollno;
  String name, dept;
  public static void main(String[] args) {
    Student s = new Student();
    s.rollno = 30;
    s.name = &quot;ABC&quot;;
    s.dept = &quot;CSE&quot;;
    System.out.println(&quot;Name is &quot; + s.name + &quot; bearing Roll Number &quot; + s.rollno + &quot; in Department &quot; +
s.dept);
  }
}
