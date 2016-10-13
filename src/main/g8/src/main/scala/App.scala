import org.apache.http.client.fluent.{
  Form, Request
}

object App {
  def main(args: Array[String]): Unit = {
    val content = 
      Request.Get("http://www.cnn.com").execute().returnContent()

    println(content)

    /*
    Request.Post("http://targethost/login")
      .bodyForm(Form.form().add("username",  "vip").add("password",  "secret").build())
      .execute().returnContent()
      */
  }
}
