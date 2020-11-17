package pl.davko.jetbrains.excercise;

class Visit extends BaseEntity {

    protected User user;
    protected WebSite site;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public long getVersion() {
        return version;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setSite(WebSite site) {
        this.site = site;
    }

    public WebSite getSite() {
        return site;
    }
}
