package com.acharya.inheritance;
interface dad{
	void snoring();
}
interface mom{
	void snoring();
}
public class child implements dad,mom{

	public static void main(String[] args) {
		child c = new child();
		c.snoring();

	}

	@Override
	public void snoring() {
		System.out.println("My parents have snoring");
		
	}

}
