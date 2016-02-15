package com.knoldus

/**
  * Created by knoldus on 15/2/16.
  */

case class Employee(id : Int , name : String, salary: Double)

object EmployeeOrdering extends Ordering[Employee]{

  def compare(a: Employee , b: Employee)= a.salary compare b.salary
  }

class EmployeeSort()
{

  def doSort(list:List[Employee]): List[Employee]={
    require(list!= Nil )
    list.sorted(EmployeeOrdering)
  }
}
