/*
   Author: Mustafa Radheyyan
   Course: CS300
   Date: 1/18/2020
   File: Implementation File
   Proj: This file contains the Inventory class.
*/

package com.inventory;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Inventory extends JPanel
{
    public static Inventory inventory;
    private static JFrame frame;
    Scanner input = new Scanner(System.in);
    // Private Fields //
    // The size of the array.
    // final private int ARRAY_SIZE = 5;
    // A reference to the head of the array.
    static final int MAX_ITEMS = 6;
    static final int ITEMS_SQRT = (int) Math.ceil(Math.sqrt(MAX_ITEMS));
    static final int WIDTH_SIZE = 336;
    static final int WIDTH_OFFSET = WIDTH_SIZE / 26;
    static final int HEIGHT_SIZE = 312;
  //  static final double OFFSET = Math.round(HEIGHT_SIZE / Math.pow(ITEMS_SQRT, ITEMS_SQRT));
    static final int SLOT_SIZE = Math.round((Integer.min(WIDTH_SIZE, HEIGHT_SIZE) - (Integer.min(WIDTH_SIZE, HEIGHT_SIZE) / 5)) / ITEMS_SQRT);// (int) OFFSET;
    private Item [] heroInv = new Item[MAX_ITEMS];
    // The name of the location the inventory is in.
    private String location;
    private Boolean InventorySet = false;
    // The maximum amount of items allowed in the inventory
 //   private int MAX_ITEMS;
    // The count of each of the three types of items, and the number of items total.
    private double items, food, tools; //entertainment;
/*
    public static void main( String[] args ) throws Exception  {
        inventory = new Inventory();
        JFrame frame = new JFrame("Inventory");
        frame.add(inventory);
        frame.setSize(WIDTH_SIZE, HEIGHT_SIZE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Scanner input = new Scanner(System.in);
        // An inventory object that will contain the items and the circular linked list of arrays.
        // An Tool object used to invoke the item class methods because that class is abstract.
        Tool add = new Tool();
        // The variable for the menu choices.
        char choice;
        /*
          Quit is for quitting the application, full is for indicating that
          the maximum number of items has been reached.
        */
        boolean quit = false, full = false;

        do {
            // Menu Interface Loop
            System.out.print("\nWhat would you like to do?\n\n");
            // If the inventory is full don't allow adding a new item
            if (!full)
            {
                System.out.print("(A)dd an item, ");
            }
            System.out.println("(D)isplay the inventory in order, A(l)phabetize inventory," +
                    " (S)earch for an item, (R)emove an item, (X)remove all items or (q)uit.\n");

            choice = input.next().charAt(0);

            switch (choice) {
                case 'A':
                case 'a':
                    // If the inventory is full and doesn't allow adding a new item
                    if (!full)
                    {
                        if (add.applyItem(inventory) == -1)
                        {
                            full = true;
                        }
                        else
                        {
                            inventory.repaint();
                        }
                    }
                    break;
                case 'D':
                case 'd':
                    if (inventory.display())
                    {
                        inventory.repaint();
                    }
                    break;
                case 'L':
                case 'l':
                    if (inventory.Alphabetize())
                    {
                        inventory.repaint();
                    }
                    break;
                case 'R':
                case 'r':
                    // If the inventory is full and an item was removed successfully
                    if (inventory.removeItem() && full)
                    {
                        full = false;
                    }
                    inventory.repaint();
                    break;
                case 'S':
                case 's':
                    inventory.search();
                    break;
                case 'X':
                case 'x':
                    if (inventory.removeItems())
                    {
                        inventory.repaint();
                    }
                    full = false;
                    break;
                case 'Q':
                case 'q':
                    System.out.println("Are you sure you want to quit?");
                    choice = input.next().charAt(0);
                    if (choice == 'y')
                    {
                        quit = true;
                    }
                    break;
            }
        } while (!quit);
    }
