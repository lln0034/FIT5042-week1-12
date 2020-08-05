/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit5042.tutex.repository;

import fit5042.tutex.repository.entities.Property;
import java.util.ArrayList;
import java.util.List;

/**
 * TODO Exercise 1.3 Step 2 Complete this class.
 * 
 * This class implements the PropertyRepository class. You will need to add the keyword
 * "implements" PropertyRepository. 
 * 
 * @author Junyang
 */
public class SimplePropertyRepositoryImpl  implements PropertyRepository{

	ArrayList<Property> properties=new ArrayList<Property>();
	
    	
    	
    public ArrayList<Property> getProperties() {
		return properties;
	}

	public void setProperties(ArrayList<Property> properties) {
		this.properties = properties;
	}

	public SimplePropertyRepositoryImpl() {
		
    }


	@Override
	public void addProperty(Property property) throws Exception {
		// TODO Auto-generated method stub
		properties.add(property);
	    
		
	}

	@Override
	public Property searchPropertyById(int id) throws Exception {
		// TODO Auto-generated method stub
		Property p = null;
		for(Property property:properties)
		{
			if (property.getId()==id)
			{
				p=property;
			}
			else 
			{
				p=null;
			}
			
		}
		return p;
	}

	@Override
	public List<Property> getAllProperties() throws Exception {
		// TODO Auto-generated method stub
		
		List<Property> properties=getProperties();
		
		return properties;
	}
    
}
