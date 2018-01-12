package calculatorapplication;

import java.util.Scanner;

/**
 *
 * @author Daniel Gurbiel
 */
public class CalculatorApplication {
    Scanner input = new Scanner(System.in);
    static Number number1;
    static Number number2;
    static char operation;
    static float result;

    public CalculatorApplication() {
      number1 = new Number();
      number2 = new Number();
    }

    void insertNumber(Number number){
        System.out.print("Please insert the number: ");
        number.setValue(input.nextFloat());
    }
    
    void chooseOperation(){
        System.out.print("Choose action [+ - * / % sqrt ^x]: ");
        operation = input.next().charAt(0);
    }
    
    void calculate(Number number1, Number number2){
        switch(operation){
            case '+': result = number1.getValue() + number2.getValue();
                    break;
            case '-': result = number1.getValue() - number2.getValue();
                    break;
            case '*': result = number1.getValue() * number2.getValue();
                    break;
            case '/': result = number1.getValue() / number2.getValue();
                    break;
            case '%': result = number1.getValue() % number2.getValue();
                    break;
            case 's': result = (float) Math.sqrt(number1.getValue());
                    break;
            case '^': result =  (float) Math.pow(number1.getValue(), number2.getValue());
                    break;
            default:
                    System.out.println("ERROR!");
            
        }
    }
    
    float seeResult(){
        operation = ' ';
        number1.setValue(result);
        return result;
    }
    
    public static void main(String[] args) {
        CalculatorApplication calc = new CalculatorApplication();
        calc.insertNumber(number1);
        do{
            calc.chooseOperation();
        } while((operation != '+') & (operation != '-') & (operation != '*') & (operation != '/') & (operation != '%')
                & (operation != 's') & (operation != '^'));
        if(operation != 's')
            calc.insertNumber(number2);
        if(operation == '/' & number2.getValue() == 0)
            System.out.println("Never divide by 0!");
        else {
        calc.calculate(number1, number2);
        System.out.println(calc.seeResult());
        }
    } 
}
