
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ownerMyReservations_Scope0 {
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

class ownerMyReservations extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
"""),_display_(/*2.2*/views/*2.7*/.html.main("Reservando")/*2.31*/ {_display_(Seq[Any](format.raw/*2.33*/("""
    """),_display_(/*3.6*/ownerNav(messages)),format.raw/*3.24*/("""
    """),_display_(/*4.6*/languageSelector(messages)),format.raw/*4.32*/("""
    """),format.raw/*5.5*/("""<div class="container" ng-controller="MyReservationsCtrl">
        <div class="row title">
            <h3>"""),_display_(/*7.18*/Messages("owner.my.reservations.my.reservations")),format.raw/*7.67*/("""</h3>
        </div>
        <div class="row title" ng-show="reservations.length == 0">
            <h4>"""),_display_(/*10.18*/Messages("owner.my.reservations.no.reservation")),format.raw/*10.66*/("""</h4>
        </div>
        <div class="row" ng-show="reservations.length != 0">
            <ul class="collapsible popout" data-collapsible="accordion">
                <li ng-repeat="reservation in reservations | filter: filterByPage">
                    <div class="collapsible-header" ng-class=""""),format.raw/*15.63*/("""{"""),format.raw/*15.64*/("""'active': $first"""),format.raw/*15.80*/("""}"""),format.raw/*15.81*/(""""><i class="material-icons"><i class="material-icons">restaurant</i></i>"""),format.raw/*15.153*/("""{"""),format.raw/*15.154*/("""{"""),format.raw/*15.155*/("""reservation.local.name"""),format.raw/*15.177*/("""}"""),format.raw/*15.178*/("""}"""),format.raw/*15.179*/("""  """),format.raw/*15.181*/("""-  """),format.raw/*15.184*/("""{"""),format.raw/*15.185*/("""{"""),format.raw/*15.186*/("""getDateTimeFormat(reservation.date)"""),format.raw/*15.221*/("""}"""),format.raw/*15.222*/("""}"""),format.raw/*15.223*/("""<span class="right" ng-show="isExpire(reservation)">"""),_display_(/*15.276*/Messages("owner.my.reservations.finished")),format.raw/*15.318*/("""</span></div>
                    <div class="collapsible-body container">
                        <div class="row">
                            <div class="col s12">
                                <div class="row"><h5>"""),_display_(/*19.55*/Messages("owner.my.reservations.info")),format.raw/*19.93*/("""</h5></div>
                                <div class="row">
                                    <table>
                                        <tbody>
                                            <tr>
                                                <td>"""),_display_(/*24.54*/Messages("owner.my.reservations.date")),format.raw/*24.92*/("""</td>
                                                <td>"""),format.raw/*25.53*/("""{"""),format.raw/*25.54*/("""{"""),format.raw/*25.55*/("""getDate(reservation.date)"""),format.raw/*25.80*/("""}"""),format.raw/*25.81*/("""}"""),format.raw/*25.82*/("""</td>
                                                <td>"""),_display_(/*26.54*/Messages("owner.my.reservations.address")),format.raw/*26.95*/("""</td>
                                                <td>"""),format.raw/*27.53*/("""{"""),format.raw/*27.54*/("""{"""),format.raw/*27.55*/("""reservation.local.address.completeAddress"""),format.raw/*27.96*/("""}"""),format.raw/*27.97*/("""}"""),format.raw/*27.98*/("""</td>
                                            </tr>
                                            <tr>
                                                <td>"""),_display_(/*30.54*/Messages("owner.my.reservations.time")),format.raw/*30.92*/("""</td>
                                                <td>"""),format.raw/*31.53*/("""{"""),format.raw/*31.54*/("""{"""),format.raw/*31.55*/("""getTime(reservation.date)"""),format.raw/*31.80*/("""}"""),format.raw/*31.81*/("""}"""),format.raw/*31.82*/("""</td>
                                                <td>"""),_display_(/*32.54*/Messages("owner.my.reservations.amount.of.people")),format.raw/*32.104*/("""</td>
                                                <td>"""),format.raw/*33.53*/("""{"""),format.raw/*33.54*/("""{"""),format.raw/*33.55*/("""reservation.amount"""),format.raw/*33.73*/("""}"""),format.raw/*33.74*/("""}"""),format.raw/*33.75*/("""</td>
                                            </tr>
                                            <tr ng-show="reservation.discount">
                                                <td>"""),_display_(/*36.54*/Messages("owner.my.reservations.discount.code")),format.raw/*36.101*/("""</td>
                                                <td>"""),format.raw/*37.53*/("""{"""),format.raw/*37.54*/("""{"""),format.raw/*37.55*/("""reservation.discount.code"""),format.raw/*37.80*/("""}"""),format.raw/*37.81*/("""}"""),format.raw/*37.82*/(""" """),format.raw/*37.83*/("""- """),format.raw/*37.85*/("""{"""),format.raw/*37.86*/("""{"""),format.raw/*37.87*/("""reservation.discount.discount"""),format.raw/*37.116*/("""}"""),format.raw/*37.117*/("""}"""),format.raw/*37.118*/("""%</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                                <div class="row">
                                    <div class="col s6 offset-s3"><div class="btn btn-large fullBtn" ng-click="toRestaurant(reservation)">"""),_display_(/*43.140*/Messages("owner.my.reservations.view.restaurant")),format.raw/*43.189*/("""</div></div>
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
""")))}/*65.2*/ {_display_(Seq[Any](format.raw/*65.4*/("""
    """),format.raw/*66.5*/("""<link rel="stylesheet" href=""""),_display_(/*66.35*/routes/*66.41*/.Assets.versioned("stylesheets/client/newOrder.css")),format.raw/*66.93*/("""">
    <link rel="stylesheet" href=""""),_display_(/*67.35*/routes/*67.41*/.Assets.versioned("stylesheets/client/myOrders.css")),format.raw/*67.93*/("""">
""")))}/*68.2*/ {_display_(Seq[Any](format.raw/*68.4*/("""
    """),format.raw/*69.5*/("""<script src=""""),_display_(/*69.19*/routes/*69.25*/.Assets.versioned("javascripts/owner/myReservations.js")),format.raw/*69.81*/(""""></script>
    <script src=""""),_display_(/*70.19*/routes/*70.25*/.Assets.versioned("javascripts/languageSelector.js")),format.raw/*70.77*/(""""></script>
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
object ownerMyReservations extends ownerMyReservations_Scope0.ownerMyReservations
              /*
                  -- GENERATED --
                  DATE: Thu Jul 20 21:49:54 ART 2017
                  SOURCE: /Users/Gustavo/Desktop/laboratorio/reservando/app/views/ownerMyReservations.scala.html
                  HASH: 61458c0c55d9c8a88279414c29f1500487dd0d10
                  MATRIX: 775->1|890->21|917->23|929->28|961->52|1000->54|1031->60|1069->78|1100->84|1146->110|1177->115|1311->223|1380->272|1512->377|1581->425|1910->726|1939->727|1983->743|2012->744|2113->816|2143->817|2173->818|2224->840|2254->841|2284->842|2315->844|2347->847|2377->848|2407->849|2471->884|2501->885|2531->886|2612->939|2676->981|2924->1202|2983->1240|3266->1496|3325->1534|3411->1592|3440->1593|3469->1594|3522->1619|3551->1620|3580->1621|3666->1680|3728->1721|3814->1779|3843->1780|3872->1781|3941->1822|3970->1823|3999->1824|4184->1982|4243->2020|4329->2078|4358->2079|4387->2080|4440->2105|4469->2106|4498->2107|4584->2166|4656->2216|4742->2274|4771->2275|4800->2276|4846->2294|4875->2295|4904->2296|5120->2485|5189->2532|5275->2590|5304->2591|5333->2592|5386->2617|5415->2618|5444->2619|5473->2620|5503->2622|5532->2623|5561->2624|5619->2653|5649->2654|5679->2655|6086->3034|6157->3083|6827->3735|6866->3737|6898->3742|6955->3772|6970->3778|7043->3830|7107->3867|7122->3873|7195->3925|7217->3929|7256->3931|7288->3936|7329->3950|7344->3956|7421->4012|7478->4042|7493->4048|7566->4100
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|34->3|34->3|35->4|35->4|36->5|38->7|38->7|41->10|41->10|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|46->15|50->19|50->19|55->24|55->24|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|63->32|63->32|64->33|64->33|64->33|64->33|64->33|64->33|67->36|67->36|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|74->43|74->43|96->65|96->65|97->66|97->66|97->66|97->66|98->67|98->67|98->67|99->68|99->68|100->69|100->69|100->69|100->69|101->70|101->70|101->70
                  -- GENERATED --
              */
          