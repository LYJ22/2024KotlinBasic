fun main() {
    /* 상속
    부모의 클래스의 기능(멤버변수, 멤버메서드)를 물려받는 개념
    Kotlin에서는 상속이 가능한 클래스를 정의할 때 open이라는 키워드를 class 앞에 써준다.
     */

    var super2 = Super2()
    var sub2 = Sub2()
    println("sub2.sub2Memeber: ${sub2.sub2Member}")
    println("super2.sub2Member: ${sub2.super2Member}")
    sub2.sub2Fun()
    super2.super2Fun()
}

open class Super
// "class Sub: Super(){ ..." 자식 클래스의 객체를 생성할 땐 항상 부모 클래스의 생성자를 호출
class Sub: Super{
    // 이렇게도 가능하다
    constructor() : super()
}

open class Super2{
    var super2Member = 100

    fun super2Fun() {
        println("Super2의 super2Fun()")
    }
}

class Sub2() : Super2(){
    var sub2Member = 200

    fun sub2Fun(){
        println("Sub2의 sub2Fun()")
    }
}

// 부모클래스에 매개변수가 있을 경우
open class Super3(a1: Int){

}
// 부모클래스 생성자 호출 필요
class Sub3() : Super3(100){

}