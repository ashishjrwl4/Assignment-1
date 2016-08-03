import java.util.Scanner; 
public class Ass_1 {

	public static void main(String[] args) {
		Product_detail obj1 = new Product_detail(); 
		int g; //new variable formed 
		
		
        Scanner user_in= new Scanner(System.in);
    System.out.println("hello world");
    int e, f ,i;
    e = user_in.nextInt();
    f = user_in.nextInt();
    i = user_in.nextInt();
    
    System.out.println("value of e" + e);
    System.out.println("value of f: " + f);
    System.out.println("value of i" + i);
    
    
    
    int j;
     j = user_in.nextInt();
     
     switch(j){
      case 0 :
    	 System.out.println("Enter the Product Name");
         obj1.Product_name = user_in.next();
         
         System.out.println("Enter the Product Code");
         obj1.Product_code = user_in.next();
         
         System.out.println("Enter the Product Brand");
         obj1.Product_brand = user_in.next();
         
         System.out.println("Enter the Product Cost");
         obj1.product_cost= user_in.next();
         
         break;
   
         default :
    	 System.out.println("Wrong Input");
    	 
    	 }
       int z;
      z = user_in.nextInt(); 
     switch(z){
     case 0:
    	 System.out.println("hello world");
    	 break;
     case 1:
    	 System.out.println("hi everyone");
    	 break;
    	 
     
     
     
     
     
     }
     
     
     
     
     
     
     System.out.println("to know the product detail press 0");
     
     
     
     int k;
  k = user_in.nextInt();
  
  switch(k){
  
  case 0 :
 	 System.out.println("name of product is :" + obj1.Product_name);
 	 System.out.println("code of product is:" + obj1.Product_code);
 	 System.out.println("brand of product is:" + obj1.Product_brand);
 	 System.out.println("cost of product is :" + obj1.product_cost);
      
      break;
      
  default :
 	 System.out.println("wrong inout ");
 	   }     }}

