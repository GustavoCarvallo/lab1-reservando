
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newRestaurant_Scope0 {
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

class newRestaurant extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
"""),_display_(/*2.2*/views/*2.7*/.html.main("Reservando")/*2.31*/ {_display_(Seq[Any](format.raw/*2.33*/("""
    """),_display_(/*3.6*/ownerNav(messages)),format.raw/*3.24*/("""
    """),_display_(/*4.6*/languageSelector(messages)),format.raw/*4.32*/("""
    """),format.raw/*5.5*/("""<div class="container" ng-controller="NewRestaurantCtrl as ctrl">
        <div class="row">
            <h2 class="center">"""),_display_(/*7.33*/Messages("owner.new.restaurant.new.restaurant")),format.raw/*7.80*/("""</h2>
        </div>
        <div class="row">
            <div class="col m4">
                <div class="row">
                    <div class="img-placeholder" ng-show="photos.length == 0">
                        <img ng-src="/assets/images/placeholder/restaurant.jpg" alt="">
                    </div>
                </div>
                <div class="row" ng-if="photos.length > 0">
                    <img ng-src=""""),format.raw/*17.34*/("""{"""),format.raw/*17.35*/("""{"""),format.raw/*17.36*/("""photos[0].src"""),format.raw/*17.49*/("""}"""),format.raw/*17.50*/("""}"""),format.raw/*17.51*/("""" alt="">
                </div>
                <div class="row">
                    <div class="file-field input-field col s12">
                        <button class="btn file-select">
                            <span>"""),_display_(/*22.36*/Messages("owner.new.restaurant.select.photo")),format.raw/*22.81*/("""</span>
                        </button>
                        <input type="file" multiple ng-file-model="photos" accept="image/*" id="image-input">
                    </div>
                    <label class="image-error" ng-show="errors.photo">"""),_display_(/*26.72*/Messages("owner.new.restaurant.error.photo.miss")),format.raw/*26.121*/("""</label>
                    <label class="image-error" ng-show="errors.photoSize">"""),_display_(/*27.76*/Messages("owner.new.restaurant.error.photo.size")),format.raw/*27.125*/("""</label>
                </div>
            </div>
            <div class="col m8">
                <h4>"""),_display_(/*31.22*/Messages("owner.new.restaurant.info")),format.raw/*31.59*/("""</h4>
                <div class="input-field col s12">
                    <input type="text" id="name" ng-model="restaurant.name" ng-class=""""),format.raw/*33.87*/("""{"""),format.raw/*33.88*/("""invalid: errors.name"""),format.raw/*33.108*/("""}"""),format.raw/*33.109*/("""">
                    <label for="name">"""),_display_(/*34.40*/Messages("owner.new.restaurant.name")),format.raw/*34.77*/("""</label>
                </div>
                <div class="input-field col s12">
                    <input type="text" id="addressEdit" class="validate field"
                    ng-model="restaurant.address.completeAddress" vs-google-autocomplete="options"
                    vs-autocomplete-validator
                    vs-city="restaurant.address.city" vs-state="restaurant.address.state"
                    vs-country="restaurant.address.country" vs-district="restaurant.address.district"
                    vs-latitude="restaurant.address.lat" vs-longitude="restaurant.address.lng"
                    ng-class=""""),format.raw/*43.31*/("""{"""),format.raw/*43.32*/("""invalid: errors.address"""),format.raw/*43.55*/("""}"""),format.raw/*43.56*/("""">
                    <label for="addressEdit">"""),_display_(/*44.47*/Messages("owner.new.restaurant.address")),format.raw/*44.87*/("""</label>
                </div>
                <div class="input-field col s12" style="height: 30px">
                        <!-- Switch -->
                    <div class="switch">
                        <label>
                            """),_display_(/*50.30*/Messages("owner.new.restaurant.delivery")),format.raw/*50.71*/("""
                            """),format.raw/*51.29*/("""<input type="checkbox" ng-model="restaurant.isLocal">
                            <span class="lever"></span>
                            """),_display_(/*53.30*/Messages("owner.new.restaurant.local")),format.raw/*53.68*/("""
                        """),format.raw/*54.25*/("""</label>
                    </div>
                </div>
                <div class="input-field col s12" ng-show="restaurant.isLocal">
                    <input type="number" id="capacity" ng-model="restaurant.capacity" ng-class=""""),format.raw/*58.97*/("""{"""),format.raw/*58.98*/("""customInvalid: errors.capacity"""),format.raw/*58.128*/("""}"""),format.raw/*58.129*/("""">
                    <label for="capacity">"""),_display_(/*59.44*/Messages("owner.new.restaurant.capacity")),format.raw/*59.85*/("""</label>
                </div>
                <div class="input-field col s6" ng-hide="restaurant.isLocal">
                    <input type="number" id="radius" ng-model="restaurant.radius" ng-class=""""),format.raw/*62.93*/("""{"""),format.raw/*62.94*/("""invalid: errors.radius"""),format.raw/*62.116*/("""}"""),format.raw/*62.117*/("""">
                    <label for="radius">"""),_display_(/*63.42*/Messages("owner.new.restaurant.radio")),format.raw/*63.80*/("""</label>
                </div>
                <div class="input-field col s6" ng-hide="restaurant.isLocal">
                    <input type="number" id="responseTime" ng-model="restaurant.responseTime" ng-class=""""),format.raw/*66.105*/("""{"""),format.raw/*66.106*/("""invalid: errors.responseTime"""),format.raw/*66.134*/("""}"""),format.raw/*66.135*/("""">
                    <label for="responseTime">"""),_display_(/*67.48*/Messages("owner.new.restaurant.average.response.time")),format.raw/*67.102*/("""</label>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="input-field col s12">
                <textarea name="description" id="description" cols="30" rows="10" ng-model="restaurant.description" class="materialize-textarea" ng-class=""""),format.raw/*73.156*/("""{"""),format.raw/*73.157*/("""invalid: errors.description"""),format.raw/*73.184*/("""}"""),format.raw/*73.185*/(""""></textarea>
                <label for="description">"""),_display_(/*74.43*/Messages("owner.new.restaurant.description")),format.raw/*74.87*/("""</label>
            </div>
        </div>
        <div class="row">
            <h4>"""),_display_(/*78.18*/Messages("owner.new.restaurant.business.days")),format.raw/*78.64*/("""</h4>
            <div class="col" ng-class=""""),format.raw/*79.40*/("""{"""),format.raw/*79.41*/("""m3: selectedDays, m12: !selectedDays || selectedDays.length == 0"""),format.raw/*79.105*/("""}"""),format.raw/*79.106*/("""">
                <div class="input-field col m12" ng-class=""""),format.raw/*80.60*/("""{"""),format.raw/*80.61*/("""customInvalid: errors.days"""),format.raw/*80.87*/("""}"""),format.raw/*80.88*/("""">
                    <select ng-model="selectedDays" material-select multiple watch>
                        <option value="" disabled selected>"""),_display_(/*82.61*/Messages("owner.new.restaurant.select")),format.raw/*82.100*/("""</option>
                        <option ng-repeat="day in days">"""),format.raw/*83.57*/("""{"""),format.raw/*83.58*/("""{"""),format.raw/*83.59*/("""day.day"""),format.raw/*83.66*/("""}"""),format.raw/*83.67*/("""}"""),format.raw/*83.68*/("""</option>
                    </select>
                </div>
            </div>
            <div class="col m9" ng-show="selectedDays">
                <div class="chip" chips ng-repeat="day in selectedDays">"""),format.raw/*88.73*/("""{"""),format.raw/*88.74*/("""{"""),format.raw/*88.75*/("""day"""),format.raw/*88.78*/("""}"""),format.raw/*88.79*/("""}"""),format.raw/*88.80*/("""</div>
            </div>
        </div>
        <div class="row">
            <h4>"""),_display_(/*92.18*/Messages("owner.new.restaurant.business.hour")),format.raw/*92.64*/("""</h4>
            <div class="col m6">
                <div class="input-field">
                    <label for="input_starttime">"""),_display_(/*95.51*/Messages("owner.new.restaurant.from")),format.raw/*95.88*/("""</label>
                    <input type="text" id="input_starttime" class="timepicker" input-clock data-twelvehour="false" ng-model="restaurant.startTime" ng-class=""""),format.raw/*96.158*/("""{"""),format.raw/*96.159*/("""invalid: errors.time"""),format.raw/*96.179*/("""}"""),format.raw/*96.180*/("""">
                </div>
            </div>
            <div class="col m6">
                <div class="input-field">
                    <label for="input_endtime">"""),_display_(/*101.49*/Messages("owner.new.restaurant.to")),format.raw/*101.84*/("""</label>
                    <input type="text" id="input_endtime" class="timepicker" input-clock data-twelvehour="false" ng-model="restaurant.endTime" ng-class=""""),format.raw/*102.154*/("""{"""),format.raw/*102.155*/("""invalid: errors.time"""),format.raw/*102.175*/("""}"""),format.raw/*102.176*/("""">
                </div>
            </div>
        </div>
        <div class="row">
            <h4>"""),_display_(/*107.18*/Messages("owner.new.restaurant.type.of.meal")),format.raw/*107.63*/("""</h4>
            <div class="col" ng-class=""""),format.raw/*108.40*/("""{"""),format.raw/*108.41*/("""m3: selectedCuisines, m12: !selectedCuisines || selectedCuisines.length == 0"""),format.raw/*108.117*/("""}"""),format.raw/*108.118*/("""">
                <div class="input-field col m12" ng-class=""""),format.raw/*109.60*/("""{"""),format.raw/*109.61*/("""customInvalid: errors.cuisines"""),format.raw/*109.91*/("""}"""),format.raw/*109.92*/("""">
                    <select ng-model="selectedCuisines" material-select multiple watch >
                        <option value="" disabled selected>"""),_display_(/*111.61*/Messages("owner.new.restaurant.select")),format.raw/*111.100*/("""</option>
                        <option ng-repeat="cuisine in cuisines">"""),format.raw/*112.65*/("""{"""),format.raw/*112.66*/("""{"""),format.raw/*112.67*/("""cuisine.name"""),format.raw/*112.79*/("""}"""),format.raw/*112.80*/("""}"""),format.raw/*112.81*/("""</option>
                    </select>
                </div>
            </div>
            <div class="col m9" ng-show="selectedCuisines">
                <div class="chip" chips ng-repeat="cuisine in selectedCuisines">"""),format.raw/*117.81*/("""{"""),format.raw/*117.82*/("""{"""),format.raw/*117.83*/("""cuisine"""),format.raw/*117.90*/("""}"""),format.raw/*117.91*/("""}"""),format.raw/*117.92*/("""</div>
            </div>
        </div>
        <div class="row">
            <div class="btn btn-large right" ng-click="restaurantSubmit()">"""),_display_(/*121.77*/Messages("owner.new.restaurant.send")),format.raw/*121.114*/("""</div>
        </div>
    </div>
""")))}/*124.2*/ {_display_(Seq[Any](format.raw/*124.4*/("""
    """),format.raw/*125.137*/("""
    """),format.raw/*126.5*/("""<link rel="stylesheet" href=""""),_display_(/*126.35*/routes/*126.41*/.Assets.versioned("stylesheets/owner/newRestaurant.css")),format.raw/*126.97*/("""">
""")))}/*127.2*/ {_display_(Seq[Any](format.raw/*127.4*/("""
    """),format.raw/*128.5*/("""<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDM9GdrRT-5ML6OHeHGIIs0zNFjJmOaQUM&libraries=places"></script>
    <script src=""""),_display_(/*129.19*/routes/*129.25*/.Assets.versioned("external/vs-google-autocomplete/vs-google-autocomplete.js")),format.raw/*129.103*/(""""></script>
    <script src=""""),_display_(/*130.19*/routes/*130.25*/.Assets.versioned("external/vs-google-autocomplete/vs-autocomplete-validator.js")),format.raw/*130.106*/(""""></script>
    """),format.raw/*131.128*/("""
    """),format.raw/*132.5*/("""<script src=""""),_display_(/*132.19*/routes/*132.25*/.Assets.versioned("javascripts/owner/newRestaurant.js")),format.raw/*132.80*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*133.19*/routes/*133.25*/.Assets.versioned("javascripts/languageSelector.js")),format.raw/*133.77*/(""""></script>
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
object newRestaurant extends newRestaurant_Scope0.newRestaurant
              /*
                  -- GENERATED --
                  DATE: Fri Jul 21 01:58:11 ART 2017
                  SOURCE: /Users/Gustavo/Desktop/laboratorio/reservando/app/views/newRestaurant.scala.html
                  HASH: c4fbfce03e759e44ffae4a0d9870ae19f0b203b2
                  MATRIX: 763->1|878->21|905->23|917->28|949->52|988->54|1019->60|1057->78|1088->84|1134->110|1165->115|1315->239|1382->286|1834->710|1863->711|1892->712|1933->725|1962->726|1991->727|2242->951|2308->996|2585->1246|2656->1295|2767->1379|2838->1428|2970->1533|3028->1570|3198->1712|3227->1713|3276->1733|3306->1734|3375->1776|3433->1813|4084->2436|4113->2437|4164->2460|4193->2461|4269->2510|4330->2550|4602->2795|4664->2836|4721->2865|4887->3004|4946->3042|4999->3067|5261->3301|5290->3302|5349->3332|5379->3333|5452->3379|5514->3420|5744->3622|5773->3623|5824->3645|5854->3646|5925->3690|5984->3728|6227->3942|6257->3943|6314->3971|6344->3972|6421->4022|6497->4076|6819->4369|6849->4370|6905->4397|6935->4398|7018->4454|7083->4498|7196->4584|7263->4630|7336->4675|7365->4676|7458->4740|7488->4741|7578->4803|7607->4804|7661->4830|7690->4831|7864->4978|7925->5017|8019->5083|8048->5084|8077->5085|8112->5092|8141->5093|8170->5094|8408->5304|8437->5305|8466->5306|8497->5309|8526->5310|8555->5311|8666->5395|8733->5441|8891->5572|8949->5609|9144->5775|9174->5776|9223->5796|9253->5797|9449->5965|9506->6000|9698->6162|9729->6163|9779->6183|9810->6184|9941->6287|10008->6332|10082->6377|10112->6378|10218->6454|10249->6455|10340->6517|10370->6518|10429->6548|10459->6549|10639->6701|10701->6740|10804->6814|10834->6815|10864->6816|10905->6828|10935->6829|10965->6830|11216->7052|11246->7053|11276->7054|11312->7061|11342->7062|11372->7063|11543->7206|11603->7243|11656->7277|11696->7279|11731->7416|11764->7421|11822->7451|11838->7457|11916->7513|11939->7517|11979->7519|12012->7524|12206->7690|12222->7696|12323->7774|12381->7804|12397->7810|12501->7891|12547->8030|12580->8035|12622->8049|12638->8055|12715->8110|12796->8163|12812->8169|12886->8221
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|34->3|34->3|35->4|35->4|36->5|38->7|38->7|48->17|48->17|48->17|48->17|48->17|48->17|53->22|53->22|57->26|57->26|58->27|58->27|62->31|62->31|64->33|64->33|64->33|64->33|65->34|65->34|74->43|74->43|74->43|74->43|75->44|75->44|81->50|81->50|82->51|84->53|84->53|85->54|89->58|89->58|89->58|89->58|90->59|90->59|93->62|93->62|93->62|93->62|94->63|94->63|97->66|97->66|97->66|97->66|98->67|98->67|104->73|104->73|104->73|104->73|105->74|105->74|109->78|109->78|110->79|110->79|110->79|110->79|111->80|111->80|111->80|111->80|113->82|113->82|114->83|114->83|114->83|114->83|114->83|114->83|119->88|119->88|119->88|119->88|119->88|119->88|123->92|123->92|126->95|126->95|127->96|127->96|127->96|127->96|132->101|132->101|133->102|133->102|133->102|133->102|138->107|138->107|139->108|139->108|139->108|139->108|140->109|140->109|140->109|140->109|142->111|142->111|143->112|143->112|143->112|143->112|143->112|143->112|148->117|148->117|148->117|148->117|148->117|148->117|152->121|152->121|155->124|155->124|156->125|157->126|157->126|157->126|157->126|158->127|158->127|159->128|160->129|160->129|160->129|161->130|161->130|161->130|162->131|163->132|163->132|163->132|163->132|164->133|164->133|164->133
                  -- GENERATED --
              */
          