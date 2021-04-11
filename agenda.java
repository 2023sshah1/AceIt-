import java.util.*;
public class Agenda {
   public static void main(String[] args) {
      Map<String, Integer> map = new HashMap<String, Integer>();
      int reply = 1;
      System.out.println("Welcome to the Agenda builder! Keep entering tasks until you are done - to finish the process enter -1");
      
      while(reply != -1) {
         Scanner sc = new Scanner(System.in);
         
         System.out.print("Name of task: ");
         String task = sc.nextLine();
      
         if(task.equals("-1")) {
            reply = -1;
            break;
         }
         
         System.out.print("Name of member responsible for completing the task: ");
         String name = sc.nextLine();
         
         task = task + " done by " + name;
      
         System.out.print("Rate the difficulty of this task on a scale of 1 to 5 (5 being the hardest): ");
         int lvl = sc.nextInt();
         map.put(task, lvl);
      }
      
      if(reply == -1) 
         System.out.println("Agenda successfully created");  
         
      System.out.println("Printing out each task, the group member responsible for its completing, and its level of difficulty: ");
      int num = 1;
      for(String t : map.keySet()) {
         int l = map.get(t);
         System.out.println("Task " + num + ": " + t + "; difficulty " + l);
         num++;
      }
   }      
}