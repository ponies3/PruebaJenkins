/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package PruebaJenkins;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public int suma(int n1, int n2){
        return n1 + n2;
    }
    
    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
    
    
}
