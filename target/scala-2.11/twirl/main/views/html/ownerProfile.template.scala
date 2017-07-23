
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ownerProfile_Scope0 {
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

class ownerProfile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
"""),_display_(/*2.2*/views/*2.7*/.html.main("Reservando")/*2.31*/ {_display_(Seq[Any](format.raw/*2.33*/("""
    """),_display_(/*3.6*/ownerNav(messages)),format.raw/*3.24*/("""
    """),_display_(/*4.6*/languageSelector(messages)),format.raw/*4.32*/("""
    """),format.raw/*5.5*/("""<div class="container" ng-controller="OwnerProfileCtrl as profile">

        <div class="show-info" ng-hide="editMode">
            <div class="row">
                <div class="col s4 center-align">
                    <img class="responsive-img" width="256px" height="256px"  ng-src=""""),_display_(/*10.88*/routes/*10.94*/.Assets.versioned("/images/placeholder/placeholder-user.png")),format.raw/*10.155*/("""" ng-hide="user.photo">
                    <img class="responsive-img" width="256px" height="256px"  ng-src=""""),_display_(/*11.88*/routes/*11.94*/.Assets.versioned("{{user.photo.path}}")),format.raw/*11.134*/("""" ng-show="user.photo">
                </div>
                <div class="col s8">
                    <div class="row">
                        <div class="col s12">
                            <h3>"""),format.raw/*16.33*/("""{"""),format.raw/*16.34*/("""{"""),format.raw/*16.35*/("""user.firstName"""),format.raw/*16.49*/("""}"""),format.raw/*16.50*/("""}"""),format.raw/*16.51*/(""" """),format.raw/*16.52*/("""{"""),format.raw/*16.53*/("""{"""),format.raw/*16.54*/("""user.lastName"""),format.raw/*16.67*/("""}"""),format.raw/*16.68*/("""}"""),format.raw/*16.69*/("""</h3>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input id="ownerEmail" type="text" autofocus ng-model="user.email" readonly>
                            <label for="ownerEmail">"""),_display_(/*22.54*/Messages("owner.profile.email")),format.raw/*22.85*/("""</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input id="ownerEmail" type="text" autofocus ng-model="user.address.completeAddress" readonly>
                            <label for="ownerEmail">"""),_display_(/*28.54*/Messages("owner.profile.address")),format.raw/*28.87*/("""</label>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col s4">
                    <div class="row">
                        <ng-map center="["""),format.raw/*36.42*/("""{"""),format.raw/*36.43*/("""{"""),format.raw/*36.44*/("""user.address.lat"""),format.raw/*36.60*/("""}"""),format.raw/*36.61*/("""}"""),format.raw/*36.62*/(""", """),format.raw/*36.64*/("""{"""),format.raw/*36.65*/("""{"""),format.raw/*36.66*/("""user.address.lng"""),format.raw/*36.82*/("""}"""),format.raw/*36.83*/("""}"""),format.raw/*36.84*/("""]">
                            <marker position=""""),format.raw/*37.47*/("""{"""),format.raw/*37.48*/("""{"""),format.raw/*37.49*/("""user.address.lat"""),format.raw/*37.65*/("""}"""),format.raw/*37.66*/("""}"""),format.raw/*37.67*/(""", """),format.raw/*37.69*/("""{"""),format.raw/*37.70*/("""{"""),format.raw/*37.71*/("""user.address.lng"""),format.raw/*37.87*/("""}"""),format.raw/*37.88*/("""}"""),format.raw/*37.89*/(""""></marker>
                        </ng-map>
                    </div>
                </div>
                <div class="col s8">
                    <div class="row">
                        <div class="col s6">
                            <div class="btn btn-large waves-effect wave-light big-btn" ng-click="setEditMode(true)">"""),_display_(/*44.118*/Messages("owner.profile.modify.profile")),format.raw/*44.158*/("""</div>
                        </div>
                        <div class="col s6">
                            <div class="btn btn-large waves-effect wave-light big-btn" ng-click="openChangePasswordModal()">"""),_display_(/*47.126*/Messages("owner.profile.modify.password")),format.raw/*47.167*/("""</div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col s12">
                            <div class="btn btn-large waves-effect waves-light red big-btn" ng-click="openDeleteAccountModal()">"""),_display_(/*52.130*/Messages("owner.profile.delete.account")),format.raw/*52.170*/("""</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="edit-info" ng-show="editMode">
            <div class="row">
                <div class="col s4">
                    <h3>"""),_display_(/*61.26*/Messages("owner.profile.edit.profile")),format.raw/*61.64*/("""</h3>
                </div>
            </div>
            <div class="row">
                <div class="col s4">
                    <div class="row center-align">
                        <img class="responsive-img" width="256px" height="256px"  ng-src=""""),_display_(/*67.92*/routes/*67.98*/.Assets.versioned("/images/placeholder/placeholder-user.png")),format.raw/*67.159*/("""" ng-show="!user.photo && photos.length == 0">
                        <img class="responsive-img" width="256px" height="256px"  ng-src=""""),_display_(/*68.92*/routes/*68.98*/.Assets.versioned("{{user.photo.path}}")),format.raw/*68.138*/("""" ng-show="user.photo && photos.length == 0">
                        <img class="responsive-img" width="256px" height="256px" ng-src=""""),format.raw/*69.90*/("""{"""),format.raw/*69.91*/("""{"""),format.raw/*69.92*/("""photos[0].src"""),format.raw/*69.105*/("""}"""),format.raw/*69.106*/("""}"""),format.raw/*69.107*/("""" ng-show="photos.length > 0">
                    </div>
                    <div class="row">
                        <div class="file-field input-field col s12" ng-show="photos.length == 0">
                            <label class="btn file-select big-btn" for="image-input">
                                <span>"""),_display_(/*74.40*/Messages("owner.profile.select.photo")),format.raw/*74.78*/("""</span>
                                <input type="file" multiple ng-file-model="photos" accept="image/*" id="image-input">
                            </label>
                        </div>
                        <div class="file-field input-field col s12" ng-show="photos.length > 0">
                            <div class="col s6">
                                <div class="btn waves-effect waves-light big-btn" ng-click="savePhoto()">"""),_display_(/*80.107*/Messages("owner.profile.save")),format.raw/*80.137*/("""</div>
                            </div>
                            <div class="col s6">
                                <div class="btn waves-effect waves-light orange big-btn" ng-click="cancelEditPhoto()">"""),_display_(/*83.120*/Messages("owner.profile.cancel")),format.raw/*83.152*/("""</div>
                            </div>
                        </div>
                        <label class="image-error" ng-show="errors.photoSize">"""),_display_(/*86.80*/Messages("owner.profile.error.photo.size")),format.raw/*86.122*/("""</label>
                    </div>
                </div>
                <div class="col s8">
                    <div class="row">
                        <div class="input-field col s6">
                            <input id="ownerName" type="text" class="validate" autofocus ng-model="editUser.firstName" ng-class=""""),format.raw/*92.130*/("""{"""),format.raw/*92.131*/("""invalid: errors.firstName"""),format.raw/*92.156*/("""}"""),format.raw/*92.157*/("""">
                            <label for="ownerName">"""),_display_(/*93.53*/Messages("owner.profile.name")),format.raw/*93.83*/("""</label>
                        </div>
                        <div class="input-field col s6">
                            <input id="ownerLastname" type="text" class="validate" autofocus ng-model="editUser.lastName" ng-class=""""),format.raw/*96.133*/("""{"""),format.raw/*96.134*/("""invalid: errors.lastName"""),format.raw/*96.158*/("""}"""),format.raw/*96.159*/("""">
                            <label for="ownerLastname">"""),_display_(/*97.57*/Messages("owner.profile.lastName")),format.raw/*97.91*/("""</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input id="ownerEmail" type="email" class="validate" autofocus ng-model="editUser.email" ng-class=""""),format.raw/*102.128*/("""{"""),format.raw/*102.129*/("""invalid: errors.email"""),format.raw/*102.150*/("""}"""),format.raw/*102.151*/("""">
                            <label for="ownerEmail">"""),_display_(/*103.54*/Messages("owner.profile.email")),format.raw/*103.85*/("""</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input type="text" id="addressEdit"  class="validate"
                            ng-model="editUser.address.completeAddress" vs-google-autocomplete="options"
                            vs-autocomplete-validator
                            vs-city="editUser.address.city" vs-state="editUser.address.state"
                            vs-country="editUser.address.country" vs-district="editUser.address.district"
                            vs-latitude="editUser.address.lat" vs-longitude="editUser.address.lng"
                            ng-class=""""),format.raw/*114.39*/("""{"""),format.raw/*114.40*/("""invalid: errors.address"""),format.raw/*114.63*/("""}"""),format.raw/*114.64*/("""">
                            <label for="addressEdit">"""),_display_(/*115.55*/Messages("owner.profile.address")),format.raw/*115.88*/("""</label>
                        </div>
                    </div>
                    <div class="row info-buttons">
                        <div class="col s6">
                            <div class="waves-effect wave-light btn btn-large big-btn big-btn" ng-click="submitUser()">"""),_display_(/*120.121*/Messages("owner.profile.modify.info")),format.raw/*120.158*/("""</div>
                        </div>
                        <div class="col s6">
                            <div class="waves-effect wave-light btn btn-large orange big-btn big-btn" ng-click="setEditMode(false)">"""),_display_(/*123.134*/Messages("owner.profile.cancel")),format.raw/*123.166*/("""</div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        """),format.raw/*130.35*/("""
        """),format.raw/*131.9*/("""<div id="deleteAccountModal" class="modal modal-fixed-footer">
            <div class="modal-content">
                <div class="row">
                    <h4>"""),_display_(/*134.26*/Messages("owner.profile.delete.account")),format.raw/*134.66*/("""</h4>
                </div>
                <div class="row">
                    <h5>"""),_display_(/*137.26*/Messages("owner.profile.delete.account.question")),format.raw/*137.75*/("""</h5>
                </div>
            </div>
            <div class="modal-footer delete-footer">
                <div class="modal-action modal-close waves-effect waves waves-light btn">"""),_display_(/*141.91*/Messages("owner.profile.cancel")),format.raw/*141.123*/("""</div>
                <div class="waves-effect waves waves-red btn btn-flat delete-btn right" ng-click="deleteAccount()">"""),_display_(/*142.117*/Messages("owner.profile.delete.account")),format.raw/*142.157*/("""</div>
            </div>
        </div>
        """),format.raw/*145.46*/("""
        """),format.raw/*146.9*/("""<div id="changePasswordModal" class="modal modal-fixed-footer">
            <div class="modal-content container">
                <div class="row">
                    <h4>"""),_display_(/*149.26*/Messages("owner.profile.change.password")),format.raw/*149.67*/("""</h4>
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <input id="previousPassword" type="password" class="validate" ng-model="previousPassword">
                        <label>"""),_display_(/*154.33*/Messages("owner.profile.old.password")),format.raw/*154.71*/("""</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field suffix col s12">
                        <input id="newPassword1" type="password" class="field" ng-model="newPassword1" ng-class=""""),format.raw/*159.114*/("""{"""),format.raw/*159.115*/("""valid: validPassword && input1Touched, invalid: !validPassword && input1Touched"""),format.raw/*159.194*/("""}"""),format.raw/*159.195*/("""" ng-change="validatePassword1()">
                        <label>"""),_display_(/*160.33*/Messages("owner.profile.new.password")),format.raw/*160.71*/("""</label>
                    </div>

                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <input id="newPassword2" type="password" class="field" ng-model="newPassword2" ng-class=""""),format.raw/*166.114*/("""{"""),format.raw/*166.115*/("""valid: equalPasswords && input2Touched, invalid: !equalPasswords && input2Touched"""),format.raw/*166.196*/("""}"""),format.raw/*166.197*/("""" ng-change="validatePassword2()">
                        <label>"""),_display_(/*167.33*/Messages("owner.profile.confirm.new.password")),format.raw/*167.79*/("""</label>
                    </div>
                </div>
            </div>
            <div class="modal-footer">
                <div href="" class=" modal-action modal-close waves-effect waves-red btn-flat">"""),_display_(/*172.97*/Messages("owner.profile.cancel")),format.raw/*172.129*/("""</div>
                <div class="waves-effect waves-green btn-flat" ng-click="changePassword()">"""),_display_(/*173.93*/Messages("owner.profile.save")),format.raw/*173.123*/("""</div>
            </div>
        </div>
    </div>

""")))}/*178.2*/{_display_(Seq[Any](format.raw/*178.3*/("""
   """),format.raw/*179.4*/("""<link rel="stylesheet" href=""""),_display_(/*179.34*/routes/*179.40*/.Assets.versioned("stylesheets/owner/ownerProfile.css")),format.raw/*179.95*/("""">
""")))}/*180.2*/ {_display_(Seq[Any](format.raw/*180.4*/("""
    """),format.raw/*181.5*/("""<script src=""""),_display_(/*181.19*/routes/*181.25*/.Assets.versioned("javascripts/utils/geocode.js")),format.raw/*181.74*/(""""></script>
    <script src=""""),_display_(/*182.19*/routes/*182.25*/.Assets.versioned("external/ngMap/ng-map.min.js")),format.raw/*182.74*/(""""></script>
    <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDM9GdrRT-5ML6OHeHGIIs0zNFjJmOaQUM&libraries=places"></script>
    <script src=""""),_display_(/*184.19*/routes/*184.25*/.Assets.versioned("external/vs-google-autocomplete/vs-google-autocomplete.js")),format.raw/*184.103*/(""""></script>
    <script src=""""),_display_(/*185.19*/routes/*185.25*/.Assets.versioned("external/vs-google-autocomplete/vs-autocomplete-validator.js")),format.raw/*185.106*/(""""></script>
    <script src=""""),_display_(/*186.19*/routes/*186.25*/.Assets.versioned("javascripts/owner/ownerProfile.js")),format.raw/*186.79*/(""""></script>
    <script src=""""),_display_(/*187.19*/routes/*187.25*/.Assets.versioned("javascripts/languageSelector.js")),format.raw/*187.77*/(""""></script>
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
object ownerProfile extends ownerProfile_Scope0.ownerProfile
              /*
                  -- GENERATED --
                  DATE: Wed Jul 19 10:24:59 ART 2017
                  SOURCE: /Users/Gustavo/Desktop/laboratorio/reservando/app/views/ownerProfile.scala.html
                  HASH: 5284cfe1195fe02ef4896ddff04a6b8aa6f4cad5
                  MATRIX: 761->1|876->21|903->23|915->28|947->52|986->54|1017->60|1055->78|1086->84|1132->110|1163->115|1477->402|1492->408|1575->469|1713->580|1728->586|1790->626|2018->826|2047->827|2076->828|2118->842|2147->843|2176->844|2205->845|2234->846|2263->847|2304->860|2333->861|2362->862|2707->1180|2759->1211|3125->1550|3179->1583|3462->1838|3491->1839|3520->1840|3564->1856|3593->1857|3622->1858|3652->1860|3681->1861|3710->1862|3754->1878|3783->1879|3812->1880|3890->1930|3919->1931|3948->1932|3992->1948|4021->1949|4050->1950|4080->1952|4109->1953|4138->1954|4182->1970|4211->1971|4240->1972|4601->2305|4663->2345|4899->2553|4962->2594|5268->2872|5330->2912|5622->3177|5681->3215|5965->3472|5980->3478|6063->3539|6228->3677|6243->3683|6305->3723|6468->3858|6497->3859|6526->3860|6568->3873|6598->3874|6628->3875|6974->4194|7033->4232|7507->4678|7559->4708|7797->4918|7851->4950|8030->5102|8094->5144|8443->5464|8473->5465|8527->5490|8557->5491|8639->5546|8690->5576|8948->5805|8978->5806|9031->5830|9061->5831|9147->5890|9202->5924|9522->6214|9553->6215|9604->6236|9635->6237|9719->6293|9772->6324|10542->7065|10572->7066|10624->7089|10654->7090|10739->7147|10794->7180|11106->7463|11166->7500|11411->7716|11466->7748|11626->7905|11663->7914|11853->8076|11915->8116|12031->8204|12102->8253|12321->8444|12376->8476|12528->8599|12591->8639|12669->8725|12706->8734|12907->8907|12970->8948|13262->9212|13322->9250|13619->9517|13650->9518|13759->9597|13790->9598|13885->9665|13945->9703|14236->9964|14267->9965|14378->10046|14409->10047|14504->10114|14572->10160|14813->10373|14868->10405|14995->10504|15048->10534|15121->10588|15160->10589|15192->10593|15250->10623|15266->10629|15343->10684|15366->10688|15406->10690|15439->10695|15481->10709|15497->10715|15568->10764|15626->10794|15642->10800|15713->10849|15923->11031|15939->11037|16040->11115|16098->11145|16114->11151|16218->11232|16276->11262|16292->11268|16368->11322|16426->11352|16442->11358|16516->11410
                  LINES: 27->1|32->1|33->2|33->2|33->2|33->2|34->3|34->3|35->4|35->4|36->5|41->10|41->10|41->10|42->11|42->11|42->11|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|47->16|53->22|53->22|59->28|59->28|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|68->37|75->44|75->44|78->47|78->47|83->52|83->52|92->61|92->61|98->67|98->67|98->67|99->68|99->68|99->68|100->69|100->69|100->69|100->69|100->69|100->69|105->74|105->74|111->80|111->80|114->83|114->83|117->86|117->86|123->92|123->92|123->92|123->92|124->93|124->93|127->96|127->96|127->96|127->96|128->97|128->97|133->102|133->102|133->102|133->102|134->103|134->103|145->114|145->114|145->114|145->114|146->115|146->115|151->120|151->120|154->123|154->123|161->130|162->131|165->134|165->134|168->137|168->137|172->141|172->141|173->142|173->142|176->145|177->146|180->149|180->149|185->154|185->154|190->159|190->159|190->159|190->159|191->160|191->160|197->166|197->166|197->166|197->166|198->167|198->167|203->172|203->172|204->173|204->173|209->178|209->178|210->179|210->179|210->179|210->179|211->180|211->180|212->181|212->181|212->181|212->181|213->182|213->182|213->182|215->184|215->184|215->184|216->185|216->185|216->185|217->186|217->186|217->186|218->187|218->187|218->187
                  -- GENERATED --
              */
          