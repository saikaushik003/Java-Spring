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
_________________________

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
- example:
```java
class A{

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
        super();
        System.out.println("in B");
    }

    public B(int n){
        this();
        System.out.println("in B int");
    }
}

public class Demo{
    public static void main(String args[]){
        B obj = new B(10);

    }
}
```

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

- class and interface - Calc, Runable

- variable and method - marks, show()

- constants - PIE, BRAND

- showMyMarks()
- MyData

- constructor - Bhai()

______________________
## packages
- a set of classes, interfaces, and sub-packages that are similar
### there are two types of packages:
- built-in packages
- user-defined packages

_______________________

## Access modifiers
<ol>
<li><b>public</b>: Within the class, Within the package, Outside the package but through child only, outside the package </li>
<li><b>private</b>: only within the class</li>
<li><b>default</b>: only Within the class and Within the package</li>
<li><b>protected</b>: only Within the class,  Within the package and Outside the package but through child only</li>
</ol>


|                    | Public | Protected | Default | Private |
|--------------------|--------|-----------|---------|---------|
|Same Class          | Yes    | Yes       | Yes     | Yes     |
|Same Package        | Yes    | Yes       | Yes     | No      |    
|Same Pack Sub Class | Yes    | Yes       | Yes     | No      |
|Diff Pack Sub CLass | Yes    | Yes       | No      | No      |
|Dif Pack No SubClass| Yes    | No        | No      | No      |

_________________________________

## final keyword
### final variable
once the final variable is created it cannot be changed.

Ex: 
```java 
final int s = 9;// it is 9 until the end 
```
### final class 
when the final keywod is used on class i.e 
```java 
final class A{
} 
```
then this final class cannot be inherited

### final method
when the final keyword is used on the method i.e
```java
class A{
   public final void show(){
    System.out.println("Sai");
   } 
}

class B extends A{
    public void show(){
        System.out.println("Kaushik");
    }
}

public class Demo{
    public static void main(String args[]){
        B b = new B(); 
        b.show();
    }
}
```
then we can prevent overriding from occuring.

________________________
## Type Casting:
```Java
public class Demo{
    public static void main(String args[]){
        double d = 4.5;
        int i = (int) d;
        System.out.println(i);
    }
 }
 ```

### Upcasting and Downcasting
<b>Upcasting:</b>
<ol>
    <li>Converting a subclass reference to a superclass reference </li>
    <li>Also known as widening or generalizing </li>
</ol>

<b>Downcasting: </b>
<ol>
<li>Converting a superclass reference to a subclass reference</li>
<li>Also known as narrowing or type refinement</li>
</ol>

Example:

```Java
class A{
    public void show1(){
        System.out.println("in A show");
    }
}

class B extends A{
    public void show2(){
        System.out.println("in B show");
    }
} 

 public class Demo{
    public static void main(String args[]){
        A obj = (A) new B();// UpCasting 
        obj.show1();

        B obj1 = (B) obj;// downCasting
        obj1.show2();
    }
 }

```
________________________
## Wrapper Classes
- Integer: The wrapper class for the primitive data type int
- Character: The wrapper class for the primitive data type char
- Double: The wrapper class for the primitive data type double


```Java
 public class Demo{
    public static void main(String args[]){
        int num = 7;
        Integer num1 = num; // autoboxing
        
        int num2 = num1.intValue(); // auto-unboxing
        System.out.println(num2);

        String str = "12";
        int i = Integer.parseInt(str);
        System.out.println(i * 4);
    }
 }
```
__________________
## Object Oriented Programming

### objects
- instance of a class
- anonymous objects
    - can be only be used once

    ```Java 
    new A();
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
__________________________
### classes

- blueprint for creating objects

- Inner class
```java
class A{
    int age;
    public void show(){
        System.out.println("in show");
    }
    class  B{
        public void config(){
            System.out.println("in config");
        }
    }
}
 public class Demo{
    public static void main(String args[]){
        A a = new A();
        a.show();
        
        A.B obj = a.new B();//to call the inner class
        obj.config();

    }
 }
