package controller;

import model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.BookService;

import java.util.List;

@Controller
@RequestMapping("/api/v1/")
public class BookController {
    private BookService service;

    BookController(BookService service) {
        this.service = service;
    }

    @RequestMapping("books")
    public @ResponseBody List<Book> getAllBooks() {
        return service.getAllBooks();
    }
}
