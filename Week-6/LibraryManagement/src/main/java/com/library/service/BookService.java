package com.library.service;
import com.library.repository.BookRepository;
import org.springframework.stereotype.Service;
@Service
public class BookService {
    private BookRepository repository;
    public BookService() {
    }
    public BookService(BookRepository repository) {
        this.repository = repository;
    }
    public void setBookRepository(BookRepository repository) {
        this.repository = repository;
    }
    public void addBook() {
        System.out.println("Book Added Successfully");
        repository.displayRepository();
    }
    public void removeBook() {
        System.out.println("Book Removed Successfully");
    }
    public void searchBook() {
        System.out.println("Book Found");
    }
}