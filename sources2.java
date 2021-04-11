import.java.util.*;
import.java.io.*;
public class sources2
{
  public static void main(String[] args)
  {
    putInSource("insert string here");
  } 

  public void putInSource(String str)
  {
    PrintWriter pw = new PrintWriter("links.txt");
    pw.println(str);
    pw.println("");
  }
}