package AreaPolygon;
import java.math.*;

public class Square implements Interface {
    
    float n;

    public Square(float n ){
        this.n = n;
    }

    @Override
    public float calcArea(){
        double area = Math.pow(n,4);
        return (float) area;
    }
}
