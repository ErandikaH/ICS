/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;

import se.cambio.ics.persistence.Category;

/**
 *
 * @author PC
 */
public interface CategoryManager {
    
    public List<Category> getCategoryByName(String categoryName)throws Exception;
    
    public Category getCategoryById(int categoryId) throws Exception;

    public void addCategory(Category category) throws Exception;

    public void deleteCategory(int categoryId,int version) throws Exception;

    public void updateCategory(Category category) throws Exception;
    
    public List<Category> getAllCategoryList() throws Exception;

    
}
