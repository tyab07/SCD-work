package com.lms.dal;

import java.util.List;

import com.lms.dto.Book;

public interface IDataAccessLayer {
 
	Book getBook(String bookId);
	List<Book>getBorrowedBooks(String studentId);
}
