package fit5042.tutex;

import fit5042.tutex.repository.PropertyRepository;
import fit5042.tutex.repository.PropertyRepositoryFactory;
import fit5042.tutex.repository.entities.Property;


public class RealEstateAgency {
    private String name;
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PropertyRepository getPropertyRepository() {
		return propertyRepository;
	}

	private final PropertyRepository propertyRepository;

    public RealEstateAgency(String name) throws Exception {
        this.name = name;
        this.propertyRepository = PropertyRepositoryFactory.getInstance();
    }
    
    /**
     * this.id = id;
		this.address = address;
		this.numberOfBedrooms = numberOfBedrooms;
		this.size = size;
		this.price = price;
     */
    public void createProperty() {
    	
    	Property p1=new Property(1, "24 Boston Ave, Malvern East VIC 3145, Australia ", 2, 150, 420);
    	Property p2=new Property(2, "11 Bettina St, Clayton VIC 3168, Australia ", 3, 352, 360);
    	Property p3=new Property(3, "2 Wattle Ave, Glen Huntly VIC 3163, Australia ", 5, 800, 650);
    	Property p4=new Property(4, "3 Hamilton St, Bentleigh VIC 3204, Australia ", 2, 170, 435);
    	Property p5=new Property(5, "82 Spring Rd, Hampton East VIC 3188, Australia ", 1, 50, 820);
    	
    }
    
    // this method is for displaying all the properties
    // complete this method
    public void displayProperties() {
        
    }
    
    // this method is for searching the property by ID
    // complete this method
    public void searchPropertyById() {
        
    }
    
    public void run() {
        createProperty();
        System.out.println("********************************************************************************");
        displayProperties();
        System.out.println("********************************************************************************");
        searchPropertyById();
    }
    
    public static void main(String[] args) {
        try {
            new RealEstateAgency("FIT5042 Real Estate Agency").run();
        } catch (Exception ex) {
            System.out.println("Application fail to run: " + ex.getMessage());
        }
    }
}
