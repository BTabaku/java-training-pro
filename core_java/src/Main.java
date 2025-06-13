class Mobile {
    String brand;
    int price;
    static String Name;

    public void show(){
        System.out.println(brand+" : " + price + " : " + Name);
    }

    public static void show1(Mobile obj){

        System.out.println(obj.brand+" : " + obj.price + " : " + Name);
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();

        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.Name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1200;
        obj2.Name = "SmartPhone";

        obj1.show();
        Mobile.show1(obj1);

    }
}