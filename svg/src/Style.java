public class Style {
    public String fillColor, strokeColor;
    public double strokeWidth;

    public Style(String fillColor, String strokeColor, double strokeWidth) {
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.strokeWidth = strokeWidth;
    }

    public String toSvg(){
        return "style=\"fill:fillColor;stroke:strokeColor;stroke-width:strokeWidth\" />";
    }
}
