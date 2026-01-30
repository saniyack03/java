import java.util.Scanner;
class Product{ 
//data members
  int pcode;
  String pname;
  double price;
  
  //1.default constructor
  Product() {
     pcode = 0;
     pname = "Unkown";
     price = 0;
  } 
  
  //2.parameterized constructor
  Product(int c, String n, double p) {
      pcode = c;
      pname = n;
      price = p;
    }
   
   //method to display details
   void display() {
       System.out.println(pcode + "\t" + pname + "\t" + price);
      }
    }
   
public class ProductMain {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    Product p1 = new Product(101,"Laptop",45000.00);
    
    System.out.println("Enter the details for Product 2:");
    
    System.out.print("product code:");
    int c2 = sc.nextInt();
    sc.nextLine();
    System.out.print("Product name:");
    String n2 = sc.nextLine();
    System.out.print("Price:");
    double pr2 = sc.nextDouble();
    
    Product p2 = new Product(c2,n2,pr2);
    
    System.out.println("Enter the details for Product 3:");
    Product p3 = new Product();
    System.out.print("Product code:");
    p3.pcode = sc.nextInt();
    sc.nextLine();
    System.out.print("Product name:");
    p3.pname = sc.nextLine();
    System.out.print("Price:");
    p3.price = sc.nextDouble();
    System.out.println("\n---Product with lowest Price---");
    Product low = p1;
    if(p2.price < low.price) {
        low = p2;
    }
    if(p3.price < low.price) {
        low = p3;
    }
    System.out.println("Code\tName\tPrice");
    low.display();
    }
 }   
    
