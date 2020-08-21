package fit5042.tutex.calculator;

import fit5042.tutex.repository.entities.Property;
import javax.ejb.Remote;
import javax.ejb.Stateless;

@Remote
public interface CompareProperty {
	void addProperty(Property property);
	void removeProperty(Property property);
	int getBestPerRoom();
}
