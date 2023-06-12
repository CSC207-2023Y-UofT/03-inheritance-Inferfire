/* This file contains a few exercises and TODOs for you to fill.
 * Make sure you do the TODOs in Bag.java, HandBag.java and CrossbodyBag.java
 * as the tasks in this file depends on the completion on those!
 */
class BagMain {
    /** DONE -Enhance each of the bags in bags. If d_enhance_handbags is
     * True, then enhance any HandBags a second time.
     * This method should work for *all* Bags! We will test this method
     * on new Bag types (and HandBag subclasses)!
     */
    public static void enhanceBags(Bag[] bags, boolean d_enhance_handbags) {
        for (int i = 0; i < bags.length; i++) { // iterates through each bag
            bags[i].enhance(); // enhances each bag
            if (d_enhance_handbags && bags[i] instanceof HandBag) { // checks
                bags[i].enhance(); // enhances the bags again
            }
        }
    }

    /** Return the total number of straps in CrossbodyBags in bags.
     * Any bag that is not a CrossbodyBag should not be included
     * in the count!
     *
     * @param bags An array of Bags
     * @return The total number of straps of CrossbodyBags.
     */
    public static int countCrossbodyStraps(Bag[] bags) {
        int total = 0;
        for (int j = 0; j < bags.length; j++) { // iterates through each bag
            if (bags[j] instanceof CrossbodyBag) { // checks for CrossbodyBags
                // add number of straps to the total
                total += ((CrossbodyBag) bags[j]).getNumberOfStraps();
            }
        }
        return total;
    }
}
