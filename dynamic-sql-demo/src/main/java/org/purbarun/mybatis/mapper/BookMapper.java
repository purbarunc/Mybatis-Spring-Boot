package org.purbarun.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.purbarun.mybatis.domain.Book;
import org.purbarun.mybatis.domain.BookFilter;

@Mapper
public interface BookMapper {
	List<Book> findBooksByTitle(@Param("title") String title);
	List<Book> getSortedBooks(@Param("sortBy") String sortBy);
	List<Book> findBooksByFilter(@Param("bookFilter") BookFilter bookFilter);
	void updateBook(@Param("book") Book book);
}
