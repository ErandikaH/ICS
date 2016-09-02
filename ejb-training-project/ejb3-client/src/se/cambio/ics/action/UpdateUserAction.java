package se.cambio.ics.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import se.cambio.ics.controller.RoleControllerImpl;
import se.cambio.ics.controller.UserControllerImpl;
import se.cambio.ics.persistence.Role;
import se.cambio.ics.persistence.User;

import com.opensymphony.xwork2.ActionSupport;

public class UpdateUserAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	RoleControllerImpl roleController=null;
	UserControllerImpl userController=null;
	User user=new User();

	
	@Override
	public String execute() {
		
		HttpServletRequest req = ServletActionContext.getRequest();
		//long itemId=Long.parseLong(req.getParameter("itemId"));
		userController=new UserControllerImpl();
		roleController=new RoleControllerImpl();
		String loginName=SearchUserAction.loginName;
		
		int userId = 0;
		try {
			userId = userController.getUserByName(loginName).getUserId();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		user.setUserId(userId);
		user.setFirstName(req.getParameter("firstName"));
		user.setLastName(req.getParameter("lastName"));
		user.setLoginName(req.getParameter("loginName"));
		user.setEmail(req.getParameter("email"));
		

		Role r=null;
		
		try {
			
			r=roleController.getRoleByName(req.getParameter("roleName"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
		
		user.setRole(r);
		
		try {
			userController.updateUser(user);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
		
		//return SUCCESS;
	}

}
