package com.kdyzm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.kdyzm.domain.Person;
/**
 * 向导表单控制器
 * @author kdyzm
 *
 */
@SuppressWarnings("deprecation")
public class MyWizardController extends AbstractWizardFormController{
	/**
	 * 还是需要通过构造方法注册命令类和命令方法
	 */
	public MyWizardController() {
		this.setCommandClass(Person.class);
		this.setCommandName("person");
	}
	/**
	 * 当最终提交了表单之后将会访问该方法
	 */
	@Override
	protected ModelAndView processFinish(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		System.out.println("访问了WizardController类："+command);
		return new ModelAndView("index");
	}
	@Override
	protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		System.out.println("访问了processCancel方法！"+command);
		return new ModelAndView("index");
	}
}
