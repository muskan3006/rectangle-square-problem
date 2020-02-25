package com.knoldus

abstract class SolutionRectangleSquare {
def area(height: Double, width: Double): Double
}
class RectangleShape {
  def area(height: Double, width: Double):Double={
    height*width
  }
}

class SquareShape extends RectangleShape {
  override def area(height: Double, width: Double): Double ={
    if (height==width) height*height else super.area(height,width)
  }
}

