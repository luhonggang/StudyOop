package com.study.abstractfactorymethod;

public abstract class AbstractYellowMan implements Human{

	@Override
	public void laugh() {
	     System.out.println("�����˻�Ц");
		
	}

	@Override
	public void anger() {
		 System.out.println("�����˻�����");
		
	}

	@Override
	public void cry() {
		 System.out.println("�����˻����");
		
	}

	@Override
	public void happy() {
		 System.out.println("�����˻����");
		
	}
}
