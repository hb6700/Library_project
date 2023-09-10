package com.project.library.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//import com.project.erpsystem.main.UserDao;
//import com.project.erpsystem.vo.AnnualSubVo;
//import com.project.erpsystem.vo.AnnualVo;
import com.project.library.model.vo.TrueBookVo;

public class TrueBookDao {

	public static ArrayList<TrueBookVo> list;
	
	static {
		list=new ArrayList<TrueBookVo>();
	}
	
	public static void load() {
		
		try {
			String dir="data\\falsebook.txt";
//			String dir="data\\turebook.txt";
			
			BufferedReader reader=new BufferedReader(new FileReader(dir));
			
			String line=null;
						
			while((line=reader.readLine()) != null) {
				String[] temp=line.split(",");
				
				list.add(new TrueBookVo(temp[0],temp[1],temp[2],temp[3],temp[4]));
				
			}
			
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void save() {
		
		try {
			String dir="data\\falseBook.txt";
			
			BufferedWriter writer=new BufferedWriter(new FileWriter(dir));
			
			for(TrueBookVo av : list) {
				String result=String.format("%s,%s,%s,%d,%s\r\n"
										,av.getIsbn()
										,av.getTitle()
										,av.getAuthor()
										,av.getPublisher()
										,av.getLocation());
				writer.write(result);
			}
			
			writer.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}    
}