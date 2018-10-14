package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.dao.AddBookRepository;
import com.example.demo.model.Book;
import com.example.demo.model.Login;
import com.example.demo.model.Register;
import com.example.demo.service.BookService;

@Controller
public class BookController {
    
	@Autowired
	BookService bookService;
	
	
	
	@RequestMapping("/")
	public String loginPage(Model model) {
		model.addAttribute("login", new Login());
		return "login";
	}
	
	@RequestMapping("/register")
	public String registerPage(Model model) {
		model.addAttribute("login", new Register());
		return "register";
	}
	
	@RequestMapping(path="/loginPage",method=RequestMethod.POST)
	public String loginProcess(@ModelAttribute("loginForm") Login login,Model model) {
		model.addAttribute("username", login.getUserName());
		List<Register> list=bookService.authService();
		for(Register user:list) {
		    String name=user.getUserName();
		    String pass=user.getPassword();
			if(login.getUserName().equals(name) && login.getPassword().equals(pass)) {
				return "home";
			}
			model.addAttribute("error", "UserName and Password Not Valid!!");
		}
		return "login";
	}
	
	@RequestMapping(path="/registerPage",method=RequestMethod.POST)
	public String registerProcess(@ModelAttribute("registerForm") Register register,Model model) {
		//model.addAttribute("username", register.getUserName());
		model.addAttribute("success", "Registration SuccessFull!!");
		bookService.registerService(register);
		return "login";
	}
	
	@RequestMapping("/addBook")
	public String addBook(Model model) {
		model.addAttribute("book", new Book());
		return "addBook";
	}
	
	@RequestMapping(path="/addBook",method=RequestMethod.POST)
	public String addBookProcess(@ModelAttribute("addBook") Book book,Model model) {
		bookService.addBookService(book);
		return "home";
	}
	
	@RequestMapping("/allBooks")
	public String allBooks(Model model) {
	   List<Book> books= bookService.allBooks();
	   model.addAttribute("books", books);
		return "allBooks";
	}
}
