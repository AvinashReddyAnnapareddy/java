package OOPS;

class EkClass {
    int a;
    String name;

    // Default constructor
    public EkClass() {
        this(0, "Default"); // Calls parameterized constructor using 'this'
    }

    // Parameterized constructor
    public EkClass(int a, String name) {
        this.a = a;           // 'this' refers to the current object's field
        this.name = name;
    }

    public void show() {
        System.out.println("a: " + this.a + ", name: " + this.name);
    }
}

class DoClass extends EkClass {
    int b;

    public DoClass(int a, String name, int b) {
        super(a, name); // Calls EkClass's parameterized constructor using 'super'
        this.b = b;
    }

    public void show() {
        super.show(); // Calls show() of EkClass
        System.out.println("b: " + this.b);
    }
}

public class this_super {
    public static void main(String[] args) {
        EkClass ek = new EkClass(10, "First");
        ek.show();

        DoClass doObj = new DoClass(20, "Second", 30);
        doObj.show();
    }
}