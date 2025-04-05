package org.example.second;

public class Krug implements Fig {
        private double r;
        private String ColorZ;
        private String ColorG;

        public Krug(double r, String ColorZ, String ColorG) {
            this.r = r;
            this.ColorZ = ColorZ;
            this.ColorG = ColorG;
        }

        @Override
        public double getP() {
            return (2 * 3.14 * r);
        }

        @Override
        public double getS() {
            return (3.14 * r * r);
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
        System.out.println("Круг:");
        System.out.println("Периметр: " + getP());
        System.out.println("Площадь: " + getS());
        System.out.println("Цвет фона: "  +getColorG());
        System.out.println("Цвет границы: " +getColorZ());
    }

}
