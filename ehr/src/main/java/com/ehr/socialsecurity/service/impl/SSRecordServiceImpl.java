package com.ehr.socialsecurity.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.mapper.EhrSsRecordsMapper;
import com.ehr.pojo.EhrSsRecords;
import com.ehr.pojo.EhrSsRecordsExample;
import com.ehr.socialsecurity.service.SSRecordService;


/**
 * @author guobaoyu
 * 员工社保入保记录
 */
@Service
public class SSRecordServiceImpl implements SSRecordService {

	@Autowired
	EhrSsRecordsMapper ssrMapper;
	
	@Override
	public List<EhrSsRecords> queryAll() {
		EhrSsRecordsExample exam = new EhrSsRecordsExample();
		return ssrMapper.selectByExample(exam);
	}

}