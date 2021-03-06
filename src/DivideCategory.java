/**
 * Created by Dorin Luca on 26.05.2017.
 */
public class DivideCategory implements TopTitle{
    private String category;
    private String topCategoryTitle;

    public DivideCategory(String category) {
        this.setCategory(category);
    }

    public void setCategory(String categoryIn) {
        this.category = categoryIn;
    }
    public String getCategory() {
        return this.category;
    }
    public String getAllCategories() {
        return getCategory();
    }

    public void setTopCategoryTitle(String topCategoryTitleIn) {
        this.topCategoryTitle = topCategoryTitleIn;
    }
    public String getTopCategoryTitle() {
        return this.topCategoryTitle;
    }

    public String getTopTitle() {
        return this.topCategoryTitle;
    }
}

