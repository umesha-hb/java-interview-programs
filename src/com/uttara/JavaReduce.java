package com.uttara;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;


public class JavaReduce {

	public static void main(String[] args) {
		List<Invoice> invoices = Arrays.asList(
                new Invoice("A01", BigDecimal.valueOf(9.99), BigDecimal.valueOf(1)),
                new Invoice("A02", BigDecimal.valueOf(19.99), BigDecimal.valueOf(1.5)),
                new Invoice("A03", BigDecimal.valueOf(4.99), BigDecimal.valueOf(2))
        );
		BigDecimal  sum = invoices.stream().
		map(x -> x.getQty().
				multiply(x.getPrice()))
		.reduce(BigDecimal.ZERO,(a,b)->a.add(b)); 
		System.out.println("sum  :  "+sum);
	}

}
class Invoice {

    String invoiceNo;
    BigDecimal price;
    BigDecimal qty;
    
	public Invoice(String invoiceNo, BigDecimal price, BigDecimal qty) {
		super();
		this.invoiceNo = invoiceNo;
		this.price = price;
		this.qty = qty;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public BigDecimal getQty() {
		return qty;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public void setQty(BigDecimal qty) {
		this.qty = qty;
	}

   
}