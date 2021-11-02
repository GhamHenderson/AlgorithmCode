public class RunClass {
    public static void main(String[] args) {
        StackReferenceBased stack = new StackReferenceBased();

        try {

            // Add items to Stack
            stack.push("Item1");
            stack.push("Item2");
            stack.push("Item3");

            // Peek at item on top of stack
            System.out.println("Current Item on top of Stack = " + stack.peek());
            // Pop item off top of stack and store in a variable.
            String topItem = (String)stack.pop();
            System.out.println("Current Item Being Popped is = " + topItem);
            System.out.println("Is the Stack empty : " + stack.isEmpty());
            stack.popAll();
            System.out.println("Is the Stack empty : " + stack.isEmpty());

            stack.push("Item1");
            stack.push("Item2");
            stack.push("Item3");

            stack.displayStack();
            isBalanced("{{}}", stack);
        }
        catch(StackException e){
            System.out.println("Stack Error, More Info Below");
            e.printStackTrace();
        }
    }

    public static Boolean isBalanced(String s, StackReferenceBased stack) {
        for (int i = 0; i < s.length(); i++) {
            // Counts # of Brackets and puts them on stack
            if (s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                // Check is stack empty
                if (stack.isEmpty()) {
                    System.out.println("Stack is empty");
                }
            }
            if(s.charAt(i) == '}') {
                try {
                    stack.pop();
                } catch (StackException e) {
                    System.out.println("Brackets are not balanced");
                    return false;
                }
            }

        }
            if(!stack.isEmpty()){
                System.out.println("Brackets are not Balanced");
                return false;
            }
            else{
                System.out.println("Brackets are Balanced");
                return true;
            }
    }
}

