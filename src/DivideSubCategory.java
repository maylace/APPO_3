/**
 * Created by Dorin Luca on 26.05.2017.
 */
public class DivideSubCategory implements TopTitle {
    private String subCategory;
    private String topSubCategoryTitle;
    private DivideCategory parent;

    public DivideSubCategory(DivideCategory divideCategory, String subCategory) {
        this.setSubCategory(subCategory);
        this.parent = divideCategory;
    }

    public void setSubCategory(String subCategoryIn) {
        this.subCategory = subCategoryIn;
    }
    public String getSubCategory() {
        return this.subCategory;
    }
    public void setCategory(String categoryIn) {
        parent.setCategory(categoryIn);
    }
    public String getCategory() {
        return parent.getCategory();
    }
    public String getAllCategories() {
        return (getCategory() + "/" + getSubCategory());
    }

    public void setTopSubCategoryTitle(String topSubCategoryTitleIn) {
        this.topSubCategoryTitle = topSubCategoryTitleIn;
    }
    public String getTopSubCategoryTitle() {
        return this.topSubCategoryTitle;
    }
    public void setTopCategoryTitle(String topCategoryTitleIn) {
        parent.setTopCategoryTitle(topCategoryTitleIn);
    }
    public String getTopCategoryTitle() {
        return parent.getTopCategoryTitle();
    }

    public String getTopTitle() {
        if (null != getTopSubCategoryTitle()) {
            return this.getTopSubCategoryTitle();
        } else {
            System.out.println("no top title in Category/SubCategory " +
                    getAllCategories());
            return parent.getTopTitle();
        }
    }
}
