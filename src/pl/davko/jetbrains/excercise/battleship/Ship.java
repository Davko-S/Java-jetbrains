package pl.davko.jetbrains.excercise.battleship;

public abstract class Ship {

    private String name;
    private int cells;
    private boolean isOnField;

    public Ship(String name, int cells, boolean isOnField) {
        this.name = name;
        this.cells = cells;
        this.isOnField = isOnField;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCells() {
        return cells;
    }

    public void setCells(int cells) {
        this.cells = cells;
    }

    public boolean isOnField() {
        return isOnField;
    }

    public void setOnField(boolean onField) {
        isOnField = onField;
    }
}
