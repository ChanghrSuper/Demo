package org.example

/** *****************************************************************************
 * - Copyright (c)  2020  chinadaas.com
 *
 * @author chr
 * - File Name: org.example.MethodAndFunction
 * - Description:
 *
 *
 * - Function List:
 *
 *
 * - History:
 *         Date         Author          Modification
 *         2020/11/20   chr             Create file
 * ******************************************************************************/
object MethodAndFunction {

  def main(args: Array[String]): Unit = {
    /*传名调用*/
    delayed(time())
    println("--------")
    delayed2(time())
    /*指定参数名*/
    printInt(b = 1, a = 2)
    /*可变参数*/
    printStrs("a", "b", "c")
    /*递归*/
    println("阶乘" + factorial(20))
    /*默认参数值*/
    printIntDefault(1)
  }

  def time(): Long = {
    println("获取时间, 纳秒")
    System.nanoTime()
  }

  def delayed(t: Long): Unit = {
    println("在delayed方法内")
    println("参数: " + t)
  }

  /**
   * 传名调用
   *
   * @param t => 设置传名调用
   */
  def delayed2(t: => Long): Unit = {
    println("在delayed方法内")
    println("参数: " + t)
  }

  def printInt(a: Int, b: Int): Unit = {
    println("a value: " + a)
    println("b value: " + b)
  }

  def printStrs(args: String*): Unit = {
    for (elem <- args) {
      println(elem)
    }
  }

  def factorial(n: BigInt): BigInt = {
    if (n <= 1) {
      1
    } else {
      n * factorial(n - 1)
    }
  }

  def printIntDefault(a: Int, b: Int = 2, c: Int = 3): Unit = {
    println("a: " + a)
    println("b: " + b)
    println("c: " + c)
  }
}
