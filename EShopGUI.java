import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class EShopGUI implements ActionListener
{
    private JFrame frame; //Vriable to create the frame
    
    // Variables for the text fild in type JTextField 
    private JTextField theModel;
    private JTextField thePrice;
    private JTextField theWeight;
    private JTextField theSize;
    private JTextField theCredit;
    private JTextField theMemory;
    private JTextField thePhoneNumb;
    private JTextField theDuration;
    private JTextField Download;
    private JTextField DisplayNumber;
    
    //Variables for buttons in type JButton 
    private JButton addPhoneButton;
    private JButton addMp3Button;
    private JButton clearButton;
    private JButton displayAllButton;
    private JButton makeCallButton;
    private JButton downloadMusicButton;
    
    //Creating global variables to be stored in our arrayList 
    private String model; 
    private double price;
    private String size;
    private int weight;
    private float memory;
    private float credit;
    private int phoneNumber;
    private float duration;
    private float download;
    private int displayNumber = -1;
    
    
    //Creating a varible of arraylist type  of string  
    private ArrayList<Gadget> gadgets;
    
    public EShopGUI()
    {
        gadgets = new ArrayList<Gadget>(); // creating the gadget array list
        drawGUI(); // calling the draw GUI to set the window for the GUI
    }
    
    public void drawGUI()
    {
        frame = new JFrame("E-Shop"); //craete the frame window
        frame.setLocation(400,100); //set the location of the frame on the screen 
        
        JMenuBar menuBar = new JMenuBar(); //Create new empty menu bar
        frame.setJMenuBar(menuBar); //set the menu bar to the frame
        
        //File block 
        JMenu fileMenu = new JMenu("File"); // create the file menu
        menuBar.add(fileMenu); // add the file menu to the menu bar
        
        JMenuItem newFileItem = new JMenuItem("New File"); //create a new item
        newFileItem.addActionListener(this); //add the "new file" item to action listener to provide the comand
        fileMenu.add(newFileItem); // add the "new file" item to the file in menu bar menu
        
        JMenuItem openFileItem = new JMenuItem("Open");
        openFileItem.addActionListener(this);
        fileMenu.add(openFileItem);
        
        menuBar.add(Box.createHorizontalStrut(100)); // add a space between the 2 items in menu bar
        //menuBar.add(Box.createHorizontalGlue()); // add maximum available space between 2 menu items
        
        //Help block
        JMenu helpMenu = new JMenu("Help"); // create the file menu
        menuBar.add(helpMenu); // add the file menu to the menu bar
        
        Container contentPane = frame.getContentPane();//create the spase to be filed with butons and fields
        
        BorderLayout borderLayout = new BorderLayout(); //create new border layout
        contentPane.setLayout(borderLayout);  //set the border layout for the content panel
        
        
        //Panel for the North block
        JPanel northPanel = new JPanel(); // crete a new panel 
        contentPane.add(northPanel,BorderLayout.NORTH); // add the north border to the top of the window panel 
        
        northPanel.add(new JLabel("Welcome to Gadget Shop")); // add a label to north borer
        northPanel.setBackground(new Color(120,180,190)); //set the color to the north panel
        
        //Panel for the West block
        JPanel westPanel = new JPanel(); //create a new panel in the left side of the window
        contentPane.add(westPanel,BorderLayout.WEST); // add the west panel to the border layout
        GridLayout westGridLayout = new GridLayout(2,1); //create grid layout in the west bordr of the layout
        westPanel.setLayout(westGridLayout); //seting the grid for the west panel
        westPanel.setBackground(new Color(120,180,190)); //set the color to the west panel
        westPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 15)); //set a space of 15 pixels between west and center panel 
        
        westPanel.add(new JLabel("Store")); // set a label in the west panel
        westPanel.add(new JLabel("Library"));// set a label in the west panel
    
        //Panel for the Center block
        JPanel centerPanel = new JPanel(); //create a new panel in the center of the window
        contentPane.add(centerPanel,BorderLayout.CENTER); //add border layout to the center panel
        centerPanel.setBackground(new Color(120,180,190)); //set color to center panel 
        
        GridLayout gridCenterLayout = new GridLayout(12,2); //create grid layout in the west bordr of the layout
        centerPanel.setLayout(gridCenterLayout);   //set the grid layout to center panel     
        
        //The "model" field block which contains the label  and the text field 
        centerPanel.add(new JLabel("Model:"));//add the "model" label to center panel
        //The "model" text field block
        theModel = new JTextField("Galaxy s23"); //create new text box
        centerPanel.add(theModel); //add the text box to the center panel
        

        //The "price" field block which contains the label  and the field 
        centerPanel.add(new JLabel("Price:"));//add the "price" label to center panel
        //The "price" text field block
        thePrice = new JTextField("452.00");
        centerPanel.add(thePrice);
   
        //The "size" field block which contains the label  and the field
        centerPanel.add(new JLabel("Size:"));//add the "size" label to center panel
        //The "size" text field block
        theSize = new JTextField("108 x 84 x 10");
        centerPanel.add(theSize);
        
        //The "weight" field block which contains the label  and the field
        centerPanel.add(new JLabel("Weight"));
        //The "weight" text field block
        theWeight = new JTextField("173");
        centerPanel.add(theWeight);
        
        //The "credit" field block which contains the label  and the field
        centerPanel.add(new JLabel("Credit"));
        //The "credit" text field block
        theCredit = new JTextField("15.62");
        centerPanel.add(theCredit);
        
        //The "memory" field block which contains the label  and the field
        centerPanel.add(new JLabel("Memory"));
        //The "memory" text field block
        theMemory = new JTextField("128");
        centerPanel.add(theMemory);
        
        //The "phone number" field block which contains the label  and the field
        centerPanel.add(new JLabel("Phone No."));
        //The "phone number" text field block
        thePhoneNumb = new JTextField("+447712345678");
        centerPanel.add(thePhoneNumb);
        
        //The "duration of the song" field block which contains the label  and the field
        centerPanel.add(new JLabel("Duration"));
        //The "duration" text field block
        theDuration = new JTextField("3.22");
        centerPanel.add(theDuration);
        
        //The "download" field block which contains the label  and the field
        centerPanel.add(new JLabel("Download"));
        //The "download" text field block
        Download = new JTextField("5.04");
        centerPanel.add(Download);
        
        //The "display number" field block which contains the label  and the field
        centerPanel.add(new JLabel("DisplayNumber"));
        //The "display number" text field block
        DisplayNumber = new JTextField();
        centerPanel.add(DisplayNumber);
        
        JPanel eastPanel = new JPanel(); //create a new panel in the left side of the window
        contentPane.add(eastPanel,BorderLayout.EAST); // add the west panel to the border layout
        GridLayout eastGridLayout = new GridLayout(3,2); //create grid layout in the west bordr of the layout
        eastPanel.setLayout(eastGridLayout); //seting the grid for the west panel
        eastPanel.setBackground(new Color(210,249,241)); 
        
        //Add new phone button block
        addPhoneButton = new JButton("Add New Phone"); //create new button called "add new phone"
        eastPanel.add(addPhoneButton); //add button to the east panel
        addPhoneButton.addActionListener(this); //connect button to action listener
        
        //Add new mp3 button block
        addMp3Button = new JButton("Add New MP3"); 
        eastPanel.add(addMp3Button);
        addMp3Button.addActionListener(this);
        
        //Add new clear button block
        clearButton = new JButton("Clear");
        eastPanel.add(clearButton);
        clearButton.addActionListener(this);
        
        //Add new display all button block
        displayAllButton = new JButton("Display All");
        eastPanel.add(displayAllButton);
        displayAllButton.addActionListener(this);        
        
        // makeCallButton;
        makeCallButton = new JButton("Call");
        eastPanel.add(makeCallButton);
        makeCallButton.addActionListener(this);
        
        // downloadMusicButton;
        downloadMusicButton = new JButton("Download");
        eastPanel.add(downloadMusicButton);
        downloadMusicButton.addActionListener(this);
        
        frame.pack(); //set minimazed frame
        frame.setVisible(true); // set the visibility of the frame when start the program  
    }
    
    //Creating action listener method to be able to interact with the program from GUI
    public void actionPerformed(ActionEvent event) 
    {
        String command = event.getActionCommand(); //making action listener to read string commands    
        if (command.equals("Add New Phone"))  // add if statement to check what button was pressed
            {
                 captureInfo("Phone");  //calling the "captureInfo" method which has an parameter
            }
        if (command.equals("Add New MP3")) 
            {
                captureInfo("Mp3");
            }   
        if (command.equals("Clear")) // add if statement to check what button was pressed
            {
                Clear();  //calling the "Clear" method which dosen't have a parameter
            }
        if (command.equals("Display All")) // add if statement to check if "Display All" button was pressed 
         {
           System.out.println(numberOfGadgets() + " Gadgets in library"); // print statement which 
           //shows how many gadgets are in arrayList
           System.out.println(); // empty print statement
           System.out.println("The list of gagets is : " + gadgets ); // print statement with list of the gadgets
           System.out.println("------------------");
           System.out.println();
           for (Gadget g : gadgets) //Looping through the gadget list
            {
              Gadget currentGad = g; // assigning the current gadget to a variable
              if (currentGad instanceof Mobile) // cheching if current gadget belongs to Mobile class
                {
                  Mobile mobile = (Mobile) currentGad; // casting the current gadget to Mobile 
                  //so we can accces the mobile methods from the gui class
                  mobile.displayMobAtributes(); // calling displayMobAtributes method 
                  //for the mobile item in arryList through casing from mobile class to display mobiles atributes
                } 
              if (currentGad instanceof Mp3) // cheching if current gadget belongs to Mp3 class
              {
                  Mp3 mp3 = (Mp3) currentGad;// casting the current gadget to Mp3
                  mp3.displayMp3Atributes();// calling displayMp3Atributes method
              }
            }     
         }
        if (command.equals("Call")) // add if statement to check if "Call" button was pressed
        {
            checkDuration(); // calling the check duration method
        }
        if (command.equals("Download"))
        {
            checkMemory();
        }
    }
    
    public int numberOfGadgets() // number of gadgets method
    {
        return gadgets.size(); //returning the size of the arrayList by using the 
        //built-in method on lists .size() 
    }
    
    private void captureInfo(String gadgetType) // capture method which checks if every text field is completed correctly
    //and it is using a parameter to check which gadget to add to gadgetList
    {
        try //using try statement to make the program more error stable and user friendly 
            {
            model = theModel.getText(); //read the text field from GUI and assigning it to a variable  
            if (model.isEmpty()) //Check if the text field is empty
                {
                    //pop-up an informative message for user
                    JOptionPane.showMessageDialog(frame, "The MODEL field is empty. Please insert text."); 
                    return;  //break the program and return to the invoked method
                }
            
            price = Double.parseDouble(thePrice.getText()); //read the text field from GUI, 
            //convert it from string to double and assigning it to variable price
            if (price <= 0) //check if the price is less then 0 
                {
                    //pop-up an informative message for user
                    JOptionPane.showMessageDialog(frame, "The PRICE field is empty or invalid. Please insert a positive number.");
                    return; //break the program and return to the invoked method
                }
            
            size = theSize.getText();//read the text field from GUI and assigning it to variable size  
            if (size.isEmpty()) //Check if the text field is empty
                {
                    //pop-up an informative message for user
                    JOptionPane.showMessageDialog(frame, "The SIZE field is empty. Please insert text.");
                    return; //break the program and return to the invoked method
                }
                
            weight = Integer.parseInt(theWeight.getText());//read the text field from GUI, 
            //convert it from string to integer type and assigning it to variable weight
            if (weight <= 0) //check if the price is less then 0
                {
                    //pop-up an informative message for user
                    JOptionPane.showMessageDialog(frame, "The WEIGHT field is empty or invalid. Please insert a positive number.");
                    return;  //break the program and return to the invoked method
                }

            if (gadgetType.equals("Phone")) //checking gadget type if it is a phone
                {
                    //add a new atribute if the gaget it's a phone
                    credit = Float.parseFloat(theCredit.getText()); //read the text field from GUI,
                    //convert it from string to float type and assigning it to variable credit
                    if (credit <= 0) //check if the credit is less then 0
                        {
                            //pop-up an informative message for user
                            JOptionPane.showMessageDialog(frame, "The CREDIT field is empty or invalid. Please insert a positive number.");
                            return; //break the program and return to the invoked method
                        }
                    addPhone(); //using addPhone method to add new phone to gadget list
                    Clear(); //using clear method to clear the fields
                } 
            else if (gadgetType.equals("Mp3")) //if it is an mp3 the program is executing the next code 
                {
                    //add a new atribute if the gaget it's an mp3
                    memory = Float.parseFloat(theMemory.getText());//read the text field from GUI,
                    //convert it from string to float type and assigning it to variable credit
                    if (memory <= 0) //check if the memory is less then 0
                        {
                            //pop-up an informative message for user
                            JOptionPane.showMessageDialog(frame, "The MEMORY field is empty or invalid. Please insert a positive number.");
                            return; //break the program and return to the invoked method 
                        }
                    addMp3();//using addMp3 method to add new mp3 to gadget list
                    Clear(); //using clear method to clear the fields
                }
            } 
        
        catch (NumberFormatException e) //catch the error without stoping the program
            {
                //pop-up an informative message for user
                JOptionPane.showMessageDialog(frame, "An error occurred while processing the input.");
            }
    }
    
    private void addPhone()
    {
        //the information to create a new gadget
        Gadget newGadget = new Mobile(model, price, weight, size, credit);
        //add the newly created Gadget object to the gadgets ArrayList
        gadgets.add(newGadget);
        System.out.println("+1 Phone added");
        System.out.println("Model: " + model);
        System.out.println("------------------");
        System.out.println(numberOfGadgets() + " Gadgets in library");
        System.out.println();
    }
    
    private void addMp3()
    {
        //the information to create a new gadget
        Gadget newGadget = new Mp3(model, price, weight, size, memory);
        //add the newly created Gadget object to the gadgets ArrayList
        gadgets.add(newGadget);
        System.out.println("+1 MP3 added");
        System.out.println("Model: " + model);
        System.out.println("------------------");
        System.out.println(numberOfGadgets() + " Gadgets in library");
        System.out.println();
    }  
    
    public void Clear() // clear the fields method
    {   
        // set new values to each field in the GUI
        theModel.setText(""); 
        thePrice.setText("");
        theWeight.setText("");
        theSize.setText("");
        theCredit.setText("");
        theMemory.setText("");
        thePhoneNumb.setText("");
        theDuration.setText("");
        Download.setText("");
        DisplayNumber.setText("");
    }
    
    private void checkDuration() // creating Cehckduration method to select: the mobile from the list and make the call
    // the number and to chech if that mobile has enoth credit to make the call 
    {
        try //using try method to make this function user friendly and not brake the program
        {
            phoneNumber = Integer.parseInt(thePhoneNumb.getText()); // convert the text from the GUI to type integer and assign to a global variable
            displayNumber = Integer.parseInt(DisplayNumber.getText());  // convert the text from the GUI to type integer and assign to a global variable
            if (displayNumber >= 0 && displayNumber < gadgets.size())  //add condition to check if the dispaly number was entered correctly
            {
                Gadget gadget = gadgets.get(displayNumber); //serchig for the gadget index in the list  
                if (gadget instanceof Mobile)  // checking if the gadget of that index belongs to mobile devices              
                {
                    Mobile mobile = (Mobile) gadget;  // assignig mobile of tipe gadget to mobile of type mobile              
                    duration = Float.parseFloat(theDuration.getText());  // convert the text from the GUI to type float and assign to a global variable
                    float currCredit = mobile.getCredit(); // creating a new local variable and asign to the method get credit from mobile class
                    if (duration >= 0 && duration <= currCredit)  // checking if the duration is less than the existing credit of the chosen phone from the gadget list
                    {
                        System.out.println("Your initial credit on the phone " + mobile.showModel() + " is: " + currCredit); // printing the initial credit
                        currCredit -= duration; //substract duration from initial credit
                        mobile.setCredit(currCredit); // assign new value after the substraction
                        System.out.println("Making a call from model " + mobile.showModel() + " to number: " + phoneNumber ); // print a message that we are calling a chosen number
                        System.out.println("...");
                        System.out.println("...");
                        System.out.println("...");
                        System.out.println("Your credit on the phone " + mobile.showModel() + " is now: " + currCredit ); // display the remaining credit
                        System.out.println("------------------------------");
                    } 
                    else 
                    {
                        JOptionPane.showMessageDialog(frame, "Try another device or reduce the calling time!"); // popping a message if its not enoth credit
                    }
                }
                else 
                {
                    JOptionPane.showMessageDialog(frame, "The gadget at index " + displayNumber + " is not a mobile device.");
                    System.out.println("The gadget at index " + displayNumber + " is not a mobile device."); // popping a message if chosen device is not an mobile phone
                    System.out.println("------------------");
                    System.out.println();
                }
            }
            else 
            {
                JOptionPane.showMessageDialog(frame, "Invalid mobile index."); // popping a message if the index device is not in the list
            }
        } 
        catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(frame, "An error occurred while processing the input type an integer number please."); // // popping a message if the text fiel is empty 
        }   
    }
    
    private void checkMemory() // creating CehckMemory method to select: the Mp3 from the list and download if that Mp3 has enough memory to dawnload music 
    {
        try //using try method to make this function user friendly and not brake the program
        {
            displayNumber = Integer.parseInt(DisplayNumber.getText());  // convert the text from the GUI to type integer and assign to a global variable
            if (displayNumber >= 0 && displayNumber < gadgets.size())  //add condition to check if the dispaly number was entered correctly
            {
                Gadget gadget = gadgets.get(displayNumber); //serchig for the gadget index in the list  
                if (gadget instanceof Mp3)
                {
                     Mp3 Mp3 = (Mp3) gadget;
                     download = Float.parseFloat(Download.getText());
                     float currMemory = Mp3.getMemory();
                     if (download >= 0 && download <= currMemory)
                     {
                        System.out.println("Your available memory on the Mp3 " + Mp3.showModel() + " is: " + currMemory); // printing the initial memory
                        currMemory -= download; //substract download memory from initial memory
                        Mp3.setMemory(currMemory); // assign new value after the substraction
                        System.out.println("Download music on " + Mp3.showModel()); // print a message that we are downloading music
                        System.out.println("...");
                        System.out.println("Remaning memory on the Mp3 " + Mp3.showModel() + " is now: " + currMemory ); // display the remaining memory
                        System.out.println("------------------------------"); 
                     }
                     else 
                    {
                        JOptionPane.showMessageDialog(frame, "Try another device or reduce the download memory!"); // popping a message if its not enoth memory
                    } 
                }
                else 
                {
                    System.out.println("The gadget at index " + displayNumber + " is not a Mp3 device."); // popping a message if chosen device is not an Mp3
                    System.out.println("------------------");
                    System.out.println();
                }
            }
            else 
            {
                JOptionPane.showMessageDialog(frame, "Invalid Mp3 index."); // popping a message if the index device is not in the list
            }
        } 
        catch (NumberFormatException e) 
        {
            JOptionPane.showMessageDialog(frame, "An error occurred while processing the input type an integer number please."); // // popping a message if the text field is empty 
        }   
    }
    
    public static void main(String[] args) // creating main class to open the app from cmd
    {    
        EShopGUI EShopGUI = new EShopGUI(); //creating a new object EShopGUI of type EShopGUI
    }
}
