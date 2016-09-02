/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.manager.ItemManager;
import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.exceptionmanager.DefaultExceptionHandler;
import se.cambio.ics.service.ItemService;

/**
 * Session Bean implementation class ItemEntityFacadeImpl
 */

@Stateless
public class ItemServiceImpl implements ItemService{
    
    /**
     * Default constructor. 
     */
   
    @EJB
    ItemManager itemEntityService;

    @Override
    public Item getItemEntity(long itemId){
        try {
            return itemEntityService.getItemEntity(itemId);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
        return null;
    }

    @Override
    public void addItemEntity(Item item) {
        try {
            itemEntityService.addItemEntity(item);
        } catch (Exception e) {
            //DefaultExceptionHandler.reportException(e, "Item can not be added. ");
        	java.util.logging.Logger.getLogger(ItemServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }

    @Override
    public void deleteItemEntity(long itemId) {
        try {
            itemEntityService.removeItemEntity(itemId);
        } catch (Exception e) {
           // DefaultExceptionHandler.reportException(e, "Item can not be deleted.");
        	java.util.logging.Logger.getLogger(ItemServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
    }

    @Override
    public void modifyItemEntity(Item item) {
        try {
            itemEntityService.updateItemEntity(item);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
            //DefaultExceptionHandler.reportException(e, "Item can not be updated.");
        }
    }

    @Override
    public List<Item> getItemByAssetNumber(String AssetNumber){
        try {
            return itemEntityService.getItemByAssetNumber(AssetNumber);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        	return (List<Item>) e;
        }
    }

    @Override
    public List<Item> getAllItemsList(){
        try {
            return itemEntityService.getAllItemsList();
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        	return (List<Item>) e;
        }
    }

	@Override
	public Double totalAmountOfAllAssets() {
		try {
            return itemEntityService.totalAmountOfAllAssets();
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        	
        }
        return null;
	}

	@Override
	public Object[] totalAmountOfAssetsAndQtyByCategoryId(
			long categoryId) {
		try {
            return itemEntityService.totalAmountOfAssetsAndQtyByCategoryId(categoryId);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
        return null;
	}

	@Override
	public List<Item> getItemSerachByDescription(String description) {
		try {
            return itemEntityService.getItemSerachByDescription(description);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
        return null;
	}

	@Override
	public List<Item> getOlderAssetsGivenYear(int year){
		try {
            return itemEntityService.getOlderAssetsGivenYear(year);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
        return null;
	}

	@Override
	public List<Item> getItemBySerialNo(int serialNumber) {
		try {
            return itemEntityService.getItemBySerialNo(serialNumber);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        	return (List<Item>) e;
        }
        
	}

	@Override
	public List<Item> getItemListByCategoryId(long categoryId) {
		try {
            return itemEntityService.getItemListByCategoryId(categoryId);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        	return (List<Item>) e;
        }
        
	}

	@Override
	public Item getItem(String assetNumber) {
		try {
            return itemEntityService.getItem(assetNumber);
        } catch (Exception e) {
        	java.util.logging.Logger.getLogger(ItemServiceImpl.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
        }
        return null;
	}

}
