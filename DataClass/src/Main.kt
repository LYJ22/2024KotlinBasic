// 1. 기본적인 선언 (클래스나 객체 생성과 비교 등이 쉬운 장점이 있다
data class Product(val name:String, var price:Double)

// 2. 가독성을 위해 개행을 주기도 한다.
data class Product2(
    val name:String,
    var price:Double
)


/* data class

 */

fun main() {
    val t1 = TestClass1(100, 200)
    val t2 = TestClass1(100, 200)
    if(t1 == t2) println("t1과 t2는 같습니다.")
    else println("t1과 t2는 다릅니다.")

    val d1 = TestClass2(100, 200)
    val d2 = TestClass2(100, 200)
    if(d1 == d2) println("d1과 d2는 같습니다.")
    else println("d1과 d2는 다릅니다.")

    println("---------------------")

    // data 클래스는 주생성자의 멤버변수 값만 같으면 같다고 인식
    d1.a3 = 1000
    d2.a3 = 2000
    if(d1 == d2) println("d1과 d2는 같습니다.")
    else println("d1과 d2는 다릅니다.")

    println("---------------------")

    // 기본적으로 class타입@주소값 형태로 출력된다.
    println("t1 : $t1")
    // data 클래스는 class타입@(주 생성자에 정의되어 있는 변수의 값) 형태로 출력
    println("d1 : $d1")

    val d100 = d1.copy()
    println("d1.a1 : ${d1.a1}")
    println("d100.a1 : ${d100.a1}")

    d100.a3 = 5000  // copy한 클래스의 변경
    println("d1.a3 : ${d1.a3}")
    println("d100.a3 : ${d100.a3}")

    println("---------------------")

    // data class
    val d1000 = d1  // 참조하는 클래스의 변경
    d1.a1 = 3000
    println("d1000.a1 : ${d1000.a1}")

    // 일반 클래스
    val t1000 = t1
    t1.a1 = 3000
    println("t1000.a1 : ${t1000.a1}")

    println("---------------------")

    val num1 = d1.component1()
    val num2 = d1.component2()
    println("num1 : $num1")
    println("num2 : $num2")

    val(num10, num20) = d1
    println("num10 : $num10")
    println("num20 : $num20")
}

class TestClass1(var a1:Int, var a2:Int){
    var a3:Int = 0
}

data class TestClass2(var a1:Int, var a2:Int){
    var a3:Int = 0
}