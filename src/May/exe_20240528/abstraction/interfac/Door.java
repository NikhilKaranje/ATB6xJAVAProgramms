package May.exe_20240528.abstraction.interfac;

public interface Door {
    default void autoDor(){
        System.out.println("Automatic Door");
    }
    default void manualDoor(){
        System.out.println("Manual Doors");
    }
}
