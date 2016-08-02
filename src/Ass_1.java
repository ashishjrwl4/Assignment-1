import java.util.Scanner; 
public class Ass_1 {

	public static void main(String[] args) {
		Product_detail obj1 = new Product_detail();
		
		
        Scanner user_input = new Scanner(System.in);
    
    System.out.println("To enter the product detail press 0");
    
        
        
        int j;
     j = user_input.nextInt();
     
     switch(j){
     
     case 0 :
    	 
         
         System.out.println("Enter the Product Name");
         obj1.Product_name = user_input.next();
         
         System.out.println("Enter the Product Code");
         obj1.Product_code = user_input.next();
         
         System.out.println("Enter the Product Brand");
         obj1.Product_brand = user_input.next();
         
         System.out.println("Enter the Product Cost");
         obj1.product_cost= user_input.next();
         
         break;
    
  
     
         
         
     default :
    	 System.out.println("Wrong Input");
    	 }

     System.out.println("to know the product detail press 0");
     
     
     int k;
  k = user_input.nextInt();
  
  switch(k){
  
  case 0 :
 	 System.out.println("name of product is :" + obj1.Product_name);
 	 System.out.println("code of product is:" + obj1.Product_code);
 	 System.out.println("brand of product is:" + obj1.Product_brand);
 	 System.out.println("cost of product is :" + obj1.product_cost);
      
      
     break;
      
  default :
 	 System.out.println("Wrong Input");
      
     
    }
}
}
