package com.zwj.service;

import java.util.List;

import com.zwj.entity.CardTradeDetail;

/**
 * @author Administrator ��ѯCardTradeDetail�ӿ�
 */
public interface ICardTradeDetailService {
	public CardTradeDetail getCardTradeDetailById(String id,String yc_errormessage);

	public List<CardTradeDetail> getAllCardTradeDetail();

}
