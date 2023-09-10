package com.project.library.view;

import java.util.Scanner;

public class MsgView {

	public static void msg(String msg) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==================================");
		System.out.println(msg);
		System.out.println("엔터를 누르시면 이전 메뉴로 돌아갑니다");
		System.out.println("==================================");
		scan.nextLine();
		
	}

}
