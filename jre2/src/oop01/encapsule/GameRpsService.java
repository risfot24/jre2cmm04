package oop01.encapsule;

//
/*
Date :2015�� 5�� 15�� 
Author : �̼��� 
Description : ���� , ���� , �� ���� ����
 1�� ������ 2�� ���� 3�� ��
 
  
  
 */

public class GameRpsService {

	
	/*
	 ���� ���� ���� ����, ����, �� ���� ����  
	 
	 */
	public String showRpsValue(int playerValue) {
		//int key = playerValue;
		
		String result = "";
		switch (playerValue ) {
		case 1:
		      
			   result ="����";
			break;

		case 2:
			  result = "����";
			break;
		
		case 3:
			result = "��";
			break;
		default : result ="�ٽ� ������� ";
		 break;
		}
		
		return result;
		
		
	}
	/*
	 ��ǻ�Ͱ� �������� �߻���Ų �� 1~3 ����
	 */

	public String displayComValue() {
	    int comValue =  (int)(Math.random() * 3)+1 ;
	    String result= " ";
	    
	    switch (comValue) {
		case 1:
			   result = "����";
			break;

		case 2:
			result = "����";
			break;
		
	    
	    case 3:
	    	result = "��";
	        break;
	    default : result = "�ٽ� �Է��ϼ���."; break;
	    }
		
		return result ;
	}

	public String showWinner() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	

}
