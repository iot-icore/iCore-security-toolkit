package seckit.gui.design.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

import models.Model;
import seckit.gui.design.DesignController;
import seckit.gui.design.DesignViewpointFactory;
import time.DiscreteClock;
import time.TimeDuration;
import time.TimeFactory;
import time.TimeUnit;
import time.Timestamp;
import utils.ecore.ECoreUtils;

public class TimeDesignController extends DesignController {

    private static Logger logger = Logger.getLogger(TimeDesignController.class);
    private SimpleDateFormat timestampFormat = new java.text.SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public TimeDesignController(DesignViewpointFactory design) {
        super("Time", design);
    }

    public SimpleDateFormat getTimestampFormat() {
        return timestampFormat;
    }

    public TimeDuration createTimeDuration(long amount, TimeUnit unit) {
        TimeDuration duration = TimeFactory.eINSTANCE.createTimeDuration();
        ECoreUtils.setup(duration);
        duration.setAmount(amount);
        duration.setUnit(unit);
        return duration;
    }

    public Timestamp createTimestamp() {
        Timestamp t = TimeFactory.eINSTANCE.createTimestamp();
        Date d = new Date();
        t.setDate(d);
        return t;
    }

    public Timestamp createTimestamp(long value) {
        Timestamp t = TimeFactory.eINSTANCE.createTimestamp();
        Date d = new Date(value);
        t.setDate(d);
        return t;
    }

    public DiscreteClock createClock(TimeDuration resolution) {
        DiscreteClock clock = TimeFactory.eINSTANCE.createDiscreteClock();
        ECoreUtils.setup(clock);
        clock.setResolution(createTimeDuration(resolution.getAmount(), resolution.getUnit()));
        clock.setStart(null);
        clock.setTimeStep(0);
        return clock;
    }

    public String debug(TimeDuration td) {
        return "[" + td.getAmount() + "[" + td.getUnit() + "]";
    }

    public long convertToSeconds(TimeDuration td) {
        if (td == null) {
            logger.warn("Null time duration provided for conversion, returning 0");
            return 0;
        }
        if (td.getUnit() == null) {
            logger.warn("Null time unit provided for conversion, returning 0");
            return 0;
        }
        if (td.getUnit() == TimeUnit.MILLISECOND) {
            return td.getAmount() / 1000;
        }
        if (td.getUnit() == TimeUnit.SECOND) {
            return td.getAmount();
        }
        logger.warn("Time unit not supported! " + td.getUnit());
        return 0;
    }

    public TimeDuration normalize(long amount, TimeUnit unit) {
        // TimeDuraction duration;
        TimeDuration d = TimeFactory.eINSTANCE.createTimeDuration();
        ECoreUtils.setup(d);
        d.setAmount(amount);
        d.setUnit(unit);

        // TODO:
        if (d.getUnit() == TimeUnit.MICROSECOND) {
        }

        if (d.getUnit() == TimeUnit.MILLISECOND) {
            long seconds = d.getAmount() / 1000;
            if (seconds != 0) {
                d.setAmount(seconds);
                d.setUnit(TimeUnit.SECOND);
            } else {
                return d;
            }
        }

        if (d.getUnit() == TimeUnit.SECOND) {
            long minutes = d.getAmount() / 60;
            if (minutes != 0) {
                d.setAmount(minutes);
                d.setUnit(TimeUnit.MINUTE);
            } else {
                return d;
            }
        }

        if (d.getUnit() == TimeUnit.MINUTE) {
            long hours = d.getAmount() / 60;
            if (hours != 0) {
                d.setAmount(hours);
                d.setUnit(TimeUnit.HOUR);
            } else {
                return d;
            }
        }

        if (d.getUnit() == TimeUnit.HOUR) {
            long days = d.getAmount() / 24;
            if (days != 0) {
                d.setAmount(days);
                d.setUnit(TimeUnit.DAY);
            } else {
                return d;
            }
        }

        if (d.getUnit() == TimeUnit.DAY) {
        }

        if (d.getUnit() == TimeUnit.WEEK) {
        }

        if (d.getUnit() == TimeUnit.MONTH) {
        }

        return d;
    }

}
