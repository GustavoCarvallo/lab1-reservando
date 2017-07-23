
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newOrder_Scope0 {
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

class newOrder extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
"""),_display_(/*2.2*/views/*2.7*/.html.main("Reservando")/*2.31*/ {_display_(Seq[Any](format.raw/*2.33*/("""
    """),_display_(/*3.6*/clientNav(messages)),format.raw/*3.25*/("""
    """),_display_(/*4.6*/languageSelector(messages)),format.raw/*4.32*/("""
    """),format.raw/*5.5*/("""<div class="container" ng-controller="NewOrderCtrl">
        <div class="row title">
            <h3>"""),_display_(/*7.18*/Messages("client.new.order.new.order.for")),format.raw/*7.60*/(""": """),format.raw/*7.62*/("""{"""),format.raw/*7.63*/("""{"""),format.raw/*7.64*/("""restaurant.name"""),format.raw/*7.79*/("""}"""),format.raw/*7.80*/("""}"""),format.raw/*7.81*/("""</h3>
        </div>
        <div class="row address">
            <div class="row"><h5>"""),_display_(/*10.35*/Messages("client.new.order.delivery.address")),format.raw/*10.80*/("""</h5></div>
            <div class="row">
                <div class="col s6">
                    <div class="row">
                        <div class="col s12" ng-hide="editAddress">
                            <div class="input-field">
                                <i class="material-icons prefix" >place</i>
                                <input type="text" ng-model="orderObject.address.completeAddress" id="currentAddress" class="active" disabled autofocus>
                                <label for="currentAddress" class="active">"""),_display_(/*18.77*/Messages("client.new.order.address")),format.raw/*18.113*/("""</label>
                            </div>
                        </div>
                        <div class="col s12" ng-hide="editAddress">
                            <div class="input-field">
                                <div class="btn btn-large fullBtn" ng-click="toggleEditAddress(true)">"""),_display_(/*23.104*/Messages("client.new.order.change.address")),format.raw/*23.147*/("""</div>
                            </div>
                        </div>
                        <div class="col s12" ng-show="editAddress">
                            <div class="input-field">
                                <i class="material-icons prefix" >place</i>
                                <input type="text" id="address"
                                ng-model="orderObject.address.completeAddress" vs-google-autocomplete="options"
                                vs-autocomplete-validator
                                vs-city="orderObject.address.city" vs-state="orderObject.address.state"
                                vs-country="orderObject.address.country" vs-district="orderObject.address.district"
                                vs-latitude="orderObject.address.lat" vs-longitude="orderObject.address.lng">
                                <label for="address">"""),_display_(/*35.55*/Messages("client.new.order.address")),format.raw/*35.91*/("""</label>
                            </div>
                        </div>
                        <div class="col s12" ng-show="editAddress">
                            <div class="input-field">
                                <div class="btn btn-large fullBtn" ng-click="getGeolocateAddress()" >"""),_display_(/*40.103*/Messages("client.new.order.geolocate")),format.raw/*40.141*/("""</div>
                            </div>
                        </div>
                        <div class="col s12" ng-show="editAddress">
                            <div class="input-field">
                                <div class="btn btn-large fullBtn" ng-click="toggleEditAddress(false)">"""),_display_(/*45.105*/Messages("client.new.order.use.my.address")),format.raw/*45.148*/("""</div>
                            </div>
                        </div>
                        <div class="col s12" ng-show="editAddress">
                            <div class="input-field">
                                <div class="btn btn-large fullBtn" ng-click="changeAddress()">"""),_display_(/*50.96*/Messages("client.new.order.confirm")),format.raw/*50.132*/("""</div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col s6">
                    <div class="row">
                        <ng-map center="["""),format.raw/*57.42*/("""{"""),format.raw/*57.43*/("""{"""),format.raw/*57.44*/("""coordinates.lat"""),format.raw/*57.59*/("""}"""),format.raw/*57.60*/("""}"""),format.raw/*57.61*/(""", """),format.raw/*57.63*/("""{"""),format.raw/*57.64*/("""{"""),format.raw/*57.65*/("""coordinates.lng"""),format.raw/*57.80*/("""}"""),format.raw/*57.81*/("""}"""),format.raw/*57.82*/("""]">
                            <marker position=""""),format.raw/*58.47*/("""{"""),format.raw/*58.48*/("""{"""),format.raw/*58.49*/("""coordinates.lat"""),format.raw/*58.64*/("""}"""),format.raw/*58.65*/("""}"""),format.raw/*58.66*/(""", """),format.raw/*58.68*/("""{"""),format.raw/*58.69*/("""{"""),format.raw/*58.70*/("""coordinates.lng"""),format.raw/*58.85*/("""}"""),format.raw/*58.86*/("""}"""),format.raw/*58.87*/(""""></marker>
                        </ng-map>
                    </div>
                </div>

            </div>
        </div>
        <div class="row menu">
            <div class="col s7">
                <div class="row"><h5>"""),_display_(/*67.39*/Messages("client.new.order.meals")),format.raw/*67.73*/("""</h5></div>
                <div class="row">
                    <table class="centered highlight">
                        <thead>
                            <tr>
                                <th></th>
                                <th>"""),_display_(/*73.38*/Messages("client.new.order.meal")),format.raw/*73.71*/("""</th>
                                <th>"""),_display_(/*74.38*/Messages("client.new.order.price")),format.raw/*74.72*/("""</th>
                                <th>"""),_display_(/*75.38*/Messages("client.new.order.quantity")),format.raw/*75.75*/("""</th>
                                <th>"""),_display_(/*76.38*/Messages("client.new.order.subtotal")),format.raw/*76.75*/("""</th>
                            </tr>
                        </thead>

                        <tbody>
                            <tr ng-repeat="orderEntry in orderObject.menu">
                                <td><img ng-src=""""),_display_(/*82.51*/routes/*82.57*/.Assets.versioned("{{orderEntry.meal.photo.path}}")),format.raw/*82.108*/("""" alt=""></td>
                                <td>"""),format.raw/*83.37*/("""{"""),format.raw/*83.38*/("""{"""),format.raw/*83.39*/("""orderEntry.meal.name"""),format.raw/*83.59*/("""}"""),format.raw/*83.60*/("""}"""),format.raw/*83.61*/("""</td>
                                <td>$"""),format.raw/*84.38*/("""{"""),format.raw/*84.39*/("""{"""),format.raw/*84.40*/("""orderEntry.meal.price"""),format.raw/*84.61*/("""}"""),format.raw/*84.62*/("""}"""),format.raw/*84.63*/("""</td>
                                <td>
                                    <input type="number" ng-model="orderEntry.amount" min="0">
                                </td>
                                <td>$"""),format.raw/*88.38*/("""{"""),format.raw/*88.39*/("""{"""),format.raw/*88.40*/("""calculateSubtotal(orderEntry)"""),format.raw/*88.69*/("""}"""),format.raw/*88.70*/("""}"""),format.raw/*88.71*/("""</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="col s5">
                <div class="row"><h5>"""),_display_(/*95.39*/Messages("client.new.order.total.label")),format.raw/*95.79*/("""</h5></div>
                <div class="row">
                    <div class="row">
                        <div class="col s12">
                            <h5>"""),_display_(/*99.34*/Messages("client.new.order.discount.voucher")),format.raw/*99.79*/("""</h5>
                        </div>
                        <div class="col s12">
                            <p>
                                <input name="discount" type="checkbox" id="discount" ng-click="hasDiscount = !hasDiscount"/>
                                <label for="discount">"""),_display_(/*104.56*/Messages("client.new.order.have.a.discount.voucher")),format.raw/*104.108*/("""</label>
                            </p>
                        </div>
                        <div class="col s6" ng-show="hasDiscount">
                            <div class="input-field">
                                <input type="text" ng-model="discCode" id="discountCode" ng-change="resetCode()">
                                <label for="discountCode">"""),_display_(/*110.60*/Messages("client.new.order.discount.code")),format.raw/*110.102*/("""</label>
                            </div>
                        </div>
                        <div class="col s4" ng-show="hasDiscount && validCode">
                            <div class="input-field">
                                <input type="text" ng-model="discount.discount" id="disc" readonly autofocus>
                                <label for="disc">"""),_display_(/*116.52*/Messages("client.new.order.discount")),format.raw/*116.89*/("""</label>
                            </div>
                        </div>
                        <div class="col s2" ng-show="hasDiscount">
                            <div class="input-field">
                                <i class="material-icons prefix send tooltipped" ng-click="checkCode()" ng-show="!invalidCode && !validCode" data-position="right" data-delay="120" data-tooltip=""""),_display_(/*121.196*/messages("client.new.order.data-tooltip")),format.raw/*121.237*/("""">send</i>
                                <i class="material-icons prefix" ng-show="validCode">check_circle</i>
                                <i class="material-icons prefix" ng-show="invalidCode">error</i>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row"><h4>"""),_display_(/*128.39*/Messages("client.new.order.total")),format.raw/*128.73*/(""": """),format.raw/*128.75*/("""{"""),format.raw/*128.76*/("""{"""),format.raw/*128.77*/("""total | currency"""),format.raw/*128.93*/("""}"""),format.raw/*128.94*/("""}"""),format.raw/*128.95*/("""</h4></div>
            </div>
        </div>
        <div class="row buttons">
            <div class="col s6 offset-s3" >
                <div class="btn-large btn fullBtn" ng-click="saveOrder()" ng-show="total != 0">"""),_display_(/*133.97*/Messages("client.new.order.make.order")),format.raw/*133.136*/("""</div>
                <div class="btn-large btn fullBtn disabled" ng-show="total == 0">"""),_display_(/*134.83*/Messages("client.new.order.make.order")),format.raw/*134.122*/("""</div>
            </div>
        </div>
    </div>
""")))}/*138.2*/ {_display_(Seq[Any](format.raw/*138.4*/("""
    """),format.raw/*139.5*/("""<link rel="stylesheet" href=""""),_display_(/*139.35*/routes/*139.41*/.Assets.versioned("stylesheets/client/newOrder.css")),format.raw/*139.93*/("""">
""")))}/*140.2*/ {_display_(Seq[Any](format.raw/*140.4*/("""
    """),format.raw/*141.5*/("""<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDM9GdrRT-5ML6OHeHGIIs0zNFjJmOaQUM&libraries=places"></script>
    <script src=""""),_display_(/*142.19*/routes/*142.25*/.Assets.versioned("external/vs-google-autocomplete/vs-google-autocomplete.js")),format.raw/*142.103*/(""""></script>
    <script src=""""),_display_(/*143.19*/routes/*143.25*/.Assets.versioned("external/vs-google-autocomplete/vs-autocomplete-validator.js")),format.raw/*143.106*/(""""></script>
    <script src=""""),_display_(/*144.19*/routes/*144.25*/.Assets.versioned("external/ngMap/ng-map.min.js")),format.raw/*144.74*/(""""></script>
    <script src=""""),_display_(/*145.19*/routes/*145.25*/.Assets.versioned("javascripts/client/newOrder.js")),format.raw/*145.76*/(""""></script>
    <script src=""""),_display_(/*146.19*/routes/*146.25*/.Assets.versioned("javascripts/languageSelector.js")),format.raw/*146.77*/(""""></script>
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
object newOrder extends newOrder_Scope0.newOrder
              /*
                  -- GENERATED --
                  DATE: Fri Jul 21 01:38:48 ART 2017
                  SOURCE: /Users/Gustavo/Desktop/laboratorio/reservando/app/views/newOrder.scala.html
                  HASH: d251409b38c58718644bc54faf0948da0c69ab30
                  MATRIX: 753->1|868->21|895->23|907->28|939->52|978->54|1009->60|1048->79|1079->85|1125->111|1156->116|1284->218|1346->260|1375->262|1403->263|1431->264|1473->279|1501->280|1529->281|1645->370|1711->415|2282->959|2340->995|2668->1295|2733->1338|3649->2227|3706->2263|4033->2562|4093->2600|4420->2899|4485->2942|4802->3232|4860->3268|5127->3507|5156->3508|5185->3509|5228->3524|5257->3525|5286->3526|5316->3528|5345->3529|5374->3530|5417->3545|5446->3546|5475->3547|5553->3597|5582->3598|5611->3599|5654->3614|5683->3615|5712->3616|5742->3618|5771->3619|5800->3620|5843->3635|5872->3636|5901->3637|6161->3870|6216->3904|6488->4149|6542->4182|6612->4225|6667->4259|6737->4302|6795->4339|6865->4382|6923->4419|7182->4651|7197->4657|7270->4708|7349->4759|7378->4760|7407->4761|7455->4781|7484->4782|7513->4783|7584->4826|7613->4827|7642->4828|7691->4849|7720->4850|7749->4851|7990->5064|8019->5065|8048->5066|8105->5095|8134->5096|8163->5097|8405->5312|8466->5352|8656->5515|8722->5560|9045->5855|9120->5907|9515->6274|9580->6316|9978->6686|10037->6723|10457->7114|10521->7155|10913->7519|10969->7553|11000->7555|11030->7556|11060->7557|11105->7573|11135->7574|11165->7575|11413->7795|11475->7834|11592->7923|11654->7962|11726->8015|11766->8017|11799->8022|11857->8052|11873->8058|11947->8110|11970->8114|12010->8116|12043->8121|12237->8287|12253->8293|12354->8371|12412->8401|12428->8407|12532->8488|12590->8518|12606->8524|12677->8573|12735->8603|12751->8609|12824->8660|12882->8690|12898->8696|12972->8748
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|34->3|34->3|35->4|35->4|36->5|38->7|38->7|38->7|38->7|38->7|38->7|38->7|38->7|41->10|41->10|49->18|49->18|54->23|54->23|66->35|66->35|71->40|71->40|76->45|76->45|81->50|81->50|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|88->57|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|89->58|98->67|98->67|104->73|104->73|105->74|105->74|106->75|106->75|107->76|107->76|113->82|113->82|113->82|114->83|114->83|114->83|114->83|114->83|114->83|115->84|115->84|115->84|115->84|115->84|115->84|119->88|119->88|119->88|119->88|119->88|119->88|126->95|126->95|130->99|130->99|135->104|135->104|141->110|141->110|147->116|147->116|152->121|152->121|159->128|159->128|159->128|159->128|159->128|159->128|159->128|159->128|164->133|164->133|165->134|165->134|169->138|169->138|170->139|170->139|170->139|170->139|171->140|171->140|172->141|173->142|173->142|173->142|174->143|174->143|174->143|175->144|175->144|175->144|176->145|176->145|176->145|177->146|177->146|177->146
                  -- GENERATED --
              */
          