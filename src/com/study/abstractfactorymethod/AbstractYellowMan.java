package com.study.abstractfactorymethod;

public abstract class AbstractYellowMan implements Human{

	@Override
	public void laugh() {
	     System.out.println("黄种人会笑");
		
	}

	@Override
	public void anger() {
		 System.out.println("黄种人会生气");
		
	}

	@Override
	public void cry() {
		 System.out.println("黄种人会哭泣");
		
	}

	@Override
	public void happy() {
		 System.out.println("黄种人会高兴");
		
	}
}
