package swcala.unit

import org.scalatest._
import swscala._


class Ch2Spec extends FlatSpec with Matchers {

  "Exercises 1" should "pass all tests" in {

    // Problem 1
    Exercises1.p1 shouldEqual Seq((0,1), (0,2), (0,3), (0,4), (0,5), (0,6), (0,7), (0,8), (0,9), (1,0), (1,1), (1,2), (1,3), (1,4), (1,5), (1,6), (1,7), (1,8), (1,9), (2,0), (2,1), (2,2), (2,3), (2,4), (2,5), (2,6), (2,7), (2,8), (2,9), (3,0), (3,1), (3,2), (3,3), (3,4), (3,5), (3,6), (3,7), (3,8), (3,9), (4,0), (4,1), (4,2), (4,3), (4,4), (4,5), (4,6), (4,7), (4,8), (4,9), (5,0), (5,1), (5,2), (5,3), (5,4), (6,0), (6,1), (6,2), (7,0), (7,1), (7,2), (8,0), (8,1), (9,0), (9,1))

    // Problem 2
    Exercises1.p2(Seq("a", "b", "c"), Seq(false, true, true)) shouldEqual Seq("b", "c")

    // Problem 3
    Exercises1.p3(Seq(1,3,2,4)) shouldEqual Seq((1,true),(3,false),(2,true))

    // Problem 4
    Exercises1.p4(Seq(true, false), Seq(Set(1), Set(2))) shouldEqual Map(Set(1) -> true, Set(2) -> false)

    // Problem 5
    Exercises1.p5(Seq("a", "b", "c"), Seq(3, 1, 2)) shouldEqual Seq("b", "c", "a")
  }

  "Exercises 2" should "pass all tests" in {

    // Problem 1
    val p1Input = Seq(("a", 1), ("b", 2), ("a", 2), ("b", 4), ("c", 10))
    Exercises2.p1(p1Input) shouldEqual Map("b" -> 6, "a" -> 3, "c" -> 10)

    // Problem 2
    val p2Input1 = Seq(List(2,6,3,8), List(20, 60, 30, 80))
    Exercises2.p2(p2Input1) shouldEqual Seq(List(8, 6, 3), List(80, 60, 30))
    val p2Input2 = Seq(List(2,6,3,8), List(20, 60))
    Exercises2.p2(p2Input2) shouldEqual Seq(List(8, 6, 3), List(60, 20))

    // Problem 3
    Exercises2.p3(Set(1, 2), Set(4, 5)) shouldEqual(Set((1, 4), (1, 5), (2, 4), (2, 5)))
    Exercises2.p3(Set("1", "2"), Set(4, 5)) shouldEqual(Set(("1", 4), ("1", 5), ("2", 4), ("2", 5)))
    val p4Input = Seq(
      Map("a" -> 11, "b" -> 21, "c" -> 1),
      Map("a" -> 12, "b" -> 22, "d" -> 2),
      Map("a" -> 13, "b" -> 23, "e" -> 3),
      )
    val p4ExpectedOutput = Map(
      "a" -> Seq(11, 12, 13),
      "b" -> Seq(21, 22, 23),
      "c" -> Seq(1),
      "d" -> Seq(2),
      "e" -> Seq(3)
    )
    Exercises2.p4(p4Input) shouldEqual p4ExpectedOutput
  }
}
