package src;

import java.util.*;

public class Menu {
    
  Map<Integer, MenuRow> menu = new HashMap<>();
  public Menu(MenuRow[] rows) {
    int i = 0;
    for (MenuRow row : rows) {
        menu.put(i++, new MenuRow(row.getTitle(), row.getAction()));
    }
  }

  public MenuRow get(int i) {
    return menu.get(i);
  }

  public void print() {
    for (Map.Entry<Integer, MenuRow> pair : menu.entrySet()) {
      System.out.println(pair.getKey() + " : " + pair.getValue().getTitle());
    }
  }

  public static void main(String[] args) {
    Driver.main(args);
  }

}

class MenuRow {
  String title;       
  Runnable action;    

  public MenuRow(String title, Runnable action) {
    this.title = title;
    this.action = action;
  }

  public String getTitle() {
    return this.title;
  }
  public Runnable getAction() {
    return this.action;
  }

  public void run() {
    action.run();
  }
}

class Driver {

  public static void main(String[] args) {
    MenuRow[] rows = new MenuRow[]{
      new MenuRow("Exit", () -> main(null)),
      new MenuRow("Swap", () -> IntByReference.main(null)), 
      new MenuRow("Matrix", () -> Matrix.main(null)),
      new MenuRow("Number", () -> Number.main(null)),
      new MenuRow("Snakes", () -> Snakes.main(null)), 
      new MenuRow("Ordered Queues", () -> OrderedQueues.main(null)),
      new MenuRow("Reverse Stack", () -> ReverseStack.main(null)),
      new MenuRow("Calculator", () -> Calculator.main(null)),
      new MenuRow("Sort", () -> Sort.main(null))
    };

    Menu menu = new Menu(rows);

    while (true) {
      System.out.println("-------------------------------");
      System.out.println("Sarah's CSA Menu:");
      System.out.println("-------------------------------");
      menu.print();
      System.out.println("Input your number: ");

      // try {
        Scanner sc = new Scanner(System.in);
        int selection = sc.nextInt();

        // try {
          MenuRow row = menu.get(selection);
          if (row.getTitle().equals("Exit"))
            return;
          System.out.println("");
          row.run();
        // } catch (Exception e) {
        //   System.out.printf("Invalid selection %d\n", selection);
        // }
      //} catch (Exception e) {
      //  System.out.println("Not a number");
      //}

      // TESTING: does stack.peek() work
      Stack test = new Stack();
      test.push(1);
      test.push(2);
      test.push(3);
      test.push(4);
      System.out.println(test.peek());
    }
  }
}
