package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import se.cambio.ics.controller.DepartmentControllerImpl;
import se.cambio.ics.persistence.Department;

import com.opensymphony.xwork2.ActionSupport;

public class DepartmentListAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Department> department=new ArrayList<Department>();
	private HashMap<String,String> aaData=new HashMap<String,String>();  
	
	public List<Department> getDepartment() {
		return department;
	}
	public void setDepartment(List<Department> department) {
		this.department = department;
	}
	
	public HashMap<String, String> getAaData() {
		return aaData;
	}
	public void setAaData(HashMap<String, String> aaData) {
		this.aaData = aaData;
	}
	@Override
    public String execute(){
    	
		DepartmentControllerImpl departmentControllerImpl=new DepartmentControllerImpl();
		aaData.put("0","Select Department");
    	try {
    		department=departmentControllerImpl.getAllDepartments();
			for(Department d:department){
	    		aaData.put(Short.toString(d.getId()), d.getName());
	    	}
	   
		} catch (Exception e) {
			java.util.logging.Logger.getLogger(DepartmentListAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
		}
    	
    	
        return SUCCESS;

    }


}
