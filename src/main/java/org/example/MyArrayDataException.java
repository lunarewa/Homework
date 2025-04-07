package org.example;

class MyArrayDataException extends Exception {
    private int str;
    private int stl;
    private String znach;

    public MyArrayDataException(int str, int stl, String znach) {
        super(String.format("значение '%s' не является числом", str, stl, znach));
        this.str = str;
        this.stl = stl;
        this.znach = znach;
    }

    public int getStr() {
        return str;
    }

    public int getStl() {
        return stl;
    }

    public String getZnach() {
        return znach;
    }
}