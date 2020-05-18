package generics;

//public class MyClass {
//    String name;
//
//    public MyClass(String name) { this.name = name; }
//    public String getName() { return name; }
//    public void setName(String name) { this.name = name; }
//
//    public static void main(String[] args) {
//        MyClass myClass = new MyClass("my-class");
//    }
//}

public class MyClass<T> {
    T name;

    public MyClass(T name) {
        this.name = name;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass("my-class");
        System.out.println(myClass.getName());
    }


}
