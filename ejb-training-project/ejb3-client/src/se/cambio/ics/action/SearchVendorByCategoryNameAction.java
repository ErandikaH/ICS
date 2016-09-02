package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import se.cambio.ics.controller.CategoryControllerImpl;
import se.cambio.ics.controller.InvoiceControllerImpl;
import se.cambio.ics.controller.ItemControllerImpl;
import se.cambio.ics.controller.VendorControllerImpl;
import se.cambio.ics.persistence.Item;
import se.cambio.ics.persistence.Vendor;

import com.opensymphony.xwork2.ActionSupport;

public class SearchVendorByCategoryNameAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;


	//@Override
	public String execute1() {
		
		//HttpServletRequest req = ServletActionContext.getRequest();
		
		//String categoryName=req.getParameter("categoryName");
		
		CategoryControllerImpl category=new CategoryControllerImpl();
		ItemControllerImpl item=new ItemControllerImpl();
		InvoiceControllerImpl invoice=new InvoiceControllerImpl();
		VendorControllerImpl vendor=new VendorControllerImpl();
		List<Item> itemList=new ArrayList<Item>();
		List<Long> invoiceIdList=new ArrayList<Long>();
		List<Long> invoiceIdList2=new ArrayList<Long>();
		
		List<Integer> vendorIdList=new ArrayList<Integer>();
		List<Vendor> vendorList=new ArrayList<Vendor>();
		
		try {
			//long categoryId=category.getCategoryByName("categoryName1").getCategoryId();
			//itemList=item.getItemListByCategoryId(categoryId);
			//System.out.println(categoryId);
			for(Item i:itemList){
				long invoiceId=i.getInvoice().getId();
				invoiceIdList.add(invoiceId);
			}
			
			HashSet<Long> listToSet = new HashSet<Long>(invoiceIdList);
		      
	        //Creating Arraylist without duplicate values
	        invoiceIdList2 = new ArrayList<Long>(listToSet);

	
			for (int i = 0; i < invoiceIdList2.size(); i++) {
				
				vendorIdList.add(invoice.getInvoice(invoiceIdList2.get(i)).getVendor().getId());
				
			}
			
			for (int i = 0; i < vendorIdList.size(); i++) {
				vendorList.add(vendor.getVendor(vendorIdList.get(i)));
			}
			
			for (Vendor v : vendorList) {
				System.out.println(v.getPrimaryContactName());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		//}
		return SUCCESS;
		
	}
	
//	public static void main(String args[]){
//		SearchVendorAction s=new SearchVendorAction();
//		s.execute1();
//	}

}
