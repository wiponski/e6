package kz.attractor.java;


import kz.attractor.java.lesson44.*;

import java.io.IOException;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Calendar calendar = new Calendar();
        System.out.println(calendar.getDate());

        System.out.println(calendar.getToday());
        System.out.println(calendar.getWeekDay());
        System.out.println(calendar.getDayNum());
        Calendars cal = new Calendars();
        System.out.println(cal.getCalendarList());


        try {
            new LessonExam("localhost", 9889).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
