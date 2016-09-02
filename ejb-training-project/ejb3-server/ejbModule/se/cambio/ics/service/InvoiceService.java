/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.service;

import java.util.List;
import javax.ejb.Remote;

import se.cambio.ics.persistence.Invoice;

/**
 *
 * @author PC
 */

@Remote
public interface InvoiceService {
    
    public Invoice getInvoice(long id) throws Exception;
    
    public Invoice getInvoiceByInvoiceNo(int invoiceNumber) throws Exception;
    
    public List<Invoice> getAllInvoicesList()throws Exception;

    public void addInvoice(Invoice invoice) throws Exception;

    public void deleteInvoice(long id) throws Exception;

    public void modifyInvoice(Invoice invoice) throws Exception;
    
}
