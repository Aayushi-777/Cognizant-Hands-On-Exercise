package com.library.controller;
import com.library.entity.Book;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService service;
    @GetMapping
    public List<Book> getBooks() {
        return service.getAllBooks();
    }
    @GetMapping("/{id}")
    public Book getBook(@PathVariable Integer id) {
        return service.getBookById(id);
    }
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return service.saveBook(book);
    }
    @PutMapping
    public Book updateBook(@RequestBody Book book) {
        return service.updateBook(book);
    }
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Integer id) {
        service.deleteBook(id);
        return "Book Deleted Successfully";
    }
}