package com.OOPS;
class fraction{
      int num;
      int den;
      fraction(int num, int den){
        this.num = num;
        this.den = den;
        simplify();
      }
      void print(){
        System.out.println(num+"/"+den);
      }

      void add(fraction f){
        num = num*f.den + den*f.num;
        den = den*f.den;
           simplify();
      }

      void mul(fraction f){
        num = num*f.num;
        den = den*f.den;
        simplify();
      }

      void div(fraction f){
        num = num*f.den;
        den = den*f.num;
        simplify();
      }

      int hcf(int a , int b){
        if(a==0) return b;
        return hcf(b%a, a);
      }

    void simplify(){
        boolean isNegative = (num*den < 0) ? true : false;
        num = Math.abs(num);
        den = Math.abs(den);

         int gcd = hcf(num, den);
         num = num/gcd;
         den = den/gcd;

         if(isNegative) num = -num;
    }

    

}
public class FractionClass {
    public static void main(String[] args) {
        fraction f1 = new fraction(3, 7);
        f1.print();

        fraction f2 = new fraction(7, 3);
        f1.add(f2);
        f1.print();

        f1.mul(f2);
        f1.print();

        f1.div(f2);
        f1.print();

        fraction f3 = new fraction(-50, 100);
        f3.print();
    }
}
