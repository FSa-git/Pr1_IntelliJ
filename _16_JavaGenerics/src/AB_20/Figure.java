package AB_20;

public class Figure {

    public int id;

    public Figure(int id){
        this.id = id;
    }

    public void draw(){
        System.out.println("Ich zeichne dir die Form mit der id: " + this.id);
    }

}
