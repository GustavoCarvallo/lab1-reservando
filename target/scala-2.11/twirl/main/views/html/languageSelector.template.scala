
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object languageSelector_Scope0 {
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

class languageSelector extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(messages: Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.22*/("""
"""),format.raw/*2.1*/("""<div ng-controller="langController">
    <div class="fixed-action-btn">
        <a class='btn-floating btn-large' href='#'>
            <i class="large material-icons">language</i>
        </a>
        <ul>
            <li><a class="btn-floating red" ng-click="changeToSpanish()">ES</a></li>
            <li><a class="btn-floating blue" ng-click="changeToEnglish()">EN</a></li>
        </ul>
    </div>
</div>





"""))
      }
    }
  }

  def render(messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(messages)

  def f:((Messages) => play.twirl.api.HtmlFormat.Appendable) = (messages) => apply(messages)

  def ref: this.type = this

}


}

/**/
object languageSelector extends languageSelector_Scope0.languageSelector
              /*
                  -- GENERATED --
                  DATE: Tue Jul 11 18:34:53 ART 2017
                  SOURCE: /Users/Gustavo/Desktop/laboratorio/reservando/app/views/languageSelector.scala.html
                  HASH: 97506e207ff7b9a0f10ac45017a0847d6cf80885
                  MATRIX: 769->1|884->21|911->22
                  LINES: 27->1|32->1|33->2
                  -- GENERATED --
              */
          