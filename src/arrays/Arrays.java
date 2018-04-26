
package arrays;

public class Arrays {

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public void arrayValue(){
        int[] age = new int[3];//hvor mange arrays skal vi bruge?
        age[0] = 21;
        age[1] = 41;
        age[2] = 14;
        
        //giver mulighed for, at kunne bruge dette længere ned.
        int returnValue = 0;
        for (int i = 0; i < age.length; i++) {
            returnValue += age[i];
        }
        
        //udskriver indholdet here
        System.out.println(returnValue);
        
        //----------------Anden måde at lave arrays på.-------------------//
        
        float[] theValues = {10.4f, 21.3f, 32.22f, 219.022f};
        float sum = 0.0f;
        
        for (int i = 0; i < theValues.length; i++) {
            sum += theValues[i];
        }
        System.out.println(sum);
    }
    
}
