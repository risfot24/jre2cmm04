package oop01.syntax;

public class AverageB {
	String name;
	int kor;
	int eng;
	/*�޼ҵ带 ���⿡ �����ϼ��� .!���� �����!*/
	/*�޼ҵ��� ��üȭ�� ���ּ���. */
    void Input(String name, int kor, int eng){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
    	
	}
	
    int Tot(){
    int Tot = 0;
    Tot = this.kor + this.eng;
	return Tot;
    }
    
    double Avg(){
    double Avg = 0;
    Avg = Tot()/2 ;
    return Avg;	
    }
    
	
	public static void main(String[] args) {
		AverageB Hulk = new AverageB();
		AverageB iron = new AverageB();
		AverageB Thor = new AverageB();
		
		
		//Hulk.i �ȵȴ�..
		Hulk.Input("��ũ",100,70);
	
		
		
		
		
		System.out.println("===" + Hulk.name + "�� ����ǥ ===");
		System.out.println("���� : " + Hulk.kor);
		System.out.println("���� : " + Hulk.eng);
		System.out.println("���� : " + Hulk.Tot());
		System.out.println("��� : " + Hulk.Avg());
		System.out.println("============");

		
		/*
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

		*/
	}
	


}
