package pl.davko.jetbrains.excercise;

class User extends BaseEntity {

    protected String name;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public long getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
