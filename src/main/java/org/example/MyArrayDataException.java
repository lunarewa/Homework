package org.example;

class MyArrayDataException extends Exception {
    private int str;
    private int stl;
    private String z;

    public MyArrayDataException(int str, int stl, String z) {
        super(String.format("значение '%s' не является числом", str, stl, z));
        this.str = str;
        this.stl = stl;
        this.z = z;
    }

    public int getStr() {
        return str;
    }

    public int getStl() {
        return stl;
    }

    public String getZnach() {
        return z;
    }
}