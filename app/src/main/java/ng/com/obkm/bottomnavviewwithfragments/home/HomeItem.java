package ng.com.obkm.bottomnavviewwithfragments.home;

public class HomeItem {
    public String desc;
    public int id;

    public HomeItem(){

    }

    public HomeItem(String desc, int id) {
        this.desc = desc;
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
