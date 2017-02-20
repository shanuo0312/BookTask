package com.qq.book.task;

import java.text.ParseException;

import org.quartz.SchedulerException;

import com.qq.book.task.quartz.DemoJob;
import com.qq.book.task.spring.SpringUtils;

public class App {
	
	public static void main(String [] args){
		SpringUtils.init();
		try {
			SpringUtils.getExecutor().addJob("test-19", DemoJob.class, "10 0 16 * * ?");     //秒、分、时、日、月、周
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
