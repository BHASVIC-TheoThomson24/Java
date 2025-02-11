import java.util.Objects;

public class Shape {
    private StringToNumber strToNum = new StringToNumber();

    private int radius,length,width,a,b,c;
    private String type;
    public Shape(int input){
        radius=input;
        type="circle";
    }
    public Shape(int input1,int input2){
        length=input1;
        width=input2;
        type="rectangle";
    }
    public Shape(int input1, int input2,int input3){
        a=input1;
        b=input2;
        c=input3;
        type="triangle";
    }
    public Shape(String input1){
        radius= strToNum.convert(input1);
        type="circle";
    }
    public Shape(String input1, String input2){
        length=strToNum.convert(input1);
        width=strToNum.convert(input2);
        type="rectangle";
    }
    public Shape(String input1, String input2, String input3){
       a=strToNum.convert(input1);
       b=strToNum.convert(input2);
       c=strToNum.convert(input3);
        type="triangle";
    }
    public void perimeter(){
        double perimeter=0;
        if(Objects.equals(type, "circle")){
            perimeter= (2*Math.PI*radius);
        }
        else if(Objects.equals(type, "rectangle")){
           perimeter= 2*(length+width);
        }
        else if(Objects.equals(type, "triangle")){
            perimeter= a+b+c;
        }
        System.out.println("This "+ type +" has a perimeter of "+ perimeter);
    }
    public void area(){
        double area=0;
        if(Objects.equals(type, "circle")){
            area=(Math.PI*radius*radius);
        }
        else if(Objects.equals(type, "rectangle")){
            area=length*width;
        }
        else if(Objects.equals(type, "triangle")){
            double semiPerimeter= (double) (a + b + c) /2;
            area=Math.sqrt(semiPerimeter*(semiPerimeter-a)*(semiPerimeter-b)*(semiPerimeter-c));
        }
        System.out.println("This "+type+" has an area of " + area);
    }
}