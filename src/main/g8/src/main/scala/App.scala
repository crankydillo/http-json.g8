import org.apache.http.client.fluent.{
  Form, Request
}

import org.json4s._
import org.json4s.native.JsonMethods._

object App {

  case class Resource(a: Option[Int])

  def main(args: Array[String]): Unit = {

    /*
    val content = 
      Request.Get("http://www.cnn.com").execute().returnContent()

    println(content)
    */

    implicit val formats = DefaultFormats

    val someJsonPayload = """[ { "a": 1 }, { "a": 2 }, { "b": 3 } ]"""

    val resources = parse(someJsonPayload).extract[List[Resource]]

    resources.foreach { println }

  }
}
