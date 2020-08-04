package fit5042.tutex.repository;

import java.util.ArrayList;



public class SimplePropertyRepositoryImpl implements PropertyRepository{
	private ArrayList properties;
	SimplePropertyRepositoryImpl simP=new SimplePropertyRepositoryImpl();
	public ArrayList getProperties() {
		return properties;
	}
	public void setProperties(ArrayList properties) {
		this.properties = properties;
	} 
	

}
