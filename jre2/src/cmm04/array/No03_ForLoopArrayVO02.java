package cmm04.array;

import java.util.Scanner;

public class No03_ForLoopArrayVO02 {
	private int[] arr = new int[5];
	private int result;

	public void run() {
		setArr(result);
		// getArr();
		display();

	}

	public void setArr(int result) {
		// this.arr = arr;
		int num;
		Scanner scan = new Scanner(System.in);

		for (int j = 0; j < arr.length; j++) {
			System.out.print("5���� ���ڸ� �Է��ϼ��� : ");
			num = scan.nextInt();
			this.arr[j] += num;
			result += arr[j];
		}
		this.result = result;

	}

	/*
	 * public void output(){ System.out.println("1���� 5������ �� : "+arr);
	 * 
	 * }
	 */
	public int getArr() {
		// System.out.println(arr[4]);
		return result;

	}

	public void display() {

		System.out.println("5���� ���� �� �� : " + getArr());
	}

}
