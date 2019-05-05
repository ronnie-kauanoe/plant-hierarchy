import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.*;

/**
* Plant Panel class.
* @author Ronnie Kauanoe
* @since 4/10/19
*/
public class PlantPanel extends JPanel {

   /******************** GENERAL PROJECT PANELS ********************/
   /** Contains project title, advising faculty, student. */
   private JPanel titlePanel = new JPanel(new GridLayout(2, 1));
   /** Contains title label. */
   private JPanel titleHeader = new JPanel();
   /** Contains subtitle label. */
   private JPanel subtitleHeader = new JPanel();
   /** Contains left, middle, right columns. */
   private JPanel columns = new JPanel(new GridLayout(1, 3));
   
   /******************** COLUMNS ********************/
   /** Input column. */
   private JPanel inputColumn = new JPanel(new BorderLayout());
   /** UML column. */
   private JPanel umlColumn = new JPanel(new BorderLayout());
   /** Information column. */
   private JPanel informationColumn = new JPanel(new BorderLayout());
   /** Location column. */
   private JPanel locationColumn = new JPanel(new BorderLayout());
   
   /******************** INPUT COLUMN PANELS ********************/
   /** Selection header panel. */
   private JPanel inputHeader = new JPanel();
   /** Contains family panels. */
   private JPanel familyPanels = new JPanel(new GridLayout(3, 2));
   
   //Legume
   /** Legume panel contining header and button panel. */
   private JPanel legumePanel = new JPanel(new BorderLayout());
   /** Contains Legume header. */
   private JPanel legumeHeader = new JPanel();
   /** Contains Legume buttons. */
   private JPanel legumeButtons = new JPanel();
   /** Contains Legume genera and species label. */
   private JPanel legumeMisc = new JPanel();
   
   //Soapberry
   /** Soapberry panel contining header and button panel. */
   private JPanel soapberryPanel = new JPanel(new BorderLayout());
   /** Contains Soapberry header. */
   private JPanel soapberryHeader = new JPanel();
   /** Contains Soapberry buttons. */
   private JPanel soapberryButtons = new JPanel();
   /** Contains Soapberry genera and species label. */
   private JPanel soapberryMisc = new JPanel();

   //Mallow
   /** Mallow panel contining header and button panel. */
   private JPanel mallowPanel = new JPanel(new BorderLayout());
   /** Contains Mallow header. */
   private JPanel mallowHeader = new JPanel();
   /** Contains Mallow buttons. */
   private JPanel mallowButtons = new JPanel();
   /** Contains Mallow genera and species label. */
   private JPanel mallowMisc = new JPanel();
   
   //Arum
   /** Arum panel contining header and button panel. */
   private JPanel arumPanel = new JPanel(new BorderLayout());
   /** Contains Arum header. */
   private JPanel arumHeader = new JPanel();
   /** Contains Arum buttons. */
   private JPanel arumButtons = new JPanel();
   /** Contains Arum genera and species label. */
   private JPanel arumMisc = new JPanel();
   
   //Mulberry
   /** Mulberry panel contining header and button panel. */
   private JPanel mulberryPanel = new JPanel(new BorderLayout());
   /** Contains Mulberry header. */
   private JPanel mulberryHeader = new JPanel();
   /** Contains Mulberry buttons. */
   private JPanel mulberryButtons = new JPanel();
   /** Contains Mulberry genera and species label. */
   private JPanel mulberryMisc = new JPanel();
   
   //Morning Glory
   /** Morning Glory panel contining header and button panel. */
   private JPanel morningGloryPanel = new JPanel(new BorderLayout());
   /** Contains Morning Glory header. */
   private JPanel morningGloryHeader = new JPanel();
   /** Contains Morning Glory buttons. */
   private JPanel morningGloryButtons = new JPanel();
   /** Contains Morning Glory genera and species label. */
   private JPanel morningGloryMisc = new JPanel();

   /** Array of family panels. */
   private JPanel[] families = {legumePanel, soapberryPanel,
      mallowPanel, arumPanel, mulberryPanel, morningGloryPanel};
   /** Array of plant header panels. */
   private JPanel[] plantHeaderPanels = {legumeHeader, soapberryHeader,
      mallowHeader, arumHeader, mulberryHeader, morningGloryHeader};
   /** Array of button panels. */
   private JPanel[] buttonPanels = {legumeButtons, soapberryButtons,
      mallowButtons, arumButtons, mulberryButtons, morningGloryButtons};
   /** Array of miscellaneous panels. */
   private JPanel[] miscPanels = {legumeMisc, soapberryMisc,
      mallowMisc, arumMisc, mulberryMisc, morningGloryMisc};

