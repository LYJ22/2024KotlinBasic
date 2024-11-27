fun main() {
    val outer1 = Outer1()
    val inner1 = outer1.Inner1()
//    val inner = Inner1() // 내부 클래스 바로 생성 불가

    println("outer1: $outer1")
    println("inner1: $inner1")

    val t1 = TestClass1()
    t1.interMethod1()
    t1.interMethod2()

    val t2 = object : Inter1{
        override fun interMethod1() {
            println("익명 중첩 클래스의 innerMethod1")
        }

        override fun interMethod2() {
            println("익명 중첩 클래스의 innerMethod2")
        }
    }

    t2.interMethod1()
    t2.interMethod2()
}

interface Inter1{
    fun interMethod1()
    fun interMethod2()
}

// 인터페이스를 구현한 클래스를 작성한다.
class TestClass1:Inter1{
    override fun interMethod1() {
        println("TestClass1의 interMethod1")
    }

    override fun interMethod2() {
        println("TestClass1의 interMethod2")
    }

}


// 일반 중첩 클래스
// 외부
class Outer1{
    var outerValue1 = 100
    fun outerMethod1(){
        println("Outer1의 outerMethod")

//        내부 클래스 객체가 생성된 것을 보장받을 수 없어 외부에서는 내부 클래스 변수/메서드 사용불가
//        println("innerValue1 : $innerValue1")
//        innerMethod1()
    }

    // 내부
    inner class Inner1{
        var innerValue1 = 200
        fun innerMethod1(){
            println("outerValue1 : $outerValue1")
            outerMethod1()
        }
    }
}