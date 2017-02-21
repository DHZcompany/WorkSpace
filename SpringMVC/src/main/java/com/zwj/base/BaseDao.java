package com.zwj.base;

import java.util.List;

public interface BaseDao<T> {
	/**
	 * @param id
	 * @return 
	 * 按照id查询
	 */
	T getById(String id, String yc_errormessage);

	/**
	 * @return
	 * 查询所有
	 */
	List<T> getAll();
}
