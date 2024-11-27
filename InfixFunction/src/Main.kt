fun main() {
    val a: Int = 100
    val r: Int = a.add(200)
    val s: Int = 300.add(400)

    println("r: $r, s: $s")

    val r2: Int = a add 300
    println(r2)
}


// 값 자체로 함수를 호출할 수 있다.
infix fun Int.add(a1: Int): Int{
    return this + a1
}