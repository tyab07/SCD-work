package com.lms.main;

import com.lms.bll.BusinessLayerFacade;
import com.lms.bll.IBussinessLayer;
import com.lms.dal.IDataAccessLayer;
import com.lms.dal.TextDataAccessLayer;
import com.lms.pl.CLIPresentationLayer;
import com.lms.pl.UI;

public class Main {
	
	public static void main(String args[])
	{
		IDataAccessLayer dal=new TextDataAccessLayer();
		IBussinessLayer bll=new  BusinessLayerFacade(dal);
		UI ui=new CLIPresentationLayer(bll);
		ui.start();
	}
	
	
}
