fun main() {
    /* companion은 자바의 static과 동일한 개념
    클래스 내 companion 멤버로 정의된 요소들은 객체 생성 없이 사용이 가능하며
    클래스의 이름을 통해 접근한다.
     */

    val testClass1 = TestClass1()
    println("${testClass1.a1}")
    testClass1.testMethod1()

    println("${TestClass1.a2}")
    TestClass1.testMethod2()

    // Java 코드로 만들어진 클래스의 객체 생성
    val javaMain = JavaMain()
    println("javaMain.javaA1 : ${javaMain.javaA1}")
    javaMain.javaMethod1()
    println("javaMain.javaA2 : ${JavaMain.javaA2}")
    JavaMain.javaMethod2()
}

class TestClass1{
    // 일반 멤버 변수
    var a1 = 100
    // 일반 메서드
    fun testMethod1(){
        println("testMethod1()")
        println("testMethod1 - a1 : $a1")   // 클래스의 일반 변수에 접근 가능
        println("testMethod1 - a2 : $a2")   // companion 내부 변수에도 접근 가능
    }

    companion object{
        // 컴패니언 멤버 변수
        var a2 = 200
        // 컴패니언 메소드
        fun testMethod2(){
            println("testMethod2()")
//            println("testMethod2 - a1 : $a1")   // 클래스의 일반 변수에 접근 불가
            println("testMethod2 - a2 : $a2")   // 자신 내부 변수에 접근 가능
        }
        @JvmStatic
        var a3 = 300
        @JvmStatic
        fun testMethod3(){
            println("testMethod3()")
        }
    }

}