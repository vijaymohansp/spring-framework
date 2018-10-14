package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AddBookRepository;
import com.example.demo.dao.BookRepository;
import com.example.demo.model.Book;
import com.example.demo.model.Register;

@Service
public class BookService {
    
	@Autowired
	BookRepository bookRepository;
	
	@Autowired
	AddBookRepository addBookRepo;
	
	public void registerService(Register register) {
		bookRepository.save(register);
	}
	
	public List<Register> authService() {
		List<Register> list=bookRepository.findAll();
		return list;
	}

	public void addBookService(Book book) {
		addBookRepo.save(book);
		
	}

	public List<Book> allBooks() {
		
		List<Book> books=addBookRepo.findAll();
		
		return books;
	}
}
