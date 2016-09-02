/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import se.cambio.ics.persistence.Invoice;
import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.Vendor;
import se.cambio.ics.persistence.VendorRateType;
import se.cambio.ics.persistence.EAO.generics.AbstractGenericEAO;

/**
 *
 * @author PC
 */

@Stateless
public class ItemEAOImpl extends AbstractGenericEAO<Item>implements ItemEAO{
    
    @PersistenceContext(unitName = "EjbComponentPU")
    protected EntityManager entitymanager;

    public EntityManager getEntitymanager() {
            return entitymanager;
    }

    public void setEntitymanager(EntityManager entitymanager) {
            this.entitymanager = entitymanager;
    }

    @Override
    public Item getItemEntity(long itemId){
        Item en = null;
        
        Query query = entityManager.createQuery(
                        "select r from Item r where r.id =(:id)",
                        Item.class);
        query.setParameter("id", itemId);
        en = (Item) query.getSingleResult();

        return en;
    }


    @Override
    public List<Item> getItemBySerialNo(int serialNumber){
  int  no=1111;
        Query query = entityManager.createQuery(
                        "select r from Item r where r.serialNumber LIKE (:serialNumber)",
                        Item.class);
        query.setParameter("serialNumber", no+"%");
     
        return (List<Item>) query.getResultList();
    }

    @Override
    public List<Item> getItemsFromInvoiceNo(int invoiceNo){
//        Item en = null;
//        
//        Query query = entityManager.createQuery(
//                        "select r from Item r where r.invoice =(:invoice)",
//                        Item.class);
//        query.setParameter("invoice", invoiceNo);
//        en = (Item) query.getSingleResult();
//
//        return (List<Item>) en;
    	return null;
    }

    @Override
    public List<Item> getItemByAssetNumber(String assetNumber){
       
        
        Query query = entityManager.createQuery(
                        "select r from Item r where r.assetNumber LIKE (:assetNo)",
                        Item.class);
        query.setParameter("assetNo", "%"+assetNumber+"%");

        return (List<Item>) query.getResultList();
        
    }

    @Override
    public List<Item> getAllItemsList(){
    	Query query = entityManager.createQuery(
                "select r from Item r",
                Item.class);
    	
    	return (List<Item>) query.getResultList();

    }

	@Override
	public Double totalAmountOfAllAssets() {
		Query query = entityManager.createQuery(
                "select sum(r.price) from Item r", Double.class);
		
		return (Double) query.getSingleResult();
	}

	@Override
	public Object[] totalAmountOfAssetsAndQtyByCategoryId(
			long categoryId){
		Query query = entityManager.createQuery(
               "select sum(r.price),count(*),c.categoryName from Item r JOIN r.category c where c.categoryId =(:categoryId)");
		query.setParameter("categoryId", categoryId);
		return  (Object[]) query.getSingleResult();
	}

	@Override
	public List<Item> getItemSerachByDescription(String description) {
		
        Query query = entityManager.createQuery(
                        "select r from Item r where r.description LIKE (:desc)",
                        Item.class);
        query.setParameter("desc", description+"%");
        return (List<Item>) query.getResultList();
	}

	@Override
	public List<Item> getOlderAssetsGivenYear(int year) {
		Query query = entityManager.createQuery(
                "select r from Item r where year(r.warrantyEndDate)> (:year)",
                Item.class);
		query.setParameter("year", year);
    	return (List<Item>) query.getResultList();
	}

	@Override
	public List<Item> getItemListByCategoryId(long categoryId) {
		Query query = entityManager.createQuery(
                "select r from Item r JOIN r.category v where v.categoryId=(:categoryId)",
                Item.class);
		query.setParameter("categoryId", categoryId);
    	return (List<Item>) query.getResultList();
	}

	@Override
	public Item getItem(String assetNumber) {
		Item en = null;
        
        Query query = entityManager.createQuery(
                        "select r from Item r where r.assetNumber =(:assetNumber)",
                        Item.class);
        query.setParameter("assetNumber", assetNumber);
        en = (Item) query.getSingleResult();

        return en;
	}


}
