package 권순범;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		Account[] list = null; 
		
		int count = 0;
		
		boolean run = true;
		
		while(run) {
			
			System.out.println("------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------------");
			
			System.out.print("선택 : ");
			int check = Integer.parseInt(sc.nextLine());
			
			switch(check) {
			case 1 :System.out.println("----------");
					System.out.println("계좌생성");
					System.out.println("----------");
					
					System.out.print("계좌번호 : ");
					String ano = sc.nextLine();
					
					System.out.print("계좌주 : ");
					String owner = sc.nextLine();
					
					System.out.print("초기입금액 : ");
					int balance = Integer.parseInt(sc.nextLine());
					
					
					
					//list[] = new Account(ano,owner,balance);
					
					System.out.println("결과: 계좌가 생성되었습니다");
					
					
					break;
					
			case 2 :System.out.println("----------");
					System.out.println("계좌목록");
					System.out.println("----------");
					
					
						
					System.out.print("계좌번호 : ");
						
					System.out.print("계좌주 : ");
						
					System.out.println("초기입금액 : ");
						
					
					
					break;
					
			case 3 :System.out.println("----------");
					System.out.println("예금");
					System.out.println("----------");
					
					System.out.println("결과: 예금이 성공되었습니다");
					break;
					
			case 4 :System.out.println("----------");
					System.out.println("출금");
					System.out.println("----------");
			
					System.out.println("결과: 출금이 성공되었습니다");
					break;
					
			case 5 : System.out.println("프로그램 종료"); return;
			
			default : System.out.println("번호를 신중히 입려해주세요"); break;
			}
			
			
		}
		

	}//end main

}//end class
