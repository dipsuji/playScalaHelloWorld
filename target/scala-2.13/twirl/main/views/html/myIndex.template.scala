
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object myIndex extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Welcome")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""

"""),format.raw/*5.1*/("""<section id="content">
  <div class="wrapper doc">
    <article>
      <h2> Hello I’m Sujata Maurya</h2>

      <h3 id="introduction">Introduction</h3>
      <p>Hello, I’m Sujata Maurya(スジャタ マウリヤ)
        Master with mathematics</p>
      <p>I have my own you tube channel on Japanese language learning. Also creating tutorials of Japanese language on my own website.</p>

      <li>Position: Developer</li>
      <li>Roles and Responsibilities: Creating own website using WordPress. creating Android application and creating Japanese learning You Tube tutorials.</li>
      <h2> Projects: </h2>
        <ul>
          <li>Java Programming Android Project
          </li>
          <li>Happy New Year Apps </li>
          <li>Mehndi Design Apps </li>
      <li>Japan Photos Apps </li>
      </ul>

      <img src="assets/images/sujata-stack.jpeg" alt="Play Stack" class="small-2 medium-2 large-2" />
    </article>
    <aside>
      """),_display_(/*29.8*/commonSidebar()),format.raw/*29.23*/("""
    """),format.raw/*30.5*/("""</aside>
  </div>
</section>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-21T17:53:36.763174
                  SOURCE: /Users/Sujata/IdeaProjects/playScalaHelloWorld/app/views/myIndex.scala.html
                  HASH: 50c2876f11162823147983426f52b9ab449db0ce
                  MATRIX: 724->1|820->3|850->8|873->23|912->25|942->29|1926->987|1962->1002|1995->1008
                  LINES: 21->1|26->1|28->3|28->3|28->3|30->5|54->29|54->29|55->30
                  -- GENERATED --
              */
          