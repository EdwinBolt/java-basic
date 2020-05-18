package methods;

public class MyClass {
    String name;

    // generate constructor

    public MyClass(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public static void main(String[] args) {
        MyClass myClass = new MyClass("my-class");

        System.out.println(myClass.hashCode());

        if (myClass == new MyClass("my-class"))
            System.out.println("is equal");

    }
}