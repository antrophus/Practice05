package com.javaex.ex09;

public class StringUtilApp {

    public static void main(String[] args) {

        String[] strArray = {"SuperMan", "BatMan", "SpiderMan"};
//        String[] strArray = new String[3];
//        strArray[0]="SuperMan";
//        strArray[1]="BatMan";
//        strArray[2]="SpiderMan";
        String resultStr = StringUtil.concatString(strArray);
        
        System.out.println("결과 문자열:" + resultStr);
        
        while(true) {
        	StringBuilder result = new StringBuilder();
        }
    }
   

}

