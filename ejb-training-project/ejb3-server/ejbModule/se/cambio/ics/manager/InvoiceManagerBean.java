/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

import se.cambio.ics.persistence.Invoice;
import se.cambio.ics.persistence.EAO.InvoiceEAO;


/**
 * Session Bean implementation class UserServiceImpl
 */
@Stateless
public class InvoiceManagerBean implements InvoiceManager{

    /**
     * Default constructor. 
     */
	
    @EJB
    InvoiceEAO invoiceDAO;
	
    public InvoiceManagerBean() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Invoice getInvoice(long id) throws Exception {
        return invoiceDAO.getInvoice(id);
    }

    @Override
    public List<Invoice> getAllInvoicesList() throws Exception {
        return invoiceDAO.getAllInvoicesList();
    }

    @Override
    public void addInvoice(Invoice invoice) throws Exception {
        invoiceDAO.create(invoice);
    }

    @Override
    public void removeInvoice(long id) throws Exception {
        Invoice invoice = new Invoice();
        invoice.setId(id);
        invoiceDAO.delete(invoice);
      
    }

    @Override
    public void updateInvoice(Invoice invoice) throws Exception {
        invoiceDAO.update(invoice);
    }

    @Override
    public Invoice getInvoiceByInvoiceNo(int invoiceNumber) throws Exception{
    	return invoiceDAO.getInvoiceByInvoiceNo(invoiceNumber);
    }
}
