
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Gustavo/Desktop/laboratorio/reservando/conf/routes
// @DATE:Tue Jul 11 18:34:53 ART 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
