package May.exe_20240528.abstraction.interfac;

public interface Breake {
     default void engineBreak(){
        System.out.println("Engine Break");
    }
    default void engineDoor(){
        System.out.println("Door Engine");
    }

}
