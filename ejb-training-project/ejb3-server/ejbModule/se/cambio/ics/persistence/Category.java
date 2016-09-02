package se.cambio.ics.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity
@Table(name="Category")
public class Category implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private int categoryId;
	private String categoryName;
	private String description;
	private int version;
	private List<Item> itemsList;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "category_id")
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	@Version
	@Column(name = "opt_lock")
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	@Column(name = "category_name")
	public String getCategoryName() {
		return categoryName;
	}
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	@Column(name = "description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
//	@OneToMany(targetEntity=ItemEntity.class, mappedBy="category")
//	public List<ItemEntity> getItemsList() {
//		return itemsList;
//	}
	public void setItemsList(List<Item> itemsList) {
		this.itemsList = itemsList;
	}

}
