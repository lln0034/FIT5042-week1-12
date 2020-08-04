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
	private List<Property> property; 
	

    public SimplePropertyRepositoryImpl() {
        
    }

	public List<Property> getProperty() {
		return property;
	}

	public void setProperty(List<Property> property) {
		this.property = property;
	}
	
	public void addProperty(Property p)
	{
		SimplePropertyRepositoryImpl simp = new SimplePropertyRepositoryImpl();
		simp.addProperty(p);
	}
	public Property searchPropertyById(int p)
	{
		SimplePropertyRepositoryImpl simp = new SimplePropertyRepositoryImpl();
		Property searched=simp.searchPropertyById(p);
		return searched;
	}
	public List<Property> getAllProperties()
	{
		SimplePropertyRepositoryImpl simp = new SimplePropertyRepositoryImpl();
		return simp.getAllProperties();
	}
    
}
