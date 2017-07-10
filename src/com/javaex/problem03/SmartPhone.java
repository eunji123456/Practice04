package com.javaex.problem03;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
    	 if("앱".equals(str)){
             startapp();
         }else if("음악".equals(str)){
             super.execute(str);
         }else {
        	 System.out.println("통화기능시작");
         }
         
     }
    public void startapp() {
    	System.out.println("앱 실행 ");
    }
        
    protected void playMusic(){
        System.out.println("다운로드해서 음악재생");
    }
}
    //메소드작성
    
    //메소드작성
    
    
    

