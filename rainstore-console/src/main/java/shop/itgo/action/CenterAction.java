package shop.itgo.action;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.itgo.core.pojo.TestTb;
import shop.itgo.core.service.TestTbService;

/**
 * 后台管理 控制中心
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="/test")
public class CenterAction {
	
	@Autowired
	private TestTbService testTbService;

	
	@RequestMapping(value="/index1")
	public String index1(Model model)
	{
		// Dubbo调用测试
		TestTb testTb = new TestTb();
		testTb.setName("高圆圆");
		testTb.setBirthday(new Date());
		testTbService.add(testTb);

		System.out.println("高圆圆haha");
		return "index";
	}
	
	@RequestMapping(value="/index")
	public String index(Model model)
	{
		System.out.println("haha");
		return "index";
	}
}

