<html>
<%@ page session="false" %>

<body bgcolor="white">
<jsp:useBean id='calendar' scope='page' class='trivera.jee.web.jsp.tutorial.JspCalendar'/>


<ul>
    <li> Day of month: is ${calendar.dayOfMonth}
    <li> Year: is ${calendar.year}
    <li> Month: is ${calendar.month}
    <li> Time: is ${calendar.time}
    <li> Date: is ${calendar.date}
    <li> Day: is ${calendar.day}
    <li> Day Of Year: is ${calendar.dayOfYear}
    <li> Week Of Year: is ${calendar.weekOfYear}
    <li> DST Offset: is ${calendar.DSTOffset}
    <li> Zone ID: is ${calendar.zoneId}
</ul>

</body>
</html>
