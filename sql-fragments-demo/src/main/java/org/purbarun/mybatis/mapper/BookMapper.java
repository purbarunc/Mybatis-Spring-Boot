package org.purbarun.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.purbarun.mybatis.domain.Book;

@Mapper
public interface BookMapper {
	Book getBookById(@Param("id") Long id);
	void updateBook(@Param("book") Book book,@Param("id") Long id);
	void deleteBook(@Param("id") Long id);
}
