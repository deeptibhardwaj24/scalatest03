package com.knoldus
import scala.concurrent.{Promise, Future}
import scala.concurrent.ExecutionContext.Implicits.global

/**
  * Created by knoldus on 15/2/16.
  */

object Factorial {
  def fact(num: Int): Future[Int] = Future {

    def local(num: Int): Int = {

      if (num == 1 || num == 0)
        1
      else
        num * local(num - 1)
    }
    local(num)
  }

  def factorialList(list: List[Int]): List[Future[Int]] = {

    val res = list map { a => fact(a) }
    res

  }
}

  class FirstFuture {

    def findFirstFuture(list: List[Future[Int]]): Future[Int] = {
      val promise = Promise[Int]

      list.foreach(_.onSuccess { case a => promise.trySuccess(a) })
      promise.future
    }
  }

