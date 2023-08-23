import java.util.*;

public class StackImplementation extends Stack{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Push\t2.Pop\t3.Peek\t4.Search\t5.Exit");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1: {
                    System.out.println("Enter element to be inserted: ");
                    int x = sc.nextInt();
                    st.push(x);
                }
                break;
                case 2:{
                    if(st.empty())
                    {
                        System.out.println("Stack is empty");
                    }
                    else
                    {
                        Integer ele = st.pop();
                        System.out.println(ele);
                    }
                }
                break;
                case 3:{
                    if(st.empty())
                    {
                        System.out.println("Stack is empty");
                    }
                    else
                    {
                        System.out.println(st.peek());
                    }
                }
                break;
                case 4:{
                    System.out.println("Enter element to be searched: ");
                    int x = sc.nextInt();
                    System.out.println(st.search(x));
                }
                break;
                case 5: System.exit(0);
                        break;
                default:System.out.println("Invalid input");

            }
        }
    }
}
