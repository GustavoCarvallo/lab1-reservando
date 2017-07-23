
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ownerHome_Scope0 {
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

class ownerHome extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
"""),_display_(/*2.2*/views/*2.7*/.html.main("Reservando")/*2.31*/ {_display_(Seq[Any](format.raw/*2.33*/("""
    """),_display_(/*3.6*/ownerNav(messages)),format.raw/*3.24*/("""
    """),_display_(/*4.6*/languageSelector(messages)),format.raw/*4.32*/("""
    """),format.raw/*5.5*/("""<div ng-controller="OwnerHomeCtrl">
        <div class="container body" >
            <div class="row">
                <div class="col m6">
                    <div class="row">
                        <h5 class="center">
                            """),_display_(/*11.30*/Messages("owner.home.my.restaurants")),format.raw/*11.67*/("""
                                """),format.raw/*12.33*/("""<div class="btn-floating accent-color" ng-click="openAddRestaurant()"><i class="material-icons">add</i></div>
                                <div class="btn-floating accent-color" ng-click="openRestaurants()"><i class="material-icons">view_list</i></div>
                        </h5>
                    </div>
                    <table class="center responsive-table highlight centered" ng-show="restaurants.length != 0">
                        <thead>
                            <tr>
                                <th data-field="id">"""),_display_(/*19.54*/Messages("owner.home.name")),format.raw/*19.81*/("""</th>
                                <th data-field="name">"""),_display_(/*20.56*/Messages("owner.home.type")),format.raw/*20.83*/("""</th>
                                <th data-field="state">"""),_display_(/*21.57*/Messages("owner.home.state")),format.raw/*21.85*/("""</th>
                                <th data-field="state">"""),_display_(/*22.57*/Messages("owner.home.publish")),format.raw/*22.87*/("""</th>
                                <th data-field="price">"""),_display_(/*23.57*/Messages("owner.home.modify.or.view")),format.raw/*23.94*/("""</th>
                            </tr>
                        </thead>

                        <tbody>
                            <tr ng-repeat="restaurant in restaurants">
                                <td>"""),format.raw/*29.37*/("""{"""),format.raw/*29.38*/("""{"""),format.raw/*29.39*/("""restaurant.name"""),format.raw/*29.54*/("""}"""),format.raw/*29.55*/("""}"""),format.raw/*29.56*/("""</td>
                                <td ng-show="restaurant.local">"""),_display_(/*30.65*/Messages("owner.home.local")),format.raw/*30.93*/("""</td>
                                <td ng-hide="restaurant.local">"""),_display_(/*31.65*/Messages("owner.home.delivery")),format.raw/*31.96*/("""</td>
                                <td ng-show="restaurant.published">"""),_display_(/*32.69*/Messages("owner.home.published")),format.raw/*32.101*/("""</td>
                                <td ng-hide="restaurant.published">"""),_display_(/*33.69*/Messages("owner.home.no.published")),format.raw/*33.104*/("""</td>
                                <td ng-hide="restaurant.published"><i class="material-icons publish" ng-click="publicateRestaurant(restaurant, true)">publish</i></td>
                                <td ng-show="restaurant.published"><i class="material-icons unpublish" ng-click="publicateRestaurant(restaurant, false)">publish</i></td>
                                <td><i class="material-icons view" ng-click="openRestaurantProfile(restaurant)">edit</i></td>
                            </tr>
                        </tbody>
                    </table>
                    <div class="row continues" ng-show="continues">
                        <div class="col s12">
                            <div class="btn hoverable" ng-click="openRestaurants()">"""),_display_(/*42.86*/Messages("owner.home.view.more.restaurants")),format.raw/*42.130*/("""</div>
                        </div>
                    </div>
                    <div class="my-restaurant-container valign-wrapper" ng-show="restaurants.length == 0">
                        <div class="valign center empty-msg">
                            <h5>"""),_display_(/*47.34*/Messages("owner.home.no.restaurants.yet")),format.raw/*47.75*/("""</h5>
                            <div id="addRestaurant">
                                <div class="btn-large accent-color add-btn" ng-click="openAddRestaurant()">
                                """),_display_(/*50.34*/Messages("owner.home.add.restaurant")),format.raw/*50.71*/("""
                                """),format.raw/*51.33*/("""</div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col m6 center-panel">
                    <div class="row">
                        <h5 class="center">"""),_display_(/*58.45*/Messages("owner.home.orders.and.reservations")),format.raw/*58.91*/("""</h5>
                    </div>
                    <div class="news-container">
                        <table class="center responsive-table highlight centered" ng-show="reservations.length != 0 || orders.length != 0 ">
                            <thead>
                                <tr>
                                    <th data-field="id">"""),_display_(/*64.58*/Messages("owner.home.local")),format.raw/*64.86*/("""</th>
                                    <th data-field="name">"""),_display_(/*65.60*/Messages("owner.home.type")),format.raw/*65.87*/("""</th>
                                    <th data-field="state">"""),_display_(/*66.61*/Messages("owner.home.client")),format.raw/*66.90*/("""</th>
                                    <th data-field="state">"""),_display_(/*67.61*/Messages("owner.home.date.and.time")),format.raw/*67.97*/("""</th>
                                </tr>
                            </thead>

                            <tbody>
                                <tr ng-repeat="reservation in reservations">
                                    <td>"""),format.raw/*73.41*/("""{"""),format.raw/*73.42*/("""{"""),format.raw/*73.43*/("""reservation.local.name"""),format.raw/*73.65*/("""}"""),format.raw/*73.66*/("""}"""),format.raw/*73.67*/("""</td>
                                    <td>"""),_display_(/*74.42*/Messages("owner.home.reservation")),format.raw/*74.76*/("""</td>
                                    <td>"""),format.raw/*75.41*/("""{"""),format.raw/*75.42*/("""{"""),format.raw/*75.43*/("""reservation.clientName"""),format.raw/*75.65*/("""}"""),format.raw/*75.66*/("""}"""),format.raw/*75.67*/("""</td>
                                    <td>"""),format.raw/*76.41*/("""{"""),format.raw/*76.42*/("""{"""),format.raw/*76.43*/("""getDateTimeFormat(reservation.date)"""),format.raw/*76.78*/("""}"""),format.raw/*76.79*/("""}"""),format.raw/*76.80*/("""</td>
                                </tr>
                                <tr ng-repeat="order in orders">
                                    <td>"""),format.raw/*79.41*/("""{"""),format.raw/*79.42*/("""{"""),format.raw/*79.43*/("""order.delivery.name"""),format.raw/*79.62*/("""}"""),format.raw/*79.63*/("""}"""),format.raw/*79.64*/("""</td>
                                    <td>"""),_display_(/*80.42*/Messages("owner.home.delivery")),format.raw/*80.73*/("""</td>
                                    <td>"""),format.raw/*81.41*/("""{"""),format.raw/*81.42*/("""{"""),format.raw/*81.43*/("""order.clientName"""),format.raw/*81.59*/("""}"""),format.raw/*81.60*/("""}"""),format.raw/*81.61*/("""</td>
                                    <td>"""),format.raw/*82.41*/("""{"""),format.raw/*82.42*/("""{"""),format.raw/*82.43*/("""getDateTimeFormat(order.timePlaced)"""),format.raw/*82.78*/("""}"""),format.raw/*82.79*/("""}"""),format.raw/*82.80*/("""</td>
                                </tr>
                            </tbody>
                        </table>
                        <div class="row resOrdButton">
                            <div class="col s5 offset-s2">
                                <div class="btn hoverable " ng-click="openReservations()">"""),_display_(/*88.92*/Messages("owner.home.view.more.reservations")),format.raw/*88.137*/("""</div>
                            </div>
                            <div class="col s5">
                                <div class="btn hoverable " ng-click="openOrders()">"""),_display_(/*91.86*/Messages("owner.home.view.more.orders")),format.raw/*91.125*/("""</div>
                            </div>
                        </div>
                        <div ng-hide="news.length == 0" class="center empty-msg">
                            <h5>"""),_display_(/*95.34*/Messages("owner.home.no.reservations.or.orders")),format.raw/*95.82*/("""</h5>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
""")))}/*102.2*/ {_display_(Seq[Any](format.raw/*102.4*/("""
    """),format.raw/*103.5*/("""<link rel="stylesheet" href=""""),_display_(/*103.35*/routes/*103.41*/.Assets.versioned("stylesheets/owner/ownerHome.css")),format.raw/*103.93*/("""">
""")))}/*104.2*/ {_display_(Seq[Any](format.raw/*104.4*/("""
    """),format.raw/*105.5*/("""<script src=""""),_display_(/*105.19*/routes/*105.25*/.Assets.versioned("javascripts/owner/ownerHome.js")),format.raw/*105.76*/(""""></script>
    <script src=""""),_display_(/*106.19*/routes/*106.25*/.Assets.versioned("javascripts/languageSelector.js")),format.raw/*106.77*/(""""></script>
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
object ownerHome extends ownerHome_Scope0.ownerHome
              /*
                  -- GENERATED --
                  DATE: Tue Jul 11 18:34:54 ART 2017
                  SOURCE: /Users/Gustavo/Desktop/laboratorio/reservando/app/views/ownerHome.scala.html
                  HASH: 765d3bcab1fea996faf166922285bffb369bab10
                  MATRIX: 755->1|870->21|897->23|909->28|941->52|980->54|1011->60|1049->78|1080->84|1126->110|1157->115|1436->367|1494->404|1555->437|2126->981|2174->1008|2262->1069|2310->1096|2399->1158|2448->1186|2537->1248|2588->1278|2677->1340|2735->1377|2976->1590|3005->1591|3034->1592|3077->1607|3106->1608|3135->1609|3232->1679|3281->1707|3378->1777|3430->1808|3531->1882|3585->1914|3686->1988|3743->2023|4534->2787|4600->2831|4894->3098|4956->3139|5183->3339|5241->3376|5302->3409|5584->3664|5651->3710|6031->4063|6080->4091|6172->4156|6220->4183|6313->4249|6363->4278|6456->4344|6513->4380|6776->4615|6805->4616|6834->4617|6884->4639|6913->4640|6942->4641|7016->4688|7071->4722|7145->4768|7174->4769|7203->4770|7253->4792|7282->4793|7311->4794|7385->4840|7414->4841|7443->4842|7506->4877|7535->4878|7564->4879|7741->5028|7770->5029|7799->5030|7846->5049|7875->5050|7904->5051|7978->5098|8030->5129|8104->5175|8133->5176|8162->5177|8206->5193|8235->5194|8264->5195|8338->5241|8367->5242|8396->5243|8459->5278|8488->5279|8517->5280|8863->5599|8930->5644|9133->5820|9194->5859|9409->6047|9478->6095|9630->6228|9670->6230|9703->6235|9761->6265|9777->6271|9851->6323|9874->6327|9914->6329|9947->6334|9989->6348|10005->6354|10078->6405|10136->6435|10152->6441|10226->6493
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|34->3|34->3|35->4|35->4|36->5|42->11|42->11|43->12|50->19|50->19|51->20|51->20|52->21|52->21|53->22|53->22|54->23|54->23|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|62->31|62->31|63->32|63->32|64->33|64->33|73->42|73->42|78->47|78->47|81->50|81->50|82->51|89->58|89->58|95->64|95->64|96->65|96->65|97->66|97->66|98->67|98->67|104->73|104->73|104->73|104->73|104->73|104->73|105->74|105->74|106->75|106->75|106->75|106->75|106->75|106->75|107->76|107->76|107->76|107->76|107->76|107->76|110->79|110->79|110->79|110->79|110->79|110->79|111->80|111->80|112->81|112->81|112->81|112->81|112->81|112->81|113->82|113->82|113->82|113->82|113->82|113->82|119->88|119->88|122->91|122->91|126->95|126->95|133->102|133->102|134->103|134->103|134->103|134->103|135->104|135->104|136->105|136->105|136->105|136->105|137->106|137->106|137->106
                  -- GENERATED --
              */
          