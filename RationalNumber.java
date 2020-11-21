public class RationalNumber extends RealNumber {
  private int numerator, denominator;
  
  public RationalNumber(int nume, int deno){

super(deno==0? 0:nume/deno);
numerator=nume;
denominator=deno;

  }

  public double getValue(){
if(this.denominator == 0)
{return 0;}
double d=denominator; 
double n=numerator;   

  return (n/d);
}

public int getNumerator(){
  return numerator;
}

public int getDenominator(){
   return denominator;
 }

 public RationalNumber reciprocal(){
    RationalNumber result = new RationalNumber (denominator, numerator);
   return result;

 }

 public boolean equals(RationalNumber other){
 if (this.numerator == other.getNumerator() && 
     this.denominator == other.getDenominator() )
   return true;
   return false;
 }


 public String toString(){
if(this.denominator == 0)
{return "0/1";}
  return numerator + "/" + denominator;
}


private static int gcd(int a, int b){
int gcd1 = 1;
for(int i = 2; i <= a && i <= b; i++)
{
    if(a%i==0 && b%i==0)
         gcd1 = i;
}
return gcd1;
}


private void reduce(){
int gcd = gcd(numerator, denominator);
 numerator = numerator/gcd;
 denominator = denominator/gcd;


 }

 public RationalNumber multiply(RationalNumber other){
     RationalNumber result = new RationalNumber((this.numerator * other.getNumerator()),
         ((this.denominator) * other.getDenominator()));
reduce();
  return result;
}

public RationalNumber divide(RationalNumber other){
     RationalNumber result = new RationalNumber((this.numerator * other.getNumerator()),
         ((this.denominator) * other.getNumerator()));
   reduce();
  return result;
}

public RationalNumber add(RationalNumber other){
int deno3 = (denominator * other.getDenominator()) / 
          gcd( this.denominator, other.getDenominator() );
int nume3 = (this.numerator)*(deno3/this.denominator) +
            (other.numerator) * (deno3/other.getDenominator());
RationalNumber result = new RationalNumber(nume3, deno3);
   reduce();
return result ;


}


public RationalNumber subtract(RationalNumber other){
int deno3 = (denominator * other.getDenominator()) / 
          gcd( this.denominator, other.getDenominator() );
int nume3 = (this.numerator)*(deno3/this.denominator) -
            (other.numerator) * (deno3/other.getDenominator());

RationalNumber result = new RationalNumber(nume3, deno3);
   reduce();
return result ;
}
}
