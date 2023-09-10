package com.project.library.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

//import com.project.erpsystem.main.PersonDao;
//import com.project.erpsystem.main.PersonVo;
import com.project.library.model.vo.UserVo;

public class UserDao {

//	public static PersonVo auth; // 로그인 사용자 저장변수 
	
	public static ArrayList<UserVo> list;
	
	static {
		list=new ArrayList<UserVo>();
	}
	
	public static void load() {
		
		try {
			String dir="data\\User.txt";
			
			BufferedReader reader=new BufferedReader(new FileReader(dir));
			
			String line=null;
			
			while((line=reader.readLine()) != null) {
				String[] temp=line.split(",");
				
				list.add(new UserVo(temp[0],temp[1],temp[2],temp[3],temp[4],temp[5]));
				
			}
			
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void save() {
		
		try {
			String dir="data\\User.txt";
			
			BufferedWriter writer=new BufferedWriter(new FileWriter(dir));
			
			for(UserVo av : list) {
				String result=String.format("%s,%s,%s,%s,%s,%s\r\n"
										,av.getUserNo()
										,av.getName()
										,av.getTel()
										,av.getEmail()
										,av.getId()
										,av.getPw());
				writer.write(result);
			}
			
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

//	public static String checkLogin(String id, String pw) {
//		String level=null;
//		
////		load();
//		
////		System.out.println(list.toString());
//		for(UserVo uv : list) {
//			if(uv.getId().equals(id) && uv.getPw().equals(pw)) {
//				level=uv.getLevel();
//				for(PersonVo p : PersonDao.list) {
//					if(p.getId().equals(id)) {   
//						auth=p;
//						break;
//					}
//				}
//				break;
//			}//if
//		}//for
//		return level;
//	}
	
}
