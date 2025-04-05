package org.example.second;

public class Trey implements Fig {
    private double a;
    private double b;
    private double c;
    private String ColorZ;
    private String ColorG;

    public Trey(double a, double b, double c, String ColorZ, String ColorG) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.ColorZ = ColorZ;
        this.ColorG = ColorG;
    }

    @Override
    public double getP() {
        return a+b+c;
    }

    @Override
    public double getS() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public String getColorZ() {
        return ColorZ;
    }

    @Override
    public String getColorG() {
        return ColorG;
    }

    public void info(){
        System.out.println("Треугольник:");
        System.out.println("Периметр: " + getP());
        System.out.println("Площадь: " + getS());
        System.out.println("Цвет фона: "  +getColorG());
        System.out.println("Цвет границы: " +getColorZ());
    }
}
