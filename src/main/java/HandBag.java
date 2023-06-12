// This file defines a child class named HandBag.
public class HandBag extends Bag{

    /** Creates a new HandBag with the given color and
     * capacity.
     *
     * @param color colour for the bag
     * @param capacity capacity for the bag
     */
    public HandBag(String color, int capacity) {
        super(color, capacity);
    }
    
    // Increase the capacity of this bag by 1.
    @Override
    public void enhance() {
        super.increaseCapacity(1);
    }
}
