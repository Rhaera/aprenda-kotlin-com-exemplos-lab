// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val name: String, val age: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg usuarios: Usuario) {
        
        for (u in usuarios) {
            
			this.inscritos.add(u)            
            
        }
        
        // TODO("Utilize o parâmetro $usuarios para simular uma matrícula (usar a lista de $inscritos).")
    
    }
}

fun main() {

    val user1 = Usuario("Thulio", 10)
    
    val user2 = Usuario("Yohanam", 8)
    
    val user3 = Usuario("Aryel", 7)
    
    val content1: ConteudoEducacional = ConteudoEducacional("Spring Java Developer", 120, Nivel.AVANCADO)

    val content2: ConteudoEducacional = ConteudoEducacional("PHP: API com Laravel", 90, Nivel.BASICO)
    
    var contents = mutableListOf<ConteudoEducacional>()
    
    contents.add(content1)
    contents.add(content2)
    
    val formation = Formacao("Java e PHP Developer", contents)
    
    formation.matricular(user1, user2, user3)
    
    println(formation.inscritos)

    // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    
    // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

}
