# Title: Core Java
- JDK: Java Development Kit(converts it into byte code)
- JRE: Java RunTime Enviroment is inside JDK (provides extra necessary files required)
- JVM: Java Virtual Machine is inside JRE (executes your byte code)


## Object Oriented Programming

### objects

- instance of a class

``` 
class Calc{
    public int add(int a, int b){
        int r = a + b;
        return r;
    }
}

public class Demo{
    public static void main(String args[]){
        int num1 = 4;
        int num2 = 5;
        Calc calc = new Calc();//object created for Calc
        int res = calc.add(num1, num2);
        
        System.out.println(res);
    }

}
```

### classes

- blueprint for creating objects



### inheritance
### polymorphism

- run-time polymorphism(method overriding)


- compile-time polymorphism(method overloading)
```
// method overloading
class Calc{
    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }


}
public class Demo{
    public static void main(String args[]){
        Calc calc = new Calc();
        int res = calc.add(10, 20);
        System.out.println(res);
    }

}
```