package oop01.syntax;

/*
 * �����ڴ� �ν��Ͻ��� �����ɶ�
 * ȣ�� �Ǵ� '�ν��Ͻ� �ʱ�ȭ �޼ҵ� ' �̴�.
 * 
 */

class MilkCoffee{
	public int money;
	public boolean exist;
	
	public MilkCoffee(){
		//this(500);
		//this(200,true);
		System.out.println("���� �ִ�");
		
	}
	
	public MilkCoffee(int money){
		//this(); //��
		this(200,true);
		
		System.out.println(money + "��");
		
		
	}
	public MilkCoffee(int money, boolean exist){
		
		//this(200); //��
		this();
		System.out.println(
         "���Ű��ɿ��� : "+ (exist == true ? "Ŀ����������" : "Ŀ�Ǿ��� "));
		
	}
	
	
}

public class CoffeeB {
	
	public static void main(String[] args) {
		
		//MilkCoffee milk = new MilkCoffee(500,true); //��
		
		//MilkCoffee milk2 = new MilkCoffee();	
	    //milk.money = 200;
		//milk.exist = false;
		//milk.exist = true;
	   
		//MilkCoffee milk2 = new MilkCoffee();	
	  // milk2.money = 300; 
	   //MilkCoffee milk3 = new MilkCoffee(400);
	
	 //�ν��Ͻ��� ������ �ʴ� �ּҰ��� ����... ������ �ʴ� �ּҸ� �������ִ�.
	}

}
