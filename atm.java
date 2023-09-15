import java.util.*;
public class atm {

	public static void main(String[] args) {
		
		  int b= 100000;  
          int ch,w,d;
	       
	        Scanner sc = new Scanner(System.in);  
	        System.out.println("ATM Machine");  
	       
	       while(true)
	        {  
	              System.out.println("Enter Your Choice");
	              System.out.println("1:Withdrawn\n2:Deposit\n3:Balance Check\n4:EXIT");
	              ch= sc.nextInt();  
	              switch(ch)  
	              {  
	                case 1:  
	                           System.out.print("How much money you have to withdrawn:");  
	                           w= sc.nextInt();  
	                           if(b >= w)  
	                           {  
	                              b= b - w;  
	                              System.out.println(b+"  is your remaining balance ");  
	                            }  
	                            else  
	                             {  
	            
	                                 System.out.println("Insufficient Balance");  
	                              }  
	                             System.out.println("");  
	                            break;  
	              case 2:  
	                      
	                             System.out.print("Enter money to be deposited:");  
	                             d = sc.nextInt();  
	                             b = b + d;            
	                             System.out.println(b+" is your new balance");  
	                             System.out.println("");  
	                             break;  
	   
	              case 3:  
	                            System.out.println("Balance : "+b);  
	                             System.out.println("");  
	                                    break;  
	   
	               case 4:  
	         
	                         System.exit(0);  
	            }  
	        }
	
	    }  
}



