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
