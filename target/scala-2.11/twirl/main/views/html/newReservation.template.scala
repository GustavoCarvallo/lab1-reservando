
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newReservation_Scope0 {
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

class newReservation extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
"""),_display_(/*2.2*/views/*2.7*/.html.main("Reservando")/*2.31*/ {_display_(Seq[Any](format.raw/*2.33*/("""
    """),_display_(/*3.6*/clientNav(messages)),format.raw/*3.25*/("""
    """),_display_(/*4.6*/languageSelector(messages)),format.raw/*4.32*/("""
    """),format.raw/*5.5*/("""<div class="container" ng-controller="NewReservationCtrl">
        <div class="row title">
            <h3>"""),_display_(/*7.18*/Messages("client.new.reservation.new.reservation.in")),format.raw/*7.71*/(""": """),format.raw/*7.73*/("""{"""),format.raw/*7.74*/("""{"""),format.raw/*7.75*/("""restaurant.name"""),format.raw/*7.90*/("""}"""),format.raw/*7.91*/("""}"""),format.raw/*7.92*/("""</h3>
        </div>
        <div class="row">
            <div class="col s6">
                <div class="row">
                    <div class="col s12">
                        <h5>"""),_display_(/*13.30*/Messages("client.new.reservation.select.date")),format.raw/*13.76*/("""</h5>
                    </div>
                    <div class="col s12">
                        <div class="input-field">
                            <input class="datepicker" type="text" input-date id="selectedDay" ng-model="reservation.date2" ng-change="checkComplete()" disable="disable">
                            <label for="selectedDay" class="active">"""),_display_(/*18.70*/Messages("client.new.reservation.date")),format.raw/*18.109*/("""</label>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col s12">
                        <h5>"""),_display_(/*24.30*/Messages("client.new.reservation.select.time")),format.raw/*24.76*/("""</h5>
                    </div>
                    <div class="col s12">
                        <div class="timeChip hoverable valign-wrapper waves-effect waves-red waves-ripple z-depth-2" ng-repeat="turn in turns" ng-class=""""),format.raw/*27.154*/("""{"""),format.raw/*27.155*/("""'selected': $index == selectedTurnIndex, 'z-depth-4': $index == selectedTurnIndex"""),format.raw/*27.236*/("""}"""),format.raw/*27.237*/("""" ng-click="selectTurn($index)">
                            <span>"""),format.raw/*28.35*/("""{"""),format.raw/*28.36*/("""{"""),format.raw/*28.37*/("""turn"""),format.raw/*28.41*/("""}"""),format.raw/*28.42*/("""}"""),format.raw/*28.43*/("""</span>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col s12">
                        <h5>"""),_display_(/*34.30*/Messages("client.new.reservation.amount.of.people")),format.raw/*34.81*/("""</h5>
                    </div>
                    <div class="col s12">
                        <div class="input-field">
                            <input type="number" name="amount" id="amount" ng-model="reservation.amount"
                                ng-change="checkComplete()" min="1" max=""""),format.raw/*39.74*/("""{"""),format.raw/*39.75*/("""{"""),format.raw/*39.76*/("""restaurant.capacity"""),format.raw/*39.95*/("""}"""),format.raw/*39.96*/("""}"""),format.raw/*39.97*/("""">
                            <label for="amount"> """),_display_(/*40.51*/Messages("client.new.reservation.max.amount.of.people")),format.raw/*40.106*/(""": """),format.raw/*40.108*/("""{"""),format.raw/*40.109*/("""{"""),format.raw/*40.110*/("""restaurant.capacity"""),format.raw/*40.129*/("""}"""),format.raw/*40.130*/("""}"""),format.raw/*40.131*/(""")</label>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col s12">
                        <h5>"""),_display_(/*46.30*/Messages("client.new.reservation.discount.voucher")),format.raw/*46.81*/("""</h5>
                    </div>
                    <div class="col s12">
                        <p>
                            <input name="discount" type="checkbox" id="discount" ng-click="hasDiscount = !hasDiscount"/>
                            <label for="discount">"""),_display_(/*51.52*/Messages("client.new.reservation.have.a.discount.voucher")),format.raw/*51.110*/("""</label>
                        </p>
                    </div>
                    <div class="col s6" ng-show="hasDiscount">
                        <div class="input-field">
                            <input type="text" ng-model="discCode" id="discountCode" ng-change="resetCode()">
                            <label for="discountCode">"""),_display_(/*57.56*/Messages("client.new.reservation.discount.code")),format.raw/*57.104*/("""</label>
                        </div>
                    </div>
                    <div class="col s4" ng-show="validCode && hasDiscount">
                        <div class="input-field">
                            <input type="text" ng-model="discount.discount" id="disc" readonly>
                            <label for="disc">"""),_display_(/*63.48*/Messages("client.new.reservation.discount")),format.raw/*63.91*/("""</label>
                        </div>
                    </div>
                    <div class="col s2" ng-show="hasDiscount">
                        <div class="input-field">
                            <i class="material-icons prefix send tooltipped" ng-click="checkCode()" ng-show="!invalidCode && !validCode" data-position="right" data-delay="120" data-tooltip=""""),_display_(/*68.192*/messages("client.new.reservation.data-tooltip")),format.raw/*68.239*/("""">send</i>
                            <i class="material-icons prefix" ng-show="validCode">check_circle</i>
                            <i class="material-icons prefix" ng-show="invalidCode">error</i>
                        </div>
                    </div>
                </div>
                <div class="row buttons">
                    <div class="col s6 offset-s3" >
                        <div class="btn-large btn fullBtn" ng-click="saveReservation()" ng-show="reservationComplete">"""),_display_(/*76.120*/Messages("client.new.reservation.make.reservation")),format.raw/*76.171*/("""</div>
                        <div class="btn-large btn fullBtn disabled" ng-hide="reservationComplete">"""),_display_(/*77.100*/Messages("client.new.reservation.make.reservation")),format.raw/*77.151*/("""</div>
                    </div>
                </div>
            </div>
            <div class="col s6">
                <div class="row">
                    <div class="col s12">
                        <div class="row">
                            <ng-map center="["""),format.raw/*85.46*/("""{"""),format.raw/*85.47*/("""{"""),format.raw/*85.48*/("""coordinates.lat"""),format.raw/*85.63*/("""}"""),format.raw/*85.64*/("""}"""),format.raw/*85.65*/(""", """),format.raw/*85.67*/("""{"""),format.raw/*85.68*/("""{"""),format.raw/*85.69*/("""coordinates.lng"""),format.raw/*85.84*/("""}"""),format.raw/*85.85*/("""}"""),format.raw/*85.86*/("""]">
                                <marker position=""""),format.raw/*86.51*/("""{"""),format.raw/*86.52*/("""{"""),format.raw/*86.53*/("""coordinates.lat"""),format.raw/*86.68*/("""}"""),format.raw/*86.69*/("""}"""),format.raw/*86.70*/(""", """),format.raw/*86.72*/("""{"""),format.raw/*86.73*/("""{"""),format.raw/*86.74*/("""coordinates.lng"""),format.raw/*86.89*/("""}"""),format.raw/*86.90*/("""}"""),format.raw/*86.91*/(""""></marker>
                            </ng-map>
                        </div>
                    </div>
                    <div class="col s12">
                        <div class="row"><h5>"""),_display_(/*91.47*/Messages("client.new.reservation.foods")),format.raw/*91.87*/("""</h5></div>
                        <div class="row">
                            <table class="centered highlight">
                                <thead>
                                    <tr>
                                        <th></th>
                                        <th>"""),_display_(/*97.46*/Messages("client.new.reservation.food")),format.raw/*97.85*/("""</th>
                                        <th>"""),_display_(/*98.46*/Messages("client.new.reservation.price")),format.raw/*98.86*/("""</th>
                                    </tr>
                                </thead>

                                <tbody>
                                    <tr ng-repeat="meal in menu">
                                        <td><img ng-src=""""),_display_(/*104.59*/routes/*104.65*/.Assets.versioned("{{meal.photo.path}}")),format.raw/*104.105*/("""" alt=""></td>
                                        <td>"""),format.raw/*105.45*/("""{"""),format.raw/*105.46*/("""{"""),format.raw/*105.47*/("""meal.name"""),format.raw/*105.56*/("""}"""),format.raw/*105.57*/("""}"""),format.raw/*105.58*/("""</td>
                                        <td>$"""),format.raw/*106.46*/("""{"""),format.raw/*106.47*/("""{"""),format.raw/*106.48*/("""meal.price"""),format.raw/*106.58*/("""}"""),format.raw/*106.59*/("""}"""),format.raw/*106.60*/("""</td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>
""")))}/*117.2*/ {_display_(Seq[Any](format.raw/*117.4*/("""
    """),format.raw/*118.5*/("""<link rel="stylesheet" href=""""),_display_(/*118.35*/routes/*118.41*/.Assets.versioned("stylesheets/client/newReservation.css")),format.raw/*118.99*/("""">
""")))}/*119.2*/ {_display_(Seq[Any](format.raw/*119.4*/("""
    """),format.raw/*120.5*/("""<script src=""""),_display_(/*120.19*/routes/*120.25*/.Assets.versioned("javascripts/utils/geocode.js")),format.raw/*120.74*/(""""></script>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDx5ARsKyUaIV0uBUuCs7M6HxvUOtvcm-E&libraries=places&callback=initAutocomplete"
    async defer></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/angular-materialize/0.2.2/angular-materialize.min.js"></script>
    <script src=""""),_display_(/*124.19*/routes/*124.25*/.Assets.versioned("external/ngMap/ng-map.min.js")),format.raw/*124.74*/(""""></script>
    <script src=""""),_display_(/*125.19*/routes/*125.25*/.Assets.versioned("javascripts/client/newReservation.js")),format.raw/*125.82*/(""""></script>
    <script src=""""),_display_(/*126.19*/routes/*126.25*/.Assets.versioned("javascripts/languageSelector.js")),format.raw/*126.77*/(""""></script>
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
object newReservation extends newReservation_Scope0.newReservation
              /*
                  -- GENERATED --
                  DATE: Thu Jul 20 23:41:16 ART 2017
                  SOURCE: /Users/Gustavo/Desktop/laboratorio/reservando/app/views/newReservation.scala.html
                  HASH: 6742f3410315259212cf7bb5bba8f183815bb175
                  MATRIX: 765->1|880->21|907->23|919->28|951->52|990->54|1021->60|1060->79|1091->85|1137->111|1168->116|1302->224|1375->277|1404->279|1432->280|1460->281|1502->296|1530->297|1558->298|1770->483|1837->529|2228->893|2289->932|2511->1127|2578->1173|2835->1401|2865->1402|2975->1483|3005->1484|3100->1551|3129->1552|3158->1553|3190->1557|3219->1558|3248->1559|3469->1753|3541->1804|3872->2107|3901->2108|3930->2109|3977->2128|4006->2129|4035->2130|4115->2183|4192->2238|4223->2240|4253->2241|4283->2242|4331->2261|4361->2262|4391->2263|4614->2459|4686->2510|4988->2785|5068->2843|5438->3186|5508->3234|5871->3570|5935->3613|6334->3984|6403->4031|6927->4527|7000->4578|7134->4684|7207->4735|7507->5007|7536->5008|7565->5009|7608->5024|7637->5025|7666->5026|7696->5028|7725->5029|7754->5030|7797->5045|7826->5046|7855->5047|7937->5101|7966->5102|7995->5103|8038->5118|8067->5119|8096->5120|8126->5122|8155->5123|8184->5124|8227->5139|8256->5140|8285->5141|8508->5337|8569->5377|8889->5670|8949->5709|9027->5760|9088->5800|9370->6054|9386->6060|9449->6100|9537->6159|9567->6160|9597->6161|9635->6170|9665->6171|9695->6172|9775->6223|9805->6224|9835->6225|9874->6235|9904->6236|9934->6237|10207->6491|10247->6493|10280->6498|10338->6528|10354->6534|10434->6592|10457->6596|10497->6598|10530->6603|10572->6617|10588->6623|10659->6672|11031->7016|11047->7022|11118->7071|11176->7101|11192->7107|11271->7164|11329->7194|11345->7200|11419->7252
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|34->3|34->3|35->4|35->4|36->5|38->7|38->7|38->7|38->7|38->7|38->7|38->7|38->7|44->13|44->13|49->18|49->18|55->24|55->24|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|65->34|65->34|70->39|70->39|70->39|70->39|70->39|70->39|71->40|71->40|71->40|71->40|71->40|71->40|71->40|71->40|77->46|77->46|82->51|82->51|88->57|88->57|94->63|94->63|99->68|99->68|107->76|107->76|108->77|108->77|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|116->85|117->86|117->86|117->86|117->86|117->86|117->86|117->86|117->86|117->86|117->86|117->86|117->86|122->91|122->91|128->97|128->97|129->98|129->98|135->104|135->104|135->104|136->105|136->105|136->105|136->105|136->105|136->105|137->106|137->106|137->106|137->106|137->106|137->106|148->117|148->117|149->118|149->118|149->118|149->118|150->119|150->119|151->120|151->120|151->120|151->120|155->124|155->124|155->124|156->125|156->125|156->125|157->126|157->126|157->126
                  -- GENERATED --
              */
          