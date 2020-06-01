package com.fish.Hotel;



public class InHotel extends Empty
{		
	private int room;
	IData iData;
	
	public InHotel(IData iData) {
		this.iData=iData;
	}
	public InHotel() {
		
	}
	
	public  String in(int roomNo, String name)
	{
		
		return this.iData.in_Out_Room(roomNo, name);
//		MainRun mr=new MainRun();
//		room=(roomNo%100)-1;
//		if(!isEmpty(roomNo))
//			return "�÷����Ѿ��п�����ס��";
//		mr.getRoom()[(roomNo/100)-1][room]=name;
//		if(room==(roomNo%100)-1)
//			return name+"�ɹ���ס"+roomNo+"���䣡";
//		else
//			return name+"�ɹ���ס"+(roomNo+1)+"���䣡";
	}	
		@Override
		public boolean isEmpty(int roomNo)
		{
			String room1=mr.getRoom()[(roomNo/100)-1][(roomNo%100)-1];
			String room2=room1;
			if((roomNo%100)<12)  //ͨ���������ҵ����ȱ��
				room2=mr.getRoom()[(roomNo/100)-1][(roomNo%100)];
			if("EMPTY".equals(room1)) 
				return true;
			else if("EMPTY".equals(room2))
				{
				room=roomNo%100;
				return true;}
			else
				return false;
		 }
}

