/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.controller;

import java.util.List;
import javax.naming.NamingException;

import se.cambio.ics.generics.GenericDelegate;
import se.cambio.ics.persistence.Invoice;
import se.cambio.ics.service.InvoiceService;
/**
 *
 * @author PC
 */
public class InvoiceControllerImpl extends GenericDelegate<Invoice> implements InvoiceController{

    private InvoiceService service;

    public InvoiceControllerImpl(){

        String beanName = "InvoiceServiceImpl";
        String viewClassName = "se.cambio.ics.service.InvoiceService";

        setBeanName(beanName);
        setViewClassName(viewClassName);

        try {
                service = (InvoiceService) lookupRemoteBean();
        } catch (NamingException e) {
                // TODO Auto-generated catch block
                //System.out.println("errrrorrrrr");
                e.printStackTrace();
        }
    }

    @Override
    public Invoice getInvoice(long id) throws Exception{
        try {
            return service.getInvoice(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Invoice> getAllInvoicesList() throws Exception {
        try {
            return service.getAllInvoicesList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void addInvoice(Invoice invoice) throws Exception{
        try {
            service.addInvoice(invoice);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteInvoice(long id) throws Exception {
        try {
            service.deleteInvoice(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void modifyInvoice(Invoice invoice) throws Exception{
        try {
            service.modifyInvoice(invoice);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	@Override
	public Invoice getInvoiceByInvoiceNo(int invoiceNumber) throws Exception {
		try {
            return service.getInvoiceByInvoiceNo(invoiceNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}

    
}
