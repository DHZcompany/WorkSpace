package com.zwj.test;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zwj.entity.CardTradeDetail;
import com.zwj.entity.User;
import com.zwj.service.ICardTradeDetailService;
import com.zwj.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	@Autowired
	private IUserService iUserService;
	@Resource
	private ICardTradeDetailService iCardTradeDetailService;

	//@Test
	public void test() {
		User user = iUserService.getUserById("1");
		System.out.println(user.getUser_Name());
	}

	//@Test
	public void testUser() {
		List<User> user = iUserService.getAllUser();
		for (User u : user) {
			System.out.println(u.getUser_Name());
		}
	}

	@Test
	public void testCardDetail() {
		CardTradeDetail carddetail = iCardTradeDetailService.getCardTradeDetailById("26503107","Success");
		System.out.println(carddetail.getYc_flowno());
	}

	@Test
	public void testAllCardDetail() {
		List<CardTradeDetail> card=iCardTradeDetailService.getAllCardTradeDetail();
        for(CardTradeDetail c: card){
        	logger.info(c.getYc_createddate());
        	System.out.println("Á÷Ë®ºÅÊÇ"+"   "+c.getYc_flowno());
        }
	}
}
