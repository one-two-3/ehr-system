package com.ehr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ehr.mapper.EhrPerformanceMapper;
import com.ehr.pojo.EhrPerformance;
import com.ehr.pojo.EhrPerformanceExample;
import com.ehr.utils.EhrResult;

@Controller
@RequestMapping("/performance")
public class PerformanceController {
	
	@Autowired
	EhrPerformanceMapper pMapper;
	
	@RequestMapping("/queryPerformanceRecords")
	@ResponseBody
	public EhrResult queryPerformanceRecords() {
		EhrPerformanceExample example = new EhrPerformanceExample();
		List<EhrPerformance> list = pMapper.selectByExample(example);
		return EhrResult.ok(list);
	}
	
}
