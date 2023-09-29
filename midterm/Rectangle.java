package Coding_ll_23.midterm;

public class Rectangle {
    private double width;
    private double height;
    //private double area;
    //private double perimeter;

    //consructor
    public Rectangle (double height , double width){
        this.width = width;
        this.height = height;
    }

    public void calcarea(){
     double area = width *height;
    System.out.println("the area is:"+area);

    }
    public void calcperimeter (){
     double perimeter = (width*2)+(height*2);
     System.out.println("the perimeter is:"+perimeter);
    }
}
