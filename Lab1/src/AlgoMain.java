public class AlgoMain {

    /**
     * @author Graham Henderson
     * @param args
     */
    public static void main(String[] args) {
        ListArrayBased list1 = new ListArrayBased();

        list1.isEmpty();
        list1.add(1,"Milk");
        list1.add(2,"Bread");
        list1.add(3,"Butter");
        list1.add(4,"Ham");

        System.out.println("List Size = " + list1.size());
        System.out.println("Item 1 in List is " + list1.get(1));
        list1.remove(1);
        System.out.println("Is the List Empty : " + list1.isEmpty());
        displayList(list1);
        list1.removeAll();;
        System.out.println("is the list empty : " + list1.isEmpty());
    }

    public static void displayList(ListArrayBased list){
        for(int i = 0; i < list.size(); i++){
            System.out.println("Item " + i + " Is called " + list.get(i + 1));
        }
    }
}
