package oop01.encapsule;

import java.util.Scanner;

public class PayController {
 
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	PayService Service = new PayService();
	String name;  //���� �� ������ �� �Է� �޴´�..
	int salary;     //����� �빮�ڷ� 

	   /*
	    * income = salary - tax
	    * PayController : �����
	    * PayService : ������
	    * PayVO  : GETTER, SETTER 
	    * ���� �� ���� �ϼ���.
	    * �̸��� �޿��� �Է¹޾Ƽ�
	    * ���� �� �� �ҵ��� ���ϴ� �����Դϴ�.
	    */
	
	  System.out.print("���� :  ");
	  name = scan.next(); 
	  System.out.print("���� : ");
	  salary = scan.nextInt(); 
	  Service.exe(name, salary);   //exe -> calculateIncome
	  //Service.output();
	  System.out.println("==== �޿� ���� ====");
	  System.out.print("���� : "+Service.name()+"\n");
	  System.out.print("����: "+Service.Salary()+"\n");
	  System.out.print("���� : "+Service.income()+"\n");
	  System.out.print("���� : "+Service.taxcalc());
	  
	  
	  
	  //System.out.println("�Ǽ��ɾ� : ");
     // System.out.print(Service.name());
	  //System.out.print(Service.VO.getName());	
      
	
	
	}

}
