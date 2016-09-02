/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;

import se.cambio.ics.persistence.Payment;
import se.cambio.ics.persistence.EAO.generics.GenericEAO;

/**
 *
 * @author PC
 */
public interface PaymentEAO extends GenericEAO<Payment>{
    
    public Payment getPayment(long paymentId) throws Exception;
    
    public List<Payment> getPaymentsFromInvoiceId(Long invoiceId) throws Exception;

    
}
