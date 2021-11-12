import java.net.ConnectException
import java.net.URL
import kotlin.system.exitProcess

fun netConnect() {
    while (true) {
        println()
        println("Какой пост вы хотите посмотреть?")
        Thread.sleep(1000)
        var postId = readLine()!!.toIntOrNull()
        if (postId == null) {
            postId = 1
        } else if (postId == 0) {
            exitProcess(0)
        } else if (postId < 0) {
            main()
        } else if (postId > 100) {
            postId = 100
        }

        try {
            val url = URL("https://jsonplaceholder.typicode.com/posts/$postId")
            val data = url.readText()
            Thread.sleep(1000)
            println()
            println(data)
            Thread.sleep(1000)
        } catch (e: ConnectException) {
            println()
            println(e.message)
            Thread.sleep(1000)
            println()
            println(e.stackTrace)
            Thread.sleep(1000)
            netConnect()
        }
    }
}