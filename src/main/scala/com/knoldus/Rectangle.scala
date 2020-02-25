package com.knoldus

class Rectangle(length:Double,breath:Double) extends Parallelogram {
  override val height: Double = length
  override val width: Double = breath
  area(height,width)

}
