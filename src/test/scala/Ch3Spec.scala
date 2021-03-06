package swscala.unit

import org.scalatest._
import swscala.Ch3Exercises._


class Ch3Spec extends FlatSpec with Matchers {

  "Ch3" should "pass all test" in {

    // Problem 1
    id(id[Int])(3) shouldEqual 3
    val int2Str = (x: Int) => x.toString
    id(id[Int => String])(int2Str) shouldEqual int2Str

    // Problem 2
    val constBoolInt = const[Boolean, Int]
    const[Boolean => Int => Boolean, String](constBoolInt)("hello") shouldEqual constBoolInt

    // Problem 3
    val add1: Int => Int = n => n + 1
    val n = 0
    twice[Int](add1)(n) shouldEqual 2
    twice(twice[Int])(add1)(n) shouldEqual 4
    twice(twice(twice[Int]))(add1)(n) shouldEqual 16
    twice(twice(twice(twice[Int])))(add1)(n) shouldEqual 256 // 16^2

    // Problem 4
    thrice[Int](add1)(n) shouldEqual 3
    thrice(thrice[Int])(add1)(n) shouldEqual 27
    thrice(thrice(thrice[Int]))(add1)(n) shouldEqual 27 * 27 * 27

    // Problem 5
    ence[Int](add1, 0)(n) shouldEqual 0
    ence[Int](add1, 1)(n) shouldEqual 1
    ence[Int](add1, 2)(n) shouldEqual 2
    ence[Int](add1, 3)(n) shouldEqual 3
    ence[Int](add1, 10)(n) shouldEqual 10

    // Problem 6
    def f(x: Int, y: Int) = x - y // check that f(10, 2) gives 8
    val g = swapFunc(f) // now check that g(10, 2) gives (– 8)
    f(10, 2) shouldEqual 8
    g(10, 2) shouldEqual -8
    g(2, 10) shouldEqual 8

    // Problem 7
    "def r[A, B, C]: (((A => B) => B) => C) => A => C = p ⇒ q ⇒ p(t ⇒ t(q))" should compile

    // Problem 9
    "def s[B, C, D]: ((((C => D) => D) => B) => C) => (((C => D) => D) => B) => B = f ⇒ g ⇒ g(x ⇒ x(f(g)))" should compile
  }
}
