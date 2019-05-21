package frc.robot.biblioteca;
import java.util.ArrayList;
/*This is the class that all other classes will inherit from. It has two basic functions: gathering information and doing actions. 
When one of these is instantiated, it gets added to a static list of all of them. Then you can use the methods gatherInfoAll() and doActionsAll() to update every single thing.*/
public class roboBaseClass {
    private static ArrayList<roboBaseClass> allParts = new ArrayList<roboBaseClass>();//Static list of all items.
    public roboBaseClass() {//Constructor, will run once upon instantiation of this class.
        roboBaseClass.addPart(this);//Add self to the static list
    }
    public void gatherInfo() {};//Empty method
    public void doActions() {};//Empty method
    public static void addPart(roboBaseClass e) {//Method used to add new parts
        roboBaseClass.allParts.add(e);
    };
    public static ArrayList<roboBaseClass> getParts() {//Method used to return the allParts list
        return (allParts);
    };
    public static void gatherInfoAll() {//Method used to run gatherInfo for every element
        for ( roboBaseClass r : roboBaseClass.getParts() ) {//For each roboBaseClass "r" in the static list, run gatherInfo()
            r.gatherInfo();
        }
    };
    public static void doActionsAll() {//Method used to run doActions for every element
        for ( roboBaseClass r : roboBaseClass.getParts() ) {//For each roboBaseClass "r" in the static list, run doActions()
            r.doActions();
        }
    };
}