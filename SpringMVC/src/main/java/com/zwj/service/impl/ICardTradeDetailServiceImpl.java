package com.zwj.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.zwj.dao.CardTradeDetailDao;
import com.zwj.entity.CardTradeDetail;
import com.zwj.service.ICardTradeDetailService;

/**
 * @author Administrator 
 * 查询User接口实现类
 */
@Service("icardtradedetailService")
public class ICardTradeDetailServiceImpl implements ICardTradeDetailService {

	@Resource
	private CardTradeDetailDao cardTradeDetailDao;
	@Override
	public CardTradeDetail getCardTradeDetailById(String id,String yc_errormessage) {
		// TODO Auto-generated method stub
		//return cardTradeDetailDao.getCardTradeDetailById(id);
		return cardTradeDetailDao.getById(id,yc_errormessage);
	}

	@Override
	public List<CardTradeDetail> getAllCardTradeDetail() {
		// TODO Auto-generated method stub
		//return cardTradeDetailDao.getAllCardTradeDetail();
		return cardTradeDetailDao.getAll();
	}

	

}
