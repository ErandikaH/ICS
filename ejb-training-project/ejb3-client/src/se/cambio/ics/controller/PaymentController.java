/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.controller;

import java.util.List;

import se.cambio.ics.persistence.Payment;

/**
 *
 * @author PC
 */
public interface PaymentController {
    
    public Payment getPayment(long paymentId) throws Exception;
    
    public List<Payment> getPaymentsFromInvoiceId(Long invoiceId) throws Exception;

    public void addPayment(Payment payment) throws Exception;

    public void deletePayment(long paymentId) throws Exception;

    public void modifyPayment(Payment payment) throws Exception;
    
}
