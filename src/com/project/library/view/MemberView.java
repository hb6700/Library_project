package com.project.library.view;

import java.util.Scanner;
import com.project.library.controller.Controller;
import com.project.library.model.dao.ChangePw;

public class MemberView {
	
	public static void startView() {
		
		Scanner scan = new Scanner(System.in);
			
		while(true) {
			System.out.println("쌍용 도서관(user)");
			System.out.println("1. 도서대출");
			System.out.println("2. 도서반납");
			System.out.println("3. 희망도서 신청 및 조회");
			System.out.println("4. 대출현황");
			System.out.println("5. 비밀번호 변경");
			System.out.println("6. 로그아웃");
			
			System.out.print("선택: ");
			String input=scan.nextLine();
			
			switch(input) {
				case "1" : System.out.println("개발중");break;
				case "2" : System.out.println("개발중");break;
				case "3" : System.out.println("개발중");break;
				case "4" : System.out.println("개발중");break;
				case "5" : 
					System.out.println("개발중");
					ChangePw.changePw();
					break;
				case "6" : 
					System.out.println("종료합니다");
					return;
				default : Controller.msg("잘못입력함");break;
			}
			
		}
		
	}
}
