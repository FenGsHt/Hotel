package com.fish.HotelTest;

import static org.junit.Assert.*;


import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.Test;

import com.fish.Hotel.IData;
import com.fish.Hotel.InHotel;


public class InHotelTest {

	

	private Mockery context=new Mockery();
	private IData iData=null;
	private InHotel ih=null;
	
	
	@Before
	public void setUp() throws Exception{
		iData=context.mock(IData.class);
		ih=new InHotel(iData);
		
		context.checking(new Expectations() {{
			oneOf(iData).in_Out_Room(901,"Marry");will(returnValue("玛丽成功入驻"));
		}});
	}
	
	@Test
	public void testIn() {
		assertEquals("玛丽成功入驻", ih.in(901, "Marry"));
	}

	


}
