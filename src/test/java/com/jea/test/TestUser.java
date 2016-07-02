package com.jea.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jea.service.UserSVC;
import com.jea.vo.UserVO;

public class TestUser {
	
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	UserSVC userSVC = (UserSVC) context.getBean("userService");

	
	@Test
	public void test() throws Exception{
		boolean b1 = userSVC.hasMathUser("zhangsan", "zhangsan");
		boolean b2 = userSVC.hasMathUser("lisi", "zhangsan");
		System.out.println("b1="+b1);
		System.out.println("b2="+b2);
		
		UserVO user = userSVC.findUserByUserName("lisi");
		System.out.println("password:"+user.getUserPassword());
	}

}
