package oop02.encapsule;

import java.util.Scanner;

public class NumberController {
	
	public static void main(String[] args) {
		
		NumberMatchService nms = new NumberMatchService();
		
		System.out.println("�� 3ȸ�� �Է°����մϴ�. ");
		Scanner scan = new Scanner(System.in);
		
		//int result = 0 ;
	    for(int i= 0 ; i <3 ; i++){
         
	    nms.input();
	    nms.check(i);
	    
			
			
		}
	
		
		

	}

}
