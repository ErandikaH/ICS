/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.controller;

import java.util.List;
import javax.naming.NamingException;

import se.cambio.ics.generics.GenericDelegate;
import se.cambio.ics.persistence.Item;
import se.cambio.ics.service.ItemService;
import se.cambio.ics.controller.ItemController;

/**
 *
 * @author PC
 */
public class ItemControllerImpl extends GenericDelegate<Item> implements ItemController{

    private ItemService service;

    public ItemControllerImpl(){

        String beanName = "ItemServiceImpl";
        String viewClassName = "se.cambio.ics.service.ItemService";
        
        setBeanName(beanName);
        setViewClassName(viewClassName);

        try {
                service = (ItemService) lookupRemoteBean();
        } catch (NamingException e) {
                // TODO Auto-generated catch block
                System.out.println("errrrorrrrr");
                java.util.logging.Logger.getLogger(ItemControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }

    @Override
    public Item getItemEntity(long itemId){
        try {
            return service.getItemEntity(itemId);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
        return null;
    }

    @Override
    public void addItemEntity(Item item){
        try {
            service.addItemEntity(item);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }

    @Override
    public void deleteItemEntity(long itemId){
        try {
            service.deleteItemEntity(itemId);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }

    @Override
    public void modifyItemEntity(Item item){
        try {
            service.modifyItemEntity(item);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }

    @Override
    public List<Item> getItemByAssetNumber(String AssetNumber) {
        try {
            return service.getItemByAssetNumber(AssetNumber);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        	return (List<Item>) e;
        }
        
    }

    @Override
    public List<Item> getAllItemsList(){
        try {
            return service.getAllItemsList();
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        	return (List<Item>) e;
        }
        
    }

	@Override
	public Double totalAmountOfAllAssets(){
		try {
            return service.totalAmountOfAllAssets();
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }

		return null;
	}

	@Override
	public Object[] totalAmountOfAssetsAndQtyByCategoryId(
			long categoryId){
		try {
            return service.totalAmountOfAssetsAndQtyByCategoryId(categoryId);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
		return null;
	}

	@Override
	public List<Item> getItemSerachByDescription(String description){
		try {
            return service.getItemSerachByDescription(description);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        	return (List<Item>) e;
        }
        
	}

	@Override
	public List<Item> getOlderAssetsGivenYear(int year) {
		try {
            return service.getOlderAssetsGivenYear(year);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        	return (List<Item>) e;
        }
	}

	@Override
	public List<Item> getItemBySerialNo(int serialNumber){
		try {
            return service.getItemBySerialNo(serialNumber);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        	return (List<Item>) e;
        }
	}

	@Override
	public List<Item> getItemListByCategoryId(long categoryId){
		try {
            return service.getItemListByCategoryId(categoryId);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        	return (List<Item>) e;
        }
	}

	@Override
	public Item getItem(String assetNumber) {
		try {
            return service.getItem(assetNumber);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemControllerImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
        return null;
	}
	
    
}
