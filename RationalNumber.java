public class RationalNumber extends Number {
  private int numerator, denominator;
  
  public RationalNumber(int nume, int deno){
  super(0.0);
  if (deno == 0 || nume == 0) {
  numerator = 0;
  denominator = 1;
  }
  else{
  numerator = nume;
  denominator = deno;
  reduce();
  }
  if (denominator<0){
  numerator = numerator * -1;
  denominator = denominator * -1;
  }
  }

  public double getValue(){
if(this.denominator == 0)
{return 0;}
double d=denominator; 
double n=numerator;   
  n=n/gcd(numerator, denominator);
  d=d/gcd(numerator, denominator);
  reduce();
  return (n/d);
}

public int getNumerator(){
  return numerator;
}

public int getDenominator(){
   return denominator;
 }

  public RationalNumber reciprocal(){
    int num = denominator;
    int den = numerator;
    numerator = num;
    denominator = den;
    RationalNumber ans = new RationalNumber (numerator, denominator);
    return ans;
  }

 public boolean equals(RationalNumber other){
reduce();
other.reduce();
 if (this.numerator == other.getNumerator() && 
     this.denominator == other.getDenominator() )
   return true;
   return false;
 }


 public String toString(){
if(denominator == 1)
return "" + numerator;
return numerator + "/" + denominator;
}


private static int gcd(int a, int b){
int gcd1 = 1;
for(int i = 2; i <= Math.abs(a) && i <= Math.abs(b); i++)
{
    if(Math.abs(a)%i==0 && Math.abs(b)%i==0)
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
result.reduce();
  return result;
}

public RationalNumber divide(RationalNumber other){
     RationalNumber result = new RationalNumber((this.numerator * other.getDenominator()),
         ((this.denominator) * other.getNumerator()));
   result.reduce();
  return result;
}

public RationalNumber add(RationalNumber other){
int deno3 = (denominator * other.getDenominator()) / 
          gcd( this.denominator, other.getDenominator() );
int nume3 = (this.numerator)*(deno3/this.denominator) +
            (other.numerator) * (deno3/other.getDenominator());
RationalNumber result = new RationalNumber(nume3/gcd(nume3, deno3), deno3/gcd(nume3, deno3));
   result.reduce();
return result ;


}


public RationalNumber subtract(RationalNumber other){
int deno3 = (denominator * other.getDenominator()) / 
          gcd( this.denominator, other.getDenominator() );
int nume3 = (this.numerator)*(deno3/this.denominator) -
            (other.numerator) * (deno3/other.getDenominator());

RationalNumber result = new RationalNumber(nume3, deno3);
   result.reduce();
return result ;
}
}
