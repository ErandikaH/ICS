/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.manager.CategoryManager;
import se.cambio.ics.persistence.Category;
import se.cambio.ics.persistence.exceptionmanager.DefaultExceptionHandler;


/**
 * Session Bean implementation class UserServiceImpl
 */
@Stateless
public class CategoryServiceImpl implements CategoryService{
    
    
    /**
     * Default constructor. 
     */
   
    @EJB
    CategoryManager categoryService;
   

    @Override
    public List<Category> getCategoryByName(String categoryName) throws Exception {
       
        return categoryService.getCategoryByName(categoryName);
      
    }

    @Override
    public Category getCategoryById(int categoryId) throws Exception {
         return categoryService.getCategoryById(categoryId);
      
    }

    @Override
    public void addCategory(Category category) throws Exception {
          categoryService.addCategory(category);
      
    }

    @Override
    public void removeCategory(int categoryId,int version) throws Exception {
         categoryService.deleteCategory(categoryId,version);
      
    }

    @Override
    public void updateCategory(Category category) throws Exception {
         categoryService.updateCategory(category);
        
    }

	@Override
	public List<Category> getAllCategoryList() throws Exception {
         return categoryService.getAllCategoryList();
       
	}
    
    
}
