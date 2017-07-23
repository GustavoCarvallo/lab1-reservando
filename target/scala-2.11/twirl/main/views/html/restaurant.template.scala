
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object restaurant_Scope0 {
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

class restaurant extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
"""),_display_(/*2.2*/views/*2.7*/.html.main("Reservando")/*2.31*/ {_display_(Seq[Any](format.raw/*2.33*/("""
    """),_display_(/*3.6*/clientNav(messages)),format.raw/*3.25*/("""
    """),_display_(/*4.6*/languageSelector(messages)),format.raw/*4.32*/("""
    """),format.raw/*5.5*/("""<div class="container" ng-controller="RestaurantCtrl">
        <div class="row image-holder">
            <img ng-src=""""),_display_(/*7.27*/routes/*7.33*/.Assets.versioned("{{restaurant.photo.path}}")),format.raw/*7.79*/("""" alt="" class="materialboxed" width="100%" height="300px">
        </div>
        <div class="row title">
            <div class="col s8">
                <h3>"""),format.raw/*11.21*/("""{"""),format.raw/*11.22*/("""{"""),format.raw/*11.23*/("""restaurant.name"""),format.raw/*11.38*/("""}"""),format.raw/*11.39*/("""}"""),format.raw/*11.40*/("""</h3>
                <p ng-show="!totalQualification || totalQualification == -1">"""),_display_(/*12.79*/Messages("client.restaurant.not.rated")),format.raw/*12.118*/("""</p>
                <ng-rate-it ng-model="totalQualification" min="0" max="5" read-only="true" ng-hide="!totalQualification || totalQualification == -1"></ng-rate-it>
            </div>
            <div class="col s3 offset-s1">
                <div class="btn" ng-click="openReservationPage(restaurant.id)" ng-show="restaurant.isLocal">"""),_display_(/*16.110*/Messages("client.restaurant.make.reservation")),format.raw/*16.156*/("""</div>
                <div class="btn" ng-click="openOrderPage(restaurant.id)" ng-hide="restaurant.isLocal">"""),_display_(/*17.104*/Messages("client.restaurant.make.order")),format.raw/*17.144*/("""</div>
            </div>
        </div>
        <div class="row">
            <div class="col s6 info-contanier">
                <div class="row">
                    <div class="col s12">
                        <p class="address"><i class="material-icons">location_on</i>"""),format.raw/*24.85*/("""{"""),format.raw/*24.86*/("""{"""),format.raw/*24.87*/("""restaurant.address.completeAddress"""),format.raw/*24.121*/("""}"""),format.raw/*24.122*/("""}"""),format.raw/*24.123*/("""</p>
                    </div>
                </div>
                <div class="row">
                    <div class="col s12">
                        <p class="cuisine"><i class="material-icons">restaurant</i><span ng-repeat="cuisine in restaurant.cuisines">"""),format.raw/*29.133*/("""{"""),format.raw/*29.134*/("""{"""),format.raw/*29.135*/(""" """),format.raw/*29.136*/("""$first ? "" : ",""""),format.raw/*29.153*/("""}"""),format.raw/*29.154*/("""}"""),format.raw/*29.155*/(""" """),format.raw/*29.156*/("""{"""),format.raw/*29.157*/("""{"""),format.raw/*29.158*/("""cuisine.name"""),format.raw/*29.170*/("""}"""),format.raw/*29.171*/("""}"""),format.raw/*29.172*/("""</span></p>
                    </div>
                </div>
                <div class="row">
                    <div class="col s12">
                        <p class="opening-days" ng-show="restaurant.days.length() == 7"><i class="material-icons">data_range</i> """),_display_(/*34.131*/Messages("client.restaurant.all.days")),format.raw/*34.169*/("""</p>
                        <p class="opening-days" ng-hide="restaurant.days.length() == 7"><i class="material-icons">date_range</i><span ng-repeat="day in restaurant.openingDays">"""),format.raw/*35.177*/("""{"""),format.raw/*35.178*/("""{"""),format.raw/*35.179*/("""$first?"":", """"),format.raw/*35.193*/("""}"""),format.raw/*35.194*/("""}"""),format.raw/*35.195*/(""" """),format.raw/*35.196*/("""{"""),format.raw/*35.197*/("""{"""),format.raw/*35.198*/("""getTranslateDay(day)"""),format.raw/*35.218*/("""}"""),format.raw/*35.219*/("""}"""),format.raw/*35.220*/("""</span></p>
                    </div>
                </div>
                <div class="row">
                    <div class="col s12">
                        <p class="opening-time"><i class="material-icons">schedule</i> """),_display_(/*40.89*/Messages("client.restaurant.from")),format.raw/*40.123*/(""": """),format.raw/*40.125*/("""{"""),format.raw/*40.126*/("""{"""),format.raw/*40.127*/("""restaurant.openingHour"""),format.raw/*40.149*/("""}"""),format.raw/*40.150*/("""}"""),format.raw/*40.151*/(""" """),_display_(/*40.153*/Messages("client.restaurant.to")),format.raw/*40.185*/(""": """),format.raw/*40.187*/("""{"""),format.raw/*40.188*/("""{"""),format.raw/*40.189*/("""restaurant.closingHour"""),format.raw/*40.211*/("""}"""),format.raw/*40.212*/("""}"""),format.raw/*40.213*/("""</p>
                    </div>
                </div>
                <div class="row" ng-hide="restaurant.isLocal || restaurant.local">
                    <div class="col s12">
                        <p class="opening-time"><i class="material-icons">query_builder</i> """),_display_(/*45.94*/Messages("client.restaurant.average.delivery.time")),format.raw/*45.145*/(""": """),format.raw/*45.147*/("""{"""),format.raw/*45.148*/("""{"""),format.raw/*45.149*/("""restaurant.responseTime"""),format.raw/*45.172*/("""}"""),format.raw/*45.173*/("""}"""),format.raw/*45.174*/("""</p>
                    </div>
                </div>
            </div>
            <div class="col s6">
                <div class="row">
                    <h5 class="calificacion" ng-show="personalQualification == -1">"""),_display_(/*51.85*/Messages("client.restaurant.rate.service")),format.raw/*51.127*/("""</h5>
                    <h5 class="calificacion" ng-hide="personalQualification == -1">"""),_display_(/*52.85*/Messages("client.restaurant.your.rating")),format.raw/*52.126*/("""</h5>
                    <ng-rate-it ng-model="personalQualification" min="0" max="5" ng-click="qualifyRestaurant()" resetable="false" pristine="true"></ng-rate-it>
                </div>
                <div class="row">
                    <div class="col s12">
                        <p>"""),format.raw/*57.28*/("""{"""),format.raw/*57.29*/("""{"""),format.raw/*57.30*/("""restaurant.description"""),format.raw/*57.52*/("""}"""),format.raw/*57.53*/("""}"""),format.raw/*57.54*/("""</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col s6">
                <div class="row">
                    <ng-map center="["""),format.raw/*65.38*/("""{"""),format.raw/*65.39*/("""{"""),format.raw/*65.40*/("""restaurant.address.lat"""),format.raw/*65.62*/("""}"""),format.raw/*65.63*/("""}"""),format.raw/*65.64*/(""", """),format.raw/*65.66*/("""{"""),format.raw/*65.67*/("""{"""),format.raw/*65.68*/("""restaurant.address.lng"""),format.raw/*65.90*/("""}"""),format.raw/*65.91*/("""}"""),format.raw/*65.92*/("""]">
                        <marker position=""""),format.raw/*66.43*/("""{"""),format.raw/*66.44*/("""{"""),format.raw/*66.45*/("""restaurant.address.lat"""),format.raw/*66.67*/("""}"""),format.raw/*66.68*/("""}"""),format.raw/*66.69*/(""", """),format.raw/*66.71*/("""{"""),format.raw/*66.72*/("""{"""),format.raw/*66.73*/("""restaurant.address.lng"""),format.raw/*66.95*/("""}"""),format.raw/*66.96*/("""}"""),format.raw/*66.97*/(""""></marker>
                    </ng-map>
                </div>
            </div>
            <div class="col s6 menu">
                <div class="row">
                    <div class="col s2 offset-s5">
                        <h5>"""),_display_(/*73.30*/Messages("client.restaurant.menu")),format.raw/*73.64*/("""</h5>
                    </div>
                </div>
                <div class="row">
                    <div class="col s12">
                        <table class="highlight centered responsive-table">
                            <thead>
                                <tr>
                                    <th></th>
                                    <th>"""),_display_(/*82.42*/Messages("client.restaurant.name")),format.raw/*82.76*/("""</th>
                                    <th>"""),_display_(/*83.42*/Messages("client.restaurant.description")),format.raw/*83.83*/("""</th>
                                </tr>
                            </thead>

                            <tbody>
                                <tr ng-repeat="meal in menu">
                                    <td><img ng-src=""""),_display_(/*89.55*/routes/*89.61*/.Assets.versioned("{{meal.photo.path}}")),format.raw/*89.101*/("""" class="responsive-img menu-image"></td>
                                    <td>"""),format.raw/*90.41*/("""{"""),format.raw/*90.42*/("""{"""),format.raw/*90.43*/("""meal.name"""),format.raw/*90.52*/("""}"""),format.raw/*90.53*/("""}"""),format.raw/*90.54*/("""</td>
                                    <td>"""),format.raw/*91.41*/("""{"""),format.raw/*91.42*/("""{"""),format.raw/*91.43*/("""meal.description"""),format.raw/*91.59*/("""}"""),format.raw/*91.60*/("""}"""),format.raw/*91.61*/("""</td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="row" ng-hide="menu.length > 0">
                    <p>"""),_display_(/*98.25*/Messages("client.restaurant.the.menu.is.not.defined")),format.raw/*98.78*/("""</p>
                </div>
            </div>
        </div>
    </div>
""")))}/*103.2*/ {_display_(Seq[Any](format.raw/*103.4*/("""
    """),format.raw/*104.5*/("""<link rel="stylesheet" href=""""),_display_(/*104.35*/routes/*104.41*/.Assets.versioned("external/angular-rateit-master/src/style/ng-rateit.css")),format.raw/*104.116*/("""">
    <link rel="stylesheet" href=""""),_display_(/*105.35*/routes/*105.41*/.Assets.versioned("stylesheets/owner/restaurant.css")),format.raw/*105.94*/("""">
""")))}/*106.2*/ {_display_(Seq[Any](format.raw/*106.4*/("""
    """),format.raw/*107.5*/("""<script src=""""),_display_(/*107.19*/routes/*107.25*/.Assets.versioned("external/angular-rateit-master/src/ng-rateit.js")),format.raw/*107.93*/(""""></script>
    <script src=""""),_display_(/*108.19*/routes/*108.25*/.Assets.versioned("javascripts/utils/geocode.js")),format.raw/*108.74*/(""""></script>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDx5ARsKyUaIV0uBUuCs7M6HxvUOtvcm-E&libraries=places&callback=initAutocomplete"
    async defer></script>
    <script src=""""),_display_(/*111.19*/routes/*111.25*/.Assets.versioned("external/ngMap/ng-map.min.js")),format.raw/*111.74*/(""""></script>
    <script src=""""),_display_(/*112.19*/routes/*112.25*/.Assets.versioned("javascripts/client/restaurant.js")),format.raw/*112.78*/(""""></script>
    <script src=""""),_display_(/*113.19*/routes/*113.25*/.Assets.versioned("javascripts/languageSelector.js")),format.raw/*113.77*/(""""></script>
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
object restaurant extends restaurant_Scope0.restaurant
              /*
                  -- GENERATED --
                  DATE: Thu Jul 20 22:56:18 ART 2017
                  SOURCE: /Users/Gustavo/Desktop/laboratorio/reservando/app/views/restaurant.scala.html
                  HASH: 4771e0c3df71d9ba8726c226b6bf43ec55207566
                  MATRIX: 757->1|872->21|899->23|911->28|943->52|982->54|1013->60|1052->79|1083->85|1129->111|1160->116|1306->236|1320->242|1386->288|1574->448|1603->449|1632->450|1675->465|1704->466|1733->467|1844->551|1905->590|2272->929|2340->975|2478->1085|2540->1125|2843->1400|2872->1401|2901->1402|2964->1436|2994->1437|3024->1438|3316->1701|3346->1702|3376->1703|3406->1704|3452->1721|3482->1722|3512->1723|3542->1724|3572->1725|3602->1726|3643->1738|3673->1739|3703->1740|3999->2008|4059->2046|4269->2227|4299->2228|4329->2229|4372->2243|4402->2244|4432->2245|4462->2246|4492->2247|4522->2248|4571->2268|4601->2269|4631->2270|4884->2496|4940->2530|4971->2532|5001->2533|5031->2534|5082->2556|5112->2557|5142->2558|5172->2560|5226->2592|5257->2594|5287->2595|5317->2596|5368->2618|5398->2619|5428->2620|5728->2893|5801->2944|5832->2946|5862->2947|5892->2948|5944->2971|5974->2972|6004->2973|6256->3198|6320->3240|6437->3330|6500->3371|6820->3663|6849->3664|6878->3665|6928->3687|6957->3688|6986->3689|7233->3908|7262->3909|7291->3910|7341->3932|7370->3933|7399->3934|7429->3936|7458->3937|7487->3938|7537->3960|7566->3961|7595->3962|7669->4008|7698->4009|7727->4010|7777->4032|7806->4033|7835->4034|7865->4036|7894->4037|7923->4038|7973->4060|8002->4061|8031->4062|8294->4298|8349->4332|8744->4700|8799->4734|8873->4781|8935->4822|9196->5056|9211->5062|9273->5102|9383->5184|9412->5185|9441->5186|9478->5195|9507->5196|9536->5197|9610->5243|9639->5244|9668->5245|9712->5261|9741->5262|9770->5263|10045->5511|10119->5564|10212->5638|10252->5640|10285->5645|10343->5675|10359->5681|10457->5756|10522->5793|10538->5799|10613->5852|10636->5856|10676->5858|10709->5863|10751->5877|10767->5883|10857->5951|10915->5981|10931->5987|11002->6036|11231->6237|11247->6243|11318->6292|11376->6322|11392->6328|11467->6381|11525->6411|11541->6417|11615->6469
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|34->3|34->3|35->4|35->4|36->5|38->7|38->7|38->7|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|47->16|47->16|48->17|48->17|55->24|55->24|55->24|55->24|55->24|55->24|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|60->29|65->34|65->34|66->35|66->35|66->35|66->35|66->35|66->35|66->35|66->35|66->35|66->35|66->35|66->35|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|76->45|76->45|76->45|76->45|76->45|76->45|76->45|76->45|82->51|82->51|83->52|83->52|88->57|88->57|88->57|88->57|88->57|88->57|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|96->65|97->66|97->66|97->66|97->66|97->66|97->66|97->66|97->66|97->66|97->66|97->66|97->66|104->73|104->73|113->82|113->82|114->83|114->83|120->89|120->89|120->89|121->90|121->90|121->90|121->90|121->90|121->90|122->91|122->91|122->91|122->91|122->91|122->91|129->98|129->98|134->103|134->103|135->104|135->104|135->104|135->104|136->105|136->105|136->105|137->106|137->106|138->107|138->107|138->107|138->107|139->108|139->108|139->108|142->111|142->111|142->111|143->112|143->112|143->112|144->113|144->113|144->113
                  -- GENERATED --
              */
          