   /******************** UML COLUMN PANELS ********************/
   /** Contains UML title label. */
   private JPanel umlHeader = new JPanel();
   /** Contains UML image label. */
   private JPanel umlImagePanel = new JPanel(new GridBagLayout());
   /** Contains UML information label. */
   private JPanel umlInfoPanel = new JPanel(new GridBagLayout());

   /******************** INFORMATION COLUMN PANELS ********************/
   /** Contains plant information title label. */
   private JPanel informationHeader = new JPanel();
   /** Contains plant image label. */
   private JPanel plantImagePanel = new JPanel(new GridBagLayout());
   /** Contains plant information. */
   private JPanel informationPanel = new JPanel(new GridBagLayout());
   /** Constraints to center panels with GridBagLayout. */
   private GridBagConstraints gbc = new GridBagConstraints();
            
   /******************** LOCATION COLUMN PANELS ********************/
   /** Contains plant location title. */
   private JPanel locationHeader = new JPanel();
   /** Contains location image and coordinates panels. */
   private JPanel locationPanel = new JPanel(new GridBagLayout());
   /** Contains plant location image label. */
   private JPanel locationImagePanel = new JPanel(new BorderLayout());
   /** Contains plant coordinates label. */
   private JPanel coordinatesPanel = new JPanel(new GridBagLayout());

   /******************** CREDITS PANELS ********************/
   /** Continas credits label. */
   private JPanel creditsPanel = new JPanel();
   /** Credits for plant information and images. */
   private JLabel creditsLabel = new JLabel("<html><div "
       + "style='text-align: center;'>"
       + "Credit to Instructor Mike Ross, Native Plants Hawaii, "
       + "and Missouri Botanical Gardens for plant information "
       + "and Wikimedia Commons for plant images.</html>");

   /******************** GENERAL PROJECT LABELS ********************/
   /** Project title. */
   private JLabel title = new JLabel("Modeling Native Plants"
       + " using Object-Oriented Programming");
   /** Project subtitle. */
   private JLabel subtitle = new JLabel("Advising Faculty: "
       + "Lisa Miller || Student: Ronnie Kauanoe");
   
   /******************** INPUT COLUMN LABELS ********************/
   /** Input column title. */
   private JLabel inputTitle = new JLabel("Please select a plant");
   
   /** Legume common name and scientific name label. */
   private JLabel legumeTitle = new JLabel("<html><div style='text-align: "
       + "center;'>Legume<br><i>Fabaceae</i></html>");
   /** Soapberry common name and scientific name label. */
   private JLabel soapberryTitle = new JLabel("<html><div style='text-align: "
       + "center;'>Soapberry<br><i>Sapindaceae</i></html>");
   /** Mallow common name and scientific name label. */
   private JLabel mallowTitle = new JLabel("<html><div style='text-align: "
       + "center;'>Mallow<br><i>Malvaceae</i></html>");
   /** Arum common name and scientific name label. */
   private JLabel arumTitle = new JLabel("<html><div style='text-align: "
       + "center;'>Arum<br><i>Araceae</i></html>");
   /** Mulberry common name and scientific name label. */
   private JLabel mulberryTitle = new JLabel("<html><div style='text-align: "
       + "center;'>Mulberry<br><i>Moraceae</i></html>");
   /** Morning Glory common name and scientific name label. */
   private JLabel morningGloryTitle = new JLabel("<html><div style='text-align:"
       + " center;'>Morning Glory<br><i>Convolvulaceae</i></html>");
   /** Array of family title labels. */
   private JLabel[] familyTitles = {legumeTitle, soapberryTitle,
      mallowTitle, arumTitle, mulberryTitle, morningGloryTitle};

   /** Legume genera and species counts label. */
   private JLabel legumeGenSpec = new JLabel();
   /** Soapberry genera and species counts label. */
   private JLabel soapberryGenSpec = new JLabel();
   /** Mallow genera and species counts label. */
   private JLabel mallowGenSpec = new JLabel();
   /** Arum genera and species counts label. */
   private JLabel arumGenSpec = new JLabel();
   /** Mulberry genera and species counts label. */
   private JLabel mulberryGenSpec = new JLabel();
   /** Morning Glory genera and species counts label. */
   private JLabel morningGloryGenSpec = new JLabel();
   /** Array of family genera and species labels. */   
   private JLabel[] genSpecCounts = {legumeGenSpec, soapberryGenSpec,
      mallowGenSpec, arumGenSpec, mulberryGenSpec, morningGloryGenSpec};

