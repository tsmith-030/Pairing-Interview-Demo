package repository;

import model.Book;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookRepository {
    public List<Book> getAllBooks() {
        List<Book> books = Arrays.asList(
                Book.builder()
                        .id(1L)
                        .name("Dinosaurs")
                        .author("Jeff")
                        .build(),
                Book.builder()
                        .id(13L)
                        .name("Dictionary")
                        .author("Webster")
                        .build(),
                Book.builder()
                        .id(18L)
                        .name("Cartography")
                        .author("Teddy")
                        .build()
        );
        return books;
    }
}
