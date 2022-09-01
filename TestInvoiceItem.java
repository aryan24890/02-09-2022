package com.oops.bll;

public class TestInvoiceItem {
	  public static void main(String[] args) {
	      
	      InvoiceItem I1=new InvoiceItem("1","hard disk",5,4000);
	      
	      System.out.println("ID : " + I1.getId());
	      System.out.println("Description : " + I1.getDesc());
	      System.out.println("Quantity : " + I1.getQty());
	      System.out.println("Unit Price : " + I1.getUnitPrice());
	      System.out.println("Total : " + I1.getTotal());
	      
	      System.out.println("**************" );
	      
	      I1.setUnitPrice(4000);
	      System.out.println("Total : " + I1.getTotal());
	      
	      System.out.println("**************" );
	      
	      System.out.println(I1);
	      
	      
	      
	   }

}