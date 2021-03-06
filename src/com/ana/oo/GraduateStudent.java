package com.ana.oo;

public class GraduateStudent extends Student {
	int thesis;

	public GraduateStudent() {
		super();
		//只能於建構子/第一行使用/呼叫建構子
	}

	@Override
	//覆寫
	public void print() {
		//只能放大public不能縮小
		super.print();
		//super.父類別成員
		//取得原寫的方法/屬性
		//this是參考物件本身super參考父類別物件本身
		System.out.println(english + "\t" + math
		+ "\t" + chinese + "\t" + thesis);
	}
	@Override
	public int getAverge(){
		//要回傳（有void不用return）
		return(english+math+chinese+thesis)/4;
	}
}