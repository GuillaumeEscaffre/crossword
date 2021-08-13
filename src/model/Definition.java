package model;

public class Definition
{
    private int x;
    private int y;
    private int direction;

    public Definition(int x, int y, int direction)
    {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int get_Direction()
    {
        return direction;
    }

    public void set_Direction(int direction)
    {
        this.direction = direction;
    }
}

/**
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
}*/