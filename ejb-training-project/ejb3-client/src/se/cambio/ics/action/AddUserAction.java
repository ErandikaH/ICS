package se.cambio.ics.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import se.cambio.ics.controller.RoleControllerImpl;
import se.cambio.ics.controller.UserControllerImpl;
import se.cambio.ics.persistence.Role;
import se.cambio.ics.persistence.User;

import com.opensymphony.xwork2.ActionSupport;

public class AddUserAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	User user=new User();
	
	RoleControllerImpl role=null;
	
	
	@Override
	public String execute() {
		
		HttpServletRequest req = ServletActionContext.getRequest();
		
//		long id=Long.parseLong(req.getParameter("itemId"));
//		item.setId(id);
		
		user.setFirstName(req.getParameter("firstName"));
		user.setLastName(req.getParameter("lastName"));
		user.setLoginName(req.getParameter("userName"));
		user.setEmail(req.getParameter("email"));
		
		role=new RoleControllerImpl();
		
		Role r=null;
		
		try {
			r=role.getRoleByName(req.getParameter("roleName"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
		
		user.setRole(r);
		
		UserControllerImpl userControll=new UserControllerImpl();
		
		try {
			userControll.addUser(user);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
		
		
		//return SUCCESS;
	}


}
