

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//
public class Main {
    public static void main(String[] args) {
            Greeter greeter = new Greeter();
            Calculator calculator = new Calculator();

            greeter.greet("World");
            System.out.println(calculator.add(3, 5));
        }
}