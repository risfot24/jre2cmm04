package oop02.encapsule;

public class NumberMatchVO {
	  private int player;
	  private int com;
	  private int count = 3;
	  private int result;

	  public void setPlayer(int player) {
			if (player < 1 || player > 5) {
				System.out.println("1���� 5������ ������ �Է��ؾ� �մϴ�. ");
			} else {
				this.player = player;
			}

		}
	  public int getPlayer() {
			return player;
		}
	  public int getCom() {
			return com;
		}

		public void setCom() {
			this.com = (int)((Math.random() * 10) + 1);
		}
		
		public int game(int com, int player) {
			int result;
			//int count = 0;
			if (getPlayer() == getCom()) {
			   --this.count;
				System.out.println(getPlayer() + "���� !! ");
				System.out.println(this.count+"�� ���ҽ��ϴ�.");
				result = 1; //return 1
			} else {
				--this.count;
				System.out.println("Ʋ�ǽ��ϴ�. ");
				System.out.println("��ǻ�Ͱ� ������ ���� " + getCom() + "�Դϴ�. ");
				System.out.println(this.count+"�� ���ҽ��ϴ�.");
				result = 0;  // return 0
			}
			 return result;
		 // this.result = result;
		}
		

}
