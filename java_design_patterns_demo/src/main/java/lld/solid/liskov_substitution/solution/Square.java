package lld.solid.liskov_substitution.solution;

public class Square extends Shape {

    private int side;

    @Override
    public int computeArea(){
        return this.side * this.side;
    }

    public void setSide(int side){
        this.side = side;
    }

    public int getSide(){
        return this.side;
    }
}
