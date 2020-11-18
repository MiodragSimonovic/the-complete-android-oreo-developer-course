package com.simke.numbershapesisnumbertriangularandsquare;

public class Number {

    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isTriangular() {
        int i = 0;
        int triangularNumber = 0;
        while (triangularNumber < number) {
            i++;
            triangularNumber = triangularNumber + i;
        }
        if (triangularNumber == number) {
            return true;
        }
        return  false;
    }

    public boolean isSquare() {
        int i = 0;
        int squareNumber = 0;
        while (squareNumber < number) {
            i++;
            squareNumber = i * i;
        }
        if (squareNumber == number) {
            return true;
        }
        return false;
    }

}
