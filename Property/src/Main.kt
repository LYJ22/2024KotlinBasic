fun main() {
    /* property
    객체의 변수를 외부에서 바로 접근하지 못하게 하는 것을 캡슐화라고 함
    이런 변수에 getter, setter를 설정해주게 되면 property라고 함
     */

    val obj1 = TestClass1(100, 200)
    val obj2 = TestClass2(100, 200)
    //println("obj1.a1: ${obj1.a1}") // 주생성자 변수 접근 불가
    println("obj2.a1: ${obj2.a1}")
    println("obj2.v1: ${obj2.v1}")
}

class TestClass1(a1:Int, a2:Int){

}

/* 주생성자
var : Java 코드로 변환하면 getter, setter가 모두 셋팅된다.
val : Java 코드로 변환하면 getter만 셋팅된다.
 */
class TestClass2(var a1: Int, val a2: Int){
    var v1: Int = a1
    val v2: Int = a2
}

class TestClass3{
    var v1: Int = 0
    val v2: Int = 0
    var v3: Int = 100
        get() {
            return field
        }
        set(value) {
            field = value
        }
}