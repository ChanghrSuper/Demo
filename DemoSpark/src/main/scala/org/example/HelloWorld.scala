package org.example

/**
 * Hello world!
 *
 */
object HelloWorld {

  def main(args: Array[String]): Unit = {
    println("Fu*king, world!")
    val x, y: Int = 1000
    val tuple: (Int, String) = (40, "Foo")
    val tuple1: (Int, Double, String) = new Tuple3[Int, Double, String](1, 3.14, "Foo")
  }

}