/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;

import se.cambio.ics.persistence.Item;

/**
 *
 * @author PC
 */
public interface ItemManager {
    
    public Item getItemEntity(long itemId);
    
    public Item getItem(String assetNumber);
    
    public List<Item> getItemBySerialNo(int serialNumber);
    
    public List<Item> getItemListByCategoryId(long categoryId);

    public void addItemEntity(Item item);

    public void removeItemEntity(long itemId);

    public void updateItemEntity(Item item) ;
    
    public List<Item> getItemByAssetNumber(String AssetNumber);
    
    public List<Item> getItemSerachByDescription(String description);
	
    public List<Item> getAllItemsList();
    
    public List<Item> getOlderAssetsGivenYear(int year);
    
    public Double totalAmountOfAllAssets() ;
    
    public Object[] totalAmountOfAssetsAndQtyByCategoryId(long categoryId);
    
    
}
