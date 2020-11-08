// Author: Shazeb Suhail
// Date:   11/7/20
// Start of Superclass Quadrilateral
//----------------------------------
class Quadrilateral {
    // class Quadrilateral's instance variables
    private int side1;
    private int side2;
    private int side3;
    private int side4;

    private int pointA_x, pointA_y;
    private int pointB_x, pointB_y;
    private int pointC_x, pointC_y;
    private int pointD_x, pointD_y;


    // class Quadrilateral's Constructor
    public Quadrilateral(int side1, int side2, int side3, int side4) {
        // implicit call to class Object's constructor

        // validate if sides are greater than 0.
        if (side1 < 1 || side2 < 1 || side3 < 1 || side4 < 1) {
            throw new IllegalArgumentException("One or more sides is not greater than 0");
        }

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
    } // end of class Quadrilateral's constructor

    public Quadrilateral (int pointA_x, int pointA_y,
                          int pointB_x, int pointB_y,
                          int pointC_x, int pointC_y,
                          int pointD_x, int pointD_y) {
        // implicit call to class Object's constructor happens here

        // initialize private instance variables
        // Point A: x and y
        this.pointA_x = pointA_x;
        this.pointA_y = pointA_y;

        // Point B: x and y
        this.pointB_x = pointB_x;
        this.pointB_y = pointB_y;

        // Point C: x and y
        this.pointC_x = pointC_x;
        this.pointC_y = pointC_y;

        // Point D: x and y
        this.pointD_x = pointD_x;
        this.pointD_y = pointD_y;

    }

    // Get Methods
    public int getSide1() {return side1;}
    public int getSide2() {return side2;}
    public int getSide3() {return side3;}
    public int getSide4() {return side4;}
    // end of Get methods

    // Set Methods
    public void setSide1(int side1) {
        // validate that the side is 1 or greater.
        if (side1 < 1) {
            throw new IllegalArgumentException("Side1 cannot be less than the value of 1");
        }

        this.side1 = side1;
    }

    public void setSide2(int side2) {
        // validate that the side is 1 or greater.
        if (side2 < 1) {
            throw new IllegalArgumentException("Side2 cannot be less than the value of 1");
        }

        this.side2 = side2;
    }

    public void setSide3(int side3) {
        // validate that the side is 1 or greater.
        if (side3 < 1) {
            throw new IllegalArgumentException("Side3 cannot be less than the value of 1");
        }

        this.side3 = side3;
    }

    public void setSide4(int side4) {
        // validate that the side is 1 or greater.
        if (side4 < 1) {
            throw new IllegalArgumentException("Side4 cannot be less than the value of 1");
        }

        this.side4 = side4;
    }
    // end of Set Methods
} // end of class Quadrilateral


// Start of subclass Trapezoid
//----------------------------
class Trapezoid extends Quadrilateral {
    // class Trapezoid's instance variables
    // ... none so far.

    // class Trapezoid's constructor
    public Trapezoid(int side1, int side2, int side3, int side4) {
        // explicit call to class Quadrilateral's constructor
        super(side1, side2, side3, side4);
    }
    // end of class Trapezoid's constructor

} // end of subclass Trapezoid


// Start of subclass Parallelogram
//--------------------------------
class Parallelogram extends Trapezoid {
    // class Parallelogram's instance variables
    // ... none so far.

    // class Parallelogram's constructor
    public Parallelogram (int side1, int side2, int side3, int side4) {
        // explicit call to class Trapezoid's constructor
        // which explicitly calls class Quadrilateral's constructor
        super(side1, side2, side3, side4);
    }
    // end of class Parallelogram's constructor

} // end of class Parallelogram


// Start of subclass Rectangle
//----------------------------
class Rectangle extends Parallelogram {
    // class Rectangle's instance variables
    // ... none so far.

    // class Rectangle's constructor
    public Rectangle (int side1, int side2, int side3, int side4) {
        // explicit call to class Parallelogram's constructor
        // which explicitly calls class Trapezoid's constructor
        // which explicitly calls class Quadrilateral's constructor
        super(side1, side2, side3, side4);
    }
    // end of class Rectangle's constructor

}// end of class Rectangle


// Start of subclass Square
//-------------------------
class Square extends Rectangle {
    // class Square's instance variables
    int squareArea; // to hold the value of area for a Square object

    // class Square's constructor
    public Square(int side1, int side2, int side3, int side4) {
        // explicit call to class Rectangle's constructor
        // explicit call to class Parallelogram's constructor
        // which explicitly calls class Trapezoid's constructor
        // which explicitly calls class Quadrilateral's constructor
        super(side1, side2, side3, side4);

        // initialize all the sides of the square
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
        setSide4(side4);

        // call to Square object's area calculation method
        calcSquareArea();

    }// end of class Square constructor

    // calculate the area of a square
    public void calcSquareArea() {
        squareArea = getSide1() * getSide2();
    }

    // return the area of a Square object
    public int getSquareArea() {return squareArea;}

    // class Square's Overrided toString method
    @Override
    public String toString() {
        return String.format("%s%d%n",
                "The area of squareObject is ", squareArea);
    }

    // calculate the area of a Square

} // end of class Square





