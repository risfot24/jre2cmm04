package oop01.syntax;

public class CardMain {

	public static void main(String[] args) {
		//System.out.println("ī�� ���� : ");
		//System.out.println("ī�� �ʺ� : ");
		
		// �������� �����Ͻð� == �ν��Ͻ� ���� �ϼż� (2), �Ʒ� ��� ó��
		// ��� �ǵ��� ���ּ��� 
		
		 
		//System.out.println("�÷��̾��"+ "��Ʈ" +"3�̰� ");  //heart, spade 
        //System.out.println("��ǻ�Ͱ�"+" �����̽�"+" 5"+"�� �̰���ϴ�.");
	
	  System.out.println("--------------------------------");
	  
	  System.out.println("ī�� ���� : "+CardVO.height );
	  System.out.println("ī�� �ʺ� : "+CardVO.width);
	
	  CardVO Player = new CardVO("heart",3);
	  //�̹� ��ü �����ϱ�����  static���� �ö� �ִ�..
	  
	  System.out.println("�÷��̾�� : "+Player.kind()+","+Player.number() );
	  
	  CardVO com =new CardVO();
	  
	 
	  
	  
	
	
	}

}
