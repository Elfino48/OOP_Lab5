public class Fraction {

    int numerator;
    int denumerator;
    double value;

    Fraction ( String val ){
        String dr[] = val.split("/");
        this.denumerator = Integer.valueOf(dr[1]);
        this.numerator = Integer.valueOf(dr[0]);
        value = ((double)numerator/(double)denumerator);
    }

    public double getDouble(){

        return ((double)numerator/(double)denumerator);

    }

    public String toString(){

        return (String.valueOf(value));

    }

    public String show(){

        return (numerator + "/" + denumerator);

    }




}