*/

    public static void main( String[] args ) throws Exception  {
        inventory = new Inventory();
        JFrame frame = new JFrame("Inventory");
        frame.add(inventory);
        frame.setSize(WIDTH_SIZE, HEIGHT_SIZE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Scanner input = new Scanner(System.in);
        // An inventory object that will contain the items and the circular linked list of arrays.
        // An Tool object used to invoke the item class methods because that class is abstract.
        Tool add = new Tool();
        // The variable for the menu choices.
        char choice;
        /*
          Quit is for quitting the application, full is for indicating that
          the maximum number of items has been reached.
        */
        boolean quit = false, full = false;

        do {
            // Menu Interface Loop
            System.out.print("\nWhat would you like to do?\n\n");
            // If the inventory is full don't allow adding a new item
            if (!full)
            {
                System.out.print("(A)dd an item, ");
            }
            System.out.println("(D)isplay the inventory in order, A(l)phabetize inventory," +
                    " (S)earch for an item, (R)emove an item, (X)remove all items or (q)uit.\n");

            choice = input.next().charAt(0);

            switch (choice) {
                case 'A':
                case 'a':
                    // If the inventory is full and doesn't allow adding a new item
                    if (!full)
                    {
                        if (add.applyItem(inventory) == -1)
                        {
                            full = true;
                        }
                        else
                        {
                            inventory.repaint();
                        }
                    }
                    break;
                case 'D':
                case 'd':
                    if (inventory.display())
                    {
                        inventory.repaint();
                    }
                    break;
                case 'L':
                case 'l':
                    if (inventory.Alphabetize())
                    {
                        inventory.repaint();
                    }
                    break;
                case 'R':
                case 'r':
                    // If the inventory is full and an item was removed successfully
                    if (inventory.removeItem() && full)
                    {
                        full = false;
                    }
                    inventory.repaint();
                    break;
                case 'S':
                case 's':
                    inventory.search();
                    break;
                case 'X':
                case 'x':
                    if (inventory.removeItems())
                    {
                        inventory.repaint();
                    }
                    full = false;
                    break;
                case 'Q':
                case 'q':
                    System.out.println("Are you sure you want to quit?");
                    choice = input.next().charAt(0);
                    if (choice == 'y')
                    {
                        quit = true;
                    }
                    break;
            }
        } while (!quit);
    }


    // Public Methods
    /*
       Calls on four methods to set their variables using user input,
       sets the rest to 0 and null.
    */

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d =(Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        if (!InventorySet)
        {
            inventory.draw(g2d, SLOT_SIZE); //inventory.getPosX(), inventory.getPosY());
            InventorySet = true;
        }
        else
        {
            inventory.draw(g2d);
        }
    }


    public void draw(Graphics2D g2d)
    {
       int i;
       g2d.setFont(new Font("TimesRoman", Font.PLAIN, 40));
       g2d.setColor(Color.BLACK);
       for (i = 0; i < MAX_ITEMS; ++i) {
           g2d.drawRect(heroInv[i].getPosX(), heroInv[i].getPosY(), SLOT_SIZE, SLOT_SIZE);
       }
        g2d.setColor(Color.BLUE);
        for (i = 0; i < MAX_ITEMS; ++i) {
            g2d.drawString(heroInv[i].getNameInit(), heroInv[i].getPosX() + 25, heroInv[i].getPosY() + 50);
        }
    }


    public void draw(Graphics2D g2d, int line_width)
    {
        int i, j, x, y, power, stop, count = 0, remainder = 0;
        int max = (int) Math.round(Math.sqrt(MAX_ITEMS));
        power = max * max;
        g2d.setColor(Color.BLACK);

        if (power == MAX_ITEMS)
        {
            for (i = 0; i < max; ++i)
            {
                for (j = 0; j < max; ++j)
                {
                    x = i * line_width + WIDTH_OFFSET;
                    y = j * line_width + 5;
                    heroInv[(i * max) + j].setPosX(x);
                    heroInv[(i * max) + j].setPosY(y);

                    g2d.drawRect(x, y, line_width, line_width);
                }
            }
        }
        else
        {
            if (power > MAX_ITEMS)
            {
                remainder = MAX_ITEMS % max;
                stop = max - 1;
            }
            else
            {
                remainder = MAX_ITEMS - (power);
                stop = max;
            }
            for(i = 0; i < stop; ++i) {
                for (j = 0; j < max; ++j)
                {
                    x = i * line_width + WIDTH_OFFSET;
                    y = j * line_width + 5;
                    heroInv[(i * max) + j].setPosX(x);
                    heroInv[(i * max) + j].setPosY(y);

                    g2d.drawRect(x, y, line_width, line_width);
                }
            }
            j = 0;
            while (count != remainder) {
                x = i * line_width + WIDTH_OFFSET;
                y = j * line_width + 5;

                heroInv[j + (max * i)].setPosX(x);
                heroInv[j + (max * i)].setPosY(y);

                g2d.drawRect(x, y, line_width, line_width);
                ++j;
                ++count;
            }
        }
    }

    Inventory()
    {
        //  setLocation();
        //   setMaximum();
        for (int i = 0; i < MAX_ITEMS; ++i) {
            heroInv[i] = new Tool(Items.DEFAULT);
        }
        items = 0;
        food = 0;
        tools = 0;
    }



    /*
        Copies the variables in the inventory class.
     */
    Inventory(Inventory copy)
    {
        int type, i;
        Item [] inv = new Item[MAX_ITEMS];

        for (i = 0; i < MAX_ITEMS; ++i) {
            type = copy.heroInv[i].checkType();
            if (type == 1)
            {
                inv[i] = new Food(copy.heroInv[i]);
            }
            else if (type == 2)
            {
                inv[i] = new Tool(copy.heroInv[i]);
            }
       }
        location = copy.location;
        items = copy.items;
        food = copy.food;
        tools = copy.tools;
       // MAX_ITEMS = copy.MAX_ITEMS;
    }



    /*
        Uses argument to set the location of the inventory.
    */
    public void setLocation(String location)
    {
        this.location = location;
    }



    /*
        Uses user input to set the location of the inventory.
    public void setLocation()
    {
        System.out.println("Where is the inventory located?");
        input = new Scanner(System.in);
        location = input.nextLine();
    }
    */



    public int checkItem(Item add)
    {
        return searchList(add);
    }
    /*
            Checks if the item is already in the inventory

            If it is in the inventory, then its quantity is increased and an
            error is returned.
     */



    public int searchList(Item check)
    {
        int i;
        int found = -1;

        for (i = 0; i < MAX_ITEMS; ++i) {
            if (heroInv[i] != null)
            {
                if (heroInv[i].compareID(check))
                {
                    found = i;
                    break;
                }
            }
        }
        return found;
    }



    public int searchList(String name)
    {
        int i;
        int found = -1;

        for (i = 0; i < MAX_ITEMS; ++i){
            if (heroInv[i] != null && heroInv[i].compareEquality(name) == 0)
            {
                found = i;
                break;
            }
        }
        return found;
    }



    /*
        This method resets the CLL.
    */
    public boolean removeItems()
    {
        if (items > 0)
        {
            System.out.println("All items were removed");
            int i;
            for (i = 0; i < MAX_ITEMS; ++i) {
                heroInv[i].setItem(Items.DEFAULT);
            }
            items = 0;
            tools = 0;
            food = 0;
            return true;
        }
        else
        {
            System.out.println("Your inventory is empty.");
            return false;
        }
    }



    /*
        The method checks if the items in the inventory have
        exceeded the maximum capacity. If they have, then
        false is returned.
    */
    public boolean checkStatus()
    {
        if (items >= MAX_ITEMS)
        {
            System.out.println("Your inventory is at maximum capacity!");
            return false;
        }
        else
        {
            return true;
        }
    }



    /*
        The method sets the passed in venue argument to the
        inventory. If there is room for the venue type, it will be added to
        a location that is appropriately spaced away from the last
        venue of that type that is already in the inventory.
    */
    public int addItem(Item add)
    {
        boolean met = false;
        int type, i;
        int success = 0;
        Item temp2;
        String temp;

        // If the maximum items has been exceeded, return -1.
        if (items >= MAX_ITEMS)
        {
            System.out.println("Your inventory is at maximum capacity!");
            success = -1;
        }
        // If there are no items in the inventory yet, push the item in.
        /*
        else if (items == 0)
        {
          //  heroInv = new Item[MAX_ITEMS];
            heroInv[0] = add;
            heroInv[0].incrementQuantity();
            ++items;

            System.out.println(add.getName() + " successfully added to the inventory.");
            success = 1;
        }
         */
        else
        {
            // Check if the item type is already in the inventory.
            type = checkItem(add);
            if (type >= 0)
            // If it is then continue.
            {
                do
                {
                    System.out.println("You already have one of these ");
                    add.displayName();
                    System.out.println(" in your inventory. Do you want to add another one or cancel? (yes or no)");
                    temp = input.nextLine();

                } while (temp.compareToIgnoreCase("Yes") != 0 &&
                        temp.compareToIgnoreCase("No") != 0);
                if (temp.compareToIgnoreCase("Yes") == 0)
                {
                    heroInv[type].incrementQuantity();
                    success = 1;
                    System.out.println("Item quantity successfully increased.");
                }
                else
                {
                    System.out.println("Item is already in the inventory. Not added.");
                }
            }
            else
            {
                i = 0;
                while (!met && i < MAX_ITEMS)
                {
                    if (heroInv[i].checkType() == 0)
                    {
                        met = true;
                    }
                    else
                    {
                        ++i;
                    }
                }
                temp2 = heroInv[i];
                heroInv[i] = add;
                heroInv[i].copyPos(temp2);
                heroInv[i].incrementQuantity();
                ++items;
                System.out.println(add.getName() + " successfully added to the inventory.");
            }
        }
        if (success == -1)
        {
            return success;
        }
        else
        {
            return add.checkType();
        }
    }



    /*
        This method is a wrapper method to find items with matching name from
        the inventory, using input to determine the venue to be displayed.
    */
    public boolean search()
    {
        String tempName;
        boolean found = false;
        int value;

        if (items == 0)
        {
            System.out.println("Your inventory is empty.");
        }
        else
        {
            input = new Scanner(System.in);
            System.out.print("What is the name of the venue that you want to search for? ");
            tempName = input.nextLine();

            value = searchList(tempName);

            if (value != -1)
            {
                System.out.println("\nItem found. Here are it's details:\n");
                heroInv[value].display();
                System.out.println();
                found = true;
            }
            else
            {
                System.out.println("There are no items with that name in the inventory.");
            }
        }
        return found;
    }



    /*
        This method is a wrapper method to remove a single venue from
        the inventory, using input to determine the venue to be removed.

        It will call both the method to remove the venue from the
        CLL of arrays as well as the 2-3 tree.

        Afterwards, the venue count will be decremented, and by a larger
        amount than 1 if there was a head node of similar data removed.
    */
    public boolean removeItem()
    {
        String tempName;
        int check = 0;
        boolean success = false;

        if (items == 0)
        {
            System.out.println("Your inventory is empty.");
        }
        else
        {
            input = new Scanner(System.in);
            System.out.print("What is the name of the item that you want to discard? ");
            tempName = input.nextLine();

            // This method will search the array for the venue to be deleted.
            check = searchList(tempName);

            if (check >= 0)
            {
                heroInv[check].setItem(Items.DEFAULT);
                --items;
                System.out.println("Item removed.");
                success = true;
            }
            else
            {
                System.out.println("There are no items with that name in the inventory.");
            }
        }
        return success;
    }



    /*
        This method is a wrapper method to display all of the
        items in the inventory CLL.
    */
    public boolean display()
    {
        int i;

        if (items > 0)
        {
            for (i = 0; i < MAX_ITEMS; ++i) {
                if (heroInv[i].checkType() != 0)
                {
                    heroInv[i].display();
                    System.out.println();
                }
            }
            return true;
        }
        else
        {
            System.out.println("The inventory is empty.");
            return false;
        }
    }



    public boolean Alphabetize()
    {
        int offset, offset1, offset2, lo1, lo2, hi1, hi2, i, j, index;
        Item [] arranged1;
        Item [] arranged2;

        if (items == 0)
        {
            System.out.println("Your inventory is empty.");
            return false;
        }
        else if (items == 1)
        {
            System.out.println("The inventory is already sorted!");
            return true;
        }
        else
        {
            offset = MAX_ITEMS / 2;

            lo1 = 0;
            if (MAX_ITEMS % 2 == 0)
            {
                hi1 = lo1 + offset - 1;
            }
            else
            {
                hi1 = lo1 + offset;
            }
            lo2 = hi1 + 1;
            hi2 = MAX_ITEMS - 1;

            offset1 = (hi1 - lo1) + 1;
            offset2 = (hi2 - lo2) + 1;

            arranged1 = new Item[offset1];
            arranged2 = new Item[offset2];

            AlphabetizeRec(lo1, hi1, arranged1);
            AlphabetizeRec(lo2, hi2, arranged2);

            index = 0;
            i = 0;
            j = 0;
            while (i < offset1 && j < offset2)
            {
                if (arranged1[i] == null)
                {
                    if (arranged2[j] == null)
                    {
                        ++j;
                    }
                    ++i;
                }
                else if (arranged2[j] == null)
                {
                    ++j;
                }
                else
                {
                    if (arranged1[i].compareName(arranged2[j]))
                    {
                        heroInv[index] = arranged2[j];
                        ++j;
                    }
                    else
                    {
                        heroInv[index] = arranged1[i];
                        ++i;
                    }
                    ++index;
                }
            }
            while (i < offset1)
            {
                if (arranged1[i] != null)
                {
                    heroInv[index] = arranged1[i];
                    ++index;
                }
                ++i;
            }
            while (j < offset2)
            {
                if (arranged2[j] != null)
                {
                    heroInv[index] = arranged2[j];
                    ++index;
                }
                ++j;
            }
            if (index < MAX_ITEMS)
            {
                for (i = index; i < MAX_ITEMS; ++i) {
                    heroInv[i] = null;
                }
            }
        }
        return true;
    }


    public void AlphabetizeRec(int low, int high, Item [] des)
    {
        int offset, offset1, offset2, lo1, lo2, hi1, hi2, i, j, index, items = high - low;
        Item [] arranged1;
        Item [] arranged2;

        if (items == 0)
        {
            des[0] = heroInv[low];
        }
        else
        {
            offset = (items) / 2;

            lo1 = low;
            if (items % 2 == 0)
            {
                hi1 = lo1 + offset - 1;
            }
            else
            {
                hi1 = lo1 + offset;
            }
            lo2 = hi1 + 1;
            hi2 = high;

            offset1 = (hi1 - lo1) + 1;
            offset2 = (hi2 - lo2) + 1;

            arranged1 = new Item[offset1];
            arranged2 = new Item[offset2];

            AlphabetizeRec(lo1, hi1, arranged1);
            AlphabetizeRec(lo2, hi2, arranged2);

            index = 0;
            i = 0;
            j = 0;
            while (i < offset1 && j < offset2)
            {
                if (arranged1[i] == null)
                {
                    if (arranged2[j] == null)
                    {
                        ++j;
                    }
                    ++i;
                }
                else if (arranged2[j] == null)
                {
                    ++j;
                }
                else
                {
                    if (arranged1[i].compareName(arranged2[j]))
                    {
                        des[index] = arranged2[j];
                        ++j;
                    }
                    else
                    {
                        des[index] = arranged1[i];
                        ++i;
                    }
                    ++index;
                }
            }
            while (i < offset1)
            {
                if (arranged1[i] != null)
                {
                    des[index] = arranged1[i];
                    ++index;
                }
                ++i;
            }
            while (j < offset2)
            {
                if (arranged2[j] != null)
                {
                    des[index] = arranged2[j];
                    ++index;
                }
                ++j;
            }
        }
    }


    // Protected Methods

    /*
        This method removes the items that share the same name as the passed in string argument.
    */


    // Private Methods
    /*
        Uses input to set the maximum number of items.
    private void setMaximum()
    {
        input = new Scanner(System.in);
        do
        {
            System.out.println("What is the maximum number of items allowed?");
            if (input.hasNextInt())
            {
                MAX_ITEMS = input.nextInt();
            }
            else
            {
                System.out.println("Please type an integer value.");
                input.next();
            }
        } while (MAX_ITEMS <= 0);
    }
    */
}
