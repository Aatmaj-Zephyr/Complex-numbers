import java.lang.Math;
public class Complex{
    //Create a class named Complex and declare it as public.
    double Real; //This variable is used to store the Real part of the complex number. 
    double Imaginary; //This variable is used to store Imaginary part of the complex number.
    
    Complex(double x, double y){
        //Constructor to make a complex number in the cartesian form.
        Real=x;
        Imaginary=y;
    }
    
    //Static methods
    
    public static final double abs(Complex a){
        //absolute value of the complex number.
        return Math.sqrt(Math.abs(a.Real*a.Real+a.Imaginary*a.Imaginary));
    }
    
    public static final Complex sub(Complex a,Complex b){
        //Subtracting two complex numbers.
        return new Complex(a.Real-b.Real,a.Imaginary-b.Imaginary);
    }
    
    public static final Complex add(Complex a, Complex b){
        //Adding two complex numbers.
        return new Complex(a.Real+b.Real,a.Imaginary+b.Imaginary);
    }
    
    /*Product  operation. 
    The prod function is overridden to accomodate two complex numbers, one complex number and one scalar, one complex numbe in any order.
    - prod(Complex,Complex)- product two complex numbers
    - prod(Complex,double)- product Complex and scalar
    - prod(double,Complex)- product Complex and scalar
    */
    public static final Complex prod(Complex a,Complex b){
        //Product of two complex numbers
        return new Complex(a.Real*b.Real-a.Imaginary*b.Imaginary,a.Real*b.Imaginary+a.Imaginary*b.Real);
    }
    public static final Complex prod(Complex a, double b){
        //Product of a complex number and a scalar.
        return new Complex(a.Real*b,a.Imaginary*b);
    }
     public static final Complex prod(double b, Complex a){
        //Product of a complex number and a scalar.
        return new Complex(a.Real*b,a.Imaginary*b);
    }
    
    /*Division  operation. 
    The prod function is overridden to accomodate two complex numbers, one complex number and one scalar, one complex numbe in any order.
    - div(Complex,Complex)- divide two complex numbers
    - div(Complex,double)- divide Complex and scalar
    - div(double,Complex)- divide Complex and scalar
    */
    public static final Complex div(Complex a,Complex b){
        return prod(a,reciprocal(b));
    }
    public static final Complex div(Complex a, double b){
        return new Complex(a.Real/b,a.Imaginary/b);
    }
    public static final Complex div(double b, Complex a){
        return new Complex(a.Real/b,a.Imaginary/b);
    }
    
    
    public static final Complex conj(Complex a){
        //Conjucate of a complex number
        return new Complex(a.Real,-a.Imaginary);
    }
    public static final Complex reciprocal(Complex a){
       // Reciprocal of a complex number. same as 1/div(). 
       //note that the div() function uses this function.
        return div(conj(a),abs(a));
    }
    
    public static void print(Complex a){
        //Function to print the complex number.
        //Note this is not marked as final so you can override and print in any format.
        System.out.println(a.Real+"+i"+a.Imaginary);
    }
    
    public static final Complex Polar(double r, double theta){
        //The polar form of complex number.
        return new Complex(r*Math.cos(theta),r*Math.sin(theta));
    }
    
    public static final Complex pow(Complex a, int b){
        //Complex number raised to a real power.
        Complex temp= new Complex(a.Real,a.Imaginary);
        for(int i=0;i<b-1;i++){
            temp=prod(temp,a);
        } 
        return temp;
    }
    
    public static final boolean equals(Complex a,Complex b){
        //To check of the two complex numbers are equal or not.
         if(a.Real==b.Real&&a.Imaginary==b.Imaginary){
             return true;
             //Return true if the numbers are equal
         }
         else{
             return false;
             //Return false if the numbers are not equal.
         }
         //Note that you cannot use equal to operator or such to check the equality of two complex objects as per object implementation rules.
    }
}
