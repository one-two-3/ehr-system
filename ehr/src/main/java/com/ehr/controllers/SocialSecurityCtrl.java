package com.ehr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ehr.pojo.EhrAccounts;
import com.ehr.pojo.EhrPayRecord;
import com.ehr.pojo.EhrSsRecords;
import com.ehr.pojo.EhrSsType;
import com.ehr.pojo.ParamMapping;
import com.ehr.socialsecurity.service.SSAccountService;
import com.ehr.socialsecurity.service.SSPayRecordService;
import com.ehr.socialsecurity.service.SSRecordService;
import com.ehr.socialsecurity.service.SSTypeService;
import com.ehr.utils.EhrResult;

@Controller
@RequestMapping("/socialsecurity")
public class SocialSecurityCtrl {

	@Autowired
	SSAccountService ssaService;
	
	@Autowired
	SSRecordService ssrService;
	
	@Autowired
	SSPayRecordService ssprService;
	
	@Autowired
	SSTypeService sstService;
	
	@RequestMapping("/queryAccounts")
	@ResponseBody
	public EhrResult queryAccounts() {
		try {
			List<EhrAccounts> list = ssaService.queryAll();
			return EhrResult.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	@RequestMapping("/queryAllRecords")
	@ResponseBody
	public EhrResult queryAllRecords() {
		try {
			List<EhrSsRecords> list = ssrService.queryAll();
			return EhrResult.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	
	@RequestMapping("/queryPayRecord")
	@ResponseBody
	public EhrResult queryPayRecord() {
		try {
			List<EhrPayRecord> list = ssprService.queryAll();
			return EhrResult.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	/**
	 * 查询所有的社保类型
	 * @return
	 */
	@RequestMapping("/queryAllTypes")
	@ResponseBody
	public EhrResult queryAllTypes() {
		try {
			List<EhrSsType> list = sstService.queryAll();
			return EhrResult.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	/**
	 * 批量删除发放记录
	 * @param paramstr
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/delPayRecords/{paramstr}")
	public EhrResult delPayRecords(@PathVariable String paramstr) {
		try {
			String[] enumbers = paramstr.split(",");
			ssprService.delete(enumbers);
			return EhrResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
	
	/**
	 * 批量删除员工投保记录
	 * @param paramstr
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/delRecords/{paramstr}")
	public EhrResult delRecords(@PathVariable String paramstr) {
		try {
			String[] enumbers = paramstr.split(",");
			ssrService.delete(enumbers);
			return EhrResult.ok();
		} catch (Exception e) {
			e.printStackTrace();
			return EhrResult.build(500, ParamMapping.UNKNOWN_ERROR);
		}
	}
}
