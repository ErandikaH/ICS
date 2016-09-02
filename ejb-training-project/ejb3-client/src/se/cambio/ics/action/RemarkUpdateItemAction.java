package se.cambio.ics.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import se.cambio.ics.controller.ItemControllerImpl;
import se.cambio.ics.persistence.Item;

import com.opensymphony.xwork2.ActionSupport;

public class RemarkUpdateItemAction extends ActionSupport {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		Item item=new Item();
		
		@Override
		public String execute() {
			
			HttpServletRequest req = ServletActionContext.getRequest();
			long itemId=Long.parseLong(req.getParameter("selectedItemId"));
			item.setId(itemId);
			
			String remark=req.getParameter("remarks");
			
			ItemControllerImpl itemDelegate=new ItemControllerImpl();

			try {
				item=itemDelegate.getItemEntity(itemId);
				item.setRemarks(remark);
				itemDelegate.modifyItemEntity(item);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				return ERROR;
			}

			
			return SUCCESS;
		}

}
