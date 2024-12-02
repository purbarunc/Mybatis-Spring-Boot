package org.purbarun.mybatis.controller;

import java.util.List;
import org.purbarun.mybatis.domain.Book;
import org.purbarun.mybatis.domain.BookFilter;
import org.purbarun.mybatis.mapper.BookMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	private BookMapper bookMapper;

	public BookController(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}

	@PostMapping("/search")
	public List<Book> getBooksByFilter(@RequestBody BookFilter bookFilter) {
		return bookMapper.searchBook(bookFilter.getId(), bookFilter.getYear());
	}
}