```
- static can be used only for the inner class. 
- if B is a static inner class.

```java
class A{
    int age;
    public void show(){
        System.out.println("in show");
    }
    static class  B{
        public void config(){
            System.out.println("in config");
        }
    }
}
 public class Demo{
    public static void main(String args[]){
        A a = new A();
        a.show();

        A.B obj = new A.B();//can be called like this directly
        obj.config();

    }
 }
```

- Anonymous Inner Class:
syntax:
```java
A obj = new A()
        {
            public void show(){
                System.out.println("in new show");
            }
        };
obj.show();
```

```java

class A{
    public void show(){
        System.out.println("in A show");
    }
}


 public class Demo{
    public static void main(String args[]){
        A obj = new A()
        {
            public void show(){
                System.out.println("in new show");
            }
        };

        obj.show();

    }
 }
```

- using abstract method

```java
abstract class A{
    public abstract void show();
}

 public class Demo{
    public static void main(String args[]){
        A obj = new A(){
            
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();
    }
 }
```

___________________________
### Encapsulation
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


________________________

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

____________________________

### polymorphism

- run-time polymorphism(method overriding)(Late Binding)
- different classes, same method name


```Java
class Calc{
    public int add(int n1, int n2){
        return n1 + n2;
    }
}

class AdvCalc extends Calc{
    public int add(int n1, int n2){
        return n1 + n2 + 1;
    }
    
}

public class Demo{
    public static void main(String args[]){
        AdvCalc obj = new AdvCalc();
        int res = obj.add(10, 2);
        System.out.println(res);
    }
}
```

#### Dynamic Method Dispatch 
```Java

class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A {
    public void show(){
        System.out.println("in B show");
    }
}

class C extends A {
    public void show(){
        System.out.println("in C show");
    }
}
public class Demo{
    public static void main(String args[]){
        A obj = new A();
        obj.show();
        
        obj = new B();
        obj.show();
        
        obj = new C();
        obj.show();
        

    }
}
```

- compile-time polymorphism(method overloading)(Early Binding)
- same class, same method name, different parameters
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

_____________________________________
### Abstract keyword
- is used to create a abstract class and method.(i.e if you create a abstract method then it should be in abstract class only)

- if other class extends abstract class then there should be abstract method in that extended class.

- Abstract class cannot be called it should have a sub class to call it.

- Abstract class can also contain non abstract methods also.

```Java
abstract class Car {
    public abstract void drive();

    public void playMusic(){
        System.out.println("play music");
    }
}

class WagonR extends Car {
    public void drive(){
        System.out.println("driving WagonR");
    }
}

 public class Demo{
    public static void main(String args[]){
        WagonR obj = new WagonR();
       obj.drive();
       obj.playMusic();


    }
 }
```

### Abstraction
- Hiding internal implementation and showing functionality only to the user 

__________________________
### interfaces
- all the variables in the interfaces are final and static.

- interfaces are not classes and only contain abstract methods.

- to extend interfaces with interfaces we use extends keyword

- syntax

```java
interface X{
    public abstract void run();
}

interface Y extends X{
}

```


- uses implements keyword to implement through a class(can implement multiple interfaces)


- syntax:
```java
interface A{
    public abstract void show();
    public abstract void config();
}
interface X{
    public abstract void run();
    
}
class B implements A, X{
    public void show(){
        
    }
    public void config(){

    }
    public void config(){

    }
}
```


```java
interface A{
    int age = 44; //final and static
    String area = "Bombay";
    
    public abstract void show();
    public abstract void config();
}
class B implements A {
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
    
}
 public class Demo{
    public static void main(String args[]){
        A obj = new B();
        obj.show();
        obj.config();
        System.out.println(A.area);

    }
 }
```
________________________________________


### Enumerate(enum):

- we cannot extend enum class. otherwise it acts like a class

```java
enum Laptop{
    Macbook(2000), XPS(2200), Surface, Lenovo(1800);
    
    private int price;

    private Laptop() {
        this.price = 500;
    }

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

 public class Demo{
    public static void main(String args[]){
        //Laptop lap = Laptop.values();
        for(Laptop lap: Laptop.values()){
            System.out.println(lap + ": "+lap.getPrice());
       }
    }
 }
 ```