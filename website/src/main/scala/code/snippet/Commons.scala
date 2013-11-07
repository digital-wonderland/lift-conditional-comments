package code.snippet

import net.liftweb.http.DispatchSnippet
import scala.xml.{Unparsed, NodeSeq}

object Commons extends DispatchSnippet {
  def dispatch: Commons.DispatchIt = {
    case "html" => html
    case "body" => body
  }

  def html(html: NodeSeq): NodeSeq = Unparsed("""<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
      <!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
      <!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
      <!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->""") ++ (html \ "_") ++ Unparsed("""</html>""")

  def body(html: NodeSeq): NodeSeq = Unparsed("""<!--[if lt IE 7]>      <body class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
      <!--[if IE 7]>         <body class="no-js lt-ie9 lt-ie8"> <![endif]-->
      <!--[if IE 8]>         <body class="no-js lt-ie9"> <![endif]-->
      <!--[if gt IE 8]><!--> <body class="no-js"> <!--<![endif]-->""") ++ (html \ "_") ++ Unparsed("""</body>""")
}
