package oop01.game;

import java.util.Scanner;

public class NumberMatchService {
private int result;
NumberMatchVO nvo = new NumberMatchVO();
  
public void input(){
	//  int getp, getc = 0;
	 
	  
	  Scanner scan = new Scanner(System.in);
	  System.out.println("1���� 5���� ������ �Է��ϼ���.");
	  try { 
			int in = scan.nextInt();
			nvo.setPlayer(in);
			
         
		}catch(Exception e) {// ����� ���ִ� ��Ȱ!
         System.out.println("���ڴ� �ȵ˴ϴ�. "); 
			
		}
		if(nvo.getPlayer() == 0){
			System.out.println("�ٽ� �Է��� �ֽʽÿ�");
		}else{ 
			nvo.setCom(); 
			this.result = nvo.game(nvo.getCom(),nvo.getPlayer()); //void ������ int ���� ��ü�� �ȵ�..
			//this.result =  
					//nvo.game(getc, getp); 
		    
		}
		
  }

public void check(int i){
		
	  for( ; i<3;i++){
		if(this.result == 1){
			System.out.println("���ƽ��ϴ�. " + "������ ���� �մϴ�. ");
			break;
		}else if( i == 2){
			System.out.println("3ȸ ��� �����߽��ϴ�. "+
		                       "\n ���ӿ��� �й��ؽ��ϴ�. "+
					           "\n ������ �����մϴ�. "
					);
		}
	  }
  
  }



	  
  }
 

