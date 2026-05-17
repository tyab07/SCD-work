package com.lms.dto;

import java.util.List;

public class StudentRecord {

	private	int studentId;
	private List<Book>bookList;
	private double fine;
	
	public StudentRecord(int studentId, List<Book> bookList, double fine) {
		super();
		this.studentId = studentId;
		this.bookList = bookList;
		this.fine = fine;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	public double getFine() {
		return fine;
	}

	public void setFine(double fine) {
		this.fine = fine;
	}
	
	
}
