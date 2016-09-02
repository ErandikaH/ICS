package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import se.cambio.ics.controller.AssignItemController;
import se.cambio.ics.controller.AssignItemControllerImpl;
import se.cambio.ics.controller.ItemController;
import se.cambio.ics.controller.ItemControllerImpl;
import se.cambio.ics.persistence.AssignItem;
import se.cambio.ics.persistence.Item;

import com.opensymphony.xwork2.ActionSupport;

public class AssetsViewAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AssignItemController assignDel;
	private ItemController itemdel;
	
	ArrayList<Item> list=new ArrayList<Item>();
	
	
	
	public ArrayList<Item> getList() {
		return list;
	}

	public void setList(ArrayList<Item> list) {
		this.list = list;
	}

	public AssetsViewAction() throws Exception{
		
		assignDel=new AssignItemControllerImpl();
		itemdel=new ItemControllerImpl();
		
	}

	@Override
	public String execute() {
		
		List<AssignItem> itemIdList = null;
		//HttpServletRequest req = ServletActionContext.getRequest();
		int uId=UserLogInAction.uId;
		
		long itemId;
		try {
			itemIdList=assignDel.getAssignItemByUserId(uId);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(AssignItem assignItems:itemIdList){
			itemId=assignItems.getId();
			
			
			Item itemL = null;
			try {
				itemL = itemdel.getItemEntity(itemId);
				list.add(itemL);
	//			System.out.println(itemL.getAssetNumber()+"--->"+itemL.getSerialNumber());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return SUCCESS;
		
	}

}
