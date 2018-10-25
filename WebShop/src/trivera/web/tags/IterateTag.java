package trivera.web.tags;

import java.util.Collection;
import java.util.Iterator;

import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * <p>
 * This component and its source code representation are copyright protected and
 * proprietary to Trivera Technologies, LLC, Worldwide D/B/A Trivera Technologies
 *
 * This component and source code may be used for instructional and evaluation
 * purposes only. No part of this component or its source code may be sold,
 * transferred, or publicly posted, nor may it be used in a commercial or
 * production environment, without the express written consent of the Trivera
 * Group, Inc.
 *
 * Copyright (c) 2018 Trivera Technologies, LLC. http://www.triveratech.com
 * 
 * </p>
 * 
 * @author Trivera Technologies Tech Team.
 */
public class IterateTag extends TagSupport {
	private Iterator<?> iterator;
	private Collection<?> items;
	private String var;

	public void setItems(Collection<?> items) {
		this.items = items;
	}

	public void setVar(String var) {
		this.var = var;
	}

	public int doStartTag() throws JspTagException {
		if (this.items == null) {
			return SKIP_BODY;
		}
		iterator = items.iterator();
		if (iterator.hasNext()) {
			pageContext.setAttribute(var, iterator.next());
			return EVAL_BODY_INCLUDE;
		} else {
			return SKIP_BODY;
		}
	}

	public int doAfterBody() {
		if (iterator.hasNext()) {
			pageContext.setAttribute(var, iterator.next());
			return EVAL_BODY_AGAIN;
		} else {
			return SKIP_BODY;
		}
	}

}