package statics;

public class MyClass {


    void print(){
        System.out.println("in print");
    }

    static MyClass instance;

    static MyClass factory(){
        return instance = new MyClass();
    }

    public static void main(String[] args) {
        MyClass.factory().print();
    }
}
