package pl.davko.jetbrains.excercise.basics;

// *** METHODS OVERRIDING + POLYMORPHISM ***

class Publication {

    private String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        return getType() + getDetails();
    }

    public String getType() {
        return "Publication";
    }

    public String getDetails() {
        return ": " + title;
    }

}

class Newspaper extends Publication {

    private String source;


    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }
    @Override
    public String getDetails() {
        return "(source - " + source + ")" + super.getDetails();
    }
    @Override
    public String getType() {
        return "Newspaper";
    }

}

class Article extends Publication {

    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public String getDetails() {
        return "(author - " + author + ")" + super.getDetails();
    }

    @Override
    public String getType() {
        return "Article";
    }
}

class Announcement extends Publication {

    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    @Override
    public String getDetails() {
        return "(days to expire - " + daysToExpire + ")" + super.getDetails();
    }

    @Override
    public String getType() {
        return "Announcement";
    }
}

