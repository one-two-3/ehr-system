package com.ehr.controllers;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import com.ehr.mapper.EhrRecruitmentPlanMapper;
import com.ehr.pojo.EhrRecruitmentPlan;

/**
 *    招聘模块Controller
 */
@Controller
@RequestMapping("/recruitment")
public class RecruitmentController {
	
	@Autowired
	EhrRecruitmentPlanMapper rMapper;
	
	@RequestMapping("/addRecruitmentPlan")
	public String addRecruitmentPlan(String start, String end,EhrRecruitmentPlan plan){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			plan.setStartdate(sdf.parse(start));
			plan.setEnddate(sdf.parse(end));
			rMapper.insert(plan);
			return "success";
		} catch (ParseException e) {
			Logger logger = LoggerFactory.getLogger(RecruitmentController.class);
			logger.error("<添加招聘计划>未知的错误:" + e.getMessage());
			return "保存失败";
		}
	}
	
	@InitBinder
    public void initBinder(WebDataBinder binder, WebRequest request) {
        //转换日期 注意这里的转化要和传进来的字符串的格式一致
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
    }
}
