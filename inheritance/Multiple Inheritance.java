/*When the child class extends from more than one superclass, it is known as multiple inheritance. However, Java does not support multiple inheritance.

To achieve multiple inheritance in Java, we must use the interface.*/
interface Backend {

  // abstract class
  public void connectServer();
}

class Frontend {

  public void responsive(String str) {
    System.out.println(str + " can also be used as frontend.");
  }
}

// Language extends Frontend class
// Language implements Backend interface
class Language extends Frontend implements Backend {

  String language = "Java";

  // implement method of interface
  public void connectServer() {
    System.out.println(language + " can be used as backend language.");
  }

  public static void main(String[] args) {

    // create object of Language class
    Language java = new Language();

    java.connectServer();

    // call the inherited method of Frontend class
    java.responsive(java.language);
  }

}
/*Output:
Java can be used as backend language.
Java can also be used as frontend.
*/
