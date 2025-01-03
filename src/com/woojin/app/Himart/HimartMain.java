package com.woojin.app.Himart;
import com.woojin.app.Himart.*;

public class HimartMain {

	public static void main(String[] args) {
		Computer pc = new Computer();
		Tv t = new Tv();
		Washer w = new Washer();
		
		Customer customer = new Customer();
		t.info();
		pc.info();
		w.info();
		customer.info();
		customer.buy(pc);
		
	}
	

}
