
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object clientProfile_Scope0 {
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

class clientProfile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
    """),_display_(/*2.6*/views/*2.11*/.html.main("Reservando")/*2.35*/ {_display_(Seq[Any](format.raw/*2.37*/("""
        """),_display_(/*3.10*/clientNav(messages)),format.raw/*3.29*/("""
        """),_display_(/*4.10*/languageSelector(messages)),format.raw/*4.36*/("""
        """),format.raw/*5.9*/("""<div class="container" ng-controller="ClientProfileCtrl as profile">

            <div class="show-info" ng-hide="editMode">
                <div class="row">
                    <div class="col s4 center-align">
                        <img class="responsive-img" width="256px" height="256px"  ng-src=""""),_display_(/*10.92*/routes/*10.98*/.Assets.versioned("/images/placeholder/placeholder-user.png")),format.raw/*10.159*/("""" ng-hide="user.photo">
                        <img class="responsive-img" width="256px" height="256px"  ng-src=""""),_display_(/*11.92*/routes/*11.98*/.Assets.versioned("{{user.photo.path}}")),format.raw/*11.138*/("""" ng-show="user.photo">
                    </div>
                    <div class="col s8">
                        <div class="row">
                            <div class="col s12">
                                <h3>"""),format.raw/*16.37*/("""{"""),format.raw/*16.38*/("""{"""),format.raw/*16.39*/("""user.firstName"""),format.raw/*16.53*/("""}"""),format.raw/*16.54*/("""}"""),format.raw/*16.55*/(""" """),format.raw/*16.56*/("""{"""),format.raw/*16.57*/("""{"""),format.raw/*16.58*/("""user.lastName"""),format.raw/*16.71*/("""}"""),format.raw/*16.72*/("""}"""),format.raw/*16.73*/("""</h3>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="ownerEmail" type="text" autofocus ng-model="user.email" readonly>
                                <label for="ownerEmail">"""),_display_(/*22.58*/Messages("client.profile.email")),format.raw/*22.90*/("""</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="ownerAddress" type="text" autofocus ng-model="user.address.completeAddress" readonly>
                                <label for="ownerAddress">"""),_display_(/*28.60*/Messages("client.profile.address")),format.raw/*28.94*/("""</label>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col s4">
                        <div class="row">
                            <ng-map center="["""),format.raw/*36.46*/("""{"""),format.raw/*36.47*/("""{"""),format.raw/*36.48*/("""user.address.lat"""),format.raw/*36.64*/("""}"""),format.raw/*36.65*/("""}"""),format.raw/*36.66*/(""", """),format.raw/*36.68*/("""{"""),format.raw/*36.69*/("""{"""),format.raw/*36.70*/("""user.address.lng"""),format.raw/*36.86*/("""}"""),format.raw/*36.87*/("""}"""),format.raw/*36.88*/("""]">
                                <marker position=""""),format.raw/*37.51*/("""{"""),format.raw/*37.52*/("""{"""),format.raw/*37.53*/("""user.address.lat"""),format.raw/*37.69*/("""}"""),format.raw/*37.70*/("""}"""),format.raw/*37.71*/(""", """),format.raw/*37.73*/("""{"""),format.raw/*37.74*/("""{"""),format.raw/*37.75*/("""user.address.lng"""),format.raw/*37.91*/("""}"""),format.raw/*37.92*/("""}"""),format.raw/*37.93*/(""""></marker>
                            </ng-map>
                        </div>
                    </div>
                    <div class="col s8">
                        <div class="row">
                            <div class="col s6">
                                <div class="btn btn-large waves-effect wave-light big-btn" ng-click="setEditMode(true)">"""),_display_(/*44.122*/Messages("client.profile.modify.profile")),format.raw/*44.163*/("""</div>
                            </div>
                            <div class="col s6">
                                <div class="btn btn-large waves-effect wave-light big-btn" ng-click="openChangePasswordModal()">"""),_display_(/*47.130*/Messages("client.profile.modify.password")),format.raw/*47.172*/("""</div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s12">
                                <div class="btn btn-large waves-effect waves-light red big-btn" ng-click="openDeleteAccountModal()">"""),_display_(/*52.134*/Messages("client.profile.delete.account")),format.raw/*52.175*/("""</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="edit-info" ng-show="editMode">
                <div class="row">
                    <div class="col s4">
                        <h3>"""),_display_(/*61.30*/Messages("client.profile.edit.profile")),format.raw/*61.69*/("""</h3>
                    </div>
                </div>
                <div class="row">
                    <div class="col s4">
                        <div class="row center-align">
                            <img class="responsive-img" width="256px" height="256px"  ng-src=""""),_display_(/*67.96*/routes/*67.102*/.Assets.versioned("/images/placeholder/placeholder-user.png")),format.raw/*67.163*/("""" ng-show="!user.photo && photos.length == 0">
                            <img class="responsive-img" width="256px" height="256px"  ng-src=""""),_display_(/*68.96*/routes/*68.102*/.Assets.versioned("{{user.photo.path}}")),format.raw/*68.142*/("""" ng-show="user.photo && photos.length == 0">
                            <img class="responsive-img" width="256px" height="256px" ng-src=""""),format.raw/*69.94*/("""{"""),format.raw/*69.95*/("""{"""),format.raw/*69.96*/("""photos[0].src"""),format.raw/*69.109*/("""}"""),format.raw/*69.110*/("""}"""),format.raw/*69.111*/("""" ng-show="photos.length > 0">
                        </div>
                        <div class="row">
                            <div class="file-field input-field col s12" ng-show="photos.length == 0">
                                <button class="btn file-select big-btn">
                                    <span>"""),_display_(/*74.44*/Messages("client.profile.select.photo")),format.raw/*74.83*/("""</span>
                                </button>
                                <input type="file" multiple ng-file-model="photos" accept="image/*" id="image-input">
                            </div>
                            <div class="file-field input-field col s12" ng-show="photos.length > 0">
                                <div class="col s6">
                                    <div class="btn waves-effect waves-light big-btn" ng-click="savePhoto()">"""),_display_(/*80.111*/Messages("client.profile.save")),format.raw/*80.142*/("""</div>
                                </div>
                                <div class="col s6">
                                    <div class="btn waves-effect waves-light orange big-btn" ng-click="cancelEditPhoto()">"""),_display_(/*83.124*/Messages("client.profile.cancel")),format.raw/*83.157*/("""</div>
                                </div>
                            </div>
                            <label class="image-error" ng-show="errors.photoSize">"""),_display_(/*86.84*/Messages("client.profile.error.photo.size")),format.raw/*86.127*/("""</label>
                        </div>
                    </div>
                    <div class="col s8">
                        <div class="row">
                            <div class="input-field col s6">
                                <input id="ownerName" type="text" class="validate" autofocus ng-model="editUser.firstName" ng-class=""""),format.raw/*92.134*/("""{"""),format.raw/*92.135*/("""invalid: errors.firstName"""),format.raw/*92.160*/("""}"""),format.raw/*92.161*/("""">
                                <label for="ownerName">"""),_display_(/*93.57*/Messages("client.profile.name")),format.raw/*93.88*/("""</label>
                            </div>
                            <div class="input-field col s6">
                                <input id="ownerLastname" type="text" class="validate" autofocus ng-model="editUser.lastName" ng-class=""""),format.raw/*96.137*/("""{"""),format.raw/*96.138*/("""invalid: errors.lastName"""),format.raw/*96.162*/("""}"""),format.raw/*96.163*/("""">
                                <label for="ownerLastname">"""),_display_(/*97.61*/Messages("client.profile.lastName")),format.raw/*97.96*/("""</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="ownerEmail" type="email" class="validate" autofocus ng-model="editUser.email" ng-class=""""),format.raw/*102.132*/("""{"""),format.raw/*102.133*/("""invalid: errors.email"""),format.raw/*102.154*/("""}"""),format.raw/*102.155*/("""">
                                <label for="ownerEmail">"""),_display_(/*103.58*/Messages("client.profile.email")),format.raw/*103.90*/("""</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input type="text" id="addressEdit"
                                ng-model="editUser.address.completeAddress" vs-google-autocomplete="options"
                                vs-autocomplete-validator
                                vs-city="editUser.address.city" vs-state="editUser.address.state"
                                vs-country="editUser.address.country" vs-district="editUser.address.district"
                                vs-latitude="editUser.address.lat" vs-longitude="editUser.address.lng" autofocus>
                                <label for="addressEdit">"""),_display_(/*114.59*/Messages("client.profile.address")),format.raw/*114.93*/("""</label>
                            </div>
                        </div>
                        <div class="row info-buttons">
                            <div class="col s6">
                                <div class="waves-effect wave-light btn btn-large big-btn big-btn" ng-click="submitUser()">"""),_display_(/*119.125*/Messages("client.profile.modify.info")),format.raw/*119.163*/("""</div>
                            </div>
                            <div class="col s6">
                                <div class="waves-effect wave-light btn btn-large orange big-btn big-btn" ng-click="setEditMode(false)">"""),_display_(/*122.138*/Messages("client.profile.cancel")),format.raw/*122.171*/("""</div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            """),format.raw/*129.39*/("""
            """),format.raw/*130.13*/("""<div id="deleteAccountModal" class="modal modal-fixed-footer">
                <div class="modal-content">
                    <div class="row">
                        <h4>"""),_display_(/*133.30*/Messages("client.profile.delete.account")),format.raw/*133.71*/("""</h4>
                    </div>
                    <div class="row">
                        <h5>"""),_display_(/*136.30*/Messages("client.profile.delete.account.question")),format.raw/*136.80*/("""</h5>
                    </div>
                </div>
                <div class="modal-footer delete-footer">
                    <div class="modal-action modal-close waves-effect waves waves-light btn">"""),_display_(/*140.95*/Messages("client.profile.cancel")),format.raw/*140.128*/("""</div>
                    <div class="waves-effect waves waves-red btn btn-flat delete-btn right" ng-click="deleteAccount()">"""),_display_(/*141.121*/Messages("client.profile.delete.account")),format.raw/*141.162*/("""</div>
                </div>
            </div>
            """),format.raw/*144.50*/("""
            """),format.raw/*145.13*/("""<div id="changePasswordModal" class="modal modal-fixed-footer">
                <div class="modal-content container">
                    <div class="row">
                        <h4>"""),_display_(/*148.30*/Messages("client.profile.change.password")),format.raw/*148.72*/("""</h4>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input id="previousPassword" type="password" class="validate" ng-model="previousPassword">
                            <label>"""),_display_(/*153.37*/Messages("client.profile.old.password")),format.raw/*153.76*/("""</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field suffix col s12">
                            <input id="newPassword1" type="password" class="field" ng-model="newPassword1" ng-class=""""),format.raw/*158.118*/("""{"""),format.raw/*158.119*/("""valid: validPassword && input1Touched, invalid: !validPassword && input1Touched"""),format.raw/*158.198*/("""}"""),format.raw/*158.199*/("""" ng-change="validatePassword1()">
                            <label>"""),_display_(/*159.37*/Messages("client.profile.new.password")),format.raw/*159.76*/("""</label>
                        </div>

                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input id="newPassword2" type="password" class="field" ng-model="newPassword2" ng-class=""""),format.raw/*165.118*/("""{"""),format.raw/*165.119*/("""valid: equalPasswords && input2Touched, invalid: !equalPasswords && input2Touched"""),format.raw/*165.200*/("""}"""),format.raw/*165.201*/("""" ng-change="validatePassword2()">
                            <label>"""),_display_(/*166.37*/Messages("client.profile.confirm.new.password")),format.raw/*166.84*/("""</label>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <div href="" class=" modal-action modal-close waves-effect waves-red btn-flat">"""),_display_(/*171.101*/Messages("client.profile.cancel")),format.raw/*171.134*/("""</div>
                    <div class="waves-effect waves-green btn-flat" ng-click="changePassword()">"""),_display_(/*172.97*/Messages("client.profile.save")),format.raw/*172.128*/("""</div>
                </div>
            </div>
        </div>

    """)))}/*177.6*/{_display_(Seq[Any](format.raw/*177.7*/("""
        """),format.raw/*178.9*/("""<link rel="stylesheet" href=""""),_display_(/*178.39*/routes/*178.45*/.Assets.versioned("stylesheets/owner/ownerProfile.css")),format.raw/*178.100*/("""">
    """)))}/*179.6*/ {_display_(Seq[Any](format.raw/*179.8*/("""
        """),format.raw/*180.9*/("""<script src=""""),_display_(/*180.23*/routes/*180.29*/.Assets.versioned("javascripts/utils/geocode.js")),format.raw/*180.78*/(""""></script>
        <script src=""""),_display_(/*181.23*/routes/*181.29*/.Assets.versioned("external/ngMap/ng-map.min.js")),format.raw/*181.78*/(""""></script>
    <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDM9GdrRT-5ML6OHeHGIIs0zNFjJmOaQUM&libraries=places"></script>
    <script src=""""),_display_(/*183.19*/routes/*183.25*/.Assets.versioned("external/vs-google-autocomplete/vs-google-autocomplete.js")),format.raw/*183.103*/(""""></script>
    <script src=""""),_display_(/*184.19*/routes/*184.25*/.Assets.versioned("external/vs-google-autocomplete/vs-autocomplete-validator.js")),format.raw/*184.106*/(""""></script>
    <script src=""""),_display_(/*185.19*/routes/*185.25*/.Assets.versioned("javascripts/client/clientProfile.js")),format.raw/*185.81*/(""""></script>
    <script src=""""),_display_(/*186.19*/routes/*186.25*/.Assets.versioned("javascripts/languageSelector.js")),format.raw/*186.77*/(""""></script>
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
object clientProfile extends clientProfile_Scope0.clientProfile
              /*
                  -- GENERATED --
                  DATE: Fri Jul 21 02:01:32 ART 2017
                  SOURCE: /Users/Gustavo/Desktop/laboratorio/reservando/app/views/clientProfile.scala.html
                  HASH: a485cbb87990b7cf13cb58b9a79e9c2bdecf43cc
                  MATRIX: 763->1|878->21|909->27|922->32|954->56|993->58|1029->68|1068->87|1104->97|1150->123|1185->132|1516->436|1531->442|1614->503|1756->618|1771->624|1833->664|2081->884|2110->885|2139->886|2181->900|2210->901|2239->902|2268->903|2297->904|2326->905|2367->918|2396->919|2425->920|2794->1262|2847->1294|3241->1661|3296->1695|3611->1982|3640->1983|3669->1984|3713->2000|3742->2001|3771->2002|3801->2004|3830->2005|3859->2006|3903->2022|3932->2023|3961->2024|4043->2078|4072->2079|4101->2080|4145->2096|4174->2097|4203->2098|4233->2100|4262->2101|4291->2102|4335->2118|4364->2119|4393->2120|4782->2481|4845->2522|5093->2742|5157->2784|5483->3082|5546->3123|5874->3424|5934->3463|6242->3744|6258->3750|6341->3811|6510->3953|6526->3959|6588->3999|6755->4138|6784->4139|6813->4140|6855->4153|6885->4154|6915->4155|7264->4477|7324->4516|7819->4983|7872->5014|8122->5236|8177->5269|8368->5433|8433->5476|8806->5820|8836->5821|8890->5846|8920->5847|9006->5906|9058->5937|9328->6178|9358->6179|9411->6203|9441->6204|9531->6267|9587->6302|9927->6612|9958->6613|10009->6634|10040->6635|10128->6695|10182->6727|11004->7521|11060->7555|11392->7858|11453->7896|11710->8124|11766->8157|11950->8338|11992->8351|12194->8525|12257->8566|12385->8666|12457->8716|12692->8923|12748->8956|12904->9083|12968->9124|13058->9222|13100->9235|13313->9420|13377->9462|13689->9746|13750->9785|14067->10072|14098->10073|14207->10152|14238->10153|14337->10224|14398->10263|14709->10544|14740->10545|14851->10626|14882->10627|14981->10698|15050->10745|15312->10978|15368->11011|15499->11114|15553->11145|15642->11215|15681->11216|15718->11225|15776->11255|15792->11261|15870->11316|15897->11324|15937->11326|15974->11335|16016->11349|16032->11355|16103->11404|16165->11438|16181->11444|16252->11493|16462->11675|16478->11681|16579->11759|16637->11789|16653->11795|16757->11876|16815->11906|16831->11912|16909->11968|16967->11998|16983->12004|17057->12056
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|34->3|34->3|35->4|35->4|36->5|41->10|41->10|41->10|42->11|42->11|42->11|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|53->22|53->22|59->28|59->28|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|75->44|75->44|78->47|78->47|83->52|83->52|92->61|92->61|98->67|98->67|98->67|99->68|99->68|99->68|100->69|100->69|100->69|100->69|100->69|100->69|105->74|105->74|111->80|111->80|114->83|114->83|117->86|117->86|123->92|123->92|123->92|123->92|124->93|124->93|127->96|127->96|127->96|127->96|128->97|128->97|133->102|133->102|133->102|133->102|134->103|134->103|145->114|145->114|150->119|150->119|153->122|153->122|160->129|161->130|164->133|164->133|167->136|167->136|171->140|171->140|172->141|172->141|175->144|176->145|179->148|179->148|184->153|184->153|189->158|189->158|189->158|189->158|190->159|190->159|196->165|196->165|196->165|196->165|197->166|197->166|202->171|202->171|203->172|203->172|208->177|208->177|209->178|209->178|209->178|209->178|210->179|210->179|211->180|211->180|211->180|211->180|212->181|212->181|212->181|214->183|214->183|214->183|215->184|215->184|215->184|216->185|216->185|216->185|217->186|217->186|217->186
                  -- GENERATED --
              */
          