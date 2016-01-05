package com.kdyzm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.kdyzm.domain.Person;

/**
 * 命令控制器
 * 
 * @author kdyzm
 *         访问形式：http://localhost:8080/springmvc1/commandController.action?id=1&
 *         name=xiaozhang&age=12&address=shandong
 */
@SuppressWarnings("deprecation")
public class MyCommandController extends AbstractCommandController {
	/**
	 * 需要通过构造方法注册命令类和命令名称
	 */
	public MyCommandController() {
		this.setCommandClass(Person.class);
		this.setCommandName("person");
	}

	@Override
	protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		System.out.println("使用了CommandController控制器！" + command);
		return new ModelAndView("index");
	}

}
