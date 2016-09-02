/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.cambio.ics.persistence.EAO;

import java.util.List;

import se.cambio.ics.persistence.Invoice;
import se.cambio.ics.persistence.EAO.generics.GenericEAO;

/**
 *
 * @author PC
 */
public interface InvoiceEAO extends GenericEAO<Invoice>{
    
    public Invoice getInvoice(long invoiceId) throws Exception;
    
    public Invoice getInvoiceByInvoiceNo(int invoiceNumber) throws Exception;
    
    public List<Invoice> getAllInvoicesList()throws Exception;   

    
}
