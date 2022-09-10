package kz.attractor.java.lesson44;

import com.sun.net.httpserver.HttpExchange;
import kz.attractor.java.server.ContentType;

import java.io.IOException;
import java.nio.file.Path;

public class LessonExam extends Lesson45Server{
    public LessonExam(String host, int port) throws IOException {
        super(host, port);

        registerGet("/calendar", this::calendarGet);

    }

    private void calendarGet(HttpExchange exchange) {
        renderTemplate(exchange, "index.html", getCalendar());
    }
    private Calendars getCalendar() {
        // возвращаем экземпляр тестовой модели-данных
        // которую freemarker будет использовать для наполнения шаблона
        return new Calendars();
    }
}
