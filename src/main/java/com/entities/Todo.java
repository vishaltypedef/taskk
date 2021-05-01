package com.entities;

import java.util.Date;

public class Todo {
	private String title;
	private String content;
	private Date date;
	
	public Todo(String title, String content, Date date) {
		super();
		this.title = title;
		this.content = content;
		this.date = date;
	}

	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getTitle() +" : "+this.getContent();
	}


	
}
