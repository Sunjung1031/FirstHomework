package �ǽ�����1ȸ;

import java.util.Scanner;

public class CaseChanger {

	public static void main(String[] args) {
		// �غ�ܰ�
		char alpha;
		// �Է´ܰ�

		System.out.println("���� �� �ڸ� �Է��ϼ���>>>");
		Scanner scan = new Scanner(System.in);
		/*
		 * 'A' => 65
		 * "A" => "A\0"
		 */
		alpha = scan.next().charAt(0);
		
		if( alpha>= 'a' && alpha <= 'z') { //&& AND������, || OR ������ 
			// �º� = �캯 ; 
			alpha = (char) (alpha -32);
			
		}else if( alpha>= 'A' && alpha <= 'Z'){
	
				     alpha = (char) (alpha +32);
		}else { // �ѱ��� �Է� �Ǿ��� �� 
			 System.out.println("�����ڰ� �ƴմϴ�.");
			 System.exit(0);
		}
		System.out.println(alpha);
		scan.close();

		/*
		 * char alpha;
		 * char word; 
		 * int num;
		 * 
		 * System.out.println("���� �� �ڸ� �Է��ϼ���."); Scanner scan = new Scanner(System.in);
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
		 * System.out.println("�����ڰ� �ƴմϴ�."); }
		 */
	}

}
