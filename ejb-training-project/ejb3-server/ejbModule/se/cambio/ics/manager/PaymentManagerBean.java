/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.persistence.Payment;
import se.cambio.ics.persistence.EAO.PaymentEAO;

/**
 * Session Bean implementation class UserServiceImpl
 */
@Stateless
public class PaymentManagerBean implements PaymentManager{

    /**
     * Default constructor. 
     */
	
    @EJB
    PaymentEAO paymentDAO;
	
    public PaymentManagerBean() {
        // TODO Auto-generated constructor stub
    }

     @Override
    public Payment getPayment(long paymentId) throws Exception {
        return paymentDAO.getPayment(paymentId);
    }

    @Override
    public void addPayment(Payment payment) throws Exception {
        paymentDAO.create(payment);
    }

    @Override
    public void removePayment(long paymentId) throws Exception {
        Payment payment = new Payment();
        payment.setId(paymentId);
        paymentDAO.delete(payment);
        
    }

    @Override
    public void updatePayment(Payment payment) throws Exception {
        paymentDAO.update(payment);
    }

    @Override
    public List<Payment> getPaymentsFromInvoiceId(Long invoiceId) throws Exception {
        return paymentDAO.getPaymentsFromInvoiceId(invoiceId);
    }
    
    
}
