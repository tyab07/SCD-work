package com.lms.bll;

import com.lms.dal.IDataAccessLayer;
import com.lms.dto.StudentRecord;

public class StudentBO implements IStudent{

	private IDataAccessLayer dal;
	
	public StudentBO(IDataAccessLayer dal)
	{
		this.dal=dal;
	}

	@Override
	public StudentRecord calStudentTotalFine(String studentId) {
		// TODO Auto-generated method stub
		return null;
	}
}
