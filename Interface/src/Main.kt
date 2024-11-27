fun main() {
    /* 인터페이스
    클래스나 객체가 특정 동작을 구현하도록 강제하는 일종의 계약입니다.
    인터페이스는 추상 메서드와 프로퍼티만 선언하며, 이를 구현하는 클래스는 해당 메서드와 프로퍼티를 구현해야 합니다.
    인터페이스는 다중 상속이 가능하여, 다양한 기능을 조합할 때 유용합니다.
     */
}

interface Inter1{
    fun inter1method1(){
        println("Inter1의 inter1method1")
    }
    fun inter1method2()
}

interface Inter2{
    fun inter2method1(){
        println("Inter2의 inter2method1")
    }
    fun inter2method2()
}

class TestClass5 : Inter1, Inter2 {
    
}