package ArrayListAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Products {
	private String productName;
	ArrayList<String> productList=new ArrayList<>();
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void addProductToList(String product)
	{
		productList.add(product);
	}
	public void sortProductList()
	{
		Collections.sort(productList);
	}
	public void display()
	{
		Iterator<String> it=productList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
