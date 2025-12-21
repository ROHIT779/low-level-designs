package lld.solid.liskov_substitution.problems;

public class Rectangle {
    private int width;
    private int height;

    public int computeArea(){
        return this.width * this.height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }
}
