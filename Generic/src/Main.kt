/* 제네릭이란
클래스를 설계할 때 특정 변수의 타입을 유동적으로 하고 샆을 대가 있을수도 있다.
이 때 generic 개념을 활용하면 클래스 작성시가 아닌 객체  생성 시에 해당 변수 타입을 설정할 수 있다.
 */


fun main() {
    val t1 = TestClass1<Int>()
    t1.testMethod(100)

    val t2 = TestClass1<String>()
    t2.testMethod("안녕하세요")

    val t3 = TestClass2<Int, Double, Boolean,String>(100, 11.11)
    t3.testMethod(true, "문자열1")

    val t4 = TestClass2<Double, String, Boolean, Int >(22.22, "문자열2")
    t3.testMethod(false, 200)

    val t5:TestClass3<SubClass1> = TestClass3<SubClass1>()
    val t6:TestClass3<SubClass1> = TestClass3()
//    val t7:TestClass3<SuperClass1> = TestClass3<SubClass1>()
//    val t8:TestClass3<SubClass2> = TestClass3<SubClass1>()

    // 공변성 : 변수에 설정한 제네릭이 객체를 생성했을 때 사용한 제네릭과 같거나
    // 부모 클래스인 경우 담을 수 있다.
}


open class SuperClass1
open class SubClass1:SuperClass1()
class SubClass2: SubClass1()

// 불변성 (제네릭에 키워드를 붙히지 않는다
class TestClass3<T>
// 공변성
class TestClass4<out A>()
// 반 공변성
class TestClass5<in A>()


/* 암묵적 약속
T : 타입
E: 리스트
K: 키, 맵과 같이 이름을 통해 객체를 관리하는 요소들의 이름으로 사용할 타입
V: 리턴 값 또는 매핑된 값
N: 숫자
S, U, V: 2,3,4번째 선언된 값
 */
class TestClass1<T>{
    var a1: T? = null
    fun testMethod(a1: T){
        println("a1 : $a1")
    }
}

class TestClass2<A,B,C,D>(var a1:A, var a2:B){
    fun testMethod(a3: C, a4: D){

    }
}