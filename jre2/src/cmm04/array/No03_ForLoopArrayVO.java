package cmm04.array;

public class No03_ForLoopArrayVO {
	
	void input(){
		int[] arr = {1,2,3,4,5};
		//int[] arr = {0,0,0,0,0};
		//int[] arr = {};
		// int[] arr = arr[5];
		/*
		 * 1���� 5������ ���� ���ϼ���
		 */
		int i = 0, result = 0;
		for (; i < arr.length; i++) {
			//arr[i] = i+1 ; //arr[i] += i ;
			result += arr[i];
		}
		/*
		 * ���� for�� ��� 
		 * index �� �������� �ʱ� ������ �� �Ⱦ�������.	
		 */
		for(int num : arr){
			System.out.println(" "+num);
		}
		
		System.out.println("1���� 5������ ���� :"+result );
		
        
		
		
	}

}
