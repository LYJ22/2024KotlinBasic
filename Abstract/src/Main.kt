fun main() {
    /* 추상 클래스
    하나 이상의 추상 메서드(구현되지 않은 메서드)를 포함하는 클래스를 의미합니다.
    추상 클래스는 직접 객체를 생성할 수 없으며 다른 클래스에서 상속받아 구현해야 합니다.
    추상 클래스는 클래스의 공동 기능을 정의하고, 자식 클래스에서 세부 동작을 구현하도록 강제할 수 있습니다.
     */

    val sub2 = Sub2()
    sub2.method1()
    sub2.method2()

}

abstract class Super2{
    fun method1(){
        println("Super2 클래스의 method1()")
    }

    abstract fun method2()
}

class Sub2 : Super2() {
    override fun method2(){
        println("Super2 클래스의 method2()")
    }
}