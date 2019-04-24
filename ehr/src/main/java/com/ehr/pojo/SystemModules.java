package com.ehr.pojo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="modules")
public class SystemModules {
	
	//人事档案
	public LinkedHashMap<String, String> humanfiles;
	
	//薪资管理
	public LinkedHashMap<String, String>  salary;
	
	//社保
	public LinkedHashMap<String, String>  socialsecurity;
	
	//考勤
	public LinkedHashMap<String, String>  attendence;
	
	//绩效
	public LinkedHashMap<String, String>  performance;
	
	//部门
	public LinkedHashMap<String, String>  department;
	
	//招聘
	public LinkedHashMap<String, String>  recruitment;
	
	public LinkedHashMap<String, String>  training;
	
	//预警
	public LinkedHashMap<String, String>  warning;
	
	//系统
	public LinkedHashMap<String, String>  system;
	
	//通过反射机制执行查询方法
	public Object queryByModuleName(String moduleName) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException  {
		if(null == moduleName)
			return null;
		String methodName = "get" + moduleName.toUpperCase().charAt(0) + moduleName.substring(1);
		Class<?> klass = Class.forName("com.ehr.pojo.SystemModules");
		Method method = klass.getDeclaredMethod(methodName);
		method.setAccessible(true);
		return method.invoke(this);
	}


	public LinkedHashMap<String, String> getHumanfiles() {
		return humanfiles;
	}


	public void setHumanfiles(LinkedHashMap<String, String> humanfiles) {
		this.humanfiles = humanfiles;
	}


	public LinkedHashMap<String, String> getsalary() {
		return salary;
	}


	public void setsalary(LinkedHashMap<String, String> salary) {
		this.salary = salary;
	}


	public LinkedHashMap<String, String> getSocialsecurity() {
		return socialsecurity;
	}


	public LinkedHashMap<String, String> getSalary() {
		return salary;
	}


	public void setSalary(LinkedHashMap<String, String> salary) {
		this.salary = salary;
	}


	public void setSocialsecurity(LinkedHashMap<String, String> socialsecurity) {
		this.socialsecurity = socialsecurity;
	}


	public LinkedHashMap<String, String> getAttendence() {
		return attendence;
	}


	public void setAttendence(LinkedHashMap<String, String> attendence) {
		this.attendence = attendence;
	}


	public LinkedHashMap<String, String> getPerformance() {
		return performance;
	}


	public void setPerformance(LinkedHashMap<String, String> performance) {
		this.performance = performance;
	}


	public LinkedHashMap<String, String> getDepartment() {
		return department;
	}


	public void setDepartment(LinkedHashMap<String, String> department) {
		this.department = department;
	}


	public LinkedHashMap<String, String> getRecruitment() {
		return recruitment;
	}


	public void setRecruitment(LinkedHashMap<String, String> recruitment) {
		this.recruitment = recruitment;
	}


	public LinkedHashMap<String, String> getTraining() {
		return training;
	}


	public void setTraining(LinkedHashMap<String, String> training) {
		this.training = training;
	}


	public LinkedHashMap<String, String> getWarning() {
		return warning;
	}


	public void setWarning(LinkedHashMap<String, String> warning) {
		this.warning = warning;
	}


	public LinkedHashMap<String, String> getSystem() {
		return system;
	}


	public void setSystem(LinkedHashMap<String, String> system) {
		this.system = system;
	}
}
