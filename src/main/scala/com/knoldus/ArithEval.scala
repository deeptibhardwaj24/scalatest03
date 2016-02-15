package com.knoldus
import scala.collection.mutable.Stack

/**
  * Created by knoldus on 15/2/16.
  */

class ArithEval {

  val operandStack: Stack[Int] = Stack[Int]()
  val operatorStack: Stack[Char] = Stack[Char]()

  def doEvaluation(input: String) = {
    val inputList = input.toList
println(inputList)

    def local(input: List[Char]): Unit = {

val one = inputList.head

    if(one >= '0' && one <= '9' ) {

      val ele = inputList.head
      //println(ele)
      operandStack.push(ele.toInt)
      local(inputList.tail)

    }
    }
  }
}