package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        nf.find(new Integer[] {79, 9, 4, 17, 22, 0, -43});

        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());
    }
}
