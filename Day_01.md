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




__________________
## Object Oriented Programming

### objects

- instance of a class

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



### inheritance
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