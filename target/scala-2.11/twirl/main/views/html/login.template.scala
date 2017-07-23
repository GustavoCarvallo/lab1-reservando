
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
"""),_display_(/*2.2*/views/*2.7*/.html.main("Reservando")/*2.31*/ {_display_(Seq[Any](format.raw/*2.33*/("""
    """),_display_(/*3.6*/languageSelector(messages)),format.raw/*3.32*/("""
    """),format.raw/*4.5*/("""<div ng-controller="loginCtrl" id="loginbody">
        <div class="bg-overlay">
            <div class="row navbar">
                <div class="col s6 offset-s6">
                    <div class="input-field col s4 offset-s2">
                        <input id="loginMail" type="email" class="validate field" ng-model="loginEmail" >
                        <label for="loginMail">"""),_display_(/*10.49*/Messages("login.email")),format.raw/*10.72*/("""</label>
                    </div>
                    <div class="input-field col s3">
                        <input id="loginPassword" type="password" class="validate field" ng-model="loginPassword">
                        <label for="loginPassword">"""),_display_(/*14.53*/Messages("login.password")),format.raw/*14.79*/("""</label>
                    </div>
                    <div class="input-field col s3">
                        <a class="waves-effect waves-light btn right" ng-click="login()">"""),_display_(/*17.91*/Messages("login.login")),format.raw/*17.114*/("""</a>
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row full-height">
                    <div class="col m7 full-height valign-wrapper title-wrap">
                        <div class="valign title">
                            <h1>"""),_display_(/*25.34*/Messages("login.title")),format.raw/*25.57*/("""</h1>
                            <h4>"""),_display_(/*26.34*/Messages("login.subtitle")),format.raw/*26.60*/("""</h4>
                        </div>

                    </div>
                    <div class="col m5 full-height valign-wrapper">
                        <div class="row valign login-section">
                            <div id="register" class="col s12">
                                <div class="input-field col s6">
                                    <input id="first_name" type="text" class="validate field" ng-model="firstName" ng-class=""""),format.raw/*34.126*/("""{"""),format.raw/*34.127*/("""invalid: firstNameError"""),format.raw/*34.150*/("""}"""),format.raw/*34.151*/("""">
                                    <label for="first_name">"""),_display_(/*35.62*/Messages("login.name")),format.raw/*35.84*/("""</label>
                                </div>
                                <div class="input-field col s6">
                                    <input id="last_name" type="text" class="validate field" ng-model="lastName" ng-class=""""),format.raw/*38.124*/("""{"""),format.raw/*38.125*/("""invalid: lastNameError"""),format.raw/*38.147*/("""}"""),format.raw/*38.148*/("""">
                                    <label for="last_name">"""),_display_(/*39.61*/Messages("login.lastName")),format.raw/*39.87*/("""</label>
                                </div>
                                <div class="input-field col s12">
                                    <input id="email" type="email" class="validate field" ng-model="email" ng-class=""""),format.raw/*42.118*/("""{"""),format.raw/*42.119*/("""invalid: emailError"""),format.raw/*42.138*/("""}"""),format.raw/*42.139*/("""" >
                                    <label for="email">"""),_display_(/*43.57*/Messages("login.email")),format.raw/*43.80*/("""</label>
                                </div>
                                <div class="input-field col s12">
                                    <input id="password" type="password" ng-model="password" ng-class=""""),format.raw/*46.104*/("""{"""),format.raw/*46.105*/("""valid: validPassword && pTouched, invalid: !validPassword && pTouched"""),format.raw/*46.174*/("""}"""),format.raw/*46.175*/("""" ng-change="validatePassword()" class="field">
                                    <label for="password">"""),_display_(/*47.60*/Messages("login.password")),format.raw/*47.86*/("""</label>
                                </div>
                                <div class="input-field col s12">
                                    <input id="password2" type="password" ng-model="password2" ng-class=""""),format.raw/*50.106*/("""{"""),format.raw/*50.107*/("""valid: validPassword2 && p2Touched, invalid: !validPassword2 && p2Touched"""),format.raw/*50.180*/("""}"""),format.raw/*50.181*/("""" ng-change="passwordValidation()" class="field">
                                    <label for="password2">"""),_display_(/*51.61*/Messages("login.validate.password")),format.raw/*51.96*/("""</label>
                                </div>
                                <div class="input-field col s12">
                                    <input type="text" id="address" class="validate field"
                                    ng-model="address.completeAddress" vs-google-autocomplete="options"
                                    vs-autocomplete-validator
                                    vs-city="address.city" vs-state="address.state"
                                    vs-country="address.country" vs-district="address.district"
                                    vs-latitude="address.lat" vs-longitude="address.lng"
                                    ng-class=""""),format.raw/*60.47*/("""{"""),format.raw/*60.48*/("""invalid: addressError"""),format.raw/*60.69*/("""}"""),format.raw/*60.70*/("""" placeholder="">
                                    <label for="address">"""),_display_(/*61.59*/Messages("login.address")),format.raw/*61.84*/("""</label>
                                </div>
                                <div class="input-field col s12" style="height: 30px">
                                        <!-- Switch -->
                                    <div class="switch">
                                        <label>
                                            """),_display_(/*67.46*/Messages("login.client")),format.raw/*67.70*/("""
                                            """),format.raw/*68.45*/("""<input type="checkbox" ng-model="userType">
                                            <span class="lever"></span>
                                            """),_display_(/*70.46*/Messages("login.owner")),format.raw/*70.69*/("""
                                        """),format.raw/*71.41*/("""</label>
                                    </div>
                                </div>
                                <div class="col s12">
                                    <a class="waves-effect waves-light btn right" ng-click="registerUser()">"""),_display_(/*75.110*/Messages("login.sign.in")),format.raw/*75.135*/("""</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

