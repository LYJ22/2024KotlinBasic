fun main() {
    /* 지연 초기화 Lazy Initialization
    변수를 선언할 때가 아닌 나중에 값을 할당한다고 할 때 lateinit 키워드를 붙여준다
     */

    val obj1 = TestClass1()
    println("obj1.a1: ${obj1.a1}")
    println("obj1.a4: ${obj1.a4}")
//    println("obj1.a2: ${obj1.a2}")

    obj1.testMethod()
}

class TestClass1 {
    var a1 = 100
    var a2: Int
    // lateinit 키워드는 String과 같은 참조 타입에만 사용 가능
    // Int 같은 기본형에는 사용 불가
//    lateinit var a3: Int
    val a4: Int by lazy {
        println("a4 init")
        300
    }

    init {
        a2 = 100
    }

    fun testMethod(){
//        if (!::a3.isInitialized){
//            a3 = 200
//        }
//        println("a3: $a3")
    }
}