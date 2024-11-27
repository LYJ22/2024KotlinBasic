fun main() {
    testFunction1()

    // 코틀린은 이름 있는 함수를 다른 변수에 담는 것이 불가능
//    val testFunction2 = testFunction1

    testFunction3()
}

fun testFunction1(){
    println("testFunction1 입니다")
}

val testFunction3 = fun() {
    println("익명 함수 입니다")
}