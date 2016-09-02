package se.cambio.ics.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import se.cambio.ics.controller.ItemControllerImpl;
import se.cambio.ics.persistence.Item;

import com.opensymphony.xwork2.ActionSupport;

public class PriceUpdateItemAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Item item=new Item();
	
	@Override
	public String execute() {
		
		HttpServletRequest req = ServletActionContext.getRequest();
		//long itemId=Long.parseLong(req.getParameter("itemId"));
		long itemId=Long.parseLong(req.getParameter("selectedItemId"));
		item.setId(itemId);
		
		double price=Double.parseDouble(req.getParameter("price"));
		
		ItemControllerImpl itemDelegate=new ItemControllerImpl();
		
		try {
			item=itemDelegate.getItemEntity(itemId);
			item.setPrice(price);
			itemDelegate.modifyItemEntity(item);
			return SUCCESS;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
		
	}

}
