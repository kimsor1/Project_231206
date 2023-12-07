package com.javalec.ex03;

public class Ex03 {

	
	
	
	// 입력한 숫자부터 4개를 증가하여 화면 가로롤 구구단을 표시하기   (FOR)문 한번만 사용.

	
	 
	//Field
	        int num1 =0;    //입력변수지정
  
               		

	     
	     
	     
	   //constructor  
	     
	   public Ex03() {
		
	}
	   
	   public Ex03(int num1) {     							//main 에서 숫자를 받으면    Method 로 넘겨줌
		   this.num1 = num1;
	   }
	     
	     
	     
	     
	     
	 //Method    
	   public void ex03() {									//객체변수 esx03
		   
		   
	   
	        int e =1;       										
	     for ( int i = num1 ; i <= num1+3 && e < 10 ; i++   ) {         //구구단 돌리기
	    	 System.out.print(i + "x" + e + "=" + (i*e) + "\t\t" );   //출력문
	    	 if ( i  == num1 +3   ) {                                   //구구단 루프 시키기
	    		e++;
	    		 i = num1-1;
	    		 
	    		 System.out.println();									//줄띄기
	             
	    	 } 
	    
	     }
	     }
	
	     
	
	
	   
	
	
	
	
	
	
}
