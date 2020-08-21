package fit5042.tutex.calculator;

import java.util.Set;
import javax.ejb.Stateful;
import fit5042.tutex.repository.entities.Property;


@Stateful
public class ComparePropertySessionBean implements CompareProperty{
	
	private Set<Property> pList;
	

	public Set<Property> getpList() {
		return pList;
	}

	public void setpList(Set<Property> pList) {
		this.pList = pList;
	}

	@Override
	public void addProperty(Property property) {
		// TODO Auto-generated method stub
		pList.add(property);
		
	}

	@Override
	public void removeProperty(Property property) {
		// TODO Auto-generated method stub
		//for each loop, find the property has the same property id and remove the one
		for(Property p: pList) {
			if(p.getPropertyId()==property.getPropertyId()) {
				
				pList.remove(p);
			}
			
		}
		
	}

	@Override
	public int getBestPerRoom() {
		int id=0;
		double price=1000000000.00;
		for(Property p: pList) {
			//for each loop 
			//find the one under the budget
			
			if(p.getPrice()/p.getNumberOfBedrooms() < price) {
				
				id=p.getPropertyId();
				price=p.getPrice()/p.getNumberOfBedrooms();
				//price is the current best per room 
			}
			
		}
		
		return id;
	}
	
	

}
