package oop02.encapsule;

import java.util.Scanner;

public class GameRpsController {

	public static void main(String[] args) {
		
		System.out.println("����,����,��, ������ �����մϴ�.");
		System.out.println("1.����,2.����,3.��  ���Է��ϼ���.");  //��ĳ�ʰ� �־�� �ٳ�?
		Scanner scan = new Scanner(System.in);
		int playerValue = scan.nextInt();
		
		GameRpsService service = new GameRpsService();
		//service.showRpsValue(playerValue);
		System.out.println("�����"+service.showRpsValue(playerValue) +"�� �½��ϴ�.");
		
		//int comValue = service.displayComValue();
		
		System.out.println("��ǻ�ʹ�"+service.displayComValue() +"�� �½��ϴ�.");
		
		String winner = service.showWinner();
		System.out.println(winner+"�� �̰���ϴ�.");
		
	}

}
