
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object clientNav_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class clientNav extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
"""),format.raw/*2.1*/("""<nav class="red darken-1">
    <div class="nav-wrapper">
       <a href="/client/home" class="brand-logo">Reservando</a>
        <ul id="nav-mobile" class="right hide-on-med-and-down">
           <li><a href="/my-orders">"""),_display_(/*6.38*/Messages("client.navBar.my.orders")),format.raw/*6.73*/("""</a></li>
           <li><a href="/my-reservations">"""),_display_(/*7.44*/Messages("client.navBar.my.reservations")),format.raw/*7.85*/("""</a></li>
           <li><a href="/client/profile">"""),_display_(/*8.43*/Messages("client.navBar.my.profile")),format.raw/*8.79*/("""</a></li>
           <li><a href="/logout">"""),_display_(/*9.35*/Messages("client.navBar.logout")),format.raw/*9.67*/("""</a></li>
        </ul>
    </div>
</nav>"""))
      }
    }
  }

  def render(messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(messages)

  def f:((Messages) => play.twirl.api.HtmlFormat.Appendable) = (messages) => apply(messages)

  def ref: this.type = this

}


}

/**/
object clientNav extends clientNav_Scope0.clientNav
              /*
                  -- GENERATED --
                  DATE: Tue Jul 11 18:34:53 ART 2017
                  SOURCE: /Users/Gustavo/Desktop/laboratorio/reservando/app/views/clientNav.scala.html
                  HASH: 421ae4cbdc8519c0170179c11af23868d6a12c47
                  MATRIX: 755->1|870->21|897->22|1145->244|1200->279|1279->332|1340->373|1418->425|1474->461|1544->505|1596->537
                  LINES: 27->1|32->1|33->2|37->6|37->6|38->7|38->7|39->8|39->8|40->9|40->9
                  -- GENERATED --
              */
          