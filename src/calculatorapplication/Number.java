package calculatorapplication;

/**
 *
 * @author Daniel Gurbiel
 */

public class Number {
    private float value;
    Number(){
        value = 0;
    }
    
    Number(float value){
        this.value = value;
    }
    
    void setValue(float value){
        this.value = value;
    }
    
    float getValue(){
        return value;
    }
}
