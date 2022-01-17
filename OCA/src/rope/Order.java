package rope;

public class Order {

     String result = "t";
    {result += "a";}
    {result += "c";}

     int a;

    public Order(){
        result += "b";
    }

    public Order(String s){
        result += s;
    }

    public static void main(String[] args) {
        Order order = new Order("f");
        order = new Order();
        System.out.println(order.result);
    }

     void defaultMethod() {

    }

}