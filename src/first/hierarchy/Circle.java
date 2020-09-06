package first.hierarchy;

public class Circle extends Figure{
    private float radius;

    public float getPerimeter(){
        return (float) (2*this.radius*Math.PI);
    }

}
