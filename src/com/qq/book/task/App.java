package com.qq.book.task;

import com.qq.book.task.quartz.DemoJob;
import com.qq.book.task.spring.SpringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.SchedulerException;

import java.text.ParseException;

public class App {
    private static final Log LOGGER = LogFactory.getLog(App.class);

    public static void main(String [] args){
		SpringUtils.init();
		try {
            System.out.println("start add");
//            SpringUtils.getExecutor().removeJob("test-1");
//            SpringUtils.getExecutor().removeJob("test-2");
//            SpringUtils.getExecutor().removeJob("test-3");
//            SpringUtils.getExecutor().removeJob("test-4");
//            SpringUtils.getExecutor().addJob("test-1", DemoJob.class, "0 29 17 * * ?");     //秒、分、时、日、月、周
            SpringUtils.getExecutor().addJob("test-3", DemoJob.class, "0 09 22 * * ?");     //秒、分、时、日、月、周
            System.out.println("end add");
            //new Object().wait();
        } catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e){
            e.printStackTrace();
        }
	}

}
