package com.javaex.ex04;

public class Base {

	public void service(String state) {
        System.out.println();
  
        //코드작성할것
///////// if문 작성  /////////////////////////////////////////  
      if(state.equals("낮")) {
    	  day();
    	  
      }else if(state.equals("밤")){
    	  night();
    	  
      }else if(state.equals("오후")) {
    	  afternoon();
      }
    }
////////////////////////////////////////////////////////////
	public void day() {
		System.out.println("낮에는 열심히 수업듣자");
	}

	public void night() {
		System.out.println("밤엔 숙면");
		// 코드작성할것
	}

	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
	}
}
