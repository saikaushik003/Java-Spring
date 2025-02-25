package Basics;

class A{

    public A(){
        super();
        System.out.println("in A");
    }

    public A(int n){
        System.out.println("in A int");
    }

}

class B extends A{
    public B(){
        super(5);
        System.out.print("in B");
    }

    public B(int n){
        this();
        System.out.print("in B int");
    }
}

public class Demo{
    public static void main(String args[]){
        B obj = new B();

    }
}