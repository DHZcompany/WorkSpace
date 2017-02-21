package com.zwj.base;

import java.util.List;

public interface BaseDao<T> {
	/**
	 * @param id
	 * @return 
	 * ����id��ѯ
	 */
	T getById(String id, String yc_errormessage);

	/**
	 * @return
	 * ��ѯ����
	 */
	List<T> getAll();
}
