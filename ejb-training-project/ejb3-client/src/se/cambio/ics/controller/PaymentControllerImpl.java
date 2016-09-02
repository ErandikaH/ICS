/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.controller;

import java.util.List;
import javax.naming.NamingException;

import se.cambio.ics.generics.GenericDelegate;
import se.cambio.ics.persistence.Payment;
import se.cambio.ics.service.PaymentService;

/**
 *
 * @author PC
 */
public class PaymentControllerImpl extends GenericDelegate<Payment> implements PaymentController{

    private PaymentService service;

    public PaymentControllerImpl(){

        String beanName = "PaymentServiceImpl";
        String viewClassName = "se.cambio.ics.service.PaymentService";

        setBeanName(beanName);
        setViewClassName(viewClassName);

        try {
                service = (PaymentService) lookupRemoteBean();
        } catch (NamingException e) {
                // TODO Auto-generated catch block
                //System.out.println("errrrorrrrr");
                e.printStackTrace();
        }
    }

    @Override
    public Payment getPayment(long paymentId) throws Exception{
        try {
            return service.getPayment(paymentId);
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return null;
    }

    @Override
    public List<Payment> getPaymentsFromInvoiceId(Long invoiceId) throws Exception {
        try {
            return service.getPaymentsFromInvoiceId(invoiceId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void addPayment(Payment payment) throws Exception{
        try {
            service.addPayment(payment);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletePayment(long paymentId) throws Exception{
        try {
            service.deletePayment(paymentId);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void modifyPayment(Payment payment) throws Exception{
        try {
            service.modifyPayment(payment);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
}
