package se.cambio.ics.action;


import se.cambio.ics.controller.CategoryControllerImpl;
import se.cambio.ics.persistence.Category;


import com.opensymphony.xwork2.ActionSupport;

public class CategoryAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private String categoryId;
	private String catgoryName;
	private String description;
	
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
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

	@Override
	public String execute() {
		
		CategoryControllerImpl categoryController=new CategoryControllerImpl();
		Category c;
	
		try {
			int catId=Integer.parseInt(categoryId);
			c=categoryController.getCategoryById(catId);
			catgoryName=c.getCategoryName();
			description=c.getDescription();
			return SUCCESS;
	
		} catch (Exception e1) {
			java.util.logging.Logger.getLogger(CategoryAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e1);
			return ERROR;
		}
		
		
	}

}
