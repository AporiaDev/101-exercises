package AreaPolygon;

public class Rectangle implements Interface{

    float l1;
    float l2;

    public Rectangle(float l1, float l2){

        this.l1 = l1;
        this.l2 = l2;

    }

    @Override
    public float calcArea(){

        double area = l1 * l2;
        return (float) area;
    }
    
}
