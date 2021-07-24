/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Testing functions");
		Complex a=new Complex(1,2);
		Complex b=new Complex(2,3);
		Complex.print(Complex.add(a,b));
		Complex.print(Complex.sub(a,b));
		Complex.print(Complex.prod(a,b));
		Complex.print(Complex.prod(a,2));
		Complex.print(Complex.div(a,b));
		Complex.print(Complex.conj(a));
		Complex.print(Complex.div(a,2));
		Complex.print(Complex.Polar(2,3.141596372));
		Complex.print(Complex.pow(a,2));
		System.out.println((Complex.equals(a,a)));

	}
}
