package hierarchy;

public class Rect extends Figure {
    private float width;
    private float length;
    public float getPerimeter(){
        return 2*(this.width+this.length);
    }
}
