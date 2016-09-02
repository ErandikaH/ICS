/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.manager.PaymentManager;
import se.cambio.ics.persistence.Payment;
import se.cambio.ics.persistence.exceptionmanager.DefaultExceptionHandler;

/**
 * Session Bean implementation class PaymentFacadeImpl
 */

@Stateless
public class PaymentServiceImpl implements PaymentService{
    
    /**
     * Default constructor. 
     */
   
    @EJB
    PaymentManager paymentService;

    @Override
    public Payment getPayment(long paymentId) throws Exception {
        try {
            return paymentService.getPayment(paymentId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Payment> getPaymentsFromInvoiceId(Long invoiceId) throws Exception {
        try {
            return paymentService.getPaymentsFromInvoiceId(invoiceId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void addPayment(Payment payment) throws Exception {
        try {
            paymentService.addPayment(payment);
        } catch (Exception e) {
            DefaultExceptionHandler.reportException(e, "Payment can not be added. ");
        }
    }

    @Override
    public void deletePayment(long paymentId) throws Exception {
        try {
            paymentService.removePayment(paymentId);
        } catch (Exception e) {
            DefaultExceptionHandler.reportException(e, "Payment can not be deleted.");
        }
    }

    @Override
    public void modifyPayment(Payment payment) throws Exception {
        try {
            paymentService.updatePayment(payment);
        } catch (Exception e) {
            DefaultExceptionHandler.reportException(e, "Payment can not be updated.");
        }
    }
    
}
