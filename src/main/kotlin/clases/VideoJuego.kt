package clases

class VideoJuego: Entregable {
    var titulo:String=""
    var horasEstimadas:Int=10
    var entregado:Boolean=false
    var genero:String=""
    var compania:String=""

    constructor(){

    }
    constructor(titulo:String,horasEstimadas:Int){
        this.titulo=titulo
        this.horasEstimadas=horasEstimadas
    }
    constructor(titulo:String, horasEstimadas:Int,genero:String,compania:String){
        this.titulo=titulo
        this.horasEstimadas=horasEstimadas
        this.genero=genero
        this.compania=compania
    }

    override fun devolver() {
        this.entregado=false
    }
    override fun entregar() {
        this.entregado=true
    }

    override fun isEntregado(): Boolean {
        if(this.entregado==false){
            return false
        }
        return true
    }
}