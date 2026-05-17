package com.lms.bll;

import com.lms.dal.IDataAccessLayer;
import com.lms.dto.Book;

public class BookBO implements IBook {

private IDataAccessLayer dal;
	
	public BookBO(IDataAccessLayer dal)
	{
		this.dal=dal;
	}

	@Override
	public Book calBookOverDues(String bookId) {
		
		return null;
	}
}
