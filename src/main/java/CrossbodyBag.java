// This file defines a child class named CrossbodyBag.

public class CrossbodyBag extends Bag {
    // need var for number of straps; Str color + int capacity from super
    private int numberOfStraps;

    /** constructor for CrossbodyBag
     * @param color colour for the bag
     * @param capacity capacity for the bag
     * @param numberOfStraps number of strap(s) for the bag
     */
    public CrossbodyBag(String color, int capacity, int numberOfStraps) {
        super(color, capacity);  // calling bag's constructor (parent)
        this.numberOfStraps = numberOfStraps;  // # of strap(s) attribute
    }

    // getter function
    public int getNumberOfStraps() {
        return this.numberOfStraps;
    }

    // enhance method overriding -increasing capacity by 2 instead
    @Override
    public void enhance() {
        super.increaseCapacity(2); // capacity increased by 2
    }

    // toString overriding -replacing Bag with Crossbody Bag w/ {# of Straps}"
    @Override
    public String toString() {
        String rep_L = "Crossbody Bag with " + this.numberOfStraps + " straps";
        return super.toString().replace("Bag", rep_L);
    }
}
