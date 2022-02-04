package ru.ystu.rBook.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import ru.ystu.rBook.domain.Book;
import ru.ystu.rBook.service.BookService;

import javax.annotation.PostConstruct;

@Configuration
@RequiredArgsConstructor
public class BookConfig {
    private final BookService service;

    @PostConstruct
    public void init() {
        service.create(new Book(1L, "В поисках утраченного времени", "1907", "Пруст", "Драма"));
        service.create(new Book(2L, "Три товарища", "1933", "Ремарк", "Роман"));
        service.create(new Book(4L, "Как завоевать друзей", "1950", "Карнеги", "Психология"));
        service.create(new Book(5L, "В поисках Немо", "1999", "Верн", "Фантастика"));
    }
}
