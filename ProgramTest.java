// Author: Shazeb Suhail
// Date:   11/7/20
/*
(Quadrilateral Inheritance Hierarchy)
 Write an inheritance hierarchy for classes:
    > Quadrilateral
    > Trapezoid
    > Parallelogram
    > Rectangle
    > Square
 Use 'Quadrilateral' as the superclass of the hierarchy.
 Create and use a 'Point' class to represent the points in each shape.
 Make the hierarchy as deep (i.e. as many levels) as possible.
 Specify the instance variables and methods for each class.
 The 'private' instance variables of 'Quadrilateral' should be the x-y coordinate
 pairs for the four endpoints of the 'Quadrilateral'.
 Write a program that instantiates objects of your classes and outputs each
 object's area (except 'Quadrilateral').
 */

public class ProgramTest {
    public static void main(String[] args) {
        // local variables

        // create a square object and return its calculated area
        Square squareObject = new Square(5,5,5,5);

        // implicitly call squareObject's toString method
        System.out.print(squareObject);
    }
}
