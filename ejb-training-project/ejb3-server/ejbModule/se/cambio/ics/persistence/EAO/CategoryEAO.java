/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;

import se.cambio.ics.persistence.Category;
import se.cambio.ics.persistence.EAO.generics.GenericEAO;



/**
 *
 * @author PC
 */
public interface CategoryEAO extends GenericEAO<Category>{
    
    public List<Category> getCategoryByName(String categoryName)throws Exception;
    
    public Category getCategoryById(int categoryId) throws Exception;
    
    public List<Category> getAllCategoryList() throws Exception;
     
    
}
