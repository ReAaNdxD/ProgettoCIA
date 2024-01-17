package it.unirc.pwm.actions;

import java.util.Map;

import org.apache.struts2.action.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class Logout extends ActionSupport implements SessionAware {

	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;

	public String execute() {
		session.clear();
		return SUCCESS;
	}

	@Override
	public void withSession(Map<String, Object> session) {
		this.session = session;
	}

}
