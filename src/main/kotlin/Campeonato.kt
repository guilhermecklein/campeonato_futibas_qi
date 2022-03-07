import javax.swing.text.StyledEditorKit.BoldAction

class Campeonato(
    val Ano: Short,
) {
    private var times = mutableListOf<Time>()

    fun cadastrarTime(time: Time): Boolean = if
                                                     (times.size < 20) times.add(time) else false

    fun buscarTimePorNome(nome: String): Time? {
        if (nome.isEmpty()) return null

        val times = times.filter { t -> t.nome.equals(nome, ignoreCase = true) }
        return times.first()
        //return times[0]
    }

    fun editarTime(objTime: Time) {
        val time = buscarTimePorNome(objTime.nome)
        val indice = times.indexOf(time)
        if (time != null)
            times.set(indice, objTime)
    }

    fun listarTimesPorDivisao(divisao: Divisao) =
        times.filter { t -> t.divisao == divisao }

    fun listarTodosOsTimes() = times

    fun removerTime(nome: String): Boolean {
        val time = buscarTimePorNome(nome)
        if (time != null)
            times.remove(time)
        return false
    }

}
