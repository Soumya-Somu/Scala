package com.knoldus

class ShapePrinter {

  def driverFunction(flags: List[String]): Unit = {
    for (i <- flags.indices) {
      val flag = flags(i)
      if (flag(0) == '-') {
        checkFlag(flag)
      }
    }
  }

  /**
   * This method checks the flag in the given string and returns the character corresponding to it.
   *
   * @return String
   * */
  def checkFlag(flag: String): Char = {
    val mapIm = Map("-c" -> 'c', "-r" -> 'r', "-z" -> 'z', "-s" -> 's', "-t" -> 't')
    var output = ' '
    try {
      output = mapIm(flag)
    } catch {
      case _: NoSuchElementException => println("No such flag exists."); output = '~'
    }
    output match {
      case 'c' => printCircle()
      case 'r' => printRectangle()
      case 's' => printSquare()
      case 'z' => zoey
      case 't' => printTriangle()
      case '~' => println("You have provided a wrong flag. Please use any of the given flags : \n'-c'\t:\tprints a circle\n'-r'\t:\tprints a rectangle\n'-s'\t:\tprints a square\n'-t'\t:\tprints a triangle\n'-z'\t:\tprints a dog emoji")
    }
    output
  }

  /**
   * This method prints a square pattern.
   *
   * @return Unit
   * */
  def printSquare(n: Int = 5): Unit = {
    var i = 0
    var j = 0
    i = 1
    while (i <= n) {
      j = 1
      while (j <= n * 2) {
        if (i == 1 || i == n || j == 1 || j == n * 2) print("*")
        else print(" ")
        j += 1
      }
      print("\n")
      i += 1
    }
  }

  /**
   * This method prints a rectangle pattern.
   *
   * @return Unit
   * */
  def printRectangle(n: Int = 5, m: Int = 20): Unit = {
    var i = 0
    var j = 0
    i = 1
    while ( {
      i <= n
    }) {
      j = 1
      while ( {
        j <= m
      }) {
        if (i == 1 || i == n || j == 1 || j == m) print("*")
        else print(" ")

        j += 1
      }
      println()
      i += 1
    }
  }

  /**
   * This method prints a square pattern.
   *
   * @return Unit
   * */
  def printTriangle(rows: Int = 5): Unit = {
    var k = 0
    var i = 1
    while (i <= rows) {
      for (space <- 1 to rows - i) {
        System.out.print("  ")
      }
      while (k != 2 * i - 1) {
        System.out.print("* ")
        k += 1
      }
      System.out.println()

      i += 1
      k = 0
    }
  }

  /**
   * This method prints a circle pattern.
   *
   * @return Unit
   * */
  def printCircle(radius: Int = 5): Unit = {
    var dist: Double = 0
    for (i <- 0 to 2 * radius) {
      for (j <- 0 to 2 * radius) {
        dist = Math.sqrt((i - radius) * (i - radius) + (j - radius) * (j - radius))
        if (dist > radius - 0.5 && dist < radius + 0.5) System.out.print("*")
        else System.out.print(" ")
      }
      System.out.print("\n")
    }
  }

  /**
   * This method prints a dog emoji pattern.
   *
   * @return Unit
   * */
  def zoey() {
    println(" /^ ^\\")
    println("/ 0 0 \\")
    println("V\\ Y /V")
    println(" / - \\")
    println(" |    \\")
    println(" || (__V")
  }
}

