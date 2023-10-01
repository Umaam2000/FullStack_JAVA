package com.ust.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ust.aop.Model.Bank;

/**
 * Hello world!
 *
 */
	public class App
	{
			public static void main( String[] args )
			{
				System.out.println( "Hello World!" );
				ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
				Bank bank=(Bank) ctx.getBean("bank");
				bank.withdraw();
				bank.deposit();
			}
}
