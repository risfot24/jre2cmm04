package oop01.encapsule;

import java.util.Scanner;

public class KaupVO {

	private double height;
	private double weight;
	private double idx; 
	//ü�ߵ� ���������̴�.. ����ȭ
	private String msg;
	Scanner scan = new Scanner(System.in);

	public void exe() {
		 setHeight(height); //���� set �� �Ű����� �Ͽ��� ó�� ���ص��ȴ�.. ���⿡���� 
		 setWeight(weight);
		 setIdx(height,weight);
		 // toString();
		//Input();
		 scan.close();
		 setMsg(msg);//setMsg(getMsg) �Է��� ���ߴµ� �Ҹ��� null ���� �Է��� �ȴ�...
		Display();

	}

	public void setMsg(String msg) { //setMsg 
		//String msg = "";
		
		if (idx > 30) {this.msg = "��";} 
		else if (idx > 24) {this.msg = "��ü��";} 
		else if (idx > 20) {this.msg = "��ü��";} 
		else if (idx > 15) {this.msg = "����";} 
		else if (idx > 13) {this.msg = "�������";} 
		else {this.msg = "�Ҹ��� ";}
		
		//this.msg = msg;
		//return msg;
	}

	@Override
	public String toString() {
		return "KaupService [height=" + height + ", weight=" + weight
				+ ", idx=" + idx + " " + getMsg() + "]";
	}

	private void Display() {
		System.out.println(toString());
	}
/*
	private void Input() {
		System.out.print("Ű�� �Է��ϼ���: ");
		this.height = scan.nextDouble();
		System.out.print("�����Ը� �Է��ϼ���: ");
		this.weight = scan.nextDouble();
		

	}
	*/
		
		public double getHeight() {
			return height;
		}
         
		public void setHeight(double height) {
			System.out.print("Ű�� �Է��ϼ���: ");
			height = scan.nextDouble();
			this.height = height;
		}
		
		public double getWeight() {
			return weight;
		}
      
		public void setWeight(double weight) {
			System.out.print("�����Ը� �Է��ϼ��� :");
			weight = scan.nextDouble();
			this.weight = weight;
		}
		
		public double getIdx() {
			return idx;
		}
        
		public void setIdx(double height, double weight) {
			this.idx = (int) weight / ((height * height)) * 10000;
			//this.idx = idx;
		}
		public String getMsg() {
			return msg;
		}
		
        
		//KaupService ks = new KaupService();
		
	
		
	}


