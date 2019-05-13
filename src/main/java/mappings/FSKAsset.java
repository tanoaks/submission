package mappings;

public class FSKAsset {
    Integer asset_id;
    String title;
    Integer production_year;
public FSKAsset(Integer asset_id,String title,Integer production_year){
    this.asset_id=asset_id;
    this.title=title;
    this.production_year=production_year;


}
    public Integer getAsset_id() {
        return asset_id;
    }

    public void setAsset_id(Integer asset_id) {
        this.asset_id = asset_id;
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
}
