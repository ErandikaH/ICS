package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import se.cambio.ics.controller.CategoryControllerImpl;
import se.cambio.ics.persistence.Category;

import com.opensymphony.xwork2.ActionSupport;

public class CategoryListAction extends ActionSupport {
	
private static final long serialVersionUID = 1L;
	
	private List<Category> category=new ArrayList<Category>();
	private HashMap<String,String> aaData=new HashMap<String,String>(); 
	
	public List<Category> getCategory() {
		return category;
	}
	public void setCategory(List<Category> category) {
		this.category = category;
	}

	public HashMap<String, String> getAaData() {
		return aaData;
	}
	public void setAaData(HashMap<String, String> aaData) {
		this.aaData = aaData;
	}
	
	@Override
    public String execute(){
    	
		CategoryControllerImpl categoryControllerImpl=new CategoryControllerImpl();
		aaData.put("0","Select Category");
    	try {
			category=categoryControllerImpl.getAllCategoryList();
			for(Category c:category){
	    		aaData.put(Integer.toString(c.getCategoryId()), c.getCategoryName());
	    	}
	   
		} catch (Exception e) {
			java.util.logging.Logger.getLogger(CategoryListAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
		}
   
        return SUCCESS;

    }

}
