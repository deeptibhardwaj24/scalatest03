package com.knoldus

/**
  * Created by knoldus on 15/2/16.
  */

import org.scalatest.FunSuite
import scala.collection.mutable

class ArithEvalTest extends FunSuite{

  val obj = new ArithEval
  obj.doEvaluation("234%56+")
  assert(obj.operandStack == mutable.Stack(6,5,4,3,2))

}
