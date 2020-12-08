package org.example

/** *****************************************************************************
 * - Copyright (c)  2020  changSuper.com
 *
 * @author chr
 * - File Name: org.example.For
 * - Description:
 *
 *
 * - Function List:
 *
 *
 * - History:
 *         Date         Author          Modification
 *         2020/11/19   chr             Create file
 * ******************************************************************************/
object For {

  def main(args: Array[String]): Unit = {

    for (a <- 1 to 10) {
      println("a: " + a)
    }
    for (b <- 1 until 10) {
      println("b: " + b)
    }
    for (c <- 1 to 3; d <- 1 to 3) {
      println("c: " + c + " d: " + d)
    }
    var list = List(1, 2, 3)
    for (elem <- list) {
      println("list: " + elem)
    }
    list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (elem <- list if elem != 3; if elem < 8) {
      println("list if : " + elem)
    }
    val yieldRe : List[Int] = for (elem <- list if elem != 3; if elem < 8) yield elem
    for (elem <- yieldRe) {
      println("yieldRe: " + elem)
    }
  }
}
