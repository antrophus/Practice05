package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member mb1 = new Member();
		mb1.setName("정우성");
		mb1.setId("jws");
		mb1.setPoint(50000);
		
		Member mb2 = new Member();
		mb2.setName("유재석");
		mb2.setId("yjs");
		mb2.setPoint(30000);
		
		Member mb3 = new Member();
		mb3.setName("이효리");
		mb3.setId("lhr");
		mb3.setPoint(40000);
		
		
		mb1.showInfo();
		mb2.showInfo();
		mb3.showInfo();
	}
	
		

}
