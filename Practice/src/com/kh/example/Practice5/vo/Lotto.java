package com.kh.example.Practice5.vo;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random random = new Random();
		
		int ran = (int)Math.random()*65+1;
		System.out.println(ran);
	}
}
