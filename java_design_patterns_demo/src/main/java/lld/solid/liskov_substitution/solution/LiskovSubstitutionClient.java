package lld.solid.liskov_substitution.solution;

public class LiskovSubstitutionClient {

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(30);
        rectangle.setHeight(20);
        int area = rectangle.computeArea();
        System.out.println("Rectangle Area: " + area);

        Square square = new Square();
        square.setSide(20);
        int squareArea = square.computeArea();
        System.out.println("Square Area: " + squareArea);
    }
}
