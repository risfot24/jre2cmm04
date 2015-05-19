package oop02.encapsule;

import java.util.Scanner;

public class RpsController {

	public static void main(String[] args) {
	  RpsService service = new RpsService();
	  
	  System.out.println("���������� ������ �����մϴ�.");
	  System.out.println("1.���� , 2.���� , 3.���ڱ� �� �Է��ϼ���.");
	  Scanner scan =new Scanner(System.in);
    
	  int playerVal = scan.nextInt();
	  if(playerVal < 1 || playerVal > 3 )
	  {
	  service.check(playerVal);
	  }else{
	       System.out.println("�÷��̾��"+ service.showRpsVal(playerVal) +"�½��ϴ�.");
	       int comVal = service.displayComVal(); 
	       service.comtext(comVal);
	       System.out.println("��ǻ�ʹ� "+ service.comtext(comVal) +"�½��ϴ�. ");
	       String winner = service.showWinner(playerVal, comVal);
	       System.out.println(winner + ""+"�� �̰���ϴ�.");
	  }
	}

}
