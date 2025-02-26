package Basics;

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
       for(Laptop lap: Laptop.values()){
            System.out.println(lap + ": "+lap.getPrice());
       }
    }
 }