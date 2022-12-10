package Kotlin.StudentsKotlin.Gleb

fun main() {
println("довайте сыграем в игру для начала ведите имя пользывателя")
val game_name= readLine()!!.toString()
    var enemy_hp=100
    var player_hp=100
    println("приступим игре ,на $game_name напал враг атакуйте!")
    while (enemy_hp>10) {


    println("выберите атаку:слабый_удар -10 hp сильный_удар -25 hp")
    var damage= readLine()!!.toString()
    if (damage=="слабый удар") {
     println(enemy_hp-10)
     } else if (damage=="сильный удар")
         println(enemy_hp-25)
     println("монстр атаковал вас в ответ !")
        println(player_hp-15)
    }
    println("вы уже прошли? так быстро ? продолжение? на продолжение не хватило бюджета и навыков авторы так что пока!")
}
