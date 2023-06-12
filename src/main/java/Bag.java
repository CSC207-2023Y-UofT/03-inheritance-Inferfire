// This file defines an abstract class named Bag.

public abstract class Bag {
    // private vars
    private String color;         // a String named color
    private int numberOfContents; // an int named numberOfContents
    private int capacity;         // an int named capacity
    private String[] contents;    // an array of Strings named contents

    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.numberOfContents = 0;
        this.contents = new String[capacity];
    }

    // getter functions
    public String getColor() {
        return color;
    }

    public int getNumberOfContents() {
        return numberOfContents;
    }

    public int getCapacity() {
        return capacity;
    }

    // setter function
    public void setColor(String color) {
        this.color = color;
    }

    /** DONE Create a method called addItem that takes in a String
     *       representing an item in the Bag.
     *       The item is added into the Bag if the number of items
     *       in the bag is < the capacity of the Bag.
     *       Remember to modify numberOfContents accordingly.
     *       This method should return true if the item was added
     *       and false otherwise.
     */
    public boolean addItem(String item) {
        if (numberOfContents < capacity) {
            contents[numberOfContents] = item;
            numberOfContents++;
            return true;
        }
        return false;
    }

    /** DONE Create a method called popItem that returns a String.
     *       The string should be the last item added to this Bag
     *       and the item should be removed from this Bag.
     *       Remember to modify numberOfContents accordingly.
     * If there are no items in this Bag, return null.
     *
     * @return returns popped item
     */
    public String popItem() {
        if (numberOfContents > 0) {
            String item = contents[numberOfContents - 1];
            contents[numberOfContents - 1] = null;
            numberOfContents--;
            return item;
        }
        return null;
    }

    /** Increase this bag's capacity by n
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        capacity += n;
        String[] newContents = new String[capacity];
        for (int j = 0; j < numberOfContents; j++) {
            newContents[j] = contents[j];
        }
        contents = newContents;
    }

    /** Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return returns string representation of the bag
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /* Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}
