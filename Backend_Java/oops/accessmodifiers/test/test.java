package accessmodifiers.test;
public class test {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("ram");
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();
        System.out.println(Student.count);
    }
}
