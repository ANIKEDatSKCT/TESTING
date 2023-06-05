package com.testNG.Report;

import org.testng.Assert;
import org.testng.annotations.Test;

  

  public class Day7task2 {
    @Test
    public void add() {
  	  int a =10 ;int b=70;
  	  
  	  int c= a+b;
  	  Assert.assertEquals(c, 80);
  	  
    }
    @Test
    public void subtract() {
  	  int a =30 ;int b=10;
  	  
  	  int c= a-b;
  	  Assert.assertEquals(c, 20);
  	  
    }
    @Test
    public void multiply() {
  	  int a =20 ;int b=50;
  	  
  	  int c= a*b;
  	  Assert.assertEquals(c, 1000);
  	  
    }
    @Test
public void divide() {
    	int a =200 ;int b=20;
    	int c= a/b;
    	Assert.assertEquals(c, 10);


}
  
   
  }

