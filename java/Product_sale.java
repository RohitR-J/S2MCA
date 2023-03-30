import java.util.Scanner;

class Product{
    int pcode,price;
    String pname;
   Product(){

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter pname");
       pname = sc.nextLine();
       System.out.println("Enter pcode");
       pcode = sc.nextInt();
       System.out.println("Enter price");
       price = sc.nextInt();
   }
   void min_price(Product p1,Product p2,Product p3){
       if(p1.price < p2.price){
           if(p2.price < p3.price){
               System.out.println("min price is : "+p1.price);
           }
           else
               System.out.println("min price is : "+p3.price);
       }
   }
   void display(Product p1,Product p2,Product p3){
       System.out.println("---product1 details---");
       System.out.println(p1.pname);
       System.out.println(p1.pcode);
       System.out.println(p1.price);
       System.out.println("---Product2 details---");
       System.out.println(p2.pname);
       System.out.println(p2.pcode);
       System.out.println(p2.price);
       System.out.println("---Product3 details---");
       System.out.println(p3.pname);
       System.out.println(p3.pcode);
       System.out.println(p3.price);
   }
}
public class Product_sale {
    public static void main (String[] args){
        Product a = new Product();
        Product b = new Product();
        Product c = new Product();
        a.min_price(a,b,c);
        a.display(a,b,c);
    }
}
