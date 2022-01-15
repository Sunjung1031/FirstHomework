package 실습과제1회;

import java.util.Scanner;

public class CaseChanger {

	public static void main(String[] args) {
		// 준비단계
		char alpha;
		// 입력단계

		System.out.println("문자 한 자를 입력하세요>>>");
		Scanner scan = new Scanner(System.in);
		/*
		 * 'A' => 65
		 * "A" => "A\0"
		 */
		alpha = scan.next().charAt(0);
		
		if( alpha>= 'a' && alpha <= 'z') { //&& AND연산자, || OR 연산자 
			// 좌변 = 우변 ; 
			alpha = (char) (alpha -32);
			
		}else if( alpha>= 'A' && alpha <= 'Z'){
	
				     alpha = (char) (alpha +32);
		}else { // 한글이 입력 되었을 때 
			 System.out.println("영문자가 아닙니다.");
			 System.exit(0);
		}
		System.out.println(alpha);
		scan.close();

		/*
		 * char alpha;
		 * char word; 
		 * int num;
		 * 
		 * System.out.println("문자 한 자를 입력하세요."); Scanner scan = new Scanner(System.in);
		 * alpha = scan.next().charAt(0); 
		 * num = alpha; 
		 * System.out.println(num);
		 * 
		 * 
		 * if( num >64 && num <91){
		 * 
		 * num = num + 32; 
		 * 
		 * word = (char)num
		 * 
		 * ; System.out.println(word); }
		 * 
		 * else if (num>96 && num < 123){ 
		 * 
		 * num = num -32;
		 * 
		 * word = (char)num; 
		 * 
		 * System.out.println(word); }
		 * else {
		 * System.out.println("영문자가 아닙니다."); }
		 */
	}

}
