/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;

import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.EAO.generics.GenericEAO;

/**
 *
 * @author PC
 */
public interface ItemEAO extends GenericEAO<Item>{
    
    public Item getItemEntity(long itemId);
    
    public Item getItem(String assetNumber);
    
    public List<Item> getItemBySerialNo(int serialNumber);
    
    public List<Item> getItemSerachByDescription(String description);
    
    public List<Item> getItemByAssetNumber(String assetNumber);
    
    public List<Item> getItemListByCategoryId(long categoryId) ;
	
    public List<Item> getItemsFromInvoiceNo(int invoiceNo);
    
    public List<Item> getAllItemsList();
    
    public List<Item> getOlderAssetsGivenYear(int year);
    
    public Double totalAmountOfAllAssets();
    
    public Object[] totalAmountOfAssetsAndQtyByCategoryId(long categoryId);
    
    
    
}
