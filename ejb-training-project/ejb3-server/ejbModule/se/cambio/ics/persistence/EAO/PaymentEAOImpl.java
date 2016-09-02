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

import se.cambio.ics.persistence.Payment;
import se.cambio.ics.persistence.EAO.generics.AbstractGenericEAO;


/**
 *
 * @author PC
 */
@Stateless
public class PaymentEAOImpl extends AbstractGenericEAO<Payment>implements PaymentEAO{
    
    @PersistenceContext(unitName = "EjbComponentPU")
    protected EntityManager entitymanager;

    public EntityManager getEntitymanager() {
            return entitymanager;
    }

    public void setEntitymanager(EntityManager entitymanager) {
            this.entitymanager = entitymanager;
    }

    @Override
    public Payment getPayment(long paymentId) throws Exception {
        Payment en = null;
        
        Query query = entityManager.createQuery(
                        "select r from Payment r where r.id =(:id)",
                        Payment.class);
        query.setParameter("id", paymentId);
        en = (Payment) query.getSingleResult();

        return en;
    }

    @Override
    public List<Payment> getPaymentsFromInvoiceId(Long invoiceId) throws Exception {
    	Query query = entityManager.createQuery(
                "select r from Payment r",
                Payment.class);
    	
    	return (List<Payment>) query.getResultList();
    }
    
    
    
}
