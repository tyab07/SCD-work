package com.lms.pl;

import com.lms.bll.IBussinessLayer;

public class SwingPresentationLayer implements UI{

	private  IBussinessLayer bll;
	
	public SwingPresentationLayer(IBussinessLayer bll)
	{
		this.bll=bll;
	}
	
	public void start ()
	{
		
	}
}
