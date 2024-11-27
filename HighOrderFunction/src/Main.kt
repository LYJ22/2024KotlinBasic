// 고차 함수 : 함수 자체를 매개변수로 받거나 반환하는 것

fun main() {
    val t1 = fun(x1: Int, x2: Int): Int{
        return x1 + x2
    }

    // 익명함수로 전달, 함수로 전달, 람다식으로 전달 전부 가능하다.
    testFunc1(100, 100, t1)

    testFunc1(100, 100, fun(x1: Int, x2: Int): Int{
        return x1 * x2
    })

    val lambda1 = {x1: Int, x2: Int -> x1/x2}
    testFunc1(100, 100, lambda1)

    println("-----------")

    // 매개변수가 1개인 람다식
    testFunc4(100) {x1 ->
        x1 + 100
    }
    // it으로도 사용 가능
    testFunc4(100) {it ->
        it + 100
    }
    // it이면 앞에 생략도 가능
    testFunc4(100) {
        it + 100
    }
}

// 매개변수로 함수 받는 함수
// 함수형변수: (매개변수의 타입) -> 반환값타입 형태로 작성
fun testFunc1(a1: Int, a2:Int, m1:(Int, Int) -> Int){
    val r1 = m1(a1, a2)
    println("testFunc1 r1: $r1")
}

// 함수 반환하는 함수
fun testFunc2(a1: Int): (Int, Int) -> Int{
    val a2 = 100
    return fun(x1: Int, x2:Int):Int{
        return x1 + x2 + a1 + a2
    }
}

// 람다식 반환 가능
fun testFunc3(a1: Int): (Int, Int) -> Int{
    val a2 = 100
    return { x1: Int, x2:Int ->
        x1 + x2 + a1 + a2
    }
}

fun testFunc4(a1:Int, m1:(Int) -> Int){
    val r1 = m1(a1)
    println("testFunc4 r1 : $r1")
}