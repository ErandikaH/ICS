/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.persistence.Category;
import se.cambio.ics.persistence.EAO.CategoryEAO;


/**
 * Session Bean implementation class UserServiceImpl
 */
@Stateless
public class CategoryManagerBean implements CategoryManager{

    /**
     * Default constructor. 
     */
	
    @EJB
    CategoryEAO categoryDAO;
	
    public CategoryManagerBean() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public List<Category> getCategoryByName(String categoryName) throws Exception {
        return categoryDAO.getCategoryByName(categoryName);
    }

    @Override
    public Category getCategoryById(int categoryId) throws Exception {
        return (Category)categoryDAO.getCategoryById(categoryId);
    }

    @Override
    public void addCategory(Category category) throws Exception {
        categoryDAO.create(category);
    }

    @Override
    public void deleteCategory(int categoryId,int version) throws Exception {
        Category category = new Category();
        category.setCategoryId(categoryId);
        category.setVersion(version);
        categoryDAO.delete(category);
   
    }

    @Override
    public void updateCategory(Category category) throws Exception {
        categoryDAO.update(category);
    }
    
    @Override
    public List<Category> getAllCategoryList() throws Exception{
    	return categoryDAO.getAllCategoryList();
    }

}
