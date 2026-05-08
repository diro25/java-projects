public class Student {
  int id;
  float gpa;

  public static void main(
      String args[]) {
    Student id = new Student();
    Student gpa = new Student();

    id.id = 123;
    gpa.gpa = 3.7f;

    System.out.println(id.id);
    System.out.println(gpa.gpa);
  }

}
