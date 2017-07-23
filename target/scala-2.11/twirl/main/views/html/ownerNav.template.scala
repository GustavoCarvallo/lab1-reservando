
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ownerNav_Scope0 {
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

class ownerNav extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
"""),format.raw/*2.1*/("""<!-- Dropdown Structure -->
<ul id="restaurantDropdown" class="dropdown-content owenr">
    <li><a href="/owner/restaurants">"""),_display_(/*4.39*/Messages("owner.navBar.my.restaurants")),format.raw/*4.78*/("""</a></li>
    <li class="divider"></li>
    <li><a href="/owner/new-restaurant">"""),_display_(/*6.42*/Messages("owner.navBar.new.restaurant")),format.raw/*6.81*/("""</a></li>
</ul>
<nav class="red darken-1">
    <div class="nav-wrapper">
        <a href="/owner/home" class="brand-logo">Reservando</a>
        <ul id="nav-mobile" class="right hide-on-med-and-down">
            <li><a class="dropdown-button" href="#!" data-activates="restaurantDropdown">"""),_display_(/*12.91*/Messages("owner.navBar.restaurants")),format.raw/*12.127*/("""</a></li>
            <li><a href="/owner/my-orders">"""),_display_(/*13.45*/Messages("owner.navBar.orders")),format.raw/*13.76*/("""</a></li>
            <li><a href="/owner/my-reservations">"""),_display_(/*14.51*/Messages("owner.navBar.reservations")),format.raw/*14.88*/("""</a></li>
            <li><a href="/owner/profile">"""),_display_(/*15.43*/Messages("owner.navBar.profile")),format.raw/*15.75*/("""</a></li>
            <li><a href="/logout">"""),_display_(/*16.36*/Messages("owner.navBar.logout")),format.raw/*16.67*/("""</a></li>
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
object ownerNav extends ownerNav_Scope0.ownerNav
              /*
                  -- GENERATED --
                  DATE: Tue Jul 11 18:34:54 ART 2017
                  SOURCE: /Users/Gustavo/Desktop/laboratorio/reservando/app/views/ownerNav.scala.html
                  HASH: 14baa3dce70daf34b053266b190d0719025ce60e
                  MATRIX: 753->1|868->21|895->22|1047->148|1106->187|1213->268|1272->307|1590->598|1648->634|1729->688|1781->719|1868->779|1926->816|2005->868|2058->900|2130->945|2182->976
                  LINES: 27->1|32->1|33->2|35->4|35->4|37->6|37->6|43->12|43->12|44->13|44->13|45->14|45->14|46->15|46->15|47->16|47->16
                  -- GENERATED --
              */
          