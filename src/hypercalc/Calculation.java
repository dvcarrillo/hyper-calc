/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hypercalc;

/**
 *
 * @author davidvargascarrillo
 */
public class Calculation {
    
    private double operator1 = 0;
    private double operator2 = 0;
    
    /**************************************************************************/
    // CONSTRUCTOR
    
    public Calculation ()
    {
        this.operator1 = 0;
        this.operator2 = 0;
    }
    
    public Calculation (double op1, double op2)
    {
        this.operator1 = op1;
        this.operator2 = op2;
    }
    
    /**************************************************************************/
    // GETTER / SETTER METHODS

    public double getOperator1() {
        return operator1;
    }

    public double getOperator2() {
        return operator2;
    }

    public void setOperator1(double operator1) {
        this.operator1 = operator1;
    }

    public void setOperator2(double operator2) {
        this.operator2 = operator2;
    }
    
    /**************************************************************************/
    // OPERATIONS
    
    public double Sum ()
    {
        return operator1 + operator2;
    }
    
    public double Substraction ()
    {
        return operator1 - operator2;
    }
    
    public double Division ()
    {
        return operator1 / operator2;
    }
    
    public int Quotient ()
    {
        int iop1 = (int)operator1;
        int iop2 = (int)operator2;
        
        return iop1 / iop2;
    }
    
    public int Rest ()
    {
        int iop1 = (int)operator1;
        int iop2 = (int)operator2;
        
        return iop1 % iop2;
    }
    
    public int Reverse ()
    {
        int iop1 = (int)operator1;
        int iop2 = (int)operator2;
        
        int i = 0;
        boolean found = false;
        
        while (i < 1000000 && !found)
        {
            int mul = iop1 * i;
            
            if ((mul % iop2) == 1)
                found = true;
            else
                i++;
        }
        
        return i;
    }
    
}
