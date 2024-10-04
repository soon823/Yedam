package 도서관리;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		// 도서관리
		Scanner sc = new Scanner(System.in);
		BookDao dao = null;
		int cnt = 0;
		boolean run = true;
		
		// 메인메뉴
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1.도서등록 2.도서검색 3.도서전체 4.도서삭제 5.도서 정보 변경 6.종료");
			System.out.println("--------------------------------------------------------");
			
			System.out.print("메뉴선택 : ");
			int check = Integer.parseInt(sc.nextLine());
			
			switch(check) {
			// 선택1번 : 도서등록
			case 1 :System.out.println("[도서등록]");
			 		System.out.print("책 제목 : ");
			 		String title = sc.nextLine();
			 		System.out.print("작가 : ");
			 		String writer = sc.nextLine();
			 		System.out.print("책 번호 : ");
			 		String bnum = sc.nextLine();
			 		System.out.println("책 가격 : ");
			 		int price = Integer.parseInt(sc.nextLine());
			 		
			 		Book book = new Book(title, writer, bnum, price);
			 		dao = new BookDao();
			 		cnt = dao.insert(book);
					break;
			// 선택2번 : 도서검색 => 책 제목으로 검색
			case 2 :
					break;
			// 선택3번 : 도서전체 조회
			case 3 :
					break;
			// 선택4번 : 도서삭제
			case 4 :
					break;
			// 선택5번 : 도서 정보 변경 (책 재목 : 변경할 책 번호, 변경할 책 가격 입력 => 수정)
			case 5 :
					break;
			// 선택6번 : 프로그램 종료
			case 6 :System.out.println("프로그램 종료"); return;
			default : System.out.println("다시 선택 해주세요"); break;
			}
			
			
		}
		

	}

}
