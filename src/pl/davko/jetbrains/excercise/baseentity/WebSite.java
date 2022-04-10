package pl.davko.jetbrains.excercise.baseentity;

public class WebSite extends BaseEntity {

    protected String url;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public long getVersion() {
        return version;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
