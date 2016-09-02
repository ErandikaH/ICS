package se.cambio.ics.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import se.cambio.ics.controller.UserControllerImpl;
import se.cambio.ics.persistence.User;

import com.opensymphony.xwork2.ActionSupport;

public class SearchUserAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private UserControllerImpl userController;
	protected static String loginName;
	
	String roleName;
	
	ArrayList<User> list=new ArrayList<User>();
	

	public ArrayList<User> getList() {
		return list;
	}


	public void setList(ArrayList<User> list) {
		this.list = list;
	}

	
	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public SearchUserAction() throws Exception{
		
		userController=new UserControllerImpl();
		
	}

	
	
	@Override
	public String execute() {
		
		HttpServletRequest req = ServletActionContext.getRequest();
		
		loginName=req.getParameter("selectedName");
		
		User user=null;
		
		try {
			user=userController.getUserByName(loginName);
			roleName=user.getRole().getRoleName();
			
			list.add(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
		

		//}
		return SUCCESS;
		
	}



}
