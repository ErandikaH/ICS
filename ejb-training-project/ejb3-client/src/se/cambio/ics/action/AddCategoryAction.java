package se.cambio.ics.action;

import se.cambio.ics.controller.CategoryControllerImpl;
import se.cambio.ics.persistence.Category;

import com.opensymphony.xwork2.ActionSupport;

public class AddCategoryAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;

	private String catgoryName;
	private String description;
	private String dummyMsg;
	private String errorMsg;
	
	public String getCatgoryName() {
		return catgoryName;
	}
	public void setCatgoryName(String catgoryName) {
		this.catgoryName = catgoryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDummyMsg() {
		return dummyMsg;
	}
	public void setDummyMsg(String dummyMsg) {
		this.dummyMsg = dummyMsg;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	@Override
	public String execute() {
		
		Category category=new Category();

		category.setCategoryName(catgoryName);
		category.setDescription(description);
		
		CategoryControllerImpl c=new CategoryControllerImpl();

		try {
			c.addCategory(category);
			dummyMsg = "Added Successfully.";
			return SUCCESS;
		} catch (Exception e) {
			errorMsg="$";
			dummyMsg = "Added Failed:"+e.getMessage();
			//java.util.logging.Logger.getLogger(AddCategoryAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
			return ERROR;
		}

	}

}
