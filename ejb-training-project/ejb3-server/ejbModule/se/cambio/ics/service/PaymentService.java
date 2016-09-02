/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;
import javax.ejb.Remote;

import se.cambio.ics.persistence.Payment;

/**
 *
 * @author PC
 */
@Remote
public interface PaymentService {
    
    public Payment getPayment(long paymentId) throws Exception;
    
    public List<Payment> getPaymentsFromInvoiceId(Long invoiceId) throws Exception;

    public void addPayment(Payment payment) throws Exception;

    public void deletePayment(long paymentId) throws Exception;

    public void modifyPayment(Payment payment) throws Exception;
    
}
