/*
helloName.java
https://codingbat.com/prob/p171896

Given a string name, e.g. "Bob", 
return a greeting of the form "Hello Bob!".

Output:
helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
*/

public String helloName(String name) {
  return "Hello " + name + "!";
}

/*
All Correct:
helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
helloName("Dolly") → "Hello Dolly!"
helloName("Alpha") → "Hello Alpha!"
helloName("Omega") → "Hello Omega!"
helloName("Goodbye") → "Hello Goodbye!"
helloName("ho ho ho") → "Hello ho ho ho!"
helloName("xyz!") → "Hello xyz!!"
helloName("Hello") → "Hello Hello!"
*/
