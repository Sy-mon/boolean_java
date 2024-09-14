//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        boolean passedDoor = true;
        boolean missedDoor = false;
        boolean passedAllDoors = false;
        int doorCount = 0;


    if(passedDoor){
        System.out.println("We have passed the first door.");
        doorCount = doorCount + 1;
    }
    if(passedDoor){
        System.out.println("We have passed the second door.");
        doorCount = doorCount + 1;
    }
    if(passedDoor){
        System.out.println("We have passed the third door.");
        doorCount = doorCount + 1;
    }

    System.out.println("===================================");

    if(doorCount == 3) {
        passedAllDoors = true;
    }

    if(passedAllDoors){
        System.out.println("Congrats..You've won the game...🥳🎉");
    }
    }
}