package model;

public class Definition extends Cell {
    String label;
    int x;
    int y;
    int direction;

    public Definition() {
    }

    @Override
    public String getLabelCell() {
        return label;
    }

    @Override
    public void setLabelCell(String label) {
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}