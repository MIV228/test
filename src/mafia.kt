class Player {
    val trick: Int = (1..10).random()
    var role: Role = Role.PEACEFUL
}

fun startMafia() {
    var players: List<Player> = listOf(
        Player(),
        Player(),
        Player(),
        Player(),
        Player()
    )

    for (player in players) {
        if (players.find { player.role == Role.MAFIA } == null) {
            players.random().role = Role.MAFIA
        }
        if (players.find { player.role == Role.DOCTOR } == null) {
            players.random().role = Role.DOCTOR
        }
    }

    while (true) {
        println()
        for (player in players) {
            println(player.role)
        }

        println()
        var i = 3
        while (players.filter { it.trick <= i }.isEmpty()) {
            i++
        }
        players = players.minus(
        players.filter { it.trick <= i }.random()
        )

        if (players.find { it.role == Role.MAFIA } == null) {
            for (player in players) {
                println(player.role)
            }
            println("Игра окончена.")
            Thread.sleep(1000)
            println("Мирные победили!")
            Thread.sleep(1000)
            break
        }

        if (players.filter { it.role != Role.MAFIA }.isEmpty()) {
            for (player in players) {
                println(player.role)
            }
            println("Игра окончена.")
            Thread.sleep(1000)
            println("Мафия выиграла!")
            Thread.sleep(1000)
            break
        }

        Thread.sleep(500)
    }
    main()
}

enum class Role {
    PEACEFUL,
    MAFIA,
    DOCTOR
}