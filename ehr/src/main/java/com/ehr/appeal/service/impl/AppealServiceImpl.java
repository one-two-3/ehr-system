package com.ehr.appeal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehr.appeal.service.AppealService;
import com.ehr.mapper.EhrAppealMapper;
import com.ehr.pojo.EhrAppeal;
import com.ehr.pojo.EhrAppealExample;

@Service
public class AppealServiceImpl implements AppealService {

	@Autowired
	EhrAppealMapper appealMapper;
	
	@Override
	public List<EhrAppeal> queryAll() {
		EhrAppealExample appealExample = new EhrAppealExample();
		return appealMapper.selectByExample(appealExample);
	}

	@Override
	public void delete(String[] enumbers) {
		EhrAppealExample exam = new EhrAppealExample();
		for (String string : enumbers) {
			exam.clear();
			exam.createCriteria().andEnumberEqualTo(string);
			appealMapper.deleteByExample(exam);
		}
	}

}
