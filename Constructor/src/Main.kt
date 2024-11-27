fun main() {
    /* 생성자 Constructor
    * 객체가 생성될 때 제일 처음 호출되는 메서드
    * */

    val firstClass = FirstClass(100)

    val fourthClass = FourthClass(100, 200)
    val fourthClass2 = FourthClass(100)
}

class FirstClass{
    // init 블록: 객체가 생성될 때 생성자 말고도 처음 실행할 수 있는 코드
    // init, constructor가 둘 다 있는 경우 init이 먼저 실행된다.
    init {
        println("FirstClass init()")
    }
    // 생성자
    constructor(){
        println("FirstClass constructor()")
    }

    // 객체 오버로딩
    constructor(a1: Int){
        println("FirstClass constructor() a1: $a1")
    }
}

// 주생성자 (기본생성자)
class SecondClass constructor(){

}

// second class의 축약형
class ThirdClass() {

}

// 주생성자 사용
class FourthClass(a1: Int, a2:Int){
    init {
        println("FourthClass a1: $a1, a2: $a2")
    }

    // 주생성자가 있는 클래스에서 보조생성자 생성할 경우
    // this는 객체가 생성될 때 자기 자신을 의미
    constructor(a1: Int): this(a1, 100){
        println("보조생성자 실행 a1: $a1, a2: $a2")
    }
}