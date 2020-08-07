package fit5042.tutex;

import fit5042.tutex.repository.PropertyRepository;
import fit5042.tutex.repository.PropertyRepositoryFactory;
import fit5042.tutex.repository.entities.Property;
//import java.io.IOException;
//import java.math.BigDecimal;
//import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * TODO Exercise 1.3 Step 3 Complete this class. Please refer to tutorial instructions.
 * This is the main driver class. This class contains the main method for Exercise 1A
 * 
 * This program can run without the completion of Exercise 1B.
 * 
 * @author Junyang
 */
public class RealEstateAgency {
    private String name;
    private final PropertyRepository propertyRepository;

    public RealEstateAgency(String name) throws Exception {
        this.setName(name);
        this.propertyRepository = PropertyRepositoryFactory.getInstance();
    }
    
    // this method is for initializing the property objects
    // complete this method
    public void createProperty() {
    	
    	Property p1=new Property(1, "24 Boston Ave, Malvern East VIC 3145, Australia ", 2, 150, 420.0D);
    	Property p2=new Property(2, "11 Bettina St, Clayton VIC 3168, Australia ", 3, 352, 360.0D);
        Property p3=new Property(3, "2 Wattle Ave, Glen Huntly VIC 3163, Australia ", 5, 800, 650.0D);
        Property p4=new Property(4, "3 Hamilton St, Bentleigh VIC 3204, Australia ", 2, 170, 435.0D);
        Property p5=new Property(5, "82 Spring Rd, Hampton East VIC 3188, Australia ", 1, 50, 820.0D);
    try {
    	int i= propertyRepository.getAllProperties().size();
			propertyRepository.addProperty(p1);
			propertyRepository.addProperty(p2);
			propertyRepository.addProperty(p3);
			propertyRepository.addProperty(p4);
			propertyRepository.addProperty(p5);
			int y=propertyRepository.getAllProperties().size()-i;
			
			System.out.println( y + " properties added successfully");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
    
    // this method is for displaying all the properties
    // complete this method
    public void displayProperties() {
    	
    	try {
			List<Property> p=propertyRepository.getAllProperties();
			if( p!=null)
			{for(Property property: p)
			{
				System.out.println(property.toString());
				
			}}
			else {
				System.out.println("No property in dataset");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    // this method is for searching the property by ID
    // complete this method
    public void searchPropertyById() {
    	try {
    		System.out.println(" Enter the iD of the property you want to search:");
    		Scanner sc=new Scanner(System.in);
    		int id=sc.nextInt();
			List<Property> p=propertyRepository.getAllProperties();
			if( p!=null)
			{for(Property property: p)
			{
				if(id==property.getId())
				System.out.println(property.toString());
				
			}}
			else {
				System.out.println("No property in dataset");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
