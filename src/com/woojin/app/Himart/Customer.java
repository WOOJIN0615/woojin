package com.woojin.app.Himart;

public class Customer extends Machine {
	
	private int money=1000;
	private int point=0;
	
	public void info() {
		System.out.println("현재금액 : "+money);
		System.out.println("현재포인트 : "+point);
	}
	
	//buy
	public void buy(Machine machine) {
		if (this.money>=machine.getPrice()) {
			this.money = this.money - machine.getPrice();
			this.point = this.point + machine.getPoint();
			this.info();
		}else {
			System.out.println("금액이 부족합니다");
		}
	}
	
	public void buy(Machine[] machines) {
		for (int i=0; i<machines.length; i++) { //물건을 또 산다면
			this.buy(machines[i]);
		}
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}

}
