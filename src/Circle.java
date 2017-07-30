/**
 * Created by user on 27.07.2017.
 */
public class Circle implements Shape {
    private String color;
    private double r;
    private double pi = 3.14;
    Circle(double a, String color){
        this.color = color;
        this.r = a;
        this.color = color;
        }



    @Override
    public double size(){
        return pi * r * r;
    }

    @Override
    public EnumColours colour() {

        return EnumColours.valueOf(color);
    }
}