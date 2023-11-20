package lab55;

public class Square extends Shape{
    public Square(Integer l){
        super(l);
    }

    @Override
    public Double area(){return Double.valueOf(l*l);}
    public Integer perimeter(){return l*6;}
}
