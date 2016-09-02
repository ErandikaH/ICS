package se.cambio.ics.action;

import se.cambio.ics.controller.CategoryControllerImpl;
import se.cambio.ics.persistence.Category;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateCategoryAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private String categoryId;
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
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
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
		CategoryControllerImpl c=new CategoryControllerImpl();
		
		int catId=Integer.parseInt(categoryId);
		category.setCategoryId(catId);
		category.setCategoryName(catgoryName);
		category.setDescription(description);
		
		int version=0;
		//category.setVersion(category.getVersion());
		try {
			version=c.getCategoryById(catId).getVersion();
		} catch (Exception e) {
			//dummyMsg = "Delete failed. :" + e.getMessage(); 
			java.util.logging.Logger.getLogger(UpdateCategoryAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
		}
		category.setVersion(version);

		try {
			c.updateCategory(category);
			dummyMsg = "Updated Successfully.";
			return SUCCESS;
		} catch (Exception e1) {
			errorMsg="$";
			//java.util.logging.Logger.getLogger(UpdateCategoryAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
			dummyMsg = "Updated Failed:"+e1.getMessage();
			return ERROR;
		}
		
		//return SUCCESS;
	}

}
