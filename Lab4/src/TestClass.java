public class TestClass {
    public static void main(String[] args) {
        QueueArrayBased queue = new QueueArrayBased();
        queue.enqueue("Apple");
        queue.enqueue("Orange");
        queue.enqueue("Banana");
        queue.enqueue("Mango");
        System.out.println(queue.peek());
        queue.dequeue();
        System.out.println(queue.peek());
        queue.dequeueAll();
        System.out.println("Que is Empty : " + queue.isEmpty());


        queue.enqueue("Apple");
        queue.enqueue("Orange");
        queue.enqueue("Banana");
        queue.enqueue("Mango");
        queue.displayQueue();
        System.out.println("");
        System.out.println("Is Pal = " + isPal("kayak"));
        System.out.println("Is Pal = " + isPal("Graham"));
    }

    public static boolean isPal(String s){

        QueueArrayBased queue = new QueueArrayBased();
        StackReferenceBased stack = new StackReferenceBased();

        int lenght = s.length();

        for(int i = 0; i < lenght; i++){
            Character nextChar = s.charAt(i);
            queue.enqueue(nextChar);
            stack.push(nextChar);
        }
        boolean charactersAreEqual = true;
        while(!queue.isEmpty() && charactersAreEqual == true){
            Character queueFront = (Character) queue.dequeue();
            Character stackTop = (Character) stack.pop();
            if(queueFront != stackTop){
                charactersAreEqual = false;
            }
        }
        return charactersAreEqual;
    }
}
