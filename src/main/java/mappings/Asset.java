package mappings;

public class Asset {
    Integer asset_id;
    String title;
    Integer production_year;
    String fsk_level_list_facet[];
    String object_class;

    public String getObject_class() {
        return object_class;
    }

    public void setObject_class(String object_class) {
        this.object_class = object_class;
    }

    public String[] getFsk_level_list_facet() {
        return fsk_level_list_facet;
    }

    public void setFsk_level_list_facet(String[] fsk_level_list_facet) {
        this.fsk_level_list_facet = fsk_level_list_facet;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getProduction_year() {
        return production_year;
    }

    public void setProduction_year(Integer production_year) {
        this.production_year = production_year;
    }

    public Integer getAsset_id() {
        return asset_id;
    }

    public void setAsset_id(Integer asset_id) {
        this.asset_id = asset_id;
    }
}
