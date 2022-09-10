package kz.attractor.java.lesson44;

import com.sun.net.httpserver.HttpExchange;
import kz.attractor.java.server.ContentType;
import kz.attractor.java.server.ResponseCodes;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class LessonExam extends Lesson45Server{
    public LessonExam(String host, int port) throws IOException {
        super(host, port);

        registerGet("/calendar", this::calendarGet);
        registerPost("/calendar", this::calendarPost);
        registerGet("/task", this::taskGet);
        registerPost("/task", this::taskPost);

    }

    private void taskGet(HttpExchange exchange) {
    }

    private void calendarGet(HttpExchange exchange) {
        renderTemplate(exchange, "index.html", getCalendar());
    }
    private Calendars getCalendar() {
        // возвращаем экземпляр тестовой модели-данных
        // которую freemarker будет использовать для наполнения шаблона
        return new Calendars();
    }

    private void calendarPost(HttpExchange exchange) {
        redirect303(exchange, "/task");
            
    }
    private void taskPost(HttpExchange exchange) {
        redirect303(exchange, "/task");

    }
}
