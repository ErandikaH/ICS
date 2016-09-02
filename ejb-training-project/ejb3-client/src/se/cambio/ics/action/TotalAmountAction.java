package se.cambio.ics.action;

import java.util.ArrayList;

import se.cambio.ics.controller.ItemController;
import se.cambio.ics.controller.ItemControllerImpl;
import se.cambio.ics.model.ItemAmountQty;

import com.opensymphony.xwork2.ActionSupport;

public class TotalAmountAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	private ItemController itemdel;
	
	ArrayList<ItemAmountQty> list=new ArrayList<ItemAmountQty>();
	
	
	
	public ArrayList<ItemAmountQty> getList() {
		return list;
	}

	public void setList(ArrayList<ItemAmountQty> list) {
		this.list = list;
	}

	public TotalAmountAction() throws Exception{

		itemdel=new ItemControllerImpl();
		
	}

	@Override
	public String execute() {
		ItemAmountQty iaq=new ItemAmountQty();
		Double d;
		try {
			d=itemdel.totalAmountOfAllAssets();
	
				iaq.setAmount(d);
				list.add(iaq);
				
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		return SUCCESS;
		
	}

}
