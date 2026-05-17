package com.lms.dal;

import java.util.List;

import com.lms.dto.Book;

public class TextDataAccessLayer  implements IDataAccessLayer{

	private BookDAO book;
	private StudentDAO student;
	
	public TextDataAccessLayer()
	{
		book=new BookDAO();
		student=new StudentDAO();
	}
	
	
	public Book getBook(String bookId)
	{
		return book.getBook(bookId);
	}
	
	public List<Book> getBorrowedBooks(String studentId)
	{
		return student.getBorrowedBooks(studentId);
	}
}
