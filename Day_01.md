# Title: Core Java

- JDK --> JRE --> JVM

- JDK: Java Development Kit(converts it into byte code)
- JRE: Java RunTime Enviroment is inside JDK (provides extra necessary files required)
- JVM: Java Virtual Machine is inside JRE (executes your byte code)

_______________________________
## Data Allocation
- stores the data in the form of stack(local variables and also instance of methods) and heap(where objects are stored with reference address in that stack and with global variables in that class)

__________________________
## Arrays
- stores multiple values of same data types in a single variable.

- syntax: 
```Java 
int[] arr = {1, 2, 3};
int arr[] = {1, 2, 3};
int arr[] = new int[4] //where 4 is the size and is the fixed size of the array 
```
- we use 
```Java 
arr.length;
``` 
to find the length of the array

### Multi Dimentional array
- syntax:
```Java
int arr[][] = new int[3][4] 
```

### Jagged Array
- array with different sized rows
syntax:
```Java
    int arr[][] = new int[3][];
    arr[0] = new int[3];
    arr[1] = new int[4];
    arr[2] = new int[5];
```

### Array Objects

```Java
    class Student{
        int rollno;
        String name;
        int marks;
    }

    public class Demo{
        public static void main(String args[]){
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "sai";
        s1.marks = 88;

        Student s[] = new Student[1];

        }
    }
```
______________________


## String
- collection of characters.
- String is Class not primitive type.
- once the String is created it cannot be changed which means it is immutable(creates a new String object when changed and changes its hashCode reference to the new String object).

Syntax: to find the length of the String we use
```Java
s.length();
```
some basic methods

```Java
a.concat(b);
s.charAt(1); //not s[1] returns only character at index 1
```


### if we want to use mutable Strings
### StringBuffer 
(gives us 16 extra space than our current String length)
- Syntax: 
```Java
 StringBuffer sb = new StringBuffer("sai");
 
 //to convert back to String
 sb.toString()
 ```

### StringBuilder()
- Syntax:
```Java
StringBuilder sb = new StringBuilder("Sai");
//to convert back to String
sb.toString()

```
_________________________
## diff b/w StringBuffer and StringBuilder
- StringBuffer is Thread Safe but StringBuilder is not Thread Safe.
- StringBuffer is slower than StringBuilder

______________________

### static keyword
- a variables that belongs to a class, not the instance of that class

- static variables are called directly with the class name not with the object name

- example: 
```java
class Mobile{
    String brand;
    int price;
    static String name;
}

public class Demo{
    public static void main(String args[]){
        Mobile mob = new Mobile();
        mob.brand = "Apple";
        mob.price = 1500;

        Mobile.name = "SmartPhone";
    }
}
```

### static method
- we can use only static variables in the static methods.

- static method can be directly called with the class name not with the object name. 

example:
```java
class Mobile{
    String brand;
    int price;
    static String name;

    public static void show1(){
        System.out.println(name);
    }
}

public class Demo{
    public static void main(String args[]){
        Mobile mob = new Mobile();
        mob.brand = "Apple";
        mob.price = 1500;
        Mobile.name = "SmartPhone";

        Mobile.show1();
    }
}
```

### static block

- a set of instructions that is run only once when a class is loaded into memory.

- Syntax:
```java 
class Mobile{
    String brand;
    int price;
    static String name;


    static{
        name = "Phone";
        System.out.println("in static block");
    }

    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("in constructor");

    }
}
```

## this keyword

- a reference variable that refers to the current object

- Example:
    without this keyword
```java
class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public void setAge(int age, Human obj){
        Human obj1 = obj;
        obj1.age = age;
    }
    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

}

public class Demo{
    public static void main(String args[]) throws ClassNotFoundException{
        Human obj = new Human();
        obj.setAge(10, obj);
        obj.setName("sai");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
} 
```

with this keyword

```java 
class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

}

public class Demo{
    public static void main(String args[]) throws ClassNotFoundException{
        Human obj = new Human();
        obj.setAge(10);
        obj.setName("sai");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
```
## this method


## super method 
- Example:
```java
class A extends Object{

    public A(){
        super();
        System.out.println("in A");
    }

    public A(int n){
        super();
        System.out.println("in A int");
    }

}

class B extends A{
    public B(){
        super(5);
        System.out.print("in B");
    }

    public B(int n){
        super(n);
        System.out.print("in B int");
    }
}

public class Demo{
    public static void main(String args[]){
        B obj = new B();
    
    }
}
```

## constructor
- it should be of same name as the class like a method 

example
```java 
class King{
    public King(){
    // default Constructor
        age = 12;
        name = "John" ;
    }

    public King(int age, String name){
        //parameterized constructor
        this.age = age;
        this.name = name;
    }
}
public class Demo{
    public static void main(String args[]){
        Human obj = new Human();//calling default Constructor
        Human obj = new Human(18, "Kaushik");//calling parameterized constructor
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
```


## Naming conventions

- Camel casing
class and interface - Calc, Runable
variable and method - marks, show()
constants - PIE, BRAND

showMyMarks()
MyData

constructor - Bhai()
__________________
## Object Oriented Programming

### objects
- instance of a class
- anonymous objects
    - can be only be used once
    syntax:
    ```Java 
    new A() 
    ```

``` Java
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


### encapsulation
- is a process of wrapping code and data together into a single unit.

- It provides you the control over the data.

- It is a way to achieve data hiding since it uses private keyword(which can be used within the class only).

- uses setter or getter method

Example:
```Java
class Human{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name;
    }

    public void setName(String n){
        this.name = n;
    }

}

public class Demo{
    public static void main(String args[]) throws ClassNotFoundException{
        Human obj = new Human();
        obj.setAge(10);
        obj.setName("sai");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}

```




### inheritance
- allows one class to inherit features from another class

- uses extends keyword

example:
```java
class Calc{
    public int add(int n1, int n2){
        return n1 + n2;
    } 

    public int sub(int n1, int n2){
        return n1 - n2;
    }
}

class AdvCal extends Calc{
    public int mul(int n1, int n2){
        return n1 * n2;
    }

    public int div(int n1, int n2){
        return n1 / n2;
    }
    
}

public class Demo{
    public static void main(String args[]){
        int i = 10;
        int j = 5;
        AdvCal adv = new AdvCal();
        System.out.println(adv.add(i, j) + " " + adv.sub(i, j) +" " + adv.mul(i, j) + " " + adv.div(i, j));
    }
}
```
- Types of inheritance
<ol>
<li>single inheritance :  A class inherits from only one parent class. </li>

<li>multi-level inheritance:  A class inherits from another class that is already the descendant of some other class.  </li>
<li>multiple inheritance(using interface)</li>
<li>Hierarchical inheritance:  Multiple classes inherit from a single superclass. </li>
<li>Hybrid inheritance</li>
</ol>






### polymorphism

- run-time polymorphism(method overriding)


- compile-time polymorphism(method overloading)
```Java
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