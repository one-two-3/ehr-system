package com.ehr.controllers;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ehr.pojo.SystemModules;

@Controller
@RequestMapping("/createLeft")
public class CreateLeftController {

	@Autowired
	private SystemModules systemModules;
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/{type}")
	@ResponseBody
	public ModelAndView createLeft(@PathVariable("type") String type, HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		LinkedHashMap<String, String> map = null;
			try {
				map = (LinkedHashMap<String, String>) systemModules.queryByModuleName(type);
				System.out.println(map.values());
			} catch (ClassNotFoundException e) {
				mv.addObject("msg",e.getMessage());
			} catch (InstantiationException e) {
				mv.addObject("msg",e.getMessage());
			} catch (IllegalAccessException e) {
				mv.addObject("msg",e.getMessage());
			} catch (NoSuchMethodException e) {
				mv.addObject("msg",e.getMessage());
			} catch (SecurityException e) {
				mv.addObject("msg",e.getMessage());
			} catch (IllegalArgumentException e) {
				mv.addObject("msg",e.getMessage());
			} catch (InvocationTargetException e) {
				mv.addObject("msg",e.getMessage());
			}
		mv.addObject("sys_module",map);
		mv.setViewName("home");
		return mv;
	}
}
