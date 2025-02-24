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