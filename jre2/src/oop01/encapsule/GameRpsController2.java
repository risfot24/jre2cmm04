package oop01.encapsule;

import java.util.Scanner;

public class GameRpsController2 {

	public static void main(String[] args) {
		System.out.println("���������� ������ �����մϴ�.");
		boolean flag = true ;
		while(flag){
			GameRpsService service = new GameRpsService();
			Scanner scan = new Scanner(System.in);
			System.out.println("����:1 ����:2 ��:3 �� �Է��غ�����.");
			GameRPSValidation valid = new GameRPSValidation();
			try {
				int player = scan.nextInt();
				int a = 1;
				int b = 3;
				if (player < 1 || player > 3) {
					// System.out.println(valid.showRange(a,b));
					continue;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
					
	}
}
				//String playerRPS = vo.setRpsValue(player);
				
				
			
			
			
			
		
		
