package com.javaex.ex07;

public class Friend {
	
	//필드

    private String name;
    private String hp;
    private String school;
    
    //생성자
    public Friend() {
    	
    }

    
    // 메소드 getter/setter 작성

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHp() {
		return hp;
	}


	public void setHp(String hp) {
		this.hp = hp;
	}


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}
	
	
	
	@Override
	public String toString() {
		return "Friend [name=" + name + ", hp=" + hp + ", school=" + school + "]";
	}


	public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }


}
