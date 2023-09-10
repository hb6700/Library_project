package com.project.library.view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

import com.project.library.controller.Controller;
import com.project.library.model.vo.UserVo;
//import com.project.library.model.dao;
import com.project.library.view.MsgView;

public class MainView {

	public static void startView() {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("쌍용 도서관");
			System.out.println("1. 회원가입");
			System.out.println("2. 도서조회");
			System.out.println("3. 로그인");
			System.out.println("4. 종료");
			
			System.out.print("선택: ");
			String input=scan.nextLine();
			
			switch(input) {
				case "1" : System.out.println("개발중");break;
				case "2" : 
					SearchBook();
					break;
				case "3" : System.out.println("개발중");break;
				case "4" : System.out.println("종료합니다");return;
				default : Controller.msg("잘못입력함");break;
			}
			
		}
		
	}

	private static void SearchBook() {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요");
		//1062926180251,쌍용의자바,정훈훈,좋은책,722.정
		
	}

}
