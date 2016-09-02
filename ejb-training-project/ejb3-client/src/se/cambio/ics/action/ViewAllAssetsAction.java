package se.cambio.ics.action;

import java.util.ArrayList;
import java.util.List;

import se.cambio.ics.controller.ItemControllerImpl;
import se.cambio.ics.persistence.Item;

import com.opensymphony.xwork2.ActionSupport;

public class ViewAllAssetsAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	List<Item> list=new ArrayList<Item>();
	
	

	public List<Item> getList() {
		return list;
	}

	public void setList(List<Item> list) {
		this.list = list;
	}

	public ViewAllAssetsAction() throws Exception{
		
	}

	@Override
	public String execute() {
		
		
		ItemControllerImpl itemDelegate=new ItemControllerImpl();

		try {
			list=itemDelegate.getAllItemsList();
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return ERROR;
		}

		return SUCCESS;
		
	}


}
