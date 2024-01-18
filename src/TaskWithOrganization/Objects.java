package TaskWithOrganization;

import java.util.Queue;

public class Objects {
    public static void run (){
        Supervisor supervisor = new Supervisor("Arsesha", 1000);
        Subordinate subordinate = new Subordinate("Mysh", 500);
        Subordinate subordinate2 = new Subordinate("Each", 400);
        supervisor.printSubordinates();
        supervisor.addSubordinate(subordinate);
        supervisor.addSubordinate(subordinate2);
        supervisor.printSubordinates();
        supervisor.addSubordinateName(subordinate);
        supervisor.addSubordinateName(subordinate2);
        supervisor.printNames();
    }
}
