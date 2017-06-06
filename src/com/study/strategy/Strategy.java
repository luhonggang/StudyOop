package com.study.strategy;
/**
 *  ���ģʽ֮ ����ģʽ 
 * @author LuHongGang
 * @date 2017��6��1��
 * @time ����4:26:50
 * @since 1.0
 * ִ���� ��ִ����Щ�ƻ�
 * ��׼������: �������
 */
public class Strategy {

	public static void main(String[] args) {
	  
	  /**
	   * PlanForContent ���Ⱦ�������ʵ�� ��ִ�������ļƻ�(����)
	   * �ص�:���ھ۵����
	   *      ����չ�Ժ� ,��������Լ���������ȥ,ֻҪ�޸�PlanForContent.java�༴��
	   */
      PlanForContent content;
      content = new PlanForContent(new TheFirstPlan());
      content.operate();
      
      content = new PlanForContent(new TheSecondPlan());
      content.operate();
      
      content = new PlanForContent(new TheThirdPlan());
      content.operate();
      
	}

}
