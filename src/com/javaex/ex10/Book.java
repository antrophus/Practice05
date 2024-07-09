package com.javaex.ex10;

public class Book {

	// 필드
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;

	// 생성자
	public Book() {
		super();
	}

	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1; // 생성자 호출 시 1로 세팅
	}

	// 메소드 gs
	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getStateCode() {
		return stateCode;
	}

	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	// 메소드 일반

	public void rent() {
		stateCode = 0;
		System.out.println(title + "이(가) 대여 됐습니다.");

	}

	public void print() {
		String rentState;
		if (stateCode == 1) {
			rentState = "재고있음";
		} else {
			rentState = "대여중";
		}
		System.out.println(bookNo + " 책 제목:" + title + ", 작가:" + author + ", 대여 유무:" + rentState);
	}
}
