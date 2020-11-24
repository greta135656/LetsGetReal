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
    double val = getValue();
    double otherval = other.getValue();
    if (val == 0 || otherval == 0){
      return (val == 0 && otherval == 0);
    }
    else{
      return Math.abs((val - otherval)/val) <= (0.00001 * val);
    }
  }

 public RealNumber add(RealNumber other){
      RealNumber result = new RealNumber(value + other.getValue());
    return result;
}

public RealNumber multiply(RealNumber other){
      RealNumber result = new RealNumber(value * other.getValue());
    return result;
}

public RealNumber divide(RealNumber other){
      RealNumber result = new RealNumber(value / other.getValue());
    return result;
 }

 public RealNumber subtract(RealNumber other){
      RealNumber result = new RealNumber(value - other.getValue());
    return result;
}
}
