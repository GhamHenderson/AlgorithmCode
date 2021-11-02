public class RunClass {
    public static void main(String[] args) {
        ListReferenceBased refBased = new ListReferenceBased();

        refBased.isEmpty();
        refBased.add(1,1);
        refBased.add(2, 2);
        refBased.add(3, 3);
        refBased.add(4, 4);
        System.out.println("Size of List = " + refBased.size());
        refBased.remove(4);
        refBased.displayList();
        refBased.listLargest();
    }
}
