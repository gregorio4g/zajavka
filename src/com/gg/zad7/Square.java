package com.gg.zad7;

import java.util.Arrays;
import java.util.Random;

public class Square implements Comparable {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public Square() {
        this(5);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int perimeter() {
        return side * 4;
    }

    public int area() {
        return side * side;
    }
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return side == square.side;
    }

    @Override
    public int hashCode() {
        return side;
    }

    @Override
    public int compareTo(Object o) {
        return this.side - ((Square)o).side;
    }

    public static void main(String[] args) {
        Square[] squares = new Square[20];
        Random rand = new Random();
        for (int i = 0; i < squares.length; i++) {
            squares[i] = new Square(rand.nextInt(20));
        }
        Arrays.sort(squares);
        System.out.println(Arrays.toString(squares));

        Square[] tmpSquares = new Square[squares.length];
        int tmpIndex = 1;
        tmpSquares[0] = squares[0];
        for (int i = 0; i < squares.length-1; i++) {
            if (!squares[i].equals(squares[i+1])) {
                tmpSquares[tmpIndex] = squares[i+1];
                tmpIndex++;
            }
        }
        Square[] outSquares = Arrays.copyOf(tmpSquares, tmpIndex);
        System.out.println(Arrays.toString(outSquares));
    }

}
