/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.manager.InvoiceManager;
import se.cambio.ics.persistence.Invoice;
import se.cambio.ics.persistence.exceptionmanager.DefaultExceptionHandler;

/**
 * Session Bean implementation class InvoiceFacadeImpl
 */

@Stateless
public class InvoiceServiceImpl implements InvoiceService{
    
    /**
     * Default constructor. 
     */
   
    @EJB
    InvoiceManager invoiceService;

    @Override
    public Invoice getInvoice(long id) throws Exception {
        try{
            return invoiceService.getInvoice(id);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Invoice> getAllInvoicesList() throws Exception {
        try{
            return invoiceService.getAllInvoicesList();
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void addInvoice(Invoice invoice) throws Exception {
        try{
            invoiceService.addInvoice(invoice);
        }catch(Exception e){
            DefaultExceptionHandler.reportException(e, "Invoice can not be added .");
        }
    }

    @Override
    public void deleteInvoice(long id) throws Exception {
        try {
            invoiceService.removeInvoice(id);
        } catch (Exception e) {
            DefaultExceptionHandler.reportException(e, "Invoice can not be deleted.");
        }
    }

    @Override
    public void modifyInvoice(Invoice invoice) throws Exception {
        try {
            invoiceService.updateInvoice(invoice);
        } catch (Exception e) {
            DefaultExceptionHandler.reportException(e, "Invoice can not be updated.");
        }
    }

	@Override
	public Invoice getInvoiceByInvoiceNo(int invoiceNumber) throws Exception {
		try{
            return invoiceService.getInvoiceByInvoiceNo(invoiceNumber);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
	}
    
}
