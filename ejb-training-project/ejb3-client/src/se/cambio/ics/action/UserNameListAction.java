package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.List;

import se.cambio.ics.controller.UserControllerImpl;
import se.cambio.ics.persistence.User;

import com.opensymphony.xwork2.ActionSupport;

public class UserNameListAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	List<User> userList=new ArrayList<User>();
	ArrayList<String> userNameList=new ArrayList<String>();
	private String selectedName;


	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public ArrayList<String> getUserNameList() {
		return userNameList;
	}

	public void setUserNameList(ArrayList<String> userNameList) {
		this.userNameList = userNameList;
	}

	public String getSelectedName() {
		return selectedName;
	}

	public void setSelectedName(String selectedName) {
		this.selectedName = selectedName;
	}

	@Override
	public String execute() {

		UserControllerImpl userController=new UserControllerImpl();
		
		try {
			userList=userController.GetAllUsersList();
			
			for(User user:userList){
				userNameList.add(user.getLoginName());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
		
	
		return SUCCESS;
	}


}
