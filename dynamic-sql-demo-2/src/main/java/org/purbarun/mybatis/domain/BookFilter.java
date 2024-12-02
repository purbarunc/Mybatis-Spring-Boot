package org.purbarun.mybatis.domain;

import java.util.List;

public class BookFilter {
	private Long id;
	private List<Integer> year;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Integer> getYear() {
		return year;
	}
	public void setYear(List<Integer> year) {
		this.year = year;
	}
}
