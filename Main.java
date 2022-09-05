/******************************************************************************
 This contains the complex numbers class. 
 As complex numbers are not supported in Java like in Python, a seprate class complex numbers is required to be made for generating complex numbers. 
 You can use the class in the package to make Complex numbers by creating an instance of the class Complex and use the methods easily. 
 Check out the documentation for more details.
 *******************************************************************************/
public class Main {
  public static void main(String[] args) {
    System.out.println("Testing functions");
    Complex a = new Complex(1, 2);
    Complex b = new Complex(2, 3);
    Complex.println(Complex.add(a, b));
    Complex.println(Complex.sub(a, b));
    Complex.println(Complex.prod(a, b));
    Complex.println(Complex.prod(a, 2));
    Complex.println(Complex.div(a, b));
    Complex.println(Complex.conj(a));
    Complex.println(Complex.div(a, 2));
    Complex.println(Complex.Polar(2, 3.141596372));
    Complex.println(Complex.pow(a, 2));
    System.out.println((Complex.equals(a, a)));
  }
}
