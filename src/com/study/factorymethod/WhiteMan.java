package com.study.factorymethod;

public class WhiteMan implements Human{

	@Override
	public void laugh() {
		System.out.println("白种人会笑");
		
	}

	@Override
	public void anger() {
		System.out.println("白种人会生气");
		
	}

	@Override
	public void cry() {
		System.out.println("白种人会哭泣");
		
	}

	@Override
	public void happy() {
		System.out.println("白种人会高兴");
		
	}

}
