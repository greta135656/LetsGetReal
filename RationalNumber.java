public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){

 super(nume/deno);

  }

  public double getValue(){
         reduce();
  return (numerator/denominator);
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
  return "getNumerator()" + "/" + "getDenominator";
}


private static int gcd(int a, int b){
int gcd = 0;
for(int i = 1; i <= a && i <= b; i++)
{
    if(a%i==0 && b%i==0)
         gcd = i;
}
return gcd;
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
