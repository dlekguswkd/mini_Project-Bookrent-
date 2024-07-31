package bookrent;

import java.util.Scanner;

public class UserApp {

	public static void main(String[] args) {
		
		//회원가입		로그인	히스토리		회원수정
		
		UserDao userDao = new UserDao();

		Scanner sc = new Scanner(System.in);
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

		
		sc.close();
	}

}
