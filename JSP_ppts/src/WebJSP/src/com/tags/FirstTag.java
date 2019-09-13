package com.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;

public class FirstTag extends javax.servlet.jsp.tagext.TagSupport {

	public int doStartTag() throws JspException{
		try {
			JspWriter out=pageContext.getOut();
			out.print("<h1>Welcome to All</h1>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return EVAL_BODY_INCLUDE;
	}
  public int doEndTag() throws JspException{
	  return EVAL_PAGE;
  }
}
