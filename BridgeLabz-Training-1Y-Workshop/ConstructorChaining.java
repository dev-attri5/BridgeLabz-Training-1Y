public class ConstructorChaining {

    int id;
    String name;
    int age;

    // Default constructor
    public ConstructorChaining() {
        this(0, "Unknown", 0);   // constructor chaining
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    public ConstructorChaining(int id, String name, int age) {
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
        ConstructorChaining s1 = new ConstructorChaining();
        s1.display();

        System.out.println();

        ConstructorChaining s2 = new ConstructorChaining(1, "Akshansh", 20);
        s2.display();
    }
}
