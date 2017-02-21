package com.zwj.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zwj.util.FileOperateUtil;

/**
 * @author Administrator
 *�ϴ������ļ�
 */
@Controller
@RequestMapping("/file")
public class FileOperateController {
	/**
	 * @return
	 * �ϴ�ҳ��
	 */
	@RequestMapping("/to_upload")
	public ModelAndView toUpload() {
		return new ModelAndView("file/upload");
	}

	/**
	 * @param request
	 * @return
	 * @throws IOException
	 * �ϴ�����
	 */
	@RequestMapping("/upload")
	public ModelAndView upload(HttpServletRequest request) throws IOException {
		Map<String, Object> map = new HashMap<String, Object>();
		String[] alaises = ServletRequestUtils.getStringParameters(request,
				"alais");
		String[] params = new String[] { "alais" };
		Map<String, Object[]> values = new HashMap<String, Object[]>();
		values.put("alais", alaises);
		List<Map<String, Object>> result = FileOperateUtil.upload(request,
				params, values);
		map.put("result", result);
		return new ModelAndView("file/uploadsuccess", map);
	}
	
	/**
	 * @param request
	 * @return
	 * ���ع���
	 */
	@RequestMapping("/download")
	public ModelAndView download(HttpServletRequest request,HttpServletResponse response){
		
		return null;
	}
}
