
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ownerRestaurants_Scope0 {
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

class ownerRestaurants extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
"""),_display_(/*2.2*/views/*2.7*/.html.main("Reservando")/*2.31*/ {_display_(Seq[Any](format.raw/*2.33*/("""
    """),format.raw/*3.5*/("""<div id="top"></div>
    """),_display_(/*4.6*/ownerNav(messages)),format.raw/*4.24*/("""
    """),_display_(/*5.6*/languageSelector(messages)),format.raw/*5.32*/("""
    """),format.raw/*6.5*/("""<div class="container" ng-controller="OwnerRestaurantsCtrl">
        <div class="row">
            <h3 class="center">"""),_display_(/*8.33*/Messages("owner.restaurants.my.restaurants")),format.raw/*8.77*/("""</h3>
        </div>
        <div class="row">
            <div class="col s6 offset-s3">
                <div class="input-field">
                    <i class="prefix material-icons" >search</i>
                    <input type="text" ng-model="filterTerm2" id="search" ng-change="resetPage()">
                    <label for="search">"""),_display_(/*15.42*/Messages("owner.restaurants.filter.restaurants")),format.raw/*15.90*/("""</label>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col s4" ng-repeat="restaurant in filteredRestaurants = (restaurants | filter: filter) | filter: filterByPage" ng-animate=" 'animate' ">
                <div class="card sticky-action">
                    <div class="card-image">
                        <img class="responsive-img custom-image" ng-src=""""),_display_(/*23.75*/routes/*23.81*/.Assets.versioned("{{restaurant.photo.path}}")),format.raw/*23.127*/("""" ng-show="restaurant.photo">
                        <img class="responsive-img custom-image" ng-src=""""),_display_(/*24.75*/routes/*24.81*/.Assets.versioned("/images/placeholder/restaurant.jpg")),format.raw/*24.136*/("""" ng-hide="restaurant.photo">
                        <span class="card-title">"""),format.raw/*25.50*/("""{"""),format.raw/*25.51*/("""{"""),format.raw/*25.52*/("""restaurant.name"""),format.raw/*25.67*/("""}"""),format.raw/*25.68*/("""}"""),format.raw/*25.69*/("""</span>
                    </div>
                    <div class="card-content">
                        <span class="card-title activator grey-text text-darken-4">
                            <ng-rate-it ng-model="nonQualification" min="0" max="5" read-only="true" ng-show="restaurant.qualification == -1"></ng-rate-it>
                            <ng-rate-it ng-model="restaurant.qualification" min="0" max="5" read-only="true" ng-show="restaurant.qualification != -1"></ng-rate-it>
                            <i class="material-icons right">more_vert</i>
                        </span>
                        <p class="truncate">"""),format.raw/*33.45*/("""{"""),format.raw/*33.46*/("""{"""),format.raw/*33.47*/("""printCuisines(restaurant)"""),format.raw/*33.72*/("""}"""),format.raw/*33.73*/("""}"""),format.raw/*33.74*/("""</p>
                    </div>
                    <div class="card-reveal">
                        <span class="card-title red-text">"""),format.raw/*36.59*/("""{"""),format.raw/*36.60*/("""{"""),format.raw/*36.61*/("""truncateText(restaurant.name, 15)"""),format.raw/*36.94*/("""}"""),format.raw/*36.95*/("""}"""),format.raw/*36.96*/("""<i class="material-icons right green-text text-darken-4">close</i></span>
                        <p>"""),format.raw/*37.28*/("""{"""),format.raw/*37.29*/("""{"""),format.raw/*37.30*/("""truncateText(restaurant.description, 100)"""),format.raw/*37.71*/("""}"""),format.raw/*37.72*/("""}"""),format.raw/*37.73*/("""</p>
                        <p><b>"""),_display_(/*38.32*/Messages("owner.restaurants.address")),format.raw/*38.69*/("""</b></p>
                        <p>"""),format.raw/*39.28*/("""{"""),format.raw/*39.29*/("""{"""),format.raw/*39.30*/("""truncateText(restaurant.address.completeAddress, 100)"""),format.raw/*39.83*/("""}"""),format.raw/*39.84*/("""}"""),format.raw/*39.85*/("""</p>
                    </div>
                    <div class="card-action">
                        <a class="btn-flat" style="width: 100%; text-align: center" ng-click="openRestaurant(restaurant.id)" ng-show="restaurant.local">"""),_display_(/*42.154*/Messages("owner.restaurants.view.local")),format.raw/*42.194*/("""</a>
                        <a class="btn-flat" style="width: 100%; text-align: center" ng-click="openRestaurant(restaurant.id)" ng-hide="restaurant.local">"""),_display_(/*43.154*/Messages("owner.restaurants.view.delivery")),format.raw/*43.197*/("""</a>
                    </div>
                </div>
            </div>
        </div>
        <div class="row center-align">
            <pagination
            page="currentPage"
            page-size="9"
            total="filteredRestaurants.length"
            show-prev-next="true"
            use-simple-prev-next="false"
            dots="...."
            hide-if-empty="true"
            adjacent="2"
            scroll-top="true"
            pagination-action="changePage(page)" />
        </div>
    </div>
""")))}/*62.2*/ {_display_(Seq[Any](format.raw/*62.4*/("""
    """),format.raw/*63.5*/("""<link rel="stylesheet" href=""""),_display_(/*63.35*/routes/*63.41*/.Assets.versioned("external/angular-rateit-master/src/style/ng-rateit.css")),format.raw/*63.116*/("""">
    <link rel="stylesheet" href=""""),_display_(/*64.35*/routes/*64.41*/.Assets.versioned("stylesheets/owner/ownerRestaurants.css")),format.raw/*64.100*/("""">
""")))}/*65.2*/ {_display_(Seq[Any](format.raw/*65.4*/("""
    """),format.raw/*66.5*/("""<script src=""""),_display_(/*66.19*/routes/*66.25*/.Assets.versioned("external/angular-rateit-master/src/ng-rateit.js")),format.raw/*66.93*/(""""></script>
    <script src=""""),_display_(/*67.19*/routes/*67.25*/.Assets.versioned("javascripts/owner/restaurants.js")),format.raw/*67.78*/(""""></script>
    <script src=""""),_display_(/*68.19*/routes/*68.25*/.Assets.versioned("javascripts/languageSelector.js")),format.raw/*68.77*/(""""></script>
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
object ownerRestaurants extends ownerRestaurants_Scope0.ownerRestaurants
              /*
                  -- GENERATED --
                  DATE: Fri Jul 21 01:33:02 ART 2017
                  SOURCE: /Users/Gustavo/Desktop/laboratorio/reservando/app/views/ownerRestaurants.scala.html
                  HASH: f0f4e870ac1ca308feebbbd10308ad81a3d69ca9
                  MATRIX: 769->1|884->21|911->23|923->28|955->52|994->54|1025->59|1076->85|1114->103|1145->109|1191->135|1222->140|1367->259|1431->303|1795->640|1864->688|2311->1108|2326->1114|2394->1160|2525->1264|2540->1270|2617->1325|2724->1404|2753->1405|2782->1406|2825->1421|2854->1422|2883->1423|3547->2059|3576->2060|3605->2061|3658->2086|3687->2087|3716->2088|3880->2224|3909->2225|3938->2226|3999->2259|4028->2260|4057->2261|4186->2362|4215->2363|4244->2364|4313->2405|4342->2406|4371->2407|4434->2443|4492->2480|4556->2516|4585->2517|4614->2518|4695->2571|4724->2572|4753->2573|5012->2804|5074->2844|5260->3002|5325->3045|5865->3567|5904->3569|5936->3574|5993->3604|6008->3610|6105->3685|6169->3722|6184->3728|6265->3787|6287->3791|6326->3793|6358->3798|6399->3812|6414->3818|6503->3886|6560->3916|6575->3922|6649->3975|6706->4005|6721->4011|6794->4063
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|34->3|35->4|35->4|36->5|36->5|37->6|39->8|39->8|46->15|46->15|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|56->25|56->25|56->25|64->33|64->33|64->33|64->33|64->33|64->33|67->36|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|68->37|68->37|68->37|69->38|69->38|70->39|70->39|70->39|70->39|70->39|70->39|73->42|73->42|74->43|74->43|93->62|93->62|94->63|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|97->66|97->66|97->66|97->66|98->67|98->67|98->67|99->68|99->68|99->68
                  -- GENERATED --
              */
          