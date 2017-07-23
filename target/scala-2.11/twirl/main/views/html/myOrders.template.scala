
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object myOrders_Scope0 {
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

class myOrders extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
"""),_display_(/*2.2*/views/*2.7*/.html.main("Reservando")/*2.31*/ {_display_(Seq[Any](format.raw/*2.33*/("""
    """),_display_(/*3.6*/clientNav(messages)),format.raw/*3.25*/("""
    """),_display_(/*4.6*/languageSelector(messages)),format.raw/*4.32*/("""
    """),format.raw/*5.5*/("""<div class="container" ng-controller="MyOrdersCtrl">
        <div class="row title">
            <h3>"""),_display_(/*7.18*/Messages("client.orders.my.orders")),format.raw/*7.53*/("""</h3>
        </div>
        <div class="row title" ng-show="orders.length == 0">
            <h4>"""),_display_(/*10.18*/Messages("client.orders.no.orders")),format.raw/*10.53*/("""</h4>
        </div>
        <div class="row" ng-show="orders.length != 0">
            <ul class="collapsible popout" data-collapsible="accordion">
                <li ng-repeat="order in orders | filter: filterByPage">
                    <div class="collapsible-header" ng-class=""""),format.raw/*15.63*/("""{"""),format.raw/*15.64*/("""'active': $first"""),format.raw/*15.80*/("""}"""),format.raw/*15.81*/(""""><i class="material-icons"><i class="material-icons">local_shipping</i></i>"""),format.raw/*15.157*/("""{"""),format.raw/*15.158*/("""{"""),format.raw/*15.159*/("""order.delivery.name"""),format.raw/*15.178*/("""}"""),format.raw/*15.179*/("""}"""),format.raw/*15.180*/("""  """),format.raw/*15.182*/("""-  """),format.raw/*15.185*/("""{"""),format.raw/*15.186*/("""{"""),format.raw/*15.187*/("""getDateTimeFormat(order.timePlaced)"""),format.raw/*15.222*/("""}"""),format.raw/*15.223*/("""}"""),format.raw/*15.224*/(""" """),format.raw/*15.225*/("""<span class="right" ng-show="isExpire(order)">"""),_display_(/*15.272*/Messages("client.orders.finished")),format.raw/*15.306*/("""</span></div>
                    <div class="collapsible-body container">
                        <div class="row">
                            <div class="col s6">
                                <div class="row"><h5>"""),_display_(/*19.55*/Messages("client.orders.info")),format.raw/*19.85*/("""</h5></div>
                                <div class="row">
                                    <table>
                                        <tbody>
                                            <tr>
                                                <td>"""),_display_(/*24.54*/Messages("client.orders.delivery.address")),format.raw/*24.96*/("""</td>
                                                <td>"""),format.raw/*25.53*/("""{"""),format.raw/*25.54*/("""{"""),format.raw/*25.55*/("""order.address"""),format.raw/*25.68*/("""}"""),format.raw/*25.69*/("""}"""),format.raw/*25.70*/("""</td>
                                            </tr>
                                            <tr ng-show="order.discount">
                                                <td>"""),_display_(/*28.54*/Messages("client.orders.discount.code")),format.raw/*28.93*/("""</td>
                                                <td>"""),format.raw/*29.53*/("""{"""),format.raw/*29.54*/("""{"""),format.raw/*29.55*/("""order.discount.code"""),format.raw/*29.74*/("""}"""),format.raw/*29.75*/("""}"""),format.raw/*29.76*/(""" """),format.raw/*29.77*/("""- """),format.raw/*29.79*/("""{"""),format.raw/*29.80*/("""{"""),format.raw/*29.81*/("""order.discount.discount"""),format.raw/*29.104*/("""}"""),format.raw/*29.105*/("""}"""),format.raw/*29.106*/("""%</td>
                                            </tr>
                                            <tr>
                                                <td>"""),_display_(/*32.54*/Messages("client.orders.total.price")),format.raw/*32.91*/("""</td>
                                                <td>$"""),format.raw/*33.54*/("""{"""),format.raw/*33.55*/("""{"""),format.raw/*33.56*/("""calculateTotal(order)"""),format.raw/*33.77*/("""}"""),format.raw/*33.78*/("""}"""),format.raw/*33.79*/("""</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="col s6">
                                <div class="row"><h5>"""),_display_(/*40.55*/Messages("client.orders.foods")),format.raw/*40.86*/("""</h5></div>
                                <div class="row">
                                    <table>
                                        <thead>
                                            <tr>
                                                <td>"""),_display_(/*45.54*/Messages("client.orders.foods")),format.raw/*45.85*/("""</td>
                                                <td>"""),_display_(/*46.54*/Messages("client.orders.name")),format.raw/*46.84*/("""</td>
                                                <td>"""),_display_(/*47.54*/Messages("client.orders.price")),format.raw/*47.85*/("""</td>
                                                <td>"""),_display_(/*48.54*/Messages("client.orders.quantity")),format.raw/*48.88*/("""</td>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr ng-repeat="orderMeal in order.meals">
                                                <td></td>
                                                <td>"""),format.raw/*54.53*/("""{"""),format.raw/*54.54*/("""{"""),format.raw/*54.55*/("""orderMeal.meal.name"""),format.raw/*54.74*/("""}"""),format.raw/*54.75*/("""}"""),format.raw/*54.76*/("""</td>
                                                <td>$"""),format.raw/*55.54*/("""{"""),format.raw/*55.55*/("""{"""),format.raw/*55.56*/("""orderMeal.meal.price"""),format.raw/*55.76*/("""}"""),format.raw/*55.77*/("""}"""),format.raw/*55.78*/("""</td>
                                                <td>"""),format.raw/*56.53*/("""{"""),format.raw/*56.54*/("""{"""),format.raw/*56.55*/("""orderMeal.amount"""),format.raw/*56.71*/("""}"""),format.raw/*56.72*/("""}"""),format.raw/*56.73*/("""</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
        <div class="row center-align" ng-show="orders.length != 0">
            <pagination
                page="1"
                page-size="9"
                total="orders.length"
                show-prev-next="true"
                use-simple-prev-next="false"
                dots="...."
                hide-if-empty="true"
                adjacent="2"
                scroll-top="false"
                pagination-action="changePage(page)" />
        </div>
    </div>
""")))}/*81.2*/ {_display_(Seq[Any](format.raw/*81.4*/("""
    """),format.raw/*82.5*/("""<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href=""""),_display_(/*83.35*/routes/*83.41*/.Assets.versioned("stylesheets/client/newOrder.css")),format.raw/*83.93*/("""">
    <link rel="stylesheet" href=""""),_display_(/*84.35*/routes/*84.41*/.Assets.versioned("stylesheets/client/myOrders.css")),format.raw/*84.93*/("""">
""")))}/*85.2*/ {_display_(Seq[Any](format.raw/*85.4*/("""
    """),format.raw/*86.5*/("""<script src=""""),_display_(/*86.19*/routes/*86.25*/.Assets.versioned("javascripts/client/myOrders.js")),format.raw/*86.76*/(""""></script>
    <script src=""""),_display_(/*87.19*/routes/*87.25*/.Assets.versioned("javascripts/languageSelector.js")),format.raw/*87.77*/(""""></script>
""")))}))
      }
    }
  }

  def render(messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(messages)

  def f:((Messages) => play.twirl.api.HtmlFormat.Appendable) = (messages) => apply(messages)

  def ref: this.type = this

}


}

