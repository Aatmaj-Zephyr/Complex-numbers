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
    
    Complex(double r, float theta){
        //The polar form of complex number.
        this(r*Math.cos(theta),r*Math.sin(theta));
    }
    
    //Static methods
    public static double abs(Complex a){
        return Math.sqrt(Math.abs(a.Real*a.Real+a.Imaginary*a.Imaginary));
    }
    
    public static Complex sub(Complex a,Complex b){
        return new Complex(a.Real-b.Real,a.Imaginary-b.Imaginary);
    }
    
    public static Complex add(Complex a, Complex b){
        return new Complex(a.Real+b.Real,a.Imaginary+b.Imaginary);
    }
    
    public static Complex prod(Complex a,Complex b){
        return new Complex(a.Real*b.Imaginary,a.Imaginary*a.Real);
    }
    public static Complex div(Complex a,Complex b){
        return prod(a,conj(b));
    }
    public static Complex div(Complex a, double b){
        return new Complex(a.Real/b,a.Imaginary/b);
    }
    public static Complex prod(Complex a, double b){
        return new Complex(a.Real*b,a.Imaginary*b);
    }
    public static Complex conj(Complex a){
        return div(new Complex(a.Real,-a.Imaginary),abs(a));
    }
}
