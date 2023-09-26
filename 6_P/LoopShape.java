public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
        if(width > 1 && height > 1){
        for(int i = 0 ; i < width-1;i++){
            System.out.print("#");
        }
        System.out.print("#\n");
        for(int i = 2; i < height;i++){
            String space = "";
            for(int x = 2; x<width;x++ )
            space += " ";


            System.out.println("#"+ space +"#");
        }
         for(int i = 0 ; i < width;i++){
            System.out.print("#");
        }
        
    }
    }
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
         System.out.println("#");
         String space = " ";
        for(int i = 0; i < leg-1;i++ ){
            System.out.println("#"+ space + "#");
            space += " ";

        }
        int length = space.length()+2;
        for(int i = 0; i <length;i++){
            System.out.print("#"); 
        }

        
        
        
    }
}
