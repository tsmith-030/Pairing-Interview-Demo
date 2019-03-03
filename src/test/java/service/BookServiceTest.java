package service;

import model.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import repository.BookRepository;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BookServiceTest {

    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookService service;

    private List<Book> books = Arrays.asList(
            Book.builder()
                    .id(1L)
                    .name("Dinosaurs")
                    .author("Jeff")
                    .build()
    );

    @Test
    public void getAllBooks_returnsAListOfAllBooksInDB() {
        when(bookRepository.getAllBooks()).thenReturn(books);

        assertEquals(books, service.getAllBooks());

        verify(bookRepository).getAllBooks();
    }
}