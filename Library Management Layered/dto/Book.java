package com.lms.dto;

import java.util.Date;

public class Book {
	
	private String title;
	private String author;
	private double finePerDay;
	private Date dueDate;
	
	public Book(String title, String author, double finePerDay, Date dueDate) {
		super();
		this.title = title;
		this.author = author;
		this.finePerDay = finePerDay;
		this.dueDate = dueDate;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getFinePerDay() {
		return finePerDay;
	}
	public void setFinePerDay(double finePerDay) {
		this.finePerDay = finePerDay;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
}
