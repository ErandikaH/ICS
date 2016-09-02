package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.List;

import se.cambio.ics.controller.ItemControllerImpl;
import se.cambio.ics.persistence.Item;
import com.opensymphony.xwork2.ActionSupport;

public class ItemIdListAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List<Item> itemList=new ArrayList<Item>();
	ArrayList<Long> itemIdList=new ArrayList<Long>();
	private long selectedItemId;
	
	
	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public ArrayList<Long> getItemIdList() {
		return itemIdList;
	}

	public void setItemIdList(ArrayList<Long> itemIdList) {
		this.itemIdList = itemIdList;
	}

	public long getSelectedItemId() {
		return selectedItemId;
	}


	public void setSelectedItemId(long selectedItemId) {
		this.selectedItemId = selectedItemId;
	}


	@Override
	public String execute() {
		
//		HttpServletRequest req = ServletActionContext.getRequest();
//		long itemId=Long.parseLong(req.getParameter("itemId"));
//		item.setId(itemId);
		
		ItemControllerImpl itemDelegate=new ItemControllerImpl();

		try {
			itemList=itemDelegate.getAllItemsList();
			
			for(Item item:itemList){
				itemIdList.add(item.getId());
			}
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return ERROR;
		}

		return SUCCESS;
	}

}
