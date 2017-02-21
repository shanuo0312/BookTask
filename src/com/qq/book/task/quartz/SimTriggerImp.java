package com.qq.book.task.quartz;

import org.quartz.*;

import java.util.Date;

/**
 * Created by Gavin on 2017/2/21 17:43
 */
public class SimTriggerImp implements SimpleTrigger {

    public int getRepeatCount() {
        return 0;
    }

    public long getRepeatInterval() {
        return 0;
    }

    public int getTimesTriggered() {
        return 0;
    }

    public TriggerKey getKey() {
        return null;
    }

    public JobKey getJobKey() {
        return null;
    }

    public String getDescription() {
        return null;
    }

    public String getCalendarName() {
        return null;
    }

    public JobDataMap getJobDataMap() {
        return null;
    }

    public int getPriority() {
        return 0;
    }

    public boolean mayFireAgain() {
        return false;
    }

    public Date getStartTime() {
        return null;
    }

    public Date getEndTime() {
        return null;
    }

    public Date getNextFireTime() {
        return null;
    }

    public Date getPreviousFireTime() {
        return null;
    }

    public Date getFireTimeAfter(Date date) {
        return null;
    }

    public Date getFinalFireTime() {
        return null;
    }

    public int getMisfireInstruction() {
        return 0;
    }

    public TriggerBuilder<SimpleTrigger> getTriggerBuilder() {
        return null;
    }

    public ScheduleBuilder<? extends Trigger> getScheduleBuilder() {
        return null;
    }

    public int compareTo(Trigger trigger) {
        return 0;
    }
}
