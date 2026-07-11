package com.library.service;
import com.library.entity.Book;
import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class BookService {
    @Autowired
    private BookRepository repository;
    public List<Book> getAllBooks() {
        return repository.findAll();
    }
    public Book getBookById(Integer id) {
        return repository.findById(id).orElse(null);
    }
    public Book saveBook(Book book) {
        return repository.save(book);
    }
    public Book updateBook(Book book) {
        return repository.save(book);
    }
    public void deleteBook(Integer id) {
        repository.deleteById(id);
    }
}