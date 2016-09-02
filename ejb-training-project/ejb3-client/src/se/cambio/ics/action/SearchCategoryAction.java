package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import se.cambio.ics.controller.CategoryControllerImpl;
import se.cambio.ics.persistence.Category;

import com.opensymphony.xwork2.ActionSupport;

public class SearchCategoryAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String categoryName;
	List<Category> aaData=new ArrayList<Category>();
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public List<Category> getAaData() {
		return aaData;
	}
	public void setAaData(List<Category> aaData) {
		this.aaData = aaData;
	}
	
	@Override
	public String execute() {
		
		CategoryControllerImpl category=new CategoryControllerImpl();
		
		if(!categoryName.equals("0")){
			try {
				aaData=category.getCategoryByName(categoryName);
				
				return SUCCESS;
			} catch (Exception e) {
				java.util.logging.Logger.getLogger(SearchCategoryAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
				return ERROR;
			}
		}else{
			try {
				aaData=category.getAllCategoryList();
				return SUCCESS;
			} catch (Exception e) {
				java.util.logging.Logger.getLogger(SearchCategoryAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
				return ERROR;
			}
		}

	}


}
