fun main() {
    println(testFun1(1,2))
    println(testFunc4(5,2))
    testFunc2()

    val r1 = lambda1(100, 200)
    val r2 = lambda2(100, 200)
    val r3 = lambda3(100, 200)
    println("r1: $r1, r2: $r2, r3: $r3")
}

// 리턴이 있는 경우
fun testFun1(a1:Int, a2:Int): Int{
    return a1 + a2
}

// 리턴이 없는 경우 안 붙이거나 unit 사용
//fun testFunc2(){
fun testFunc2(): Unit{
    println("testFunc2 호출")
}

// testFun1의 축약형
fun testFunc4(a1:Int, a2:Int): Int = a1 + a2

// 여러 줄인 경우에는 축약 불가
//fun testFunc5(a1:Int, a2:Int): Int = {
//    val r1 = a1 + 100
//    val r2 = a2 + 200
//    val r3 = r1 + r2
//    return r3
//}

val lambda1: (Int, Int) -> Int = {a1:Int, a2:Int -> a1+a2}
val lambda2 = {a1:Int, a2:Int -> a1+a2} // 위 람다식 타입 생략 형태.
val lambda3: (Int, Int) -> Int = {a1, a2 -> a1+a2} // 수행문 변수 타입 생략 가능
