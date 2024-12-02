package org.purbarun.mybatis.mapper;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.purbarun.mybatis.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;

@MybatisTest
class BookMapperTest {
	@Autowired
	private BookMapper bookMapper;

	@Test
	@DisplayName("getBookById executes successfully")
	void getBookById() {
		Book book = bookMapper.getBookById(1L);
		assertThat(book.getTitle()).isEqualTo("Effective Java");
		assertThat(book.getAuthor()).isEqualTo("Joshua Bloch");
		assertThat(book.getPublicationYear()).isEqualTo(2018);
	}

}
