package com.knoldus

trait Parallelogram {
  val height: Double
  val width: Double

  def area(height: Double, width: Double): Double = height * width
}
