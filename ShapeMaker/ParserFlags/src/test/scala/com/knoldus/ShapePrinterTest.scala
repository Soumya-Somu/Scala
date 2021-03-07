package com.knoldus
import org.scalatest.flatspec.AnyFlatSpec

class ShapePrinterTest extends AnyFlatSpec {

  val obj = new ShapePrinter

  /**
   *Testcases for correct outputs
   * */

  "-s" should "should return character 's' and print a square" in {
    assert(obj.checkFlag("-s") === 's')
  }
  "-t" should "should return character 't' and print a triangle" in {
    assert(obj.checkFlag("-t") === 't')
  }
  "-r" should "should return character 'r' and print a rectangle" in {
    assert(obj.checkFlag("-r") === 'r')
  }
  "-c" should "should return character 'c' and print a circle" in {
    assert(obj.checkFlag("-c")==='c')
  }
  "-z" should "should return character 'z' and print a dog emoji" in {
    assert(obj.checkFlag("-z") === 'z')
  }

  /**
   *Testcases for incorrect outputs
   * */

  "-s" should "should not return any other character than 's'" in {
    assert(obj.checkFlag("-s") !== 't')
  }
  "-t" should "should not return any other character than 't'" in {
    assert(obj.checkFlag("-t") !== 'r')
  }
  "-r" should "should not return any other character than 'r'" in {
    assert(obj.checkFlag("-r") !== 'c')
  }
  "-c" should "should not return any other character than 'c'" in {
    assert(obj.checkFlag("-c")!=='z')
  }
  "-z" should "should not return any other character than 'z'" in {
    assert(obj.checkFlag("-z") !== 's')
  }
}