/**/
object myOrders extends myOrders_Scope0.myOrders
              /*
                  -- GENERATED --
                  DATE: Thu Jul 20 21:43:46 ART 2017
                  SOURCE: /Users/Gustavo/Desktop/laboratorio/reservando/app/views/myOrders.scala.html
                  HASH: ba8b1aa61c79f0ca6e8491d77683b8b428b90a61
                  MATRIX: 753->1|868->21|895->23|907->28|939->52|978->54|1009->60|1048->79|1079->85|1125->111|1156->116|1284->218|1339->253|1465->352|1521->387|1832->670|1861->671|1905->687|1934->688|2039->764|2069->765|2099->766|2147->785|2177->786|2207->787|2238->789|2270->792|2300->793|2330->794|2394->829|2424->830|2454->831|2484->832|2559->879|2615->913|2862->1133|2913->1163|3196->1419|3259->1461|3345->1519|3374->1520|3403->1521|3444->1534|3473->1535|3502->1536|3712->1719|3772->1758|3858->1816|3887->1817|3916->1818|3963->1837|3992->1838|4021->1839|4050->1840|4080->1842|4109->1843|4138->1844|4190->1867|4220->1868|4250->1869|4436->2028|4494->2065|4581->2124|4610->2125|4639->2126|4688->2147|4717->2148|4746->2149|5100->2476|5152->2507|5435->2763|5487->2794|5573->2853|5624->2883|5710->2942|5762->2973|5848->3032|5903->3066|6280->3415|6309->3416|6338->3417|6385->3436|6414->3437|6443->3438|6530->3497|6559->3498|6588->3499|6636->3519|6665->3520|6694->3521|6780->3579|6809->3580|6838->3581|6882->3597|6911->3598|6940->3599|7775->4416|7814->4418|7846->4423|7994->4544|8009->4550|8082->4602|8146->4639|8161->4645|8234->4697|8256->4701|8295->4703|8327->4708|8368->4722|8383->4728|8455->4779|8512->4809|8527->4815|8600->4867
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|34->3|34->3|35->4|35->4|36->5|38->7|38->7|41->10|41->10|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|50->19|50->19|55->24|55->24|56->25|56->25|56->25|56->25|56->25|56->25|59->28|59->28|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|71->40|71->40|76->45|76->45|77->46|77->46|78->47|78->47|79->48|79->48|85->54|85->54|85->54|85->54|85->54|85->54|86->55|86->55|86->55|86->55|86->55|86->55|87->56|87->56|87->56|87->56|87->56|87->56|112->81|112->81|113->82|114->83|114->83|114->83|115->84|115->84|115->84|116->85|116->85|117->86|117->86|117->86|117->86|118->87|118->87|118->87
                  -- GENERATED --
              */
          