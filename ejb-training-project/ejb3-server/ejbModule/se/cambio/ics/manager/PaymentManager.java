/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;

import se.cambio.ics.persistence.Payment;

/**
 *
 * @author PC
 */
public interface PaymentManager {
    
    public Payment getPayment(long paymentId) throws Exception;
    
    public List<Payment> getPaymentsFromInvoiceId(Long invoiceId) throws Exception;

    public void addPayment(Payment payment) throws Exception;

    public void removePayment(long paymentId) throws Exception;

    public void updatePayment(Payment payment) throws Exception;
}
