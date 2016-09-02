/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.Query;

import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.EAO.ItemEAO;


/**
 * Session Bean implementation class UserServiceImpl
 */
@Stateless
public class ItemManagerBean implements ItemManager{

    /**
     * Default constructor. 
     */
	
    @EJB
    ItemEAO itemEntityDAO;
	
    public ItemManagerBean() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public Item getItemEntity(long itemId){
        return itemEntityDAO.getItemEntity(itemId);
    }

    @Override
    public void addItemEntity(Item item){
        itemEntityDAO.create(item);
    }

    @Override
    public void removeItemEntity(long itemId) {
        Item item=new Item();
        item.setId(itemId);
        itemEntityDAO.delete(item);
    }

    @Override
    public void updateItemEntity(Item item){
        itemEntityDAO.update(item);
    }

    @Override
    public List<Item> getItemByAssetNumber(String AssetNumber){
        return itemEntityDAO.getItemByAssetNumber(AssetNumber);
    }

    @Override
    public List<Item> getAllItemsList() {
        return itemEntityDAO.getAllItemsList();
    }
    
    @Override
    public Double totalAmountOfAllAssets(){
        return itemEntityDAO.totalAmountOfAllAssets();
    }

    @Override
    public Object[] totalAmountOfAssetsAndQtyByCategoryId(long categoryId) {
    	return itemEntityDAO.totalAmountOfAssetsAndQtyByCategoryId(categoryId);
       
    }

    @Override
    public List<Item> getItemSerachByDescription(String description){
    	return itemEntityDAO.getItemSerachByDescription(description);
    }
    
    @Override
    public List<Item> getOlderAssetsGivenYear(int year){
    	return itemEntityDAO.getOlderAssetsGivenYear(year);
    }
    
    @Override
    public List<Item> getItemBySerialNo(int serialNumber){
    	return itemEntityDAO.getItemBySerialNo(serialNumber);
    }

	@Override
	public List<Item> getItemListByCategoryId(long categoryId){
		return itemEntityDAO.getItemListByCategoryId(categoryId);
	}

	@Override
	public Item getItem(String assetNumber) {
		return itemEntityDAO.getItem(assetNumber);
	}
}
