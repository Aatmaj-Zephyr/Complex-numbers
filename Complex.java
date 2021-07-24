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
        return new Complex(a.Real*b.Real-a.Imaginary*b.Imaginary,a.Real*b.Imaginary+a.Imaginary*b.Real);
    }
    public static Complex div(Complex a,Complex b){
        return prod(a,reciprocal(b));
    }
    public static Complex div(Complex a, double b){
        return new Complex(a.Real/b,a.Imaginary/b);
    }
    public static Complex prod(Complex a, double b){
        return new Complex(a.Real*b,a.Imaginary*b);
    }
    public static Complex conj(Complex a){
        return new Complex(a.Real,-a.Imaginary);
    }
    public static Complex reciprocal(Complex a){
        return div(conj(a),abs(a));
    }
    public static void print(Complex a){
        System.out.println(a.Real+"+i"+a.Imaginary);
    }
    public static Complex Polar(double r, double theta){
        //The polar form of complex number.
        return new Complex(r*Math.cos(theta),r*Math.sin(theta));
    }
    public static Complex pow(Complex a, int b){
        Complex temp= new Complex(a.Real,a.Imaginary);
        for(int i=0;i<b-1;i++){
            temp=prod(temp,a);
        } 
        return temp;
    }
     public static boolean equals(Complex a,Complex b){
         if(a.Real==b.Real&&a.Imaginary==b.Imaginary){
             return true;
         }
         else{
             return false;
         }
     }
}
