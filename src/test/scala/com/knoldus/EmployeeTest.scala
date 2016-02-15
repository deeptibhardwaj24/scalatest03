package com.knoldus

/**
  * Created by knoldus on 15/2/16.
  */


import org.scalatest.FunSuite

class EmployeeTest extends FunSuite {
  test("sorting employee list") {

    val obj = new EmployeeSort
    val input = List(Employee(3, "kunal", 98000), Employee(1, "deepti", 45678), Employee(2, "himani", 56789))
    val result = obj.doSort(input)
    assert(result === List(Employee(1, "deepti", 45678.0), Employee(2, "himani", 56789.0), Employee(3, "kunal", 98000.0)))
  }

  test("sending empty Employee list") {
    val input = Nil
    val obj = new EmployeeSort
    intercept[IllegalArgumentException] {
      val result = obj.doSort(input)
    }
    }
  }


