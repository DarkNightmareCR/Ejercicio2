import clases.VideoJuego
import clases.Serie
fun main(args: Array<String>) {
    var videoJuego = arrayOf<VideoJuego>()
    var serie = arrayOf<Serie>()

    val videoJuego1 = VideoJuego("COD",22,"accion","Blizard")
    val videoJuego2 = VideoJuego("GOW",22,"accion","EpicGames")
    val videoJuego3 = VideoJuego("DarkSouls",22,"RPG","FromSoftware")
    val videoJuego4 = VideoJuego("EldenRing",60,"RPG","FromSoftware")
    val videoJuego5 = VideoJuego("Battlefield",22,"accion","EAGames")

    videoJuego = videoJuego.plus(videoJuego1)
    videoJuego = videoJuego.plus(videoJuego2)
    videoJuego = videoJuego.plus(videoJuego3)
    videoJuego = videoJuego.plus(videoJuego4)
    videoJuego = videoJuego.plus(videoJuego5)

    val serie1 = Serie("Breaking Bad",2,"Drama","No se")
    val serie2= Serie("DragonBall",5,"accion","AnimeMiedo")
    val serie3 = Serie("JJK",1,"Sobrenatural","NoSeX2")
    val serie4 = Serie("El Mentalista",5,"Drama","NoSex3")
    val serie5 = Serie("Inuyasha",2,"Sobrenatural","AnimeMiedo2")

    serie = serie.plus(serie1)
    serie = serie.plus(serie2)
    serie = serie.plus(serie3)
    serie = serie.plus(serie4)
    serie = serie.plus(serie5)


    videoJuego[0].entregar()
    videoJuego[1].entregar()

    serie[0].entregar()
    serie[1].entregar()


    println("series:" + serie.size)
    println("video juegos:" + videoJuego.size)

    var cantSerie:Int=0
    var cantJuego:Int=0
    for (i in serie.indices){
        if(serie[i].entregado==true){
            cantSerie++
        }
    }
    println("cantidad de series entregadas:" + cantSerie)

    for (i in videoJuego.indices){
        if(videoJuego[i].entregado==true){
            cantJuego++
        }
    }
    println("cantidad de juegos entregadas:" + cantJuego)
}