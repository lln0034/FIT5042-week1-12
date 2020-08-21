package fit5042.tutex.controllers;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Guan
 */
@Named(value = "titleController")
@RequestScoped
public class TitleController {

    private String pageTitle;

    public TitleController() {
        // Set the page title 
        pageTitle = "Real Estate Agency";
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }
}
