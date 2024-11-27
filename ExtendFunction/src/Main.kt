// 확장함수
// string에는 없지만 임의로 만들어서 사용할 수 있다.
fun main() {
    var a1: String = "안녕하세요."
    a1.printString()
}

fun String.printString(){
    println("반갑습니다.")
}