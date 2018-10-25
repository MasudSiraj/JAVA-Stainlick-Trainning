package trivera.jee.web.jsp.tutorial;

/* *
 * <p>
 * This component and its source code representation are copyright protected
 * and proprietary to Trivera Technologies, LLC., Worldwide
 *
 * This component and source code may be used for instructional and
 * evaluation purposes only. No part of this component or its source code
 * may be sold, transferred, or publicly posted, nor may it be used in a
 * commercial or production environment, without the express written consent
 * of the Trivera Technologies, LLC.
 *
 * Copyright (c) 2018 Trivera Technologies, LLC.
 * http://www.triveratech.com
 * </p>
 * @author The Trivera Tech Team.
 */

import java.time.*;
import static java.time.format.TextStyle.*;

import java.time.temporal.WeekFields;
import java.util.*;

public class JspCalendar {
    private LocalDateTime dateTime;

    public JspCalendar() {
        dateTime = LocalDateTime.now();
    }

    public int getYear() {
        return dateTime.getYear();
    }

    public String getMonth() {
        return dateTime.getMonth().getDisplayName(FULL, Locale.getDefault());
    }

    public String getDay() {
        return dateTime.getDayOfWeek().getDisplayName(FULL, Locale.getDefault());

    }

    public String getDate() {
        return String.format("%tD", dateTime);
    }

    public String getTime() {
        return String.format("%tT", dateTime);
    }

    public int getDayOfMonth() {
        return dateTime.getDayOfMonth();
    }

    public int getDayOfYear() {
        return dateTime.getDayOfYear();
    }

    public int getWeekOfYear() {
        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        return dateTime.get(weekFields.weekOfWeekBasedYear());
    }

    public String getZoneId() {
        ZoneId zoneId = ZoneId.systemDefault();
        return zoneId.getDisplayName(FULL, Locale.getDefault());
    }


    public String getDSTOffset() {
        return ZoneOffset.systemDefault().getRules().getOffset(dateTime).toString();
    }


}

