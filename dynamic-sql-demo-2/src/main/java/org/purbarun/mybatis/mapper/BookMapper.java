package org.purbarun.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.purbarun.mybatis.domain.Book;

@Mapper
public interface BookMapper {
	List<Book> searchBook(@Param("id") Long title,@Param("year") List<Integer> year);
}
