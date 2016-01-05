package com.kdyzm.controller;

import org.springframework.web.servlet.mvc.SimpleFormController;

import com.kdyzm.domain.Person;
/**
 * 简单表单控制器
 * 访问方法：http://localhost:8080/springmvc1/formController.action
 * 表单页面显示方法和访问的表单提交的对象都是相同的url地址
 * @author kdyzm
 *
 */
@SuppressWarnings("deprecation")
public class MyFormController extends SimpleFormController {
	/**
	 * 在构造方法中实现注册命令类和命令名称
	 */
	public MyFormController() {
		this.setCommandClass(Person.class);
		this.setCommandName("person");
		System.out.println("执行了formController的构造方法！");
	}
	/**
	 * 执行set、get方法的时候会出问题！
	 * 表单内容必须填写正确，否则不能正确提交！最后执行不了该方法！
	 */
	@Override
	protected void doSubmitAction(Object command) throws Exception {
		System.out.println("MyFormController："+command);
		super.doSubmitAction(command);
	}
}
