public class Cell{
    private String name;
    private boolean door;
    private int seciritycode;

    public Cell (String name, boolean door, int seciritycode){
        this.door = door;
        this.name = name;
        this.seciritycode = seciritycode;

    }
   
    public String getName(){
        return name;
        }//end method getName
        public boolean getdoor(){
        return door;
        }//end method getIsOpen

        public void setisOpen(int code){
            if (code != seciritycode){
                System.out.println("that code is incorrect");
            }else{
                if (door){
                    door = false;
                    System.out.println("the door is closed");
                }else{
                    door = true;
                    System.out.println("the door is open");
                }
            }

        }
   


}