   /******************** UML COLUMN LABELS ********************/
   /** UML column title. */
   private JLabel umlTitle = new JLabel("UML Representation");
   /** UML image label. */
   private JLabel umlImageLabel = new JLabel();
   /** UML desciption label. */
   private JLabel umlDescription = new JLabel("UML information appears here.");
   
   /******************** PLANT INFORMATION LABELS ********************/
   /** Plant information column title. */
   private JLabel informationTitle = new JLabel("Plant Information");
   /** Plant image label. */
   private JLabel plantImageLabel = new JLabel();
   /** Plant information label. */
   private JLabel informationBody = new JLabel("Selected plant information"
       + " appears here.");   

   /******************** PLANT LOCATION LABELS ********************/
   /** Plant location label. */
   private JLabel locationTitle = new JLabel("Location");
   /** Plant location image label. */
   private JLabel locationImageLabel = new JLabel();
   /** Plant coordinates label. */
   private JLabel coordinatesLabel = new JLabel("Plant coordinates appear "
       + "here.");   

   /******************** FONTS ********************/
   /** Title font. */
   private Font titleFont = new Font("Times New Roman", Font.BOLD, 40);
   /** Subtitle font. */
   private Font subtitleFont = new Font("Times New Roman", Font.ITALIC, 20);
   /** Column header font. */
   private Font columnHeaderFont = new Font("Times New Roman", Font.BOLD, 35);
   /** Family header font. */
   private Font familyHeaderFont = new Font("Times New Roman", Font.PLAIN, 30);
   /** Button font. */
   private Font buttonFont = new Font("Times New Roman", Font.PLAIN, 20);
   /** Genera and species count font. */
   private Font genSpecCountFont = new Font("Times New Roman", Font.PLAIN, 15);
   /** Plant information font. */
   private Font plantInformationFont = new Font("Times New Roman", 
       Font.PLAIN, 25);

   /******************** COLORS ********************/
   /** Title color, KapCC blue. */
   private Color titleColor = new Color(0, 85, 165);

   /** Default header color on program startup. */
   private Color defaultHeaderColor = new Color(211, 211, 211);
   /** Default body color on program startup. */
   private Color defaultBodyColor = defaultHeaderColor.brighter();

   //Family header colors
   /** Legume header color. */
   private Color legumeHeaderColor = new Color(156, 255, 144);
   /** Soapberry header color. */
   private Color soapberryHeaderColor = new Color(213, 114, 255);
   /** Mallow header color. */
   private Color mallowHeaderColor = new Color(114, 255, 213);
   /** Arum header color. */
   private Color arumHeaderColor = new Color(255, 211, 109);
   /** Mulberry header color. */
   private Color mulberryHeaderColor = new Color(110, 158, 255);
   /** Morning Glory header color. */
   private Color morningGloryHeaderColor = new Color(255, 114, 156);
   /** Array of family header colors. */
   private Color[] familyHeaderColors = {legumeHeaderColor,
       soapberryHeaderColor, mallowHeaderColor, arumHeaderColor,
       mulberryHeaderColor, morningGloryHeaderColor};
   
   //Family body colors.
   /** Legume body color. */
   private Color legumeBodyColor = legumeHeaderColor.brighter();
   /** Soapberry body color. */
   private Color soapberryBodyColor = soapberryHeaderColor.brighter();
   /** Mallow body color. */
   private Color mallowBodyColor = mallowHeaderColor.brighter();
   /** Arum body color. */
   private Color arumBodyColor = arumHeaderColor.brighter();
   /** Mulberry body color. */
   private Color mulberryBodyColor = mulberryHeaderColor.brighter();
   /** Morning Glory body color. */
   private Color morningGloryBodyColor = morningGloryHeaderColor.brighter();
   /** Array of family body colors. */
   private Color[] familyBodyColors = {legumeBodyColor, soapberryBodyColor,
      mallowBodyColor, arumBodyColor, mulberryBodyColor, morningGloryBodyColor};
   
