package ru.fischerski.shamalnotepad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.fischerski.shamalnotepad.db.repository.SpaceRepository;

@SpringBootApplication
public class ShamalNotepadApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShamalNotepadApplication.class, args);
    }
}