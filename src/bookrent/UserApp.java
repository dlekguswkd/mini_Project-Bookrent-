package bookrent;

import java.util.Scanner;

public class UserApp {

	public static void main(String[] args) {
		
		//회원가입		로그인	
		//로그인 후	히스토리		회원수정
		
		UserDao userDao = new UserDao();

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		System.out.println("도서 대여 프로그램에 온걸 환영합니다!");
		System.out.println("");
		System.out.println("원하시는 옵션을 선택해주세요.");
		
		while (run) {

			System.out.println("1.로그인      2.회원가입       3.종료");
			System.out.println("--------------------------------");
			System.out.print(">메뉴번호: ");
			int menuNum = sc.nextInt();
			sc.nextLine(); // 숫자 뒤에 문자열 받을때 생기는 오류 수정용

		
			switch (menuNum) {
        
			case 1: //로그인
				
				System.out.println("[로그인]");
				System.out.println("회원정보를 입력하세요");
				System.out.print("아이디: ");
				
				System.out.print("비밀번호: ");

        	
        	
        	
				break;     
           
			case 2: //회원가입

				System.out.println("[회원가입]");
				System.out.println("회원정보를 입력하세요");
				System.out.print("아이디: ");
				String id = sc.nextLine();
				System.out.print("비밀번호: ");
				String pw = sc.nextLine();
				System.out.print("이름: ");
				String name = sc.nextLine();
				System.out.print("전화번호: ");
				String pnum = sc.nextLine();
				System.out.print("이메일: ");
				String email= sc.nextLine();
				userDao.insertUser(id, pw, name, pnum, email);

           
				break;   
        

			case 3:	// 종료
				
				run = false;
				break;
            
        	
  
				// 없는 번호일때
			default:
				System.out.println("[다시 입력해 주세요.]");
				System.out.println("");
				break;
        
			}	// switch() 종료
  
		}	// while() 종료
		System.out.println("");
        System.out.println("******************************************");
        System.out.println("*                   감사합니다           *");
        System.out.println("******************************************");
  

		
        sc.close();
	}

}
