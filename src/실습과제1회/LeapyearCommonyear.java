package �ǽ�����1ȸ;

import java.util.Scanner;

public class LeapyearCommonyear {

	public static void main(String[] args) {
		//�غ� 
		int year;
		
		//�Է� 
		System.out.println("�⵵�� �Է��ϼ���>>>");
		Scanner scan = new Scanner(System.in);
		 year = scan.nextInt();
		 
		/*
		 * ���� ���� 
		 * 4�� ������ �������� �ϰ� 100���� ������ �������� �ʰų� 
		 * 400���� ������ �������� ��� 
		 */
		 //ó���ܰ� 
		 
		 if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
			  System.out.println("�����Դϴ�.");
		 }else {
			  System.out.println("����Դϴ�.");
		 }
		 
		 scan.close();
		/*System.out.println("������ �Է��ϼ���.");
	     Scanner scan = new Scanner(System.in);
	    int year = scan.nextInt();	    
	     
	     if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){ 
	    	
	          System.out.println("�����Դϴ�.");
	     }else{  
	    	 
	    	  System.out.println("����Դϴ�.");
	    	 
	     
	}*/
	}
}
