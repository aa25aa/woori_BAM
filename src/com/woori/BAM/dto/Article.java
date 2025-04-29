package com.woori.BAM.dto;

public class Article {

	public int id;
	public String regDate;
	public String title;
	public String body;
	public int viewCnt;
	
    // 순서 수정 
	public Article(int id, String regDate, String title, String body, int viewCnt) {
		this.id = id;
		this.regDate = regDate;
		this.title = title;
		this.body = body;
		this.viewCnt = viewCnt;
	}
	
	public void increaseViewCnt() {
		this.viewCnt++;
	}
}