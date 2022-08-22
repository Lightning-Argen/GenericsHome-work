package com.company;

public class Box <G, T, A > {

    private G fromwhere;
    private T weight;
    private A width;

    public Box(T weight, A width, G fromwhere) {
        this.weight = weight;
        this.width = width;
        this.fromwhere = fromwhere;
    }

    public G getFromwhere() {
        return fromwhere;
    }

    public void setFromwhere(G fromwhere) {
        this.fromwhere = fromwhere;
    }

    public T getWeight() {
        return weight;
    }

    public void setWeight(T weight) {
        this.weight = weight;
    }

    public A getWidth() {
        return width;
    }

    public void setWidth(A width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Box{" +
                "fromwhere=" + fromwhere +
                ", weight=" + weight +
                ", width=" + width +
                '}';
    }


    public static <V> V sity (V l){
        return l;
    }
}
