package oop01.syntax;

public class AverageA {
	String name;
	int kor;
	int eng;
	

	public static void main(String[] args) {
		// tot, avg ���������� �����Ͻð�
        // �Ʒ��� ���� ��� �ǵ��� ���ּ���. // ������ �ϵ��ڵ����� �־ �ȴ�.
		/*
		   System.out.println("===��ũ�� ����ǥ ===");
		   System.out.println("���� : 100��");
		   System.out.println("���� : 70��");
		   System.out.println("���� : 170��");
		   System.out.println("��� : 85��");
		   System.out.println("============");
		*/
		  // ���̾�
		  // �丣
		System.out.println("===============================");
		
		AverageA Hulk = new AverageA();
		AverageA iron = new AverageA();
		AverageA Thor = new AverageA();
		
		int Tot = 0; 
		double Avg = 0 ;
		
		Hulk.name = "��ũ";
		Hulk.kor = 100;
		Hulk.eng = 70;
		Tot = Hulk.kor + Hulk.eng;
		Avg = Tot / 2;
		System.out.println("===" + Hulk.name + "�� ����ǥ ===");
		System.out.println("���� : " + Hulk.kor);
		System.out.println("���� : " + Hulk.eng);
		System.out.println("���� : " + Tot);
		System.out.println("��� : " + Avg);
		System.out.println("============");

		iron.name = "���̾��";
		iron.kor = 95;
		iron.eng = 100;
		Tot = iron.kor + iron.eng;
		Avg = Tot / 2;   //(double) (tot/2) ; //�ϵ� �ڵ� 
		                 //double avg = tot/2d;
		System.out.println("===" + iron.name + "�� ����ǥ ===");
		System.out.println("���� : " + iron.kor);
		System.out.println("���� : " + iron.eng);
		System.out.println("���� : " + Tot);
		System.out.println("��� : " + Avg);
		System.out.println("============");

		Thor.name = "�丣";
		Thor.kor = 100;
		Thor.eng = 70;
		Tot = Thor.kor + Thor.eng;
		Avg = Tot / 2;
		System.out.println("===" + Thor.name + "�� ����ǥ ===");
		System.out.println("���� : " + Thor.kor);
		System.out.println("���� : " + Thor.eng);
		System.out.println("���� : " + Tot);
		System.out.println("��� : " + Avg);
		System.out.println("============");

	}

}
