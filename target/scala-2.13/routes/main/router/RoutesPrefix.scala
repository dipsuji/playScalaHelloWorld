// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Sujata/IdeaProjects/playScalaHelloWorld/conf/routes
// @DATE:Tue Jan 21 17:34:36 JST 2020


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
