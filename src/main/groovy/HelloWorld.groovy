@javax.inject.Named(value = 'helloWorld')
@javax.enterprise.context.SessionScoped
public class HelloWorld implements Serializable {

  def firstName = "John"
  def lastName = "Doe"

  def showGreeting() {
    return "Hello ${firstName} ${lastName}!";
  }
}
