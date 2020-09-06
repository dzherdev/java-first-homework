package first.hierarchy;

public class Triangle extends Figure {
    private float firstSide;
    private float secondSide;
    private float thirdSide;

    public float getPerimeter(){
        return firstSide+secondSide+thirdSide;
    }

}
