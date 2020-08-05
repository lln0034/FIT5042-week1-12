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
 * @author Linan Lin
 */
public class SimplePropertyRepositoryImpl implements PropertyRepository{
	private List<Property> properties; 
	

    public SimplePropertyRepositoryImpl() {
        
    }

	public List<Property> getProperty() {
		return properties;
	}

	public void setProperty(List<Property> property) {
		
		this.properties = property;
	}
	
	
	public Property searchPropertyById(int p) throws Exception
	{
		
		Property searched=searchPropertyById(p);
		return searched;
	}
	public List<Property> getAllProperties()
	{
		return properties;
	}

	@Override
	public void addProperty(Property property) throws Exception {
		// TODO Auto-generated method stub
		properties.add(property);    	
	}

	
}
