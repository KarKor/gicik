public class Elipse extends Shape {
    private Point center;
    private double radiusX, radiusY;

    public Elipse(Style style, Point center, double radiusX, double radiusY) {
        super(style);
        this.center = center;
        this.radiusX = radiusX;
        this.radiusY = radiusY;
    }

    @Override
    public String toSvg(){
        return "<ellipse rx=\""+center.getX()+"\" ry=\""+center.getY()+"\" cx=\""+radiusX+"\" cy=\""+radiusY+"\"\n"
                + style.toSvg()+"\n";
    }

    @Override
    public String toString() {
        return "Elipse{" +
                "center=" + center +
                ", radiusX=" + radiusX +
                ", radiusY=" + radiusY +
                '}';
    }
}
