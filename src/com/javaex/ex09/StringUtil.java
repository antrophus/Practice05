package com.javaex.ex09;

public class StringUtil {
	/*
	 * 아래와 같이 출력이 나오도록 StringUtil 클래스를 완성하세요
	 * 
	 * SuperManBatManSpiderMan
	 * 
	 */

//    public static String concatString(){

//	public static String concatString(String[] strArray) {
//		StringBuilder result = new StringBuilder();
//		for (String str : strArray) {
//			result.append(str);
//		}
//		return result.toString();
//	}

//메소드 내용작성

	public static String concatString(String[] strArray) {
		String result = "";
		for (String str : strArray) {
			result += str;
		}
		return result;
	}

}
