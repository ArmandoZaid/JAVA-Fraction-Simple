/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;

/**
 *
 * @author Armando Diaz
 */
public class Fraction {
    
    private int numerator;
    private int denomurator;
 
    public Fraction() throws Exception{
        setNumerator(0);
        setDenomurator(1);
    }
    
    public Fraction(int num, int denum) throws Exception{
        setNumerator(num);
        setDenomurator(denum);
    }
    
    public static Fraction Multiply (Fraction x, Fraction y) throws Exception {
        Fraction result = new Fraction();
        result.setNumerator(x.getNumerator() * y.getNumerator());
        result.setDenomurator(x.getDenomurator() * y.getDenomurator());
        
        return result;
    }
    
    public static Fraction Multiply (Fraction x, int y) throws Exception {
        Fraction result = new Fraction();
        result.setNumerator(x.getNumerator() * y );
        result.setDenomurator(x.getDenomurator());
        
        return result;
    }
    
    public static Fraction Division (Fraction x, Fraction y) throws Exception {
        Fraction result = new Fraction();
        result.setNumerator(x.getNumerator() * y.getDenomurator());
        result.setDenomurator(x.getDenomurator() * y.getNumerator());
        
        return result;
    }
    
    public static Fraction Division (Fraction x, int y) throws Exception {
        Fraction result = new Fraction();
        result.setNumerator(x.getNumerator());
        result.setDenomurator(x.getDenomurator() * y);
        
        return result;
    }
    
    public static Fraction Addition (Fraction x, Fraction y) throws Exception {
        Fraction result = new Fraction();
        result.setNumerator((x.getNumerator() * y.getDenomurator()) + (x.getDenomurator() * y.getNumerator()));
        result.setDenomurator(x.getDenomurator() * y.getDenomurator());
        
        return result;
    }
    
    public static Fraction Addition (Fraction x, int y) throws Exception {
        Fraction result = new Fraction();
        result.setNumerator(x.getNumerator() + (x.getDenomurator() * y));
        result.setDenomurator(x.getDenomurator());
        
        return result;
    }
    
    public static Fraction Substraction (Fraction x, Fraction y) throws Exception {
        Fraction result = new Fraction();
        result.setNumerator((x.getNumerator() * y.getDenomurator()) - (x.getDenomurator() * y.getNumerator()));
        result.setDenomurator(x.getDenomurator() * y.getDenomurator());
        
        return result;
    }
    
    public static Fraction Substraction (Fraction x, int y) throws Exception {
        Fraction result = new Fraction();
        result.setNumerator(x.getNumerator() - (x.getDenomurator() * y));
        result.setDenomurator(x.getDenomurator());
        
        return result;
    }
    
    /**
     * @return the numerator
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * @param numerator the numerator to set
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * @return the denomurator
     */
    public int getDenomurator() {
        return denomurator;
    }

    /**
     * @param denomurator the denomurator to set
     */
    public void setDenomurator (int denomurator) throws Exception {
        if(denomurator != 0) {
            this.denomurator = denomurator;
        } else {
            throw new Exception("Can't be Zero");
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        
        try {
            Fraction frac1 = new Fraction(1,2);
            Fraction frac2 = new Fraction(3,4);
            int n = 5;

            Fraction result = Fraction.Multiply(frac1, frac2);
            System.out.println("");
            System.out.println("1st Fraction " + frac1.getNumerator() + "/" + frac1.getDenomurator());
            System.out.println("2nd Fraction " + frac2.getNumerator() + "/" + frac2.getDenomurator());
            System.out.println("Result: " + result.getNumerator() + "/" + result.getDenomurator());
            
            Fraction result2 = Fraction.Multiply(frac1, n);
            System.out.println("");
            System.out.println("Operasi Overloading dari Multiply");
            System.out.println("1st Fraction " + frac1.getNumerator() + "/" + frac1.getDenomurator());
            System.out.println("2nd Fraction " + n);
            System.out.println("Result: " + result2.getNumerator() + "/" + result2.getDenomurator());
            
            Fraction resultDivision = Fraction.Division(frac1, frac2);
            System.out.println("");
            System.out.println("1st Fraction " + frac1.getNumerator() + "/" + frac1.getDenomurator());
            System.out.println("2nd Fraction " + frac2.getNumerator() + "/" + frac2.getDenomurator());
            System.out.println("Result: " + resultDivision.getNumerator() + "/" + resultDivision.getDenomurator());
            
            Fraction resultDivision2 = Fraction.Division(frac1, n);
            System.out.println("");
            System.out.println("Operasi Overloading dari Division");
            System.out.println("1st Fraction " + frac1.getNumerator() + "/" + frac1.getDenomurator());
            System.out.println("2nd Fraction " + n);
            System.out.println("Result: " + resultDivision2.getNumerator() + "/" + resultDivision2.getDenomurator());
            
            Fraction resultAddition = Fraction.Addition(frac1, frac2);
            System.out.println("");
            System.out.println("1st Fraction " + frac1.getNumerator() + "/" + frac1.getDenomurator());
            System.out.println("2nd Fraction " + frac2.getNumerator() + "/" + frac2.getDenomurator());
            System.out.println("Result: " + resultAddition.getNumerator() + "/" + resultAddition.getDenomurator());
            
            Fraction resultAddition2 = Fraction.Addition(frac1, n);
            System.out.println("");
            System.out.println("Operasi Overloading dari Addition");
            System.out.println("1st Fraction " + frac1.getNumerator() + "/" + frac1.getDenomurator());
            System.out.println("2nd Fraction " + n);
            System.out.println("Result: " + resultAddition2.getNumerator() + "/" + resultAddition2.getDenomurator());
            
            Fraction resultSubstraction = Fraction.Substraction(frac1, frac2);
            System.out.println("");
            System.out.println("1st Fraction " + frac1.getNumerator() + "/" + frac1.getDenomurator());
            System.out.println("2nd Fraction " + frac2.getNumerator() + "/" + frac2.getDenomurator());
            System.out.println("Result: " + resultSubstraction.getNumerator() + "/" + resultSubstraction.getDenomurator());
            
            Fraction resultSubstraction2 = Fraction.Substraction(frac1, n);
            System.out.println("");
            System.out.println("Operasi Overloading dari Substraction");
            System.out.println("1st Fraction " + frac1.getNumerator() + "/" + frac1.getDenomurator());
            System.out.println("2nd Fraction " + n);
            System.out.println("Result: " + resultSubstraction2.getNumerator() + "/" + resultSubstraction2.getDenomurator());
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
}
