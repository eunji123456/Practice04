package com.javaex.problem01;

public class MyBase extends Base{

	public void service(String state) {
		if(state.equals("낮")) {
	            day();
	        } else if(state.equals("밤")) {
	            night();
	        } else {
	        	System.out.println("오후에도 낮과 마찬가지로 일해야 합니다.");
	        }
	    }

	    public void day() {
	        System.out.println("낮에는 열씸히 일하자");
	    }

	    public void night() {
	        System.out.println("night");
	    }
	}
