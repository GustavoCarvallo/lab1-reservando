
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ownerMyOrders_Scope0 {
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

class ownerMyOrders extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
"""),_display_(/*2.2*/views/*2.7*/.html.main("Reservando")/*2.31*/ {_display_(Seq[Any](format.raw/*2.33*/("""
    """),_display_(/*3.6*/ownerNav(messages)),format.raw/*3.24*/("""
    """),_display_(/*4.6*/languageSelector(messages)),format.raw/*4.32*/("""
    """),format.raw/*5.5*/("""<div class="container" ng-controller="MyOrdersCtrl">
        <div class="row title">
            <h3>"""),_display_(/*7.18*/Messages("owner.my.orders.my.orders")),format.raw/*7.55*/("""</h3>
        </div>
        <div class="row title" ng-show="orders.length == 0">
            <h4>"""),_display_(/*10.18*/Messages("owner.my.orders.no.orders")),format.raw/*10.55*/("""</h4>
        </div>
        <div class="row" ng-show="orders.length != 0">
            <ul class="collapsible popout" data-collapsible="accordion">
                <li ng-repeat="order in orders | filter: filterByPage">
                    <div class="collapsible-header" ng-class=""""),format.raw/*15.63*/("""{"""),format.raw/*15.64*/("""'active': $first"""),format.raw/*15.80*/("""}"""),format.raw/*15.81*/(""""><i class="material-icons"><i class="material-icons">local_shipping</i></i>"""),format.raw/*15.157*/("""{"""),format.raw/*15.158*/("""{"""),format.raw/*15.159*/("""order.delivery.name"""),format.raw/*15.178*/("""}"""),format.raw/*15.179*/("""}"""),format.raw/*15.180*/(""" """),format.raw/*15.181*/("""-  """),format.raw/*15.184*/("""{"""),format.raw/*15.185*/("""{"""),format.raw/*15.186*/("""getDateTimeFormat(order.timePlaced)"""),format.raw/*15.221*/("""}"""),format.raw/*15.222*/("""}"""),format.raw/*15.223*/("""<span class="right" ng-show="isExpire(order)">"""),_display_(/*15.270*/Messages("owner.my.orders.finished")),format.raw/*15.306*/("""</span></div>
                    <div class="collapsible-body container">
                        <div class="row">
                            <div class="col s6">
                                <div class="row">
                                    <h5>"""),_display_(/*20.42*/Messages("owner.my.orders.client")),format.raw/*20.76*/("""</h5>
                                    <h6>"""),format.raw/*21.41*/("""{"""),format.raw/*21.42*/("""{"""),format.raw/*21.43*/("""order.clientName"""),format.raw/*21.59*/("""}"""),format.raw/*21.60*/("""}"""),format.raw/*21.61*/("""</h6>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s6">
                                <div class="row"><h5>"""),_display_(/*27.55*/Messages("owner.my.orders.info")),format.raw/*27.87*/("""</h5></div>
                                <div class="row">
                                    <table>
                                        <tbody>
                                            <tr>
                                                <td>"""),_display_(/*32.54*/Messages("owner.my.orders.delivery.address")),format.raw/*32.98*/("""</td>
                                                <td>"""),format.raw/*33.53*/("""{"""),format.raw/*33.54*/("""{"""),format.raw/*33.55*/("""order.address"""),format.raw/*33.68*/("""}"""),format.raw/*33.69*/("""}"""),format.raw/*33.70*/("""</td>
                                            </tr>
                                            <tr ng-show="order.discount">
                                                <td>"""),_display_(/*36.54*/Messages("owner.my.orders.discount.code")),format.raw/*36.95*/("""</td>
                                                <td>"""),format.raw/*37.53*/("""{"""),format.raw/*37.54*/("""{"""),format.raw/*37.55*/("""order.discount.code"""),format.raw/*37.74*/("""}"""),format.raw/*37.75*/("""}"""),format.raw/*37.76*/(""" """),format.raw/*37.77*/("""- """),format.raw/*37.79*/("""{"""),format.raw/*37.80*/("""{"""),format.raw/*37.81*/("""order.discount.discount"""),format.raw/*37.104*/("""}"""),format.raw/*37.105*/("""}"""),format.raw/*37.106*/("""%</td>
                                            </tr>
                                            <tr>
                                                <td>"""),_display_(/*40.54*/Messages("owner.my.orders.total.price")),format.raw/*40.93*/("""</td>
                                                <td>$"""),format.raw/*41.54*/("""{"""),format.raw/*41.55*/("""{"""),format.raw/*41.56*/("""calculateTotal(order)"""),format.raw/*41.77*/("""}"""),format.raw/*41.78*/("""}"""),format.raw/*41.79*/("""</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="col s6">
                                <div class="row"><h5>"""),_display_(/*48.55*/Messages("owner.my.orders.meals")),format.raw/*48.88*/("""</h5></div>
                                <div class="row">
                                    <table>
                                        <thead>
                                            <tr>
                                                <td>"""),_display_(/*53.54*/Messages("owner.my.orders.meals")),format.raw/*53.87*/("""</td>
                                                <td>"""),_display_(/*54.54*/Messages("owner.my.orders.name")),format.raw/*54.86*/("""</td>
                                                <td>"""),_display_(/*55.54*/Messages("owner.my.orders.price")),format.raw/*55.87*/("""</td>
                                                <td>"""),_display_(/*56.54*/Messages("owner.my.orders.quantity")),format.raw/*56.90*/("""</td>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr ng-repeat="orderMeal in order.meals">
                                                <td></td>
                                                <td>"""),format.raw/*62.53*/("""{"""),format.raw/*62.54*/("""{"""),format.raw/*62.55*/("""orderMeal.meal.name"""),format.raw/*62.74*/("""}"""),format.raw/*62.75*/("""}"""),format.raw/*62.76*/("""</td>
                                                <td>$"""),format.raw/*63.54*/("""{"""),format.raw/*63.55*/("""{"""),format.raw/*63.56*/("""orderMeal.meal.price"""),format.raw/*63.76*/("""}"""),format.raw/*63.77*/("""}"""),format.raw/*63.78*/("""</td>
                                                <td>"""),format.raw/*64.53*/("""{"""),format.raw/*64.54*/("""{"""),format.raw/*64.55*/("""orderMeal.amount"""),format.raw/*64.71*/("""}"""),format.raw/*64.72*/("""}"""),format.raw/*64.73*/("""</td>
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
""")))}/*89.2*/ {_display_(Seq[Any](format.raw/*89.4*/("""
    """),format.raw/*90.5*/("""<link rel="stylesheet" href=""""),_display_(/*90.35*/routes/*90.41*/.Assets.versioned("stylesheets/client/newOrder.css")),format.raw/*90.93*/("""">
    <link rel="stylesheet" href=""""),_display_(/*91.35*/routes/*91.41*/.Assets.versioned("stylesheets/client/myOrders.css")),format.raw/*91.93*/("""">
""")))}/*92.2*/ {_display_(Seq[Any](format.raw/*92.4*/("""
    """),format.raw/*93.5*/("""<script src=""""),_display_(/*93.19*/routes/*93.25*/.Assets.versioned("javascripts/owner/myOrders.js")),format.raw/*93.75*/(""""></script>
    <script src=""""),_display_(/*94.19*/routes/*94.25*/.Assets.versioned("javascripts/languageSelector.js")),format.raw/*94.77*/(""""></script>
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
object ownerMyOrders extends ownerMyOrders_Scope0.ownerMyOrders
              /*
                  -- GENERATED --
                  DATE: Thu Jul 20 21:49:14 ART 2017
                  SOURCE: /Users/Gustavo/Desktop/laboratorio/reservando/app/views/ownerMyOrders.scala.html
                  HASH: dc8f9cbb86d089cbd8b7a56d43acd4d2d32ddbe9
                  MATRIX: 763->1|878->21|905->23|917->28|949->52|988->54|1019->60|1057->78|1088->84|1134->110|1165->115|1293->217|1350->254|1476->353|1534->390|1845->673|1874->674|1918->690|1947->691|2052->767|2082->768|2112->769|2160->788|2190->789|2220->790|2250->791|2282->794|2312->795|2342->796|2406->831|2436->832|2466->833|2541->880|2599->916|2883->1173|2938->1207|3012->1253|3041->1254|3070->1255|3114->1271|3143->1272|3172->1273|3455->1529|3508->1561|3791->1817|3856->1861|3942->1919|3971->1920|4000->1921|4041->1934|4070->1935|4099->1936|4309->2119|4371->2160|4457->2218|4486->2219|4515->2220|4562->2239|4591->2240|4620->2241|4649->2242|4679->2244|4708->2245|4737->2246|4789->2269|4819->2270|4849->2271|5035->2430|5095->2469|5182->2528|5211->2529|5240->2530|5289->2551|5318->2552|5347->2553|5701->2880|5755->2913|6038->3169|6092->3202|6178->3261|6231->3293|6317->3352|6371->3385|6457->3444|6514->3480|6891->3829|6920->3830|6949->3831|6996->3850|7025->3851|7054->3852|7141->3911|7170->3912|7199->3913|7247->3933|7276->3934|7305->3935|7391->3993|7420->3994|7449->3995|7493->4011|7522->4012|7551->4013|8346->4790|8385->4792|8417->4797|8474->4827|8489->4833|8562->4885|8626->4922|8641->4928|8714->4980|8736->4984|8775->4986|8807->4991|8848->5005|8863->5011|8934->5061|8991->5091|9006->5097|9079->5149
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|34->3|34->3|35->4|35->4|36->5|38->7|38->7|41->10|41->10|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|51->20|51->20|52->21|52->21|52->21|52->21|52->21|52->21|58->27|58->27|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|67->36|67->36|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|71->40|71->40|72->41|72->41|72->41|72->41|72->41|72->41|79->48|79->48|84->53|84->53|85->54|85->54|86->55|86->55|87->56|87->56|93->62|93->62|93->62|93->62|93->62|93->62|94->63|94->63|94->63|94->63|94->63|94->63|95->64|95->64|95->64|95->64|95->64|95->64|120->89|120->89|121->90|121->90|121->90|121->90|122->91|122->91|122->91|123->92|123->92|124->93|124->93|124->93|124->93|125->94|125->94|125->94
                  -- GENERATED --
              */
          