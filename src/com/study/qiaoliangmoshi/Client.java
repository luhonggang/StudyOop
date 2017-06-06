package com.study.qiaoliangmoshi;

/**
 *  ����ģʽ
 * @author LuHongGang
 * @date 2017��6��2��
 * @time ����4:26:22
 * @since 1.0
 */
public class Client {

	public static void main(String[] args) {
		
		Company c1 = new HouseCompany();
		c1.makeMoney();
		
		System.out.println("------------------------------------");
		
		Company c2 = new ClothesCompany();
		c2.makeMoney();
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		/**
		 *  ���� �г����� ,�����г�����Ҫ�������µĹ�˾��������Ӧ�Ĳ�Ʒ����
		 */
		// ���� ������ز��г���,���Ҿ� �����½����� ����
		ZhongHeCompany zhcfw = new ZhongHeCompany(new HouseCompany());
		zhcfw.makeMoney();
		
		// ������� ��װ�г�����,���Ҿ�������װ����
		ZhongHeCompany zhcfz = new ZhongHeCompany(new ClothesCompany());
		zhcfz.makeMoney();
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		HouseCorp house = new HouseCorp(new House());
		house.makeMoney();
		System.out.println("++++++++++++++++++++++++++++++++++++");
		
		ProductFactory factory = new ShaZhaiCrop(new IpdPhone());
		factory.makeMoney();
		
		
	}
}
