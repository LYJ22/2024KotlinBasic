fun main() {
    /* Any class
    코틀린의 모든 클래스는 Any 클래스를 상속 받는다.
     */

    // 클래스의 객체 참조값 출력
    val obj1 = TestClass1()
    println("obj1: $obj1") // 문자열 보간법을 통해 자동으로 toString 메서드 호출

    val obj2 = TestClass2()
    testFun1(obj2)
}

class TestClass1 {
    // Any 클래스의 메서드
    override fun toString(): String {
        return "TestClass1의 객체입니다."
    }
}

class TestClass2 {
    override fun toString(): String {
        return "TestClass2의 객체입니다."
    }
}

fun testFun1(a1: Any){
    println("a1: $a1")
}