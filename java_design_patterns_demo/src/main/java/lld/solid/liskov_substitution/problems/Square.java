package lld.solid.liskov_substitution.problems;

public class Square extends Rectangle{

    public void setSide(int side){
        super.setWidth(side);
        super.setHeight(side);
    }

    public void setWidth(int width){
        setSide(width);
    }

    public void setHeight(int height){
        setSide(height);
    }
}
