package com.lms.pl;

import com.lms.bll.IBussinessLayer;

public class CLIPresentationLayer implements UI{
	private  IBussinessLayer bll;
	
	public CLIPresentationLayer(IBussinessLayer bll)
	{
		this.bll=bll;
	}
	public void start()
	{
		
	}
}
