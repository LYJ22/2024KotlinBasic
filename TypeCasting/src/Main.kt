/* 형변환
 */

fun main() {
    // 클래스를 상속받은 클래스의 객체를 생성한다.
    val obj1:SubClass1 = SubClass1()
    // 인터페이스를 구현한 클래스의 객체를 생성한다.
    val obj2:SubClass2 = SubClass2()

    println("obj1 : $obj1")
    println("obj2 : $obj2")

    // 부모클래스 타입형 변수에 담는다.
    val obj3:SuperClass1 = obj1
    // 구현한 인터페이스 타입형 변수에 담는다.
    val obj4:Inter1 = obj2

    println("obj3 : $obj3")
    println("obj4 : $obj4")

    obj1.subMethod1()
    obj2.subMethod2()
//    obj3.subMethod1() // 부모 클래스로 형변환 되어 자식 클래스의 메서드 접근 불가
//    obj4.subMethod2()

    println("----------------------")

    // 자식 클래스로 형변환 하면 다시 사용 가능
    obj3 as SubClass1
    obj3.subMethod1()
    obj4 as SubClass2
    obj4.subMethod2()

    val temp1: SuperClass1 = SuperClass1()
//    temp1 as SubClass1    // 부모 클래스 객체로 생성하면 자식 클래스로 형변환 불가

    val temp2: SubClass3 = SubClass3()
//    temp2 as SuperClass1    // superclass1이나 inter와 아무 연관이 없기 때문에 형변환 불가
//    temp2 as Inter1

    println("----------------------")

    val obj5: SubClass1 = SubClass1()
    val temp3: SuperClass1 = obj5
    val temp4 = obj5 as SuperClass1
    println("temp3 : $temp3")
    println("temp4 : $temp4")

    // "is" 키워드로 형변환이 가능한지 체크
    val chk1 = temp4 is SubClass1
    val chk2 = temp4 is SuperClass1
    val chk3 = temp4 is Inter1
    println("chk1 : $chk1")
    println("chk2 : $chk2")
    println("chk3 : $chk3")

    println("----------------------")

    val super3: SuperClass1 = SubClass1()
    if(super3 is SubClass1){
        super3.subMethod1()
    }
//        super3.subMethod1() // if 블럭 밖에서는 에러 발생. 스마트 캐스팅 될때만 자식 메서드 접근 가능

    println("----------------------")
    val obj10 = SubClass1()
    val obj11 = SubClass2()
    val obj12 = 100
    val obj13 = "문자열"

    anyMethod(obj10)
    anyMethod(obj11)
    anyMethod(obj12)
    anyMethod(obj13)

    println("----------------------")

    var number1 : Int = 100
    var long1 : Long = number1.toLong()
    println("number1: $number1")
    println("long1: $long1")

    var string1: String = number1.toString()
    var number2: Int = string1.toInt()
    println("string1: $string1")    // 변환가능
    println("number2: $number2")    // 변환가능
}

fun anyMethod(obj: Any){
    if (obj is SubClass1){
        obj.subMethod1()
    }else if (obj is SubClass2){
        obj.subMethod2()
    }else if (obj is Int){
        println("정수입니다")
    }else if (obj is String){
        println("문자열입니다")
    }
}

class SubClass3

open class SuperClass1
interface Inter1

class SubClass1 : SuperClass1(){
    fun subMethod1(){
        println("SubClass1의 subMethod1 입니다")
    }
}

class SubClass2 : Inter1{
    fun subMethod2(){
        println("SubClass2의 subMethod2 입니다")
    }
}