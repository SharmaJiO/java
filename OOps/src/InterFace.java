import java.util.*;
public class InterFace {

    interface herbivore{
        void veg();
    }
    interface carnivore{
        void nonveg();
    }

    public static  class deer implements herbivore ,carnivore{
        public void veg(){
            System.out.println("eats only veg");
        }

        public void nonveg(){
            System.out.println("eat non-veg");
        }
    }
    public static void main(String[] args) {
deer d = new deer();
d.veg();
    }
}
