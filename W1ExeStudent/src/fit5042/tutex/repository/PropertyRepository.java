package fit5042.tutex.repository;

import fit5042.tutex.repository.entities.Property;
import java.util.List;


public interface PropertyRepository {

    public static void addProperty(Property property) throws Exception {
		// TODO Auto-generated method stub
		
	}

    
    public Property searchPropertyById(int id) throws Exception;

    public List<Property> getAllProperties() throws Exception;
}
