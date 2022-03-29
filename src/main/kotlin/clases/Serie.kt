package clases

class Serie: Entregable {

    var titulo:String=""
    var numTemporadas:Int=3
    var entregado:Boolean=false
    var genero:String=""
    var creador:String=""

    constructor(){
        // nombre=""
        //  edad=0
        //  cedula=0
        //  sexo='H'
        //  peso= 0.0F
        //  altura=0.0F
    }
    constructor(titulo:String,creador:String){
        this.titulo=titulo
        this.creador=creador
    }
    constructor(titulo:String, numTemporadas:Int,genero:String,creador:String){
        this.titulo=titulo
        this.numTemporadas=numTemporadas
        this.genero=genero
        this.creador=creador
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