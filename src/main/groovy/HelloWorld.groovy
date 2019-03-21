@javax.faces.bean.ManagedBean
public class HelloWorld {

  def firstName = "John"
  def lastName = "Doe"

  def showGreeting() {
    return "Hello ${firstName} ${lastName}!";
  }
}
