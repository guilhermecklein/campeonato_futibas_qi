fun main(args: Array<String>){
    val campeonato = Campeonato(2022)

    //Cadatrar um novo time
    campeonato.cadastrarTime(
        Time(
        nome = "Grêmio",
        estadoDeOrigem = "RS",
        divisao = Divisao.B,
        anoDeCriacao = 1903

        )
    )
     campeonato.cadastrarTime(
         Time(
             nome = "Internacional",
             estadoDeOrigem = "RS",
             divisao = Divisao.A,
             anoDeCriacao = 1909
         )
     )
    //Listar

    val times = campeonato.listarTodosOsTimes()
    val limite = times.size-1
    for (indice in 0..limite){
        println("nome: ${times[indice].nome}\nDivisao: ${times[indice].divisao}")
    }
}
