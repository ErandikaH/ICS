package se.cambio.ics.action;

import se.cambio.ics.controller.CategoryControllerImpl;
import se.cambio.ics.persistence.Category;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteCategoryAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String categoryId;
	private String dummyMsg;
	private String errorMsg;
	
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
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
		
		CategoryControllerImpl c=new CategoryControllerImpl();
		Category category=new Category();
	
		int catId=Integer.parseInt(categoryId);
		
		int version=0;
		category.setCategoryId(catId);
		try {
			version=c.getCategoryById(catId).getVersion();
		} catch (Exception e) {
			dummyMsg = "Delete failed. :" + e.getMessage(); 
			java.util.logging.Logger.getLogger(DeleteCategoryAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
		}
		

		try {
			c.removeCategory(catId,version);
			dummyMsg = "Deleted Successfully.";
			return SUCCESS;
		} catch (Exception e1) {
			errorMsg="$";
			dummyMsg = "Delete failed. :" + e1.getMessage();
			//java.util.logging.Logger.getLogger(DeleteCategoryAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
			return ERROR;
		}

		
		
	}


}
