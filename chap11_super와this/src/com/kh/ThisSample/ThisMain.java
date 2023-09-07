package com.kh.ThisSample;
/*
this    ��ü(=�ν��Ͻ�) �ڽ��� ����Ű�� �������� ��ü(=�ν��Ͻ�)�� �ּҰ� ����
this()  ���� Ŭ������ �ٸ� �����ڸ� ȣ���ϴµ� ���
*/

class MyClass {
	int myField; // this myField
	int my;
	// ù ��° ������
	MyClass() {
		this(5); // this() ����ؼ� �ٸ� ������ ȣ��
	}
	
	// �� ��° ������
	MyClass(int value) {
		this.myField = value;
		this.my = value;
	}

	void printValue() {
		System.out.println("myField�� �� : " + this.my);
	}
}

public class ThisMain {

	public static void main(String[] args) {
		MyClass obj1 = new MyClass(); // ù ��° ������ ȣ��
		MyClass obj2 = new MyClass(10); // �� ��° ������ ȣ��
		
		obj1.printValue();
		obj2.printValue();
	}

}
