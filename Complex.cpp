#include <iostream>
using namespace std;
   

 struct complex {
    double real_part=0;
    short isDivision=0;
    double imaginary_part=0;
    void getsetnumbers(){
        cout<<"number\n";
        cout<<"give real part of number- ";
        cin>>real_part;
        cout<<"give imaginary part of number- ";
        cin>>imaginary_part;
    }
    
    double operator +(complex x){
        double real_part_addition, imaginary_part_addition;
        real_part_addition=real_part+x.real_part;
        imaginary_part_addition=imaginary_part+x.imaginary_part;
        cout<<"Addition is==  "<<real_part_addition<<"+"<<imaginary_part_addition<<"i\n";
    }
    double operator -(complex x){
        double real_part_subtraction, imaginary_part_subtraction;
        real_part_subtraction=real_part-x.real_part;
        imaginary_part_subtraction=imaginary_part-x.imaginary_part;
        cout<<"Subtraction is==  "<<real_part_subtraction<<"+"<<imaginary_part_subtraction<<"i\n";
    }
 friend double operator *(complex x, complex y);
 friend double operator /(complex x, complex y);
 friend double operator |(complex x, complex y);
};  
     double operator |(complex g, complex k){
        g.real_part=k.real_part;
        g.imaginary_part=k.imaginary_part;
        g.isDivision=k.isDivision;
   }
     double operator *(complex o, complex p){
       double real_part_multiplication, imaginary_part_multiplication;
       real_part_multiplication=p.real_part*o.real_part- p.imaginary_part*o.imaginary_part;
       imaginary_part_multiplication=p.imaginary_part*o.real_part+ p.real_part*o.imaginary_part;
       if (o.isDivision== 0){
       cout<<"product is==  "<<real_part_multiplication<<"+("<<imaginary_part_multiplication<<")i\n";
       }
       else{
          o.real_part=real_part_multiplication;
          o.imaginary_part=imaginary_part_multiplication; 
       }
       
   }
       double operator /(complex h, complex k){
       complex g;
       k.isDivision=1;
       g|k;
       k.imaginary_part=-k.imaginary_part;
       k*h;
       
       g*h;
       k.real_part=k.real_part/g.real_part;
       k.imaginary_part=k.imaginary_part/g.real_part;
        cout<<"division is==  "<<k.real_part<<"+("<<k.imaginary_part<<")i\n";
       
       
   }
   
int main()
{   double a,b;
   
    
    complex z;
    z.getsetnumbers();
    complex y;
    y.getsetnumbers();
    y+(z);
    y-z;
    y*(z);
    y/z;
    return 0;
}
