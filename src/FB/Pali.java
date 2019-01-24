package FB;

import java.util.Scanner;

class Pali{  
	 public static void main(String args[]){  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("enter the number");
	  int n = sc.nextInt();
	  int r,
	  sum = 0,temp;    
	  //int n=121;//It is the number variable to be checked for palindrome  
	  
	  temp=n;    
	  while(n>0){    
	   r=n%10;  //getting remainder  
	   sum=(sum*10)+r;    
	   n=n/10;    
	  }    
	  if(temp==sum)    {
	   System.out.println("palindrome number ");    }
	  else    {
	   System.out.println("not palindrome");  }
	  sc.close();
	}  
	 
	}  