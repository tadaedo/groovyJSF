@javax.inject.Named(value = 'helloWorld')
public class HelloWorld implements Serializable {

  def firstName = "John"
  def lastName = "Doe"

  def showGreeting() {
    return "Hello ${firstName} ${lastName}!";
  }
}
