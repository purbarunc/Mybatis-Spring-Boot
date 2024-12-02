package org.purbarun.mybatis.controller;

import org.purbarun.mybatis.domain.Book;
import org.purbarun.mybatis.mapper.BookMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	private BookMapper bookMapper;

	public BookController(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}

	@GetMapping
	public Book getBookById(@RequestParam("id") Long id) {
		return bookMapper.getBookById(id);
	}

	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	public void updateBook(@RequestBody Book book) {
		bookMapper.updateBook(book, book.getId());
	}

	@DeleteMapping
	@ResponseStatus(HttpStatus.OK)
	public void deleteBook(@RequestParam("id") Long id) {
		bookMapper.deleteBook(id);
	}
}
