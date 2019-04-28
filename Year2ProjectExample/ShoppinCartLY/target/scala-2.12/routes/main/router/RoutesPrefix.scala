
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/ProjectYear2-OutDoorWear-/Year2ProjectExample/ShoppinCartLY/conf/routes
// @DATE:Sat Mar 02 22:23:44 GMT 2019


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
