object Demo {
    case class Employee(name: String, age: Int, sex: String)

    def main(args: Array[String]): Unit = {
        val numbers = List(1, 2, 3)
        
        val empList = Employee("James", 25, "male") :: 
            Employee("Jack", 33, "male") ::
            Employee("Nina", 28, "female") ::
            Nil
        
        println(numbers.fold(0)(_+_)) // order not guaranteed, ideal for parallel computation
        // ((0 + 1) + 2) + 3 = 6
        println(numbers.foldLeft(0){ (res, n) => res + n }) // iterative
        // 1 + (2 + (3 + 0))  = 6
        println(numbers.foldRight(0){ (n, res) => res + n }) // recursive, not good for lengthy lists
      
        val empInfo = empList.foldLeft(List[String]()){ (list, employee) => 
            val title = employee.sex match {
                case "male" => "Mr."
                case "female" => "Mrs."
            }
            list :+ s"$title ${employee.name}- ${employee.age}" // append to list with :+
        }

        println(empInfo)
    }
}