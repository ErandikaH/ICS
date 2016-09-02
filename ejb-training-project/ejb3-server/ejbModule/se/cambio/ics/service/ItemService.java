/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;
import javax.ejb.Remote;

import se.cambio.ics.persistence.Item;

/**
 *
 * @author PC
 */
@Remote
public interface ItemService {
    
    public Item getItemEntity(long itemId) ;
    
    public Item getItem(String assetNumber);
    
    public List<Item> getItemBySerialNo(int serialNumber);

    public void addItemEntity(Item item) ;

    public void deleteItemEntity(long itemId);

    public void modifyItemEntity(Item item) ;
    
    public List<Item> getItemByAssetNumber(String AssetNumber);
    
    public List<Item> getItemSerachByDescription(String description);
	
    public List<Item> getAllItemsList();
    
    public List<Item> getItemListByCategoryId(long categoryId);
    
    public List<Item> getOlderAssetsGivenYear(int year);
    
    public Double totalAmountOfAllAssets();
    
    public Object[] totalAmountOfAssetsAndQtyByCategoryId(long categoryId);
    
    
}
