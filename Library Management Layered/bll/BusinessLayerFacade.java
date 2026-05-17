
package com.lms.bll;

import com.lms.dal.IDataAccessLayer;
import com.lms.dto.Book;
import com.lms.dto.StudentRecord;

public class BusinessLayerFacade  implements IBussinessLayer{

		

	private BookBO book;
	private StudentBO student;
	
	public BusinessLayerFacade(IDataAccessLayer dal)
	{
		book=new BookBO(dal);
		student=new StudentBO(dal);
	}

	@Override
	public StudentRecord calStudentTotalFine(String studentId) {
		return student.calStudentTotalFine(studentId);
	}

	@Override
	public Book calBookOverDues(String bookId) {
		 return book.calBookOverDues(bookId);
	}


}
