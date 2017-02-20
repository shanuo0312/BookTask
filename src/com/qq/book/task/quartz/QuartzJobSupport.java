package com.qq.book.task.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * QuartzJob 辅助类
 * @author zhaixuefei
 * @Date 2017/02/16
 */
public abstract class QuartzJobSupport extends QuartzJobBean {

	private ApplicationContext applicationContext;


	/**
	 * 从SchedulerFactoryBean注入的applicationContext.
	 */
	public void setApplicationContext( ApplicationContext applicationContext ) {
		this.applicationContext = applicationContext;
	}


	public <T> T getBean( String beanName, Class<T> clazz ) {
		return this.applicationContext.getBean(beanName, clazz);
	}


	@Override
	protected void executeInternal( JobExecutionContext context ) throws JobExecutionException {
		innerIter(context);
	}


	public abstract void innerIter( JobExecutionContext context );

}
