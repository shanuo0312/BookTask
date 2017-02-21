package com.qq.book.task.quartz;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.quartz.JobExecutionContext;


/**
 * @title Quartz Demo Job
 * @ extends 继承 QuartzJobSupport
 * @author zhaixuefei
 */
public class DemoJob extends QuartzJobSupport {
    private static final Log LOGGER = LogFactory.getLog(DemoJob.class);

    @Override
    public void innerIter(JobExecutionContext context) {
        System.out.println("------------- 测试任务 -------------");
    }

//    @Override
//    public void innerIter(JobExecutionContext jobExecutionContext) {
//        System.out.println("------------- 测试任务 -------------");
//    }


}
