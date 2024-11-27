import com.lyj.pck1.*

fun main() {
    /* 패키지
    패키지는 가능 기능을 가지는 코드 묶음 단위
    "com.naver.diary"처럼 도메인을 거꾸로 한 형식을 사용한다.
     */

    val testClass = com.lyj.pck1.TestClass()
    val testClass2 = TestClass() // 이 형식을 쓰는 경우 import됨
    val testClass3 = TestClass2()

    testFunction()
}