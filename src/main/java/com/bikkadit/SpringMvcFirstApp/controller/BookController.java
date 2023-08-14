package com.bikkadit.SpringMvcFirstApp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bikkadit.SpringMvcFirstApp.model.Book;

@Controller
public class BookController {

	@GetMapping("/books")
	public ModelAndView getBookData() {
		Book book = new Book();
		book.setBookId(11);
		book.setBookName("rama");
		book.setBookPrice(22.53);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("BOOKS", book);
		modelAndView.setViewName("book");
		
		return modelAndView;
		
	}
	
	@GetMapping("/allbooks")
	public ModelAndView getAllBooks() {
		Book book = new Book();
		book.setBookId(11);
		book.setBookName("rama");
		book.setBookPrice(22.53);
		
		Book book2 = new Book();
		book2.setBookId(11);
		book2.setBookName("rama");
		book2.setBookPrice(22.53);
		
		Book book3 = new Book();
		book3.setBookId(11);
		book3.setBookName("rama");
		book3.setBookPrice(22.53);
		
		List<Book> books = new ArrayList<>();
		books.add(book3);
		books.add(book);
		books.add(book2);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("ALLBOOKS", books);
		mav.setViewName("allbooks");
		return mav;
		
	}
}
