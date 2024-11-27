fun main() {
    testFunction1()
    testFunction1()

    testFunction2()
    testFunction2()
}

// 일반함수
fun testFunction1(){
    println("-------------------")
    println("testFunction1")
    println("-------------------")
}


// 퍼포먼스 성능이 중요한 앱에서는 사용. 일반적으로는 사용할 일 거의 없다
inline fun testFunction2(){
    println("-------------------")
    println("testFunction2")
    println("-------------------")
}