package cmm04.array;

public class No02_stringArrayVO {
	private String[] juso = new String[3];

	void juso() {
		// Ű���� , �ĺ���, �ٵ� ?
		// ������ Ű���� , �ĺ��� , �ٵ�
		this.juso[0] = "����";
		this.juso[1] = "����";
		this.juso[2] = "��ȭ��";
		result(this.juso);
	}

	void result(String[] juso) {
		int i = 0; // �̷� ����� �����ϴ����� ?
					// for���� ������ ��� �Ҷ�

		for (; i < juso.length; i++) { // ; ������ ������ �־..for���� ������ ������ ����ȭ�Ǿ��ִ�.
			System.out.print("���� : " + juso[i] + "\t");

		}
	}



}
