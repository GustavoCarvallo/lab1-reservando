
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object clientHome_Scope0 {
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

class clientHome extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
"""),_display_(/*2.2*/views/*2.7*/.html.main("Reservando")/*2.31*/{_display_(Seq[Any](format.raw/*2.32*/("""
    """),_display_(/*3.6*/clientNav(messages)),format.raw/*3.25*/("""
    """),_display_(/*4.6*/languageSelector(messages)),format.raw/*4.32*/("""
    """),format.raw/*5.5*/("""<div ng-controller="ClientHomeCtrl">
       <div class="sidebar" ng-show="!result.noResults">
           <div class="col m12">
               <ul class="collapsible" data-collapsible="accordion">
                   <li>
                       <div class="collapsible-header">"""),_display_(/*10.57*/Messages("client.home.filters")),format.raw/*10.88*/("""</div>
                   </li>
                   <li>
                       <div class="collapsible-header"><i class="material-icons">restaurant</i>"""),_display_(/*13.97*/Messages("client.home.type.of.local")),format.raw/*13.134*/("""</div>
                       <div class="collapsible-body">
                           <p ng-show="filtersToShow.thereAreRestaurants">
                               <input type="checkbox" class="filled-in" id="filterByRestaurant" ng-model="filtersApplied.showRestaurants" ng-checked="true">
                               <label for="filterByRestaurant">"""),_display_(/*17.65*/Messages("client.home.restaurant")),format.raw/*17.99*/("""</label>
                           </p>
                           <p ng-show="filtersToShow.thereAreDeliveries">
                               <input type="checkbox" class="filled-in" id="filterByDelivery" ng-model="filtersApplied.showDeliveries" ng-checked="true">
                               <label for="filterByDelivery">"""),_display_(/*21.63*/Messages("client.home.delivery")),format.raw/*21.95*/("""</label>
                           </p>
                       </div>
                   </li>
                   <li>
                       <div class="collapsible-header"><i class="material-icons">place</i>"""),_display_(/*26.92*/Messages("client.home.zone")),format.raw/*26.120*/("""</div>
                       <div class="collapsible-body">
                           <p ng-repeat="city in filtersToShow.cities">
                               <input type="checkbox" class="filled-in" id="filterByCity"""),format.raw/*29.89*/("""{"""),format.raw/*29.90*/("""{"""),format.raw/*29.91*/("""city.name"""),format.raw/*29.100*/("""}"""),format.raw/*29.101*/("""}"""),format.raw/*29.102*/("""" ng-model="filtersApplied.showThisCities[getCityIndex(city)].isActive" ng-checked="true">
                               <label for="filterByCity"""),format.raw/*30.56*/("""{"""),format.raw/*30.57*/("""{"""),format.raw/*30.58*/("""city.name"""),format.raw/*30.67*/("""}"""),format.raw/*30.68*/("""}"""),format.raw/*30.69*/("""">"""),format.raw/*30.71*/("""{"""),format.raw/*30.72*/("""{"""),format.raw/*30.73*/("""city.name"""),format.raw/*30.82*/("""}"""),format.raw/*30.83*/("""}"""),format.raw/*30.84*/("""</label>
                           </p>
                       </div>
                   </li>
                   <li>
                       <div class="collapsible-header"><i class="material-icons">whatshot</i>"""),_display_(/*35.95*/Messages("client.home.cuisine")),format.raw/*35.126*/("""</div>
                       <div class="collapsible-body">
                           <p ng-repeat="cuisine in filtersToShow.cuisines" ng-show="$index < 10">
                               <input type="checkbox" class="filled-in" id="filterByCuisine"""),format.raw/*38.92*/("""{"""),format.raw/*38.93*/("""{"""),format.raw/*38.94*/("""cuisine.name"""),format.raw/*38.106*/("""}"""),format.raw/*38.107*/("""}"""),format.raw/*38.108*/("""" ng-model="filtersApplied.showThisCuisines[getCuisineIndex(cuisine)].isActive" ng-checked="true">
                               <label for="filterByCuisine"""),format.raw/*39.59*/("""{"""),format.raw/*39.60*/("""{"""),format.raw/*39.61*/("""cuisine.name"""),format.raw/*39.73*/("""}"""),format.raw/*39.74*/("""}"""),format.raw/*39.75*/("""">"""),format.raw/*39.77*/("""{"""),format.raw/*39.78*/("""{"""),format.raw/*39.79*/("""cuisine.name"""),format.raw/*39.91*/("""}"""),format.raw/*39.92*/("""}"""),format.raw/*39.93*/("""</label>
                           </p>
                       </div>
                   </li>
               </ul>
           </div>
       </div>
       <div class="container body">
           """),format.raw/*47.26*/("""
           """),format.raw/*48.12*/("""<div>
               <div class="row search-container">
                   <div class="input-field col m6">
                       <input placeholder=""""),_display_(/*51.45*/Messages("client.home.search.placeholder")),format.raw/*51.87*/("""" id="searchInput" type="text" ng-model="wordToSearch" class="autocomplete" ng-change="searchForAutocomplete()">
                   </div>
                   <div class="col m3">
                       <a id="searchButton" class="waves-effect wave-light btn-large btn big-btn" ng-click="search()">"""),_display_(/*54.120*/Messages("client.home.search")),format.raw/*54.150*/("""</a>
                   </div>
                   <div class="col m3">
                       <div class="waves-effect wave-light btn-large btn big-btn" ng-click="searchNearMe()">"""),_display_(/*57.110*/Messages("client.home.near.me")),format.raw/*57.141*/("""</div>
                   </div>
               </div>
           </div>
           """),format.raw/*61.23*/("""
           """),format.raw/*62.12*/("""<div class="row" ng-show="filteredResults.length > 0">
               <div class="col m10 offset-m1">
                   <h4 class="center-align">"""),_display_(/*64.46*/Messages("client.home.results")),format.raw/*64.77*/("""</h4>
               </div>
               <div class="col m1"><span><i class="material-icons small switch-list" ng-hide="showMap" ng-click="viewMap()">map</i></span></div>
               <div class="col m1"><span><i class="material-icons small switch-list" ng-show="showMap" ng-click="showMap = false">view_list</i></span></div>
           </div>
           <div class="row" ng-show="filteredResults.length > 0 && !showMap">
               """),format.raw/*70.27*/("""
               """),format.raw/*71.16*/("""<div class="col m12">
                   <div class="row">
                       <div class="col s3" ng-repeat="result in filteredResults = (result.allResults | filter: applyFilter) | filter: filterByPage" ng-animate=" 'animate' ">
                           <div class="card">
                               <div class="card-image">
                                   <img class="responsive-img customImage" ng-src=""""),_display_(/*76.85*/routes/*76.91*/.Assets.versioned("{{result.photo.path}}")),format.raw/*76.133*/("""" ng-show="result.photo">
                                   <img class="responsive-img customImage" ng-src=""""),_display_(/*77.85*/routes/*77.91*/.Assets.versioned("/images/placeholder/restaurant.jpg")),format.raw/*77.146*/("""" ng-hide="result.photo">
                                   <span class="card-title">"""),format.raw/*78.61*/("""{"""),format.raw/*78.62*/("""{"""),format.raw/*78.63*/("""result.name"""),format.raw/*78.74*/("""}"""),format.raw/*78.75*/("""}"""),format.raw/*78.76*/("""</span>
                               </div>
                               <div class="card-content">
                                   <ng-rate-it ng-model="nonQualification" min="0" max="5" read-only="true" ng-show="result.qualification == -1"></ng-rate-it>
                                   <ng-rate-it ng-model="result.qualification" min="0" max="5" read-only="true" ng-show="result.qualification != -1"></ng-rate-it>
                                   <p class="truncate">"""),format.raw/*83.56*/("""{"""),format.raw/*83.57*/("""{"""),format.raw/*83.58*/("""printCuisines(result)"""),format.raw/*83.79*/("""}"""),format.raw/*83.80*/("""}"""),format.raw/*83.81*/("""</p>
                               </div>
                               <div class="card-action">
                                   <a class="btn-flat" style="width: 100%; text-align: center" ng-show="result.local" ng-click="openRestaurant(result.id)">"""),_display_(/*86.157*/Messages("client.home.see.local")),format.raw/*86.190*/("""</a>
                                   <a class="btn-flat" style="width: 100%; text-align: center" ng-hide="result.local" ng-click="openRestaurant(result.id)">"""),_display_(/*87.157*/Messages("client.home.see.delivery")),format.raw/*87.193*/("""</a>
                               </div>
                           </div>
                       </div>
                   </div>
                   <div class="row center-align">
                       <pagination
                       page="currentPage"
                       page-size="12"
                       total="filteredResults.length"
                       show-prev-next="true"
                       use-simple-prev-next="false"
                       dots="...."
                       hide-if-empty="true"
                       adjacent="2"
                       scroll-top="true"
                       pagination-action="changePage(page)" />
                   </div>
               </div>
           </div>

           """),format.raw/*108.31*/("""
           """),format.raw/*109.12*/("""<div class="row" ng-show="filteredResults.length > 0 && showMap">
               <div class="col m12">
                   <ng-map id="results-map" zoom="11" lazy-init="true" center=""""),format.raw/*111.80*/("""{"""),format.raw/*111.81*/("""{"""),format.raw/*111.82*/("""latAverage()"""),format.raw/*111.94*/("""}"""),format.raw/*111.95*/("""}"""),format.raw/*111.96*/(""", """),format.raw/*111.98*/("""{"""),format.raw/*111.99*/("""{"""),format.raw/*111.100*/("""lngAverage()"""),format.raw/*111.112*/("""}"""),format.raw/*111.113*/("""}"""),format.raw/*111.114*/("""">
                       <marker ng-repeat="result in filteredResults" position=""""),format.raw/*112.80*/("""{"""),format.raw/*112.81*/("""{"""),format.raw/*112.82*/("""result.address.lat"""),format.raw/*112.100*/("""}"""),format.raw/*112.101*/("""}"""),format.raw/*112.102*/(""", """),format.raw/*112.104*/("""{"""),format.raw/*112.105*/("""{"""),format.raw/*112.106*/("""result.address.lng"""),format.raw/*112.124*/("""}"""),format.raw/*112.125*/("""}"""),format.raw/*112.126*/("""" on-click="showInfoMarker(event, result)"></marker>
                       <info-window id="myInfoWindow">
                            <div ng-non-bindable>
                                <h3 class="first-titled-pane">"""),format.raw/*115.63*/("""{"""),format.raw/*115.64*/("""{"""),format.raw/*115.65*/("""restaurantSelectedInMap.name"""),format.raw/*115.93*/("""}"""),format.raw/*115.94*/("""}"""),format.raw/*115.95*/("""</h3>
                                <div class="bodyContent">
                                    <p>"""),format.raw/*117.40*/("""{"""),format.raw/*117.41*/("""{"""),format.raw/*117.42*/("""restaurantSelectedInMap.description"""),format.raw/*117.77*/("""}"""),format.raw/*117.78*/("""}"""),format.raw/*117.79*/("""</p>
                                    <a class="waves-effect waves-light btn" ng-click="openRestaurant(restaurantSelectedInMap.id)">"""),_display_(/*118.132*/Messages("client.home.see")),format.raw/*118.159*/("""</a>
                                </div>
                                """),format.raw/*127.41*/("""
                            """),format.raw/*128.29*/("""</div>
                       </info-window>
                   </ng-map>
               </div>
           </div>

           """),format.raw/*134.31*/("""
           """),format.raw/*135.12*/("""<div id="recommendations" ng-show="filteredResults.length == 0">
               <div class="row">
                   <div class="col m12">
                       <h4 class="center-align">"""),_display_(/*138.50*/Messages("client.home.suggestions")),format.raw/*138.85*/("""</h4>
                   </div>
               </div>

               <div class="row">
                   <div class="col m4" ng-repeat="recommendation in recommendations">
                       <div class="card">
                           <div class="card-image">
                               <img class="responsive-img" ng-src=""""),_display_(/*146.69*/routes/*146.75*/.Assets.versioned("{{recommendation.photo.path}}")),format.raw/*146.125*/("""" ng-show="recommendation.photo">
                               <img class="responsive-img" ng-src=""""),_display_(/*147.69*/routes/*147.75*/.Assets.versioned("/images/placeholder/restaurant.jpg")),format.raw/*147.130*/("""" ng-hide="recommendation.photo">
                               <span class="card-title">"""),format.raw/*148.57*/("""{"""),format.raw/*148.58*/("""{"""),format.raw/*148.59*/("""recommendation.name"""),format.raw/*148.78*/("""}"""),format.raw/*148.79*/("""}"""),format.raw/*148.80*/("""</span>
                           </div>
                           <div class="card-content">
                               <ng-rate-it ng-model="nonQualification" min="0" max="5" read-only="true" ng-show="recommendation.qualification == -1"></ng-rate-it>
                               <ng-rate-it ng-model="recommendation.qualification" min="0" max="5" read-only="true" ng-show="recommendation.qualification != -1"></ng-rate-it>
                               <p class="truncate">"""),format.raw/*153.52*/("""{"""),format.raw/*153.53*/("""{"""),format.raw/*153.54*/("""printCuisines(recommendation)"""),format.raw/*153.83*/("""}"""),format.raw/*153.84*/("""}"""),format.raw/*153.85*/("""</p>
                           </div>
                           <div class="card-action">
                               <a class="btn-flat" style="width: 100%; text-align: center" ng-show="recommendation.local" ng-click="openRestaurant(recommendation.id)">"""),_display_(/*156.169*/Messages("client.home.see.local")),format.raw/*156.202*/("""</a>
                               <a class="btn-flat" style="width: 100%; text-align: center" ng-hide="recommendation.local" ng-click="openRestaurant(recommendation.id)">"""),_display_(/*157.169*/Messages("client.home.see.delivery")),format.raw/*157.205*/("""</a>
                           </div>
                       </div>
                   </div>
               </div>
           </div>
       </div>
    </div>
""")))}/*165.2*/{_display_(Seq[Any](format.raw/*165.3*/("""
    """),format.raw/*166.5*/("""<link rel="stylesheet" href=""""),_display_(/*166.35*/routes/*166.41*/.Assets.versioned("external/angular-rateit-master/src/style/ng-rateit.css")),format.raw/*166.116*/("""">
    <link rel="stylesheet" href=""""),_display_(/*167.35*/routes/*167.41*/.Assets.versioned("stylesheets/clientHome.css")),format.raw/*167.88*/("""">
""")))}/*168.2*/{_display_(Seq[Any](format.raw/*168.3*/("""
    """),format.raw/*169.5*/("""<script src=""""),_display_(/*169.19*/routes/*169.25*/.Assets.versioned("external/angular-rateit-master/src/ng-rateit.js")),format.raw/*169.93*/(""""></script>
    <script src=""""),_display_(/*170.19*/routes/*170.25*/.Assets.versioned("external/angularjs/angular-animate.js")),format.raw/*170.83*/(""""></script>
    <script src=""""),_display_(/*171.19*/routes/*171.25*/.Assets.versioned("javascripts/client/clientHome.js")),format.raw/*171.78*/(""""></script>
    <script src=""""),_display_(/*172.19*/routes/*172.25*/.Assets.versioned("javascripts/utils/geocode.js")),format.raw/*172.74*/(""""></script>
    <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?v=3&key=AIzaSyDM9GdrRT-5ML6OHeHGIIs0zNFjJmOaQUM&libraries=places&callback=initGoogleMapFunctionality"></script>
    <script src=""""),_display_(/*174.19*/routes/*174.25*/.Assets.versioned("external/ngMap/ng-map.min.js")),format.raw/*174.74*/(""""></script>
    <script src=""""),_display_(/*175.19*/routes/*175.25*/.Assets.versioned("javascripts/languageSelector.js")),format.raw/*175.77*/(""""></script>

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
object clientHome extends clientHome_Scope0.clientHome
              /*
                  -- GENERATED --
                  DATE: Fri Jul 21 00:51:05 ART 2017
                  SOURCE: /Users/Gustavo/Desktop/laboratorio/reservando/app/views/clientHome.scala.html
                  HASH: 79c841913ee9aa112d3a57c4fd90e6fe9edb976c
                  MATRIX: 757->1|872->21|899->23|911->28|943->52|981->53|1012->59|1051->78|1082->84|1128->110|1159->115|1462->391|1514->422|1693->574|1752->611|2136->968|2191->1002|2549->1333|2602->1365|2840->1576|2890->1604|3139->1825|3168->1826|3197->1827|3235->1836|3265->1837|3295->1838|3469->1984|3498->1985|3527->1986|3564->1995|3593->1996|3622->1997|3652->1999|3681->2000|3710->2001|3747->2010|3776->2011|3805->2012|4046->2226|4099->2257|4378->2508|4407->2509|4436->2510|4477->2522|4507->2523|4537->2524|4722->2681|4751->2682|4780->2683|4820->2695|4849->2696|4878->2697|4908->2699|4937->2700|4966->2701|5006->2713|5035->2714|5064->2715|5288->2925|5328->2937|5507->3089|5570->3131|5896->3429|5948->3459|6156->3639|6209->3670|6321->3765|6361->3777|6535->3924|6587->3955|7056->4407|7100->4423|7546->4842|7561->4848|7625->4890|7762->5000|7777->5006|7854->5061|7968->5147|7997->5148|8026->5149|8065->5160|8094->5161|8123->5162|8632->5643|8661->5644|8690->5645|8739->5666|8768->5667|8797->5668|9081->5924|9136->5957|9325->6118|9383->6154|10158->6919|10199->6931|10410->7113|10440->7114|10470->7115|10511->7127|10541->7128|10571->7129|10602->7131|10632->7132|10663->7133|10705->7145|10736->7146|10767->7147|10878->7229|10908->7230|10938->7231|10986->7249|11017->7250|11048->7251|11080->7253|11111->7254|11142->7255|11190->7273|11221->7274|11252->7275|11501->7495|11531->7496|11561->7497|11618->7525|11648->7526|11678->7527|11810->7630|11840->7631|11870->7632|11934->7667|11964->7668|11994->7669|12159->7805|12209->7832|12314->8712|12372->8741|12527->8886|12568->8898|12784->9086|12841->9121|13205->9457|13221->9463|13294->9513|13424->9615|13440->9621|13518->9676|13637->9766|13667->9767|13697->9768|13745->9787|13775->9788|13805->9789|14319->10274|14349->10275|14379->10276|14437->10305|14467->10306|14497->10307|14786->10567|14842->10600|15044->10773|15103->10809|15283->10970|15322->10971|15355->10976|15413->11006|15429->11012|15527->11087|15592->11124|15608->11130|15677->11177|15700->11181|15739->11182|15772->11187|15814->11201|15830->11207|15920->11275|15978->11305|15994->11311|16074->11369|16132->11399|16148->11405|16223->11458|16281->11488|16297->11494|16368->11543|16618->11765|16634->11771|16705->11820|16763->11850|16779->11856|16853->11908
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|34->3|34->3|35->4|35->4|36->5|41->10|41->10|44->13|44->13|48->17|48->17|52->21|52->21|57->26|57->26|60->29|60->29|60->29|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|66->35|66->35|69->38|69->38|69->38|69->38|69->38|69->38|70->39|70->39|70->39|70->39|70->39|70->39|70->39|70->39|70->39|70->39|70->39|70->39|78->47|79->48|82->51|82->51|85->54|85->54|88->57|88->57|92->61|93->62|95->64|95->64|101->70|102->71|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|109->78|109->78|109->78|114->83|114->83|114->83|114->83|114->83|114->83|117->86|117->86|118->87|118->87|139->108|140->109|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|142->111|143->112|143->112|143->112|143->112|143->112|143->112|143->112|143->112|143->112|143->112|143->112|143->112|146->115|146->115|146->115|146->115|146->115|146->115|148->117|148->117|148->117|148->117|148->117|148->117|149->118|149->118|151->127|152->128|158->134|159->135|162->138|162->138|170->146|170->146|170->146|171->147|171->147|171->147|172->148|172->148|172->148|172->148|172->148|172->148|177->153|177->153|177->153|177->153|177->153|177->153|180->156|180->156|181->157|181->157|189->165|189->165|190->166|190->166|190->166|190->166|191->167|191->167|191->167|192->168|192->168|193->169|193->169|193->169|193->169|194->170|194->170|194->170|195->171|195->171|195->171|196->172|196->172|196->172|198->174|198->174|198->174|199->175|199->175|199->175
                  -- GENERATED --
              */
          