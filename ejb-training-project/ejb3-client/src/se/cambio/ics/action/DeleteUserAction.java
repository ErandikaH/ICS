package se.cambio.ics.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import se.cambio.ics.controller.UserControllerImpl;
import se.cambio.ics.persistence.User;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteUserAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	User user=new User();
	
	@Override
	public String execute() {
		
		HttpServletRequest req = ServletActionContext.getRequest();
	
		String loginName=req.getParameter("selectedName");;
		UserControllerImpl userController=new UserControllerImpl();
		int userId = 0;
		try {
			userId = userController.getUserByName(loginName).getUserId();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		user.setUserId(userId);
		
		
		try {
			userController.removeUserById(userId);
		
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return ERROR;
		}

		
		return SUCCESS;
	}


}
