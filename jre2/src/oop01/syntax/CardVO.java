package oop01.syntax;
/*
 * Date :
 * Author :
 * Desc : static ����
 */


public class CardVO {
	private String kind; // ī���� ���� 
    private int number;   //ī�� ����
    static int width = 100;  //ī�� �� ��      //���� �� ����Ʈ�� �о��??
    static int height = 250;  //ī�� �� ����
    
	public CardVO() {
		
	}
    
    public CardVO(String name, int number) {
    	this.kind = name;
    	this.number = number;
	
	}
    


	public String kind(){
    	return this.kind;
    }
    public int number(){
    	return this.number;
    }

}
