package com.lms.bll;

import com.lms.dto.Book;

public interface IBook {

	public Book calBookOverDues(String bookId);
}
