import javax.swing.*;

public class NumbersDemo {
    public static void main(String[] args) {
           int number1 = GetNum1();
           int number2 = GetNum2();
           numberBy2 = displayTwiceTheNumber(number1, number2);
           numberUp5m = displayPlusFive();
           numberSquared = displayNumberSquared();

    }
    public static int GetNum1() {
            String number1str = JOptionPane.showInputDialog(null,  "Please enter your first number");
            Integer number1 = Integer.parseInt(number1str);
            return number1;
    }
    public static int GetNum2() {
            String number2str = JOptionPane.showInputDialog(null,  "Please enter your first number");
            Integer number2 = Integer.parseInt(number2str);
            return number2;
    }
    public static int displayTwiceTheNumber(Integer number1, Integer number2) {
            number1By2 = number1 * 2;
            number2By2 = number2 * 2;
            numberBy2 = JOptionPane.ShowOutputDialog(null, "Your first number squared is: " + number1By2 + " Your second number squared is: " + number2By1);
            return number1;
            return number2;
            return numberBy2;
    }
    //public static int


}
