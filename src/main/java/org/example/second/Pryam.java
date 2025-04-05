package org.example.second;

public class Pryam implements Fig {
    private double m;
    private double n;
    private String ColorZ;
    private String ColorG;

    public Pryam(double m, double n, String ColorZ, String ColorG) {
        this.m = m;
        this.n = n;
        this.ColorZ = ColorZ;
        this.ColorG = ColorG;
    }

    @Override
    public double getP() {
        return (m * 2 + n * 2);
    }

    @Override
    public double getS() {
        return m * n;
    }

    @Override
    public String getColorZ() {
        return ColorZ;
    }

    @Override
    public String getColorG() {
        return ColorG;
    }

    public void info() {
        System.out.println("Прямоугольник:");
        System.out.println("Периметр: " + getP());
        System.out.println("Площадь: " + getS());
        System.out.println("Цвет фона: "  +getColorG());
        System.out.println("Цвет границы: " +getColorZ());
    }
}

