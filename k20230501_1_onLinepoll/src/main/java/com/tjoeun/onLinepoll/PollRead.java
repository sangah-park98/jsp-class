package com.tjoeun.onLinepoll;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PollRead {

//	텍스트 파일의 내용을 읽어서 ArrayList에 저장해서 리턴하는 메소드
	public static ArrayList<String> pollRead(String filepath) {
		
		ArrayList<String> poll = null; // 텍스트 파일의 내용을 저장해서 리턴시킬 객체를 선언한다.
		Scanner scanner = null; // 텍스트 파일의 내용을 읽어들이는 스캐너
		
		try {
			scanner = new Scanner(new File(filepath)); // 파일이 있으면 저장을 해야 하므로 먼저 읽어들이기
			poll = new ArrayList<>();
//			파일의 끝까지(더 이상 읽을 줄이 없을 때까지) 반복하며 텍스트 파일의 내용을 읽어서
//			ArrayList에 저장한다.
			while(scanner.hasNextLine()) {
				String str = scanner.nextLine().trim();
//				읽어들인 줄이 빈 줄이 아니면 ArrayList에 저장한다.
				if(str.trim().length() !=0) {
					poll.add(str);
				}
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("디스크에 파일이 존재하지 않습니다.");
		}
		
		return poll;
	
	}
}
