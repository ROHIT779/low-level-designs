package lld.solid.liskov_substitution.solution;

public class Rectangle extends Shape {
    private int width;
    private int height;

    @Override
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
