package com.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;

public class ThridTag extends javax.servlet.jsp.tagext.BodyTagSupport {
	@Override
	public int doAfterBody() throws JspException {

		try {
			JspWriter out = bodyContent.getEnclosingWriter();
			String text = bodyContent.getString();
			out.print("<table border=1><tr><td>" + 
			text + "</td></tr></table>");
		} catch (Exception e) {
		}
		return EVAL_BODY_INCLUDE;
	}
}
