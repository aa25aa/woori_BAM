package com.woori.BAM;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("====프로그램 시작====");
		Scanner sc = new Scanner(System.in);//최적화 =>자원 1번 사용 개선
		
		while (true) { // 무한반복
		    System.out.printf("cmd)");
		    String cmd = sc.nextLine(); //cmd 변수를 만들어 낸 것은 재사용하기 위해서 cmd에는 문자값이 들어있는데
			System.out.println("명령어)" +cmd);
			if (cmd.equals("exit")) {
//			if (cmd  == "exit") {
				break;
			}
		}

		sc.close();
		System.out.println("====프로그램 종료====");

	}
}
