package com.tendecoders.libraraymanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tendecoders.libraraymanagement.model.Book;
import com.tendecoders.libraraymanagement.service.BookService;

@RestController
@RequestMapping("/books")
public class HeyController {
		
		@Autowired
		BookService repo;
		@PostMapping("/saveBook")
		public String saveBooks(@RequestBody Book book) {
			repo.create(book);
			return "sucess";
			
		}
		@GetMapping("/getBooks")
		public List<Book> getBooks() {
			
			return (List<Book>)repo.getall();
		}
		@GetMapping("get/{bookid}")
		private Book getid(@PathVariable("id")long Id)
		{
			//return repo.findById(Id);
			return repo.get(Id);
		}
		
		@GetMapping("/deleteBook/{bookId}")
		public String deleteBook(@PathVariable int bookId ) {
		int id = 0;
		repo.delete(id);
		return "success";
		}
				

		
	}