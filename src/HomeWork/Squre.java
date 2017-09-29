/**
 * Created by user on 27.07.2017.
 */
public class Squre implements Shape {


    private double a;
    private double b;
    private String color;


    Squre(double a, double b, String color){
        this.color = color;
        this.a = a;
        this.b = b;

    }

    @Override
    public double size(){
        double size;
        size = this.a * this.b;
        return size;
    }

    @Override
    public EnumColours colour() {

        return EnumColours.valueOf(color);
    }




}
