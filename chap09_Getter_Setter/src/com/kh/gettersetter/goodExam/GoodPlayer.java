package com.kh.gettersetter.goodExam;

import com.kh.gettersetter.goodExam.GoodPlayer;

public class GoodPlayer {

	private String name; // ĳ�����̸�
	private int health; // ü��
	private int attackPower; // ������

	public void setName(String name) { // �̸��� ����Ǹ� ����� set
		this.name = name;
	}

	// �����ϴ� valid
	public void isValidName() { // ĳ�����̸��� ������ ������ ����!
		if (this.name == "") {
			System.out.println("�̸��� ���� �ʾҽ��ϴ�.");
		}
	}

	public String getName() { // ĳ�����̸��� ��ȯ
		return name;
	}

	public void setHealth(int health) { // ü���� ����Ǹ� ����� set
		this.health = health;
	}

	public void isValidHealth() { // ü���� 0�������� ����!
		if (this.health <= 0) {
			this.health = 0;
		}
	}

	public int getHealth() {// ü���� ��ȯ
		return health;
	}

	public void setAttackPower(int attackPower) { // ���ݷ��� ����Ǹ� ����� set
		this.attackPower = attackPower;
	}

	public void isValidAttackPower() { // ���ݷ��� 0�������� ����!
		if (attackPower <= 0) {
			this.attackPower = 0;
		}
	}

	public int getAttackPower() {// ���ݷ��� ��ȯ
		return attackPower;
	}

}
