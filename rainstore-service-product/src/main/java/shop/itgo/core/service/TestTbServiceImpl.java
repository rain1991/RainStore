package shop.itgo.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import shop.itgo.core.dao.TestTbDAO;
import shop.itgo.core.pojo.TestTb;

/**
 * 测试服务类
 * 
 * @author Administrator
 *
 */
@Service("testTbService")
@Transactional
public class TestTbServiceImpl implements TestTbService {

	@Autowired
	private TestTbDAO testTbDAO;

	@Override
	public void add(TestTb testTb) {
		testTbDAO.add(testTb);
	}
}

