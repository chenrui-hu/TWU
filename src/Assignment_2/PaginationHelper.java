package Assignment_2;

import java.util.*;

public class PaginationHelper<I> {

    int itemCount;
    int pageCount;
    int itemsPerPage;
    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.itemCount = collection.size();
        this.pageCount = collection.size() % itemsPerPage != 0 ? collection.size() / itemsPerPage + 1 : collection.size() / itemsPerPage;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return this.itemCount;
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return this.pageCount;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        if (pageIndex >= 0 & pageIndex < this.pageCount) {
            return pageIndex+1 == this.pageCount ? this.itemCount % this.itemsPerPage : this.itemsPerPage;
        }
        else
            return -1;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex >= 0 & itemIndex < this.itemCount) {
            return (itemIndex+1) % this.itemsPerPage == 0 ? (itemIndex+1) / this.itemsPerPage - 1 : (itemIndex+1) / this.itemsPerPage;
        }
        else
            return -1;
    }

    public static void main(String[] args) {
        PaginationHelper<Character> helper = new PaginationHelper(Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'h', 'i', 'j'), 2);
        System.out.println(helper.pageItemCount(0)); // 2
        System.out.println(helper.pageItemCount(4));  // 1
        System.out.println(helper.pageItemCount(5));  // -1

        System.out.println(helper.pageIndex(5)); // 2
        System.out.println(helper.pageIndex(2)); // 1
        System.out.println(helper.pageIndex(20)); // -1
        System.out.println(helper.pageIndex(-10)); // -1
    }
}

