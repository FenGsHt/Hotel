package com.fish.HotelTest;

import static org.junit.Assert.*;


import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

import com.fish.Hotel.IData;
import com.fish.Hotel.ListHome;



public class ListHomeTest {

	
	private Mockery context=new Mockery();
	private IData iData=null;
	private ListHome lh=null;
	String string=null;
	
	@Before
	public void setUp() throws Exception{
		iData=context.mock(IData.class);
		lh=new ListHome(iData);
		
		//string="表示所有的住房情况";
		
		context.checking(new Expectations() {{
			
			
			oneOf(iData).search();will(returnValue("表示所有的住房情况"));
			
		}});
	}
	
	
	@Test
	public void testSearch() {
		
		//System.out.println(lh.search());
		
		assertEquals("表示所有的住房情况", lh.search());
	}
	
	
}
