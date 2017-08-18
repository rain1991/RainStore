package shop.itgo.core.dao;

import org.springframework.stereotype.Repository;

import shop.itgo.core.pojo.TestTb;

@Repository
public interface TestTbDAO {
	public void add(TestTb testTb);
}
