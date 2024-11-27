fun main() {
    val firstClass: FirstClass = FirstClass()
    println("firstClass: $firstClass")

    val thirdClass: ThirdClass()
    println("thirdClass a: ${thirdClass.a}")
    println("thirdClass b ${thirdClass.b}")
    thirdClass.funA()


    val newClass = NewClass()
}

class FirstClass
class SecondClass{

}

class ThirdClass(){
    val a =0;
    val b = 0

    fun funA(){
        println("This is funA()")
    }
}