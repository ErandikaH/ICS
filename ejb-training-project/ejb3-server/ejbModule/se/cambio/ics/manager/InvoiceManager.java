/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.manager;

import java.util.List;

import se.cambio.ics.persistence.Invoice;

/**
 *
 * @author PC
 */
public interface InvoiceManager {
    
    public Invoice getInvoice(long id) throws Exception;
    
    public Invoice getInvoiceByInvoiceNo(int invoiceNumber) throws Exception;
    
    public List<Invoice> getAllInvoicesList()throws Exception;

    public void addInvoice(Invoice invoice) throws Exception;

    public void removeInvoice(long id) throws Exception;

    public void updateInvoice(Invoice invoice) throws Exception;
   
    
}
