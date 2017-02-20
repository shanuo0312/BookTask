package com.qq.book.task.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qq.book.task.quartz.QuartzJobManager;

public class SpringUtils {
	private static ApplicationContext context ;
	private static QuartzJobManager threadPool;
	
	public static void init(){
		context = new ClassPathXmlApplicationContext("spring-context.xml");
		threadPool = (QuartzJobManager) context.getBean("quartzJobManager");
	}
	
	public static QuartzJobManager getExecutor(){
		return threadPool;
	}
}
