package ru.fischerski.shamalnotepad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.fischerski.shamalnotepad.db.dao.Document;
import ru.fischerski.shamalnotepad.db.dao.enums.Mode;

@SpringBootApplication
public class ShamalNotepadApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShamalNotepadApplication.class, args);
    }
}