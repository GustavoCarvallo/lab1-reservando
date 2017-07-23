
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object myReservations_Scope0 {
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

class myReservations extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
"""),_display_(/*2.2*/views/*2.7*/.html.main("Reservando")/*2.31*/ {_display_(Seq[Any](format.raw/*2.33*/("""
    """),_display_(/*3.6*/clientNav(messages)),format.raw/*3.25*/("""
    """),_display_(/*4.6*/languageSelector(messages)),format.raw/*4.32*/("""
    """),format.raw/*5.5*/("""<div class="container" ng-controller="MyReservationsCtrl">
        <div class="row title">
            <h3>"""),_display_(/*7.18*/Messages("client.reservations.my.reservations")),format.raw/*7.65*/("""</h3>
        </div>
        <div class="row title" ng-show="reservations.length == 0">
            <h4>"""),_display_(/*10.18*/Messages("client.reservations.no.reservations")),format.raw/*10.65*/("""</h4>
        </div>
        <div class="row" ng-show="reservations.length != 0">
            <ul class="collapsible popout" data-collapsible="accordion">
                <li ng-repeat="reservation in reservations | filter: filterByPage">
                    <div class="collapsible-header" ng-class=""""),format.raw/*15.63*/("""{"""),format.raw/*15.64*/("""'active': $first"""),format.raw/*15.80*/("""}"""),format.raw/*15.81*/(""""><i class="material-icons"><i class="material-icons">restaurant</i></i>"""),format.raw/*15.153*/("""{"""),format.raw/*15.154*/("""{"""),format.raw/*15.155*/("""reservation.local.name"""),format.raw/*15.177*/("""}"""),format.raw/*15.178*/("""}"""),format.raw/*15.179*/("""  """),format.raw/*15.181*/("""-  """),format.raw/*15.184*/("""{"""),format.raw/*15.185*/("""{"""),format.raw/*15.186*/("""getDateTimeFormat(reservation.date)"""),format.raw/*15.221*/("""}"""),format.raw/*15.222*/("""}"""),format.raw/*15.223*/("""<span class="right" ng-show="isExpire(reservation)">"""),_display_(/*15.276*/Messages("client.reservations.finished")),format.raw/*15.316*/("""</span></div>
                    <div class="collapsible-body container">
                        <div class="row">
                            <div class="col s12">
                                <div class="row"><h5>"""),_display_(/*19.55*/Messages("client.reservations.info")),format.raw/*19.91*/("""</h5></div>
                                <div class="row">
                                    <table>
                                        <tbody>
                                            <tr>
                                                <td>"""),_display_(/*24.54*/Messages("client.reservations.date")),format.raw/*24.90*/("""</td>
                                                <td>"""),format.raw/*25.53*/("""{"""),format.raw/*25.54*/("""{"""),format.raw/*25.55*/("""getDate(reservation.date)"""),format.raw/*25.80*/("""}"""),format.raw/*25.81*/("""}"""),format.raw/*25.82*/("""</td>
                                                <td>"""),_display_(/*26.54*/Messages("client.reservations.address")),format.raw/*26.93*/("""</td>
                                                <td>"""),format.raw/*27.53*/("""{"""),format.raw/*27.54*/("""{"""),format.raw/*27.55*/("""reservation.local.address.completeAddress"""),format.raw/*27.96*/("""}"""),format.raw/*27.97*/("""}"""),format.raw/*27.98*/("""</td>
                                            </tr>
                                            <tr>
                                                <td>"""),_display_(/*30.54*/Messages("client.reservations.hour")),format.raw/*30.90*/("""</td>
                                                <td>"""),format.raw/*31.53*/("""{"""),format.raw/*31.54*/("""{"""),format.raw/*31.55*/("""getTime(reservation.date)"""),format.raw/*31.80*/("""}"""),format.raw/*31.81*/("""}"""),format.raw/*31.82*/("""</td>
                                                <td>"""),_display_(/*32.54*/Messages("client.reservations.amount.of.people")),format.raw/*32.102*/("""</td>
                                                <td>"""),format.raw/*33.53*/("""{"""),format.raw/*33.54*/("""{"""),format.raw/*33.55*/("""reservation.amount"""),format.raw/*33.73*/("""}"""),format.raw/*33.74*/("""}"""),format.raw/*33.75*/("""</td>
                                            </tr>
                                            <tr ng-show="reservation.discount">
                                                <td>"""),_display_(/*36.54*/Messages("client.reservations.discount.code")),format.raw/*36.99*/("""</td>
                                                <td>"""),format.raw/*37.53*/("""{"""),format.raw/*37.54*/("""{"""),format.raw/*37.55*/("""reservation.discount.code"""),format.raw/*37.80*/("""}"""),format.raw/*37.81*/("""}"""),format.raw/*37.82*/(""" """),format.raw/*37.83*/("""- """),format.raw/*37.85*/("""{"""),format.raw/*37.86*/("""{"""),format.raw/*37.87*/("""reservation.discount.discount"""),format.raw/*37.116*/("""}"""),format.raw/*37.117*/("""}"""),format.raw/*37.118*/("""%</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <div class="row" ng-hide="isExpire(reservation)">
                                    <div class="col s6"><div class="btn btn-large fullBtn" ng-click="toRestaurant(reservation)">"""),_display_(/*43.130*/Messages("client.reservations.view.restaurant")),format.raw/*43.177*/("""</div></div>
                                    <div class="col s6"><div class="btn btn-large red fullBtn" ng-click="deleteReservation(reservation, $index)">"""),_display_(/*44.147*/Messages("client.reservations.cancel.reservation")),format.raw/*44.197*/("""</div></div>
                                </div>
                                <div class="row" ng-show="isExpire(reservation)">
                                    <div class="col s6 offset-s3"><div class="btn btn-large fullBtn" ng-click="toRestaurant(reservation)">"""),_display_(/*47.140*/Messages("client.reservations.view.restaurant")),format.raw/*47.187*/("""</div></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
        <div class="row center-align" ng-show="reservations.length != 0">
            <pagination
            page="1"
            page-size="9"
            total="reservations.length"
            show-prev-next="true"
            use-simple-prev-next="false"
            dots="...."
            hide-if-empty="true"
            adjacent="2"
            scroll-top="false"
            pagination-action="changePage(page)" />
        </div>
    </div>
""")))}/*69.2*/ {_display_(Seq[Any](format.raw/*69.4*/("""
    """),format.raw/*70.5*/("""<link rel="stylesheet" href=""""),_display_(/*70.35*/routes/*70.41*/.Assets.versioned("stylesheets/client/newOrder.css")),format.raw/*70.93*/("""">
    <link rel="stylesheet" href=""""),_display_(/*71.35*/routes/*71.41*/.Assets.versioned("stylesheets/client/myOrders.css")),format.raw/*71.93*/("""">
""")))}/*72.2*/ {_display_(Seq[Any](format.raw/*72.4*/("""
    """),format.raw/*73.5*/("""<script src=""""),_display_(/*73.19*/routes/*73.25*/.Assets.versioned("javascripts/client/myReservations.js")),format.raw/*73.82*/(""""></script>
    <script src=""""),_display_(/*74.19*/routes/*74.25*/.Assets.versioned("javascripts/languageSelector.js")),format.raw/*74.77*/(""""></script>
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
object myReservations extends myReservations_Scope0.myReservations
              /*
                  -- GENERATED --
                  DATE: Thu Jul 20 21:45:58 ART 2017
                  SOURCE: /Users/Gustavo/Desktop/laboratorio/reservando/app/views/myReservations.scala.html
                  HASH: 4e9d8ac862e7dec03a855911dc8c4e35d90e740a
                  MATRIX: 765->1|880->21|907->23|919->28|951->52|990->54|1021->60|1060->79|1091->85|1137->111|1168->116|1302->224|1369->271|1501->376|1569->423|1898->724|1927->725|1971->741|2000->742|2101->814|2131->815|2161->816|2212->838|2242->839|2272->840|2303->842|2335->845|2365->846|2395->847|2459->882|2489->883|2519->884|2600->937|2662->977|2910->1198|2967->1234|3250->1490|3307->1526|3393->1584|3422->1585|3451->1586|3504->1611|3533->1612|3562->1613|3648->1672|3708->1711|3794->1769|3823->1770|3852->1771|3921->1812|3950->1813|3979->1814|4164->1972|4221->2008|4307->2066|4336->2067|4365->2068|4418->2093|4447->2094|4476->2095|4562->2154|4632->2202|4718->2260|4747->2261|4776->2262|4822->2280|4851->2281|4880->2282|5096->2471|5162->2516|5248->2574|5277->2575|5306->2576|5359->2601|5388->2602|5417->2603|5446->2604|5476->2606|5505->2607|5534->2608|5592->2637|5622->2638|5652->2639|6081->3040|6150->3087|6337->3246|6409->3296|6710->3569|6779->3616|7449->4268|7488->4270|7520->4275|7577->4305|7592->4311|7665->4363|7729->4400|7744->4406|7817->4458|7839->4462|7878->4464|7910->4469|7951->4483|7966->4489|8044->4546|8101->4576|8116->4582|8189->4634
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|34->3|34->3|35->4|35->4|36->5|38->7|38->7|41->10|41->10|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|50->19|50->19|55->24|55->24|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|67->36|67->36|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|74->43|74->43|75->44|75->44|78->47|78->47|100->69|100->69|101->70|101->70|101->70|101->70|102->71|102->71|102->71|103->72|103->72|104->73|104->73|104->73|104->73|105->74|105->74|105->74
                  -- GENERATED --
              */
          