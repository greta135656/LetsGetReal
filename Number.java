public abstract class Number {
	public abstract double getValue();

	public int compareTo(Number other){
		if(getValue() == other.getValue())
    {return 0;} 
    else if (getValue() - other.getValue() > 0) 
    {return 1;} 
    else {
			return 1;
		}
	}
	
	
  public boolean equals(Number other){
		if(getValue() == 0 && other.getValue() == 0){
			return true;
		}
    if (getValue() == 0 && other.getValue() != 0){
    return false;
    }
    if (getValue() != 0 && other.getValue() == 0){
    return false;
    }
		return Math.abs((getValue() - other.getValue())/getValue()) < 0.00001;
	
}}
