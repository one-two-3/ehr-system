package com.ehr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ehr.mapper.EhrUserMapper;
import com.ehr.pojo.EhrUser;
import com.ehr.pojo.EhrUserExample;
import com.ehr.utils.EhrResult;

@Controller
@RequestMapping("/system")
public class SystemController {

	@Autowired
	EhrUserMapper uMapper;
	
	@RequestMapping("/queryAllUser")
	@ResponseBody
	public EhrResult queryAllUser() {
		EhrUserExample example = new EhrUserExample();
		List<EhrUser> list = uMapper.selectByExample(example);
		return EhrResult.ok(list);
	}
}
