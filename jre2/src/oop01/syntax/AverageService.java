package oop01.syntax;

public class AverageService {
     // VO �� �ִ� avg(), tot() �޼ҵ� ��
	 // ���񽺿��� ó���ϵ��� ���ּ���.
	 private AverageDVO dvo = new AverageDVO();
	
	public void Input(String name, int kor, int eng) {
		
		dvo.setName(name); 
		dvo.setKor(kor);
		dvo.setEng(eng);
		
		
	}
	
	public int getTotal(){
		return dvo.getKor() + dvo.getEng();
	}
	public double getAverage(){
		return getTotal() / 2d;
	}
	
	
}
