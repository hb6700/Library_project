package com.project.library.controller;

import com.project.library.view.MainView;
import com.project.library.view.MsgView;

public class Controller {

	public static void mainView() {//main > MainView
		MainView.startView();
	}

	public static void msg(String msg) {
		MsgView.msg(msg);
		
	}

}
