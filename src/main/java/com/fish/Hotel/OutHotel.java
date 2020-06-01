package com.fish.Hotel;

public class OutHotel extends Empty
{
		public String out(int roomNo) {
		    MainRun mr=new MainRun();
		   if(isEmpty(roomNo)){
			return "�÷���û�п�����ס���˷�ʧ�ܣ�";
		   }else
		    {	
			 mr.getRoom()[(roomNo/100)-1][(roomNo%100)-1]="EMPTY";		
			 return roomNo+"�˷��ɹ���";
		   }
	    }
}
