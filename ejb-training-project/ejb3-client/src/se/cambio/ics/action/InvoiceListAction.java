package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import se.cambio.ics.controller.InvoiceControllerImpl;
import se.cambio.ics.persistence.Invoice;

import com.opensymphony.xwork2.ActionSupport;

public class InvoiceListAction extends ActionSupport {
	
private static final long serialVersionUID = 1L;
	
	private List<Invoice> invoice=new ArrayList<Invoice>();
	private HashMap<String,String> aaData=new HashMap<String,String>(); 
  	
	public List<Invoice> getInvoice() {
		return invoice;
	}
	public void setInvoice(List<Invoice> invoice) {
		this.invoice = invoice;
	}
	public HashMap<String, String> getAaData() {
		return aaData;
	}
	public void setAaData(HashMap<String, String> aaData) {
		this.aaData = aaData;
	}
	
	@Override
    public String execute(){
    	
		InvoiceControllerImpl invoiceControllerImpl=new InvoiceControllerImpl();
		aaData.put("0","Select Invoice No");
    	try {
    		invoice=invoiceControllerImpl.getAllInvoicesList();
			for(Invoice i:invoice){
				aaData.put(Long.toString(i.getId()), Integer.toString(i.getInvoiceNumber()));
	    		
	    	}
	   
		} catch (Exception e) {
			java.util.logging.Logger.getLogger(InvoiceListAction.class.getName()).log(java.util.logging.Level.SEVERE,null,e);
		}
    	
    	
        return SUCCESS;

    }

}
