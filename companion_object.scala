
// create objects without new keyword
// compiler try to find companion object when there is no new keyword
// and calls the apply method
class Student(val name: String, val age: Int)
// class Student(name: String, age: Int) // cannnot access variables without val

object Student {
    def apply(name: String, age: Int): Student = {
        new Student(name, age)
    } 
}

object Demo {

    def main(args: Array[String]): Unit = {
        val s = Student("Derek", 34)
        println(s.name)
    }
}