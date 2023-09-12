import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a color code");
        int waveLenght = sc.nextInt();
        if ( waveLenght >= 380 && waveLenght < 450 ){
            System.out.println( "your color is Violet");
        }
        else if ( waveLenght >= 450 && waveLenght < 495  ){
            System.out.println( "your color is Blue");
        }
        else if ( waveLenght >= 495 && waveLenght < 570 ){
            System.out.println( "your color is Green");
        }
        else if ( waveLenght >= 570 && waveLenght < 590 ){
            System.out.println( "your color is yellow");
        } 
        else if ( waveLenght >= 590 && waveLenght < 620 ){
            System.out.println( "your color is Orange");
        }
        else if ( waveLenght >= 620 && waveLenght < 750 ){
            System.out.println( "your color is red");
        }
        else {
            System.out.println( "your color is not a part of the visible spectrum");
        }
        sc.close();
        }
    }
