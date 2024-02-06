package solidPrinciples.liskov.good;

// dont narrow down functionality of parent class
// if child is there , it needs to use or be applicable for all parent functionalities
// class A is parent of class B  then, using As object with object B ,
// even then it should not break behaviour of parent program
public interface TwoWheeler {
    public void getPrice();
}
