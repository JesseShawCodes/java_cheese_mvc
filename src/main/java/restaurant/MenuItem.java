package restaurant;

import java.util.Date;

public class MenuItem {
    private String description;
    private String Category;
    private double price;
    private Date addDate;
    private Boolean newItem;
    //Getters
    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return description;
    }

    //Setters
    public void setCategory(String aCategory) {
        this.Category = aCategory;
    }
}
