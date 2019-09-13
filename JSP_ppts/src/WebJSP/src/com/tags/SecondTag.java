package com.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;

public class SecondTag extends javax.servlet.jsp.tagext.TagSupport {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int doStartTag() throws JspException {
	try {
		JspWriter out=pageContext.getOut();
		out.println("Welcome to "+getName());
	} catch (Exception e) {	}
	return EVAL_BODY_INCLUDE;
	}

	@Override
	public int doEndTag() throws JspException {
	return EVAL_PAGE;
	}
}