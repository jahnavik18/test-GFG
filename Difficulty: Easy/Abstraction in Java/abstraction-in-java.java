abstract class Shape{
    private String color;
    public Shape(String c){
        this.color = c;
    }
    public String getColor(){
        return this.color;
    }
    public abstract double getArea();
    
}

class Square extends Shape{
    private double side;
    public Square(String c, double side){
        super(c);
        this.side = side;
    }
    
    public double getArea(){
        return (this.side)*(this.side);
    }
}