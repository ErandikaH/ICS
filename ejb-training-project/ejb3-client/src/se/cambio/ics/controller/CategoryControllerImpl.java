/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.controller;

import java.util.List;

import javax.naming.NamingException;

import se.cambio.ics.generics.GenericDelegate;
import se.cambio.ics.persistence.Category;
import se.cambio.ics.service.CategoryService;

/**
 *
 * @author PC
 */
public class CategoryControllerImpl extends GenericDelegate<Category> implements CategoryController{
    
    private CategoryService service;
	
    public CategoryControllerImpl(){
			
            String beanName = "CategoryServiceImpl";
            String viewClassName = "se.cambio.ics.service.CategoryService";

            setBeanName(beanName);
            setViewClassName(viewClassName);

            try {
                    service = (CategoryService) lookupRemoteBean();
            } catch (NamingException e) {
                    // TODO Auto-generated catch block
                    //System.out.println("errrrorrrrr");
                    e.printStackTrace();
            }
    }

    @Override
    public List<Category> getCategoryByName(String categoryName) throws Exception{
        return service.getCategoryByName(categoryName);
        
    }

    @Override
    public Category getCategoryById(int categoryId) throws Exception{

        return service.getCategoryById(categoryId);
       
    }

    @Override
    public void addCategory(Category category) throws Exception{
          service.addCategory(category);
      
    }

    @Override
    public void removeCategory(int categoryId,int version) throws Exception{
         service.removeCategory(categoryId,version);
    
    }

    @Override
    public void updateCategory(Category category) throws Exception{

        service.updateCategory(category);
       
    }

	@Override
	public List<Category> getAllCategoryList() throws Exception {
         return service.getAllCategoryList();
    
	}
	
    
}
