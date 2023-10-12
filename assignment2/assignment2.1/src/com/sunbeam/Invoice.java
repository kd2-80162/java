/* Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store. An Invoice should include four pieces of information as fields—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities. */


package com.sunbeam;

import java.util.Scanner;

public class Invoice {
	
	private String partno;
	private String part_description;
    private int quantity;
    private double price;
    
    public Invoice()
    {

    	String partno=" ";
    	String part_description=" ";
        int  quantity=0;
        double price=0;
    }
    
	public Invoice(String partno, String part_description, int quantity, double price) {
		super();
		this.partno = partno;
		this.part_description = part_description;
		if(quantity<=0)
		{
			this.quantity = 0;
		}
		else {
		this.quantity = quantity;
		}
		if(price<=0)
		{
			this.price=0;
		}else {
		this.price = price;}
	}

	public String getPartno() {
		return partno;
	}

	public void setPartno(String partno) {
		this.partno = partno;
	}

	public String getPart_description() {
		return part_description;
	}

	public void setPart_description(String part_description) {
		this.part_description = part_description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity>0)
	   {this.quantity = quantity;}
		else {
			this.quantity=0;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price>0)
			{this.price = price;}
			else {
				this.price=0;
			}
	}
	
	
	public void CalculateInvoiceAmt()
	{
	  	double totalBill=(this.quantity * this.price);
	  	System.out.println("total amount = " + totalBill);
		
	}
	public void AcceptData()
	{    System.out.println("Enter the values ");
        
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter part number");
	    this.partno=sc.next();
	    System.out.println("Enter The part Discription");
	    this.part_description=sc.next();
	    System.out.println("Enter The Quantity");
	    this.quantity=sc.nextInt();
	    System.out.println("Enter the Price");
	    this.price=sc.nextDouble();
	    		
	}
	public void Displaydata()
	{
		System.out.println(this.part_description);
		System.out.println(this.partno);
	    System.out.println(this.quantity);
		System.out.println(this.price);
	}
    
}
