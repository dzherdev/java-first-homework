package first.hierarchy;

public class Square extends Figure {

    private float sideLength;
    public float getPerimeter(){
        return 4*this.sideLength;
    }
}
