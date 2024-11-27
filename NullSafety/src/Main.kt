var a: Int? = null
var b: String? = null
var c: TestClass1? = null // 클래스 객체도 nullable 선언 가능

fun main() {
    // null을 허용하지 않는 property
    // var a1: TestClass1 = null

    var a2: TestClass1? = null // null을 허용하는 변수, null 허용하는 프로퍼티 선언할 때 반드시 타입을 작성해야 함

    val t1: TestClass1 = TestClass1()
    val t2: TestClass1? = TestClass1()  // nullable인 객체에 객체 생성 가능
    val t3: TestClass1? = null
    val t4: TestClass1 = t1
    val t5: TestClass1? = t1

    // 객체 주소값이 담겨져 있는 null을 허용하는 타입의 변수 값을 null을 허용하지 않는 변수에 넣어준다.
    val t6: TestClass1 = t2!!   // !! : 언래핑
    println("t2: $t2")
    println("t6: $t6")

    var t7:TestClass1? = null
    var t8:TestClass1? = TestClass1()
//    println("t7: ${t7!!}") // null을 언래핑하면 에러 발생. 반드시 null 체크 후 사용해야 한다.
    println("t7: $t7")
    println("t8: $t8")

    // "?:" 연산자 사용
    var t9:TestClass1 = t7 ?: TestClass1()  // 앞의 값이 null이면 뒷 값을, null 아니면 앞의 값을 사용
    var t10:TestClass1 = t8 ?: TestClass1()
    println("t9: $t9")
    println("t10: $t10")

    // "?." 연산자 사용
    var t11:TestClass1? = null
    var t12:TestClass1? = TestClass1()
    println("t11?.testValue1: ${t11?.testValue1}")
    println("t12?.testValue1: ${t12?.testValue1}")

    t11?.test1Method()
    t12?.test1Method()
    println("t11?.test2Method(): ${t11?.test2Method()}")
    println("t12?.test2Method(): ${t12?.test2Method()}")
}

class TestClass1{
    var testValue1 = 100

    fun test1Method(){
        println("TestClass1의 test1Method 입니다.")
    }

    fun test2Method() : Int{
        return 100
    }
}