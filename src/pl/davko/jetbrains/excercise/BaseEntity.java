package pl.davko.jetbrains.excercise;

abstract class  BaseEntity {

    protected long id;
    protected long version;

    public abstract long getId();
    public abstract long getVersion();

    public void setId (long id) {
        this.id = id;
    }

    public void setVersion (long version) {
        this.version = version;
    }
}
