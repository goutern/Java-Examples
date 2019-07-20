package com.company;

public class Tree {
    private String name;
    private String foliage;
    private String fruitType;
    private int height;
    private String Shape;

    public Tree(String name, String foliage, String fruitType, int height, String shape) {
        this.name = name;
        this.foliage = foliage;
        this.fruitType = fruitType;
        this.height = height;
        Shape = shape;
    }

    public Tree() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFoliage() {
        return foliage;
    }

    public void setFoliage(String foliage) {
        this.foliage = foliage;
    }

    public String getFruitType() {
        return fruitType;
    }

    public void setFruitType(String fruitType) {
        this.fruitType = fruitType;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getShape() {
        return Shape;
    }

    public void setShape(String shape) {
        Shape = shape;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "name='" + name + '\'' +
                ", foliage='" + foliage + '\'' +
                ", fruitType='" + fruitType + '\'' +
                ", height=" + height +
                ", Shape='" + Shape + '\'' +
                '}';
    }
}
