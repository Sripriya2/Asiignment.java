package com.Multiple;

public class MultipleException {
	void multiExp() {
	try{    
        int a[]=new int[0];    
        a[50]=10/0;    
        System.out.println(a[10]);  
       }    
       catch(ArithmeticException e)  
          {  
           System.out.println("Arithmetic Exception occurs");  
          }    
       catch(ArrayIndexOutOfBoundsException e)  
          {  
           System.out.println("ArrayIndexOutOfBounds Exception occurs");  
          }    
       catch(Exception e)  
          {  
           System.out.println("Parent Exception occurs");  
          }             
       System.out.println("rest of the code");    
  }
}



