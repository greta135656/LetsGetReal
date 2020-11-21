public class RealNumber{
  private double value;

  public RealNumber(double v){
    value = v;
  }

  public double getValue(){
    return value;
  }

  public String toString(){
    return ""+getValue();
  }

  public boolean equals(RealNumber other){
  if (value == 0 && other == 0)
  return true;
  if (Math.abs(value/other) <= 0.00001)
   return true;
   return false;
 }

 public RealNumber add(RealNumber other){
 return (value + other);
}

public RealNumber multiply(RealNumber other){
      return (value * other);
}

public RealNumber divide(RealNumber other){
       return (value/other);
 }

 public RealNumber subtract(RealNumber other){
  return (value-other);
}
}









public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  public RationalNumber(int nume, int deno){
    nume = numerator;
    deno = denominator;//this value is ignored! 
  }

  public double getValue(){
  return (reduce(numerator/denominator));
}

public int getNumerator(){
  return numerator;
}

public int getDenominator(){
   return denominator;
 }

 public RationalNumber reciprocal(){
   return (reduce(denominator/numerator));
 }

 public boolean equals(RationalNumber other){
 if (this.numerator == other.getNumerator() && 
     this.denominator == other.getDenominator() )
   return false;
 }


 public String toString(){
  return "getNumerator()" + "/" + "getDenominator";
}


private static int gcd(int a, int b){

for(int i = 1; i <= a && i <= b; i++)
{
    if(a%i==0 && b%i==0)
        gcd = i;
}
return gcd;
}


private void reduce(){
numerator = numerator/gcd;
denominator = denominator/gcd;
return (numerator/denominator);
 }

 public RationalNumber multiply(RationalNumber other){
 RationalNumber number1 = ((this.numerator * other.getNumerator())/
         ((this.denominator) * other.getDenominator()));
  return number1;
}

public RationalNumber divide(RationalNumber other){
RationalNumber number2 = ((this.numerator * other.getDenominator())/
        ((this.denominator) * other.getNumerator()));
  return number2;
}

public RationalNumber add(RationalNumber other){
int deno3 = (denominator * other.getDenominator) / 
          gcd( this.denominator, other.getDenominator() );
int nume3 = (this.numerator)*(deno3/this.denominator) +
            (other.numerator) * (deno3/other.getDenominator());

return (reduce(nume3, deno3));


}


public RationalNumber subtract(RationalNumber other){
int deno3 = (denominator * other.getDenominator) / 
          gcd( this.denominator, other.getDenominator() );
int nume3 = (this.numerator)*(deno3/this.denominator) -
            (other.numerator) * (deno3/other.getDenominator());

return (reduce(nume3, deno3));
}
}
