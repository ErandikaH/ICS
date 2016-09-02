/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;

import se.cambio.ics.persistence.Invoice;
import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.EAO.generics.AbstractGenericEAO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author PC
 */
@Stateless
public class InvoiceEAOImpl extends AbstractGenericEAO<Invoice>implements InvoiceEAO{
    
    @PersistenceContext(unitName = "EjbComponentPU")
    protected EntityManager entitymanager;

    public EntityManager getEntitymanager() {
            return entitymanager;
    }

    public void setEntitymanager(EntityManager entitymanager) {
            this.entitymanager = entitymanager;
    }

    @Override
    public Invoice getInvoice(long invoiceId) throws Exception {
        Invoice en = null;
        
        Query query = entityManager.createQuery(
                        "select r from Invoice r where r.id =(:id)",
                        Invoice.class);
        query.setParameter("id", invoiceId);
        en = (Invoice) query.getSingleResult();

        return en;
    }

    @Override
    public List<Invoice> getAllInvoicesList() throws Exception {
    	Query query = entityManager.createQuery(
                "select r from Invoice r",
                Invoice.class);
    	
    	return (List<Invoice>) query.getResultList();

    }

	@Override
	public Invoice getInvoiceByInvoiceNo(int invoiceNumber) throws Exception {
		Invoice en = null;
        
        Query query = entityManager.createQuery(
                        "select r from Invoice r where r.invoiceNumber =(:invoiceNumber)",
                        Invoice.class);
        query.setParameter("invoiceNumber", invoiceNumber);
        en = (Invoice) query.getSingleResult();

        return en;
	}
    
}
