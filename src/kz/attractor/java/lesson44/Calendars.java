package kz.attractor.java.lesson44;

import java.util.ArrayList;
import java.util.List;

public class Calendars {


    private List<Integer> calendarList = new ArrayList<>();

    public List<Integer> getCalendarList() {
        Calendar calendar = new Calendar();
        ;
        for (int i = 0; i < calendar.getDayNum(); i++) {
            calendarList.add(i+1);

        }
        return calendarList;
    }

    public void setCalendarList(List<Integer> calendarList) {
        this.calendarList = calendarList;
    }


    }


