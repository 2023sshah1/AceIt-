//algo: create random string if they want to generate, if they want to input, ask for string and then see if that exists.

public class createSessionID {
public static void main(String[] args) {

//MAKING THIS LIST
LinkedList<String> code = new LinkedList<String>();
String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
//62 possibilities

int one = (int)Math.random()*62; //range 0 to 61 (indexes)
int two = (int)Math.random()*62;
int three = (int)Math.random()*62;
int four = (int)Math.random()*62;
int five = (int)Math.random()*62;
int six = (int)Math.random()*62;

String str = letters.charAt(one) + letters.charAt(two) + letters.charAt(three) + letters.charAt(four) + letters.charAt(five) + letters.charAt(six) + "";

if(!code.contains(str))
code.add(str);

PrintWriter pw = new PrintWriter("sessionID.txt");
pw.println(str);

}