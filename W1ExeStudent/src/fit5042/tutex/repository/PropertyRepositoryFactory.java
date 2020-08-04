package fit5042.tutex.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertyRepositoryFactory {

    private static final PropertyRepository REPOSITORY_INSTANCE = createInstance();

    
    private static PropertyRepository createInstance() {
        try {

            Properties repositoryProperties = new Properties();
            repositoryProperties.loadFromXML(new FileInputStream(new File("repository-settings.properties")));
            return (PropertyRepository) Class.forName(repositoryProperties.getProperty("repository.implementation.use")).newInstance();
        } catch (IOException | ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }

   
    public static PropertyRepository getInstance() throws Exception {
        if (REPOSITORY_INSTANCE != null) {
            return REPOSITORY_INSTANCE;
        }
        throw new Exception("Failed to create repository");
    }
}
