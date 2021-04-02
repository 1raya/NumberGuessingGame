import java.util.ArrayList;
import java.util.*;

    public class User
    {
        // Private Dynamic Array
        private ArrayList<Integer> choices;

        // Constructor
        public User()
        {
            choices = new ArrayList<Integer>();
        }


        // Get method for private dynamic array
        public ArrayList getChoices()
        {
            return this.choices;
        }

        // Set method for private dynamic array
        public void setChoices(int value)
        {
            this.choices.add(value);
        }
    }

