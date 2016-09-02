package se.cambio.ics.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import se.cambio.ics.controller.UserControllerImpl;
import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.Role;

import com.opensymphony.xwork2.ActionSupport;

public class UserLogInAction extends ActionSupport {
	
	protected static int uId;
	private String name;
	ArrayList<Role> list=new ArrayList<Role>();
	
	
	public ArrayList<Role> getList() {
		return list;
	}
	public void setList(ArrayList<Role> list) {
		this.list = list;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String execute() {
	 
		HttpServletRequest req = ServletActionContext.getRequest();
		String stringUId=req.getParameter("userId");
		
		String name=req.getParameter("userName");
		
		if(stringUId.isEmpty() || name.isEmpty()){
			return ERROR;
		}
		
		uId=Integer.parseInt(stringUId);
		UserControllerImpl userController=new UserControllerImpl();
	
		Role role;
		if (checkLogin(uId,name)) {
			try {
				//list.add=userController.getUserById(uId).getRole().getRoleName();
				role=userController.getUserById(uId).getRole();
				list.add(role);
				String roleName=userController.getUserById(uId).getRole().getRoleName();
				if(roleName.equals("Employee")){
					return "employee";
				}
				
				if(roleName.equals("General Manager")){
					return "generalManager";
				}
				
				if(roleName.equals("Admin User")){
					return "adminUser";
				}
				//req.setAttribute("", roleName);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return SUCCESS;
		} else
			return ERROR;
		
	}
	
	public boolean checkLogin(int userId,String name) {
		
		boolean status = false;
		String userName = null;
		
		UserControllerImpl userDelegate=new UserControllerImpl();

		try {
	
			userName=userDelegate.getUserById(userId).getLoginName();
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if(name.equals(userName))
			status=true;
		else
			status=false;
		
		 
		return status;
		 
	}
	

}
