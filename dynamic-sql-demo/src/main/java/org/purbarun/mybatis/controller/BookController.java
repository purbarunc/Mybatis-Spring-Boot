package org.purbarun.mybatis.controller;

import java.util.List;
import org.purbarun.mybatis.domain.Book;
import org.purbarun.mybatis.domain.BookFilter;
import org.purbarun.mybatis.mapper.BookMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	private BookMapper bookMapper;

	public BookController(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}

	@GetMapping("/bytitle")
	public List<Book> getBookByTitle(@RequestParam("title") String title) {
		return bookMapper.findBooksByTitle(title);
	}

	@GetMapping
	public List<Book> getsortedBooks(@RequestHeader(value = "sortBy", required = false) String title) {
		return bookMapper.getSortedBooks(title);
	}

	@PostMapping("/filter")
	public List<Book> getBooksByFilter(@RequestBody BookFilter bookFilter) {
		return bookMapper.findBooksByFilter(bookFilter);
	}

	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	public void updateBook(@RequestBody Book book) {
		bookMapper.updateBook(book);
	}
}
