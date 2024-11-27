/* enum 열거형 */

// 기본적인 선언
enum class DirectionEnum{
    NORTH, EAST, SOUTH, WEST    // 대소문자 상관X, 코틀린에서는 대문자로 선언하는 것이 약속
}

enum class Bread(val shape: BreadShape) {

}

enum class BreadShape(val text: String, val modelNumber: Number){
    FISH("붕어빵", 123),
    FLOWER("붕어빵", 145)
}

fun main() {
    // 기본적인 사용법
    var directionEnum: DirectionEnum = DirectionEnum.NORTH

    printDirection1(DirectionEnum.NORTH)
}

fun printDirection1(dir: DirectionEnum){
    when(dir){
        DirectionEnum.NORTH -> println("북쪽입니다")
        DirectionEnum.EAST -> println("동쪽입니다")
        DirectionEnum.SOUTH -> println("남쪽입니다")
        DirectionEnum.WEST -> println("서쪽입니다")
    }
}