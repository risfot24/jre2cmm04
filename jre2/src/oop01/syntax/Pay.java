package oop01.syntax;

import java.util.Scanner;

public class Pay {
  private String name;
  private int salary;
  static final double TAX = 0.1;
  //�ʵ忡���� �⺯ �߰��Ͻ������ð� ���� �޼ҵ忡�� ����ϰԲ� �ϼ���..
  //get ,set �� �����ϴ�. ! ���ڱ� getter, setter �߰��Ϸ���~~ ���� ���Ѵ�.. ! ��ĳ�ʵ� ���� ����..
  // ���� ������ ���� �����Ҽ� ���� �ʾƿ�?? ���� ���� ������..
  //�׳� �ϵ� �ڵ��ض�
  
  /*
  paRefy(String name, int salary){
	  
  }
  */
  
  
	public static void main(String[] args) {
	   System.out.println("===��ũ�� 5���� ��޿��� 300���� �Դϴ�.");	
	   System.out.println("===���̾���� 5���� ��޿��� 500���� �Դϴ�.");	
	   System.out.println("===�丣�� 5���� ��޿��� 100���� �Դϴ�.");	
	   
	   System.out.println("==================================");
  
	   int income = 0 ;
	   
	   Pay paRef = new Pay();  //���������� �����ϴ� ���
	    
	   //Pay hulk = new Pay();
	   //Pay iron = new Pay();
	   //Pay thor = new Pay();
	    
	   //��Ȯ�� �ҷ��� : hulk.name , hulk.salary,  
	   
	    paRef.name = "��ũ";
	    paRef.salary = 3000000;
	    income = (int) ( paRef.salary -( paRef.salary *(1-paRef.TAX) ) );
	    //(int)((1-Pay.TAX)*pay.salary) // Pay.TAX -> TAX
	    
	    
	    System.out.println(paRef.name +"5���� ��޿��� �� ���� : " +paRef.salary+" , "+income );
	    
	    paRef.name = "���̾��";
	    paRef.salary = 5000000;
	    
	    income = (int) ( paRef.salary -( paRef.salary *(1-paRef.TAX) ) );
	    
        System.out.println(paRef.name +"5���� ��޿��� �� ���� : " +paRef.salary+" , "+income );
	    
	    
	    paRef.name = "�丣";
	    paRef.salary = 1000000;
        income = (int) ( paRef.salary -( paRef.salary *(1-paRef.TAX) ) );
	    
         System.out.println(paRef.name +"5���� ��޿��� �� ���� : " +paRef.salary+" , "+income );
	    
	
	}
	
	

	
	
}
