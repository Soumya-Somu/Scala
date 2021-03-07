package com.knoldus

object MainClassObject extends App {

  val list = args.toList
  val obj = new ShapePrinter
  obj.driverFunction(list)
}
