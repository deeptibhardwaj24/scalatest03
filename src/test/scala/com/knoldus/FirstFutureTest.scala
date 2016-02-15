package com.knoldus
import scala.concurrent.duration._
import org.scalatest.FunSuite
import scala.concurrent.{Await, Future}

/**
  * Created by knoldus on 15/2/16.
  */


class FirstFutureTest extends FunSuite{

  test("test1")
  {
    val res=Factorial.factorialList(List(1,13,4,5,6))
    val obj = new FirstFuture
    val out = Await.result(obj.findFirstFuture(res), 10.seconds)
    println(out)

  }
}
