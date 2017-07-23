
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Html,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html)(styles: Html)(scripts: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.61*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        <title>"""),_display_(/*12.17*/title),format.raw/*12.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*13.54*/routes/*13.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*14.59*/routes/*14.65*/.Assets.versioned("images/favicon.png")),format.raw/*14.104*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*15.55*/routes/*15.61*/.Assets.versioned("external/materialize/css/materialize.min.css")),format.raw/*15.126*/("""">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*16.55*/routes/*16.61*/.Assets.versioned("stylesheets/main.css")),format.raw/*16.102*/("""">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*18.55*/routes/*18.61*/.Assets.versioned("stylesheets/palette.css")),format.raw/*18.105*/("""">
        """),_display_(/*19.10*/styles),format.raw/*19.16*/("""
    """),format.raw/*20.5*/("""</head>
    <body ng-app="reservandoApp">
        """),_display_(/*22.10*/content),format.raw/*22.17*/("""
    """),format.raw/*23.5*/("""</body>
    """),format.raw/*24.119*/("""
    """),format.raw/*25.5*/("""<script type="text/javascript" src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
    <script src=""""),_display_(/*26.19*/routes/*26.25*/.Assets.versioned("external/materialize/js/materialize.min.js")),format.raw/*26.88*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*27.19*/routes/*27.25*/.Assets.versioned("external/angularjs/angular.min.js")),format.raw/*27.79*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*28.19*/routes/*28.25*/.Assets.versioned("external/angularjs/angular-route.js")),format.raw/*28.81*/("""" type="text/javascript"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/angular-materialize/0.2.2/angular-materialize.min.js"></script>
    <script src=""""),_display_(/*30.19*/routes/*30.25*/.Assets.versioned("javascripts/main.js")),format.raw/*30.65*/("""" type="text/javascript"></script>
    <script type="text/javascript" src=""""),_display_(/*31.42*/routes/*31.48*/.MessageController.messages()),format.raw/*31.77*/(""""></script>
    """),_display_(/*32.6*/scripts),format.raw/*32.13*/("""
"""),format.raw/*33.1*/("""</html>
"""))
      }
    }
  }

  def render(title:String,content:Html,styles:Html,scripts:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(styles)(scripts)

  def f:((String) => (Html) => (Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (styles) => (scripts) => apply(title)(content)(styles)(scripts)

  def ref: this.type = this

}


}

/*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Jul 20 19:53:25 ART 2017
                  SOURCE: /Users/Gustavo/Desktop/laboratorio/reservando/app/views/main.scala.html
                  HASH: 2e2d031da0a31b710715fa1cb95cade3b1bc8b31
                  MATRIX: 1012->260|1166->319|1194->321|1281->381|1307->386|1396->448|1411->454|1474->495|1562->556|1577->562|1638->601|1722->658|1737->664|1824->729|1908->786|1923->792|1986->833|2165->985|2180->991|2246->1035|2285->1047|2312->1053|2344->1058|2422->1109|2450->1116|2482->1121|2523->1247|2555->1252|2691->1361|2706->1367|2790->1430|2870->1483|2885->1489|2960->1543|3040->1596|3055->1602|3132->1658|3355->1854|3370->1860|3431->1900|3534->1976|3549->1982|3599->2011|3642->2028|3670->2035|3698->2036
                  LINES: 32->7|37->7|39->9|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|48->18|48->18|48->18|49->19|49->19|50->20|52->22|52->22|53->23|54->24|55->25|56->26|56->26|56->26|57->27|57->27|57->27|58->28|58->28|58->28|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|63->33
                  -- GENERATED --
              */
          