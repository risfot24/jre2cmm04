package oop02.encapsule;

public class RpsService {
	
	//��ǻ�Ͱ� �������� �߻���Ų �� 1 ~3 ����
	public int displayComVal() {
		return (int) ((Math.random()*3)+1);
		 
	}
	
	
	
	//showWinner
	//���ڸ� �����ִ� ����
	public String showWinner(int playerVal, int comVal) {
	int result = playerVal - comVal ;
	//(Math.abs(playerVal - comVal))  //���⼭ ���� �ȵȴ�..
	   String msi = "";
		switch (result) {
		case -2:
		case 1:
			msi = "����";
			break;

		case 0:
			msi = "���� �� �� ��";
			break;
   
			
		case -1:
		case 2:
			msi = "��ǻ��";
			break;

          /*default : msg = "�÷��̾ �����ϴ�. " ; break;
		   
			
			*/
			
		}

		return msi;
	}
	
	
	//���ڿ� �Ҵ�� ����,����,�������� ���ڷ� ��ȯ�ؼ� �����ִ� ��Ȱ
	public String showRpsVal(int playerVal){
		
		RpsVO VO = new RpsVO();
		String result = "";
		switch (playerVal) {
		case 1:
			result = "����";
			VO.setScissors(playerVal);
			VO.setRpsValue(result);
			break;

		case 2:
			result = "����";
			VO.setRock(playerVal);
			VO.setRpsValue(result);
			break;

		case 3:
			result = "��";
			VO.setPaper(playerVal);
			VO.setRpsValue(result);
			break;
		default:
			result = "�ٽ� ������� ";
			break;
		}

		return result;

	}
	public void check(int playerVal){
		int a =1 , b = 3 ;
		RpsUtil util = new RpsUtil();
		  System.out.println(util.showRange(a, b)); 
		  System.out.println(util.showWrongType());
		
		
	}



	public String comtext(int comVal) {
		
		String result = "";
		switch (comVal) {
		case 1:
			result = "����";
			
			break;

		case 2:
			result = "����";
			
			break;

		case 3:
			result = "��";
			
			break;
		default:
			result = "�ٽ� ������� ";
			break;
		}

		return result;
		
		
	}



	



	

	

}
