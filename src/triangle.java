public class triangle extends shape
{
    double breadth ;
    double height ;

    triangle (double breadth ,double height){
        this.breadth = breadth;
        this.height = height ;
    }
    @Override
    double area() {
        return 0.5*breadth * height;
    }
}