   /******************** PLANT BUTTONS ********************/
   //Legume buttons
   /** Koa button. */
   private JButton koa = new JButton("Koa");
   /** O'ahu Riverhemp button. */
   private JButton oahuRiverhemp = new JButton("O\'ahu Riverhemp");
   /** Hawaiian Coral Tree button. */
   private JButton hwnCoralTree = new JButton("Hawaiian Coral Tree");
   
   //Soapberry buttons
   /** O'ahu Soapberry button. */
   private JButton oahuSoapberry = new JButton("O\'ahu Soapberry");
   /** Hawaiian Soapberry button. */
   private JButton hwnSoapberry = new JButton("Hawaiian Soapberry");
   /** Hopbush button. */
   private JButton hopbush = new JButton("Hopbush");
   
   //Mallow buttons
   /** Hawaiian Cotton button. */
   private JButton hwnCotton = new JButton("Hawaiian Cotton");
   /** Hawaiian Red Hibiscus button. */
   private JButton hwnRedHibiscus = new JButton("Hawaiian Red Hibiscus");
   /** Flowering Maple button. */
   private JButton floweringMaple = new JButton("Flowering Maple");
   
   //Arum buttons 
   /** Taro button. */
   private JButton taro = new JButton("Taro");
   /** Giant Elephant Ear button. */
   private JButton giantElephantEar = new JButton("Giant Elephant Ear");
   /** Tarovine button. */
   private JButton tarovine = new JButton("Tarovine");
   
   //Mulberry buttons
   /** Breadfruit button. */
   private JButton breadfruit = new JButton("Breadfruit");
   /** Chinese Banyan button. */
   private JButton chineseBanyan = new JButton("Chinese Banyan");
   /** Indian Banyan button. */
   private JButton indianBanyan = new JButton("Indian Banyan");
   
   //Morning Glory buttons
   /** Sweet Potato button. */
   private JButton sweetPotato = new JButton("Sweet Potato");
   /** Bayhops button. */
   private JButton bayhops = new JButton("Bayhops");
   /** Oval-Leaf Clustervine button. */
   private JButton ovalLeafClustervine = new JButton("Oval-Leaf Clustervine");
   
   /** Array of plant buttons. */
   private JButton[] buttons = {
      koa, oahuRiverhemp, hwnCoralTree,
      oahuSoapberry, hwnSoapberry, hopbush,
      hwnCotton, hwnRedHibiscus, floweringMaple,
      taro, giantElephantEar, tarovine,
      breadfruit, chineseBanyan, indianBanyan,
      sweetPotato, bayhops, ovalLeafClustervine
   };
   
   /** Array of plant objects. */
   private Plant[] plants = {
      new Koa(), new OahuRiverhemp(), new HwnCoralTree(),
      new OahuSoapberry(), new HwnSoapberry(), new Hopbush(),
      new HwnCotton(), new HwnRedHibiscus(), new FloweringMaple(),
      new Taro(), new GiantElephantEar(), new Tarovine(),
      new Breadfruit(), new ChineseBanyan(), new IndianBanyan(),
      new SweetPotato(), new Bayhops(), new OvalLeafClustervine()
   };
   
   /** Array of family names. */
   private String[] familyNames = {
      "<html><div style='text-align: center;'>Legume</html>",
      "<html><div style='text-align: center;'>Soapberry</html>",
      "<html><div style='text-align: center;'>Mallow</html>",
      "<html><div style='text-align: center;'>Arum</html>",
      "<html><div style='text-align: center;'>Mulberry</html>",
      "<html><div style='text-align: center;'>Morning Glory</html>",
   };
   
   /** Array of UML screenshot image file names. */
   private String[] familyImageNames = {
      "legume.jpg", "soapberry.jpg", "mallow.jpg",
      "arum.jpg", "mulberry.jpg", "morningGlory.jpg"
   };
   
   /** Array of plant image file names. */
   private String[] plantImageNames = {
      "koa.jpg", "oahuRiverhemp.jpg", "hwnCoralTree.jpg",
      "oahuSoapberry.jpg", "hwnSoapberry.jpg", "hopbush.jpg",
      "hwnCotton.jpg", "hwnRedHibiscus.jpg", "floweringMaple.jpg",
      "taro.jpg", "giantElephantEar.jpg", "tarovine.jpg",
      "breadfruit.jpg", "chineseBanyan.jpg", "indianBanyan.jpg",
      "sweetPotato.jpg", "bayhops.jpg", "ovalLeafClustervine.jpg"
   };
   
   /** Families' genera counts. */
   private int[] generaCounts = {700, 135, 243, 114, 40, 57};
   /** Families' species counts. */
   private int[] speciesCounts = {20000, 1600, 4225, 3750, 1000, 1600};
      
   /** Dimensions of plant button. */
   private Dimension buttonDimension = new Dimension(230, 40);

   /** Action listener for buttons. */
   private GUIListener listener = new GUIListener();

   /**
   * Plant Panel constructor.
   */
   public PlantPanel() {
      setLayout(new BorderLayout());
      add("North", titlePanel);
      add("Center", columns);
      add("South", creditsPanel);
      
      setupTitle();      
      setupInputColumn();
      setupUMLColumn();
      setupInformationColumn();
      setupLocationColumn();
      formatButtons();      
      
      creditsPanel.add(creditsLabel);
   }
   
   /**
   * Adds and formats project title. 
   */
   private void setupTitle() {
      //Add title and subtitle panels
      titlePanel.add(titleHeader);
      titlePanel.add(subtitleHeader);
      //Add title label
      titleHeader.add(title);
      titleHeader.setBackground(titleColor);
      //Add subtitle label
      subtitleHeader.add(subtitle);
      subtitleHeader.setBackground(titleColor);
      //Formats title font and color
      title.setFont(titleFont);
      title.setForeground(Color.white);
      //Formats subtitle font and color
      subtitle.setFont(subtitleFont);
      subtitle.setForeground(Color.white);
   }
   
   /**
   * Adds and formats input column header and family cards.
   */
   private void setupInputColumn() {
      int bIndex = 0;
      int bLimit = 3;
      
      //Add input column to columns panel.
      columns.add(inputColumn);
      //Add and format input header
      inputColumn.setBorder(BorderFactory.createLineBorder(Color.black));
      inputColumn.add("North", inputHeader);
      inputHeader.add(inputTitle);
      inputHeader.setBackground(Color.white);
      inputTitle.setFont(columnHeaderFont);
      
      //Adds family, plant header, body panels.
      //Fills with appropriate labels and buttons.
      inputColumn.add("Center", familyPanels);
      //Repeats for each family
      for (int index = 0; index < 6; index++) {
         //Add family panel
         familyPanels.add(families[index]);
         families[index].setBorder(BorderFactory.createLineBorder(Color.black));
         //Add header panel
         families[index].add("North", plantHeaderPanels[index]);
         plantHeaderPanels[index].setBackground(familyHeaderColors[index]);
         //Add family title label
         plantHeaderPanels[index].add(familyTitles[index]);
         familyTitles[index].setFont(familyHeaderFont);
         //Add button panel
         families[index].add("Center", buttonPanels[index]);
         buttonPanels[index].setBackground(familyBodyColors[index]);
         //Add buttons to button panel
         for (bIndex = bIndex; bIndex < bLimit; bIndex++) {
            buttonPanels[index].add(buttons[bIndex]);
         }
         //Increments to next family's buttons
         bLimit += 3;
         //Add panel for genera and species label
         families[index].add("South", miscPanels[index]);
         miscPanels[index].setBackground(familyBodyColors[index]);
         //Add genera and species label
         miscPanels[index].add(genSpecCounts[index]);
         genSpecCounts[index].setFont(genSpecCountFont);
         genSpecCounts[index].setText("<html><div style='text-align: center;'>"
             + "<i>Genera: " + String.format("%,d", generaCounts[index])
             + " || Species: " + String.format("%,d", speciesCounts[index])
             + "</i></html>");
      }
   }
   
   /**
   * Adds and formats UML column.
   */
   private void setupUMLColumn() {
      //Add UML column to columns panel.
      columns.add(umlColumn);
      umlColumn.setBorder(BorderFactory.createLineBorder(Color.black));
      //Add header
      umlColumn.add("North", umlHeader);
      umlHeader.setBackground(defaultHeaderColor);
      //Add title label
      umlHeader.add(umlTitle);
      umlTitle.setFont(columnHeaderFont);
      umlColumn.add("Center", umlImagePanel);
      umlImagePanel.setBackground(defaultBodyColor);
      //Add UML image label
      umlImagePanel.add(umlImageLabel, gbc);
      umlColumn.add("South", umlInfoPanel);
      umlInfoPanel.setBackground(defaultBodyColor);
      //Add UML description label
      umlInfoPanel.add(umlDescription, gbc);
      umlDescription.setFont(plantInformationFont);
   }
   
   /**
   * Adds and formats information column.
   */
   private void setupInformationColumn() {
      columns.add(informationColumn);
      informationColumn.setBorder(BorderFactory.createLineBorder(Color.black));
      informationColumn.add("North", informationHeader);
      informationHeader.setBackground(defaultHeaderColor);
      informationHeader.add(informationTitle);
      informationTitle.setFont(columnHeaderFont);
      
      informationColumn.add("Center", plantImagePanel);
      plantImagePanel.setBackground(defaultBodyColor);
      plantImagePanel.add(plantImageLabel, gbc);
      plantImageLabel.setIcon(new ImageIcon(this.getClass()
          .getResource("/plantImages/kccLogo.jpg")));
      
      informationColumn.add("South", informationPanel);
      informationPanel.setBackground(defaultBodyColor);
      informationPanel.add(informationBody, gbc);
      informationBody.setFont(plantInformationFont);
   }
   
   /**
   * Adds and formats location column.
   */
   private void setupLocationColumn() {
      columns.add(locationColumn);
      locationColumn.setBorder(BorderFactory.createLineBorder(Color.black));
      locationColumn.add("North", locationHeader);
      locationHeader.setBackground(defaultHeaderColor);
      locationHeader.add(locationTitle);
      locationTitle.setFont(columnHeaderFont);
      locationColumn.add("Center", locationImagePanel);
      locationImagePanel.add("Center", locationPanel);
      locationPanel.setBackground(defaultBodyColor);
      locationPanel.add(locationImageLabel, gbc);      
      locationImagePanel.add("South", coordinatesPanel);
      coordinatesPanel.setBackground(defaultBodyColor);
      coordinatesPanel.add(coordinatesLabel, gbc);
      coordinatesLabel.setFont(plantInformationFont);
   }
   
   /**
   * Formats all buttons with the same font and dimensions.
   */
   private void formatButtons() {
      for (JButton button : buttons) {
         button.setFont(buttonFont);
         button.setPreferredSize(buttonDimension);
         button.addActionListener(listener);
      }
   }

   /** Class for button input. */
   private class GUIListener implements ActionListener {
      /** 
      * Reads action from button. 
      * @param event Input from user
      */
      public void actionPerformed(ActionEvent event) {
         int familyIndex = 0;
         for (int bIndex = 0; bIndex < 18; bIndex++) {
            if (event.getSource() == buttons[bIndex]) {
               //Sets family index using for loop value
               familyIndex = (int) (bIndex / 3);
            
               //UML column actions
               umlTitle.setText(familyNames[familyIndex]);
               umlHeader.setBackground(familyHeaderColors[familyIndex]);
               umlImagePanel.setBackground(familyBodyColors[familyIndex]);
               umlImageLabel.setIcon(new ImageIcon(this.getClass()
                   .getResource("/umlImages/"
                   + familyImageNames[familyIndex])));
               umlInfoPanel.setBackground(familyBodyColors[familyIndex]);
               umlDescription.setText(plants[bIndex].classDependencies());
                  
               //Information column actions                           
               informationHeader.setBackground(familyHeaderColors[familyIndex]);
               plantImagePanel.setBackground(familyBodyColors[familyIndex]);
               plantImageLabel.setIcon(new ImageIcon(this.getClass()
                   .getResource("/plantImages/" + plantImageNames[bIndex])));
               informationPanel.setBackground(familyBodyColors[familyIndex]);
               informationBody.setText(plants[bIndex].toStringHTML());   
                     
               //Location column actions         
               locationHeader.setBackground(familyHeaderColors[familyIndex]);
               locationPanel.setBackground(familyBodyColors[familyIndex]);
               
               if (plants[bIndex].foundAtKCC()) {
                  locationImageLabel.setIcon(new ImageIcon(this.getClass()
                      .getResource("/locationImages/"
                      + plantImageNames[bIndex])));
               } else {
                  locationImageLabel.setIcon(new ImageIcon(this.getClass()
                      .getResource("/locationImages/notfound.jpg")));
               }
               
               coordinatesPanel.setBackground(familyBodyColors[familyIndex]);
               coordinatesLabel.setText(plants[bIndex].coordinatesHTML());
            }
         }
      }
   }
}