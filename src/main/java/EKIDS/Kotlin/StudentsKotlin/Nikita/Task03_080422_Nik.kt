package Kotlin.StudentsKotlin.Nikita


fun main() {
    val ANSI_RED = "\u001B[31m"
    val ANSI_YELLOW = "\u001B[33m"
    val ANSI_BLUE = "\u001B[34m"
    val ANSI_GREEN = "\u001B[32m"
    val ANSI_PURPLE = "\u001B[35m"
    val ANSI_CYAN = "\u001B[36m"
    val ANSI_RESET = "\u001B[0m"
    print (ANSI_RED +"На далёкой Амазонке" + ANSI_RESET)
    Thread.sleep(500)
    print(ANSI_YELLOW +"\r\r\r\r\rНе бывал я никогда" + ANSI_RESET)
    Thread.sleep(500)
    print( ANSI_BLUE +"\r\r\r\r\rТолько Дон и Магдалина-"+ ANSI_RESET)
    Thread.sleep(500)
    print( ANSI_GREEN +"\r\r\r\r\rБыстроходные суда-"+ ANSI_RESET)
    Thread.sleep(500)
    print( ANSI_PURPLE + "\r\r\r\r\rТолько Дон и Магдалина"+ ANSI_RESET)
    Thread.sleep(500)
    print( ANSI_CYAN +"\r\r\r\r\rХодят по морю туда."+ ANSI_RESET)


}

