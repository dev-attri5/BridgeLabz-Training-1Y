public class Student {

    int id;
    String name;
    int age;

    public Student() {
        System.out.println("Student");
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("NAME: " + name);
        System.out.println("AGE: " + age);
    }

    public static void main(String[] args) {
        Student s = new Student(1, "Rahul", 20);
        s.display();
    }
}