""")))}/*85.2*/{_display_(Seq[Any](format.raw/*85.3*/("""
    """),format.raw/*86.5*/("""<link rel="stylesheet" href=""""),_display_(/*86.35*/routes/*86.41*/.Assets.versioned("stylesheets/login.css")),format.raw/*86.83*/("""">
""")))}/*87.2*/{_display_(Seq[Any](format.raw/*87.3*/("""
    """),format.raw/*88.5*/("""<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDM9GdrRT-5ML6OHeHGIIs0zNFjJmOaQUM&libraries=places"></script>
    <script src=""""),_display_(/*89.19*/routes/*89.25*/.Assets.versioned("external/vs-google-autocomplete/vs-google-autocomplete.js")),format.raw/*89.103*/(""""></script>
    <script src=""""),_display_(/*90.19*/routes/*90.25*/.Assets.versioned("external/vs-google-autocomplete/vs-autocomplete-validator.js")),format.raw/*90.106*/(""""></script>
    <script src=""""),_display_(/*91.19*/routes/*91.25*/.Assets.versioned("javascripts/login.js")),format.raw/*91.66*/(""""></script>
    <script src=""""),_display_(/*92.19*/routes/*92.25*/.Assets.versioned("javascripts/languageSelector.js")),format.raw/*92.77*/(""""></script>
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
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Thu Jul 20 17:32:46 ART 2017
                  SOURCE: /Users/Gustavo/Desktop/laboratorio/reservando/app/views/login.scala.html
                  HASH: 791e7153dbd36a56d32e7d43dff00e7fccdac83b
                  MATRIX: 747->1|862->21|889->23|901->28|933->52|972->54|1003->60|1049->86|1080->91|1488->472|1532->495|1815->751|1862->777|2068->956|2113->979|2459->1298|2503->1321|2569->1360|2616->1386|3095->1836|3125->1837|3177->1860|3207->1861|3298->1925|3341->1947|3606->2183|3636->2184|3687->2206|3717->2207|3807->2270|3854->2296|4114->2527|4144->2528|4192->2547|4222->2548|4309->2608|4353->2631|4599->2848|4629->2849|4727->2918|4757->2919|4891->3026|4938->3052|5186->3271|5216->3272|5318->3345|5348->3346|5485->3456|5541->3491|6255->4177|6284->4178|6333->4199|6362->4200|6465->4276|6511->4301|6879->4642|6924->4666|6997->4711|7185->4872|7229->4895|7298->4936|7580->5190|7627->5215|7852->5422|7890->5423|7922->5428|7979->5458|7994->5464|8057->5506|8079->5510|8117->5511|8149->5516|8342->5682|8357->5688|8457->5766|8514->5796|8529->5802|8632->5883|8689->5913|8704->5919|8766->5960|8823->5990|8838->5996|8911->6048
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|34->3|34->3|35->4|41->10|41->10|45->14|45->14|48->17|48->17|56->25|56->25|57->26|57->26|65->34|65->34|65->34|65->34|66->35|66->35|69->38|69->38|69->38|69->38|70->39|70->39|73->42|73->42|73->42|73->42|74->43|74->43|77->46|77->46|77->46|77->46|78->47|78->47|81->50|81->50|81->50|81->50|82->51|82->51|91->60|91->60|91->60|91->60|92->61|92->61|98->67|98->67|99->68|101->70|101->70|102->71|106->75|106->75|116->85|116->85|117->86|117->86|117->86|117->86|118->87|118->87|119->88|120->89|120->89|120->89|121->90|121->90|121->90|122->91|122->91|122->91|123->92|123->92|123->92
                  -- GENERATED --
              */
          