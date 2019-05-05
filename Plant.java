import java.util.Random;
import java.text.DecimalFormat;

/**
* Parent superclass for Plant objects.
* @author Ronnie Kauanoe
* @since 2/22/2019
*/

public abstract class Plant {
   
   /** Scientific plant family name. */
   protected String sciFamilyName;
   /** Common plant family name. */
   protected String commonFamilyName;
   /** Genera count of plant family. */
   protected int generaCount;
   /** Species count of plant family. */
   protected int speciesCount;
   /** Scientific plant name. */
   protected String sciPlantName;
   /** Common plant name. */
   protected String commonPlantName;
   /** Hawaiian plant name. */
   protected String hiPlantName;
   /** User-given name for the plant. */
   protected String nameTag;
   /** Origin of the plant. */
   protected String origin;
   /** Conservation status of the plant. */
   protected String status;
   /** Form of the plant. */
   protected String plantForm;
   /** Size of the plant. */
   protected String plantSize;
   /** Height of the plant. */
   protected double height;
   /** Width/Spread of the plant. */
   protected double width;
   /** Latitude of plant's location. */
   protected double latitude;
   /** Longitude of plant's location. */
   protected double longitude;

   /** North point of KCC. */
   private double kccNorth = -157.802251;
   /** South point of KCC. */
   private double kccSouth = -157.799451;
   /** West point of KCC. */
   private double kccWest = 21.269770;
   /** East point of KCC. */
   private double kccEast = 21.272078;

   /**
   * Plant constructor.
   * @param sciFamilyName Scientific plant family name.
   * @param commonFamilyName Common plant family name.
   * @param generaCount Genera count of plant family.
   * @param speciesCount Species count of plant family.
   * @param sciPlantName Scientific plant name.
   * @param commonPlantName Common plant name.
   * @param hiPlantName Hawaiian plant name.
   * @param nameTag user-given name for the plant.
   * @param origin Origin of the plant.
   * @param status Conservation status of the plant.
   * @param plantForm Form of the plant.
   * @param plantSize Size of the plant.
   * @param minHeight Minimum height of the plant.
   * @param maxHeight Maximum height of the plant.
   * @param minWidth Minimum width/spread of the plant.
   * @param maxWidth Maximum width/spread of the plant.
   * @param latitude Latitude of plant's location.
   * @param longitude Longitude of plant's location. 
   */
   public Plant(String sciFamilyName, String commonFamilyName,
       int generaCount, int speciesCount, String sciPlantName,
       String commonPlantName, String hiPlantName, String nameTag,
       String origin, String status, String plantForm,
       String plantSize, double minHeight, double maxHeight,
       double minWidth, double maxWidth, double latitude, 
       double longitude) {
      
      this.sciFamilyName = sciFamilyName;
      this.commonFamilyName = commonFamilyName;
      this.generaCount = generaCount;
      this.speciesCount = speciesCount;
      this.sciPlantName = sciPlantName;
      this.commonPlantName = commonPlantName;
      this.hiPlantName = hiPlantName;
      this.nameTag = nameTag;
      this.origin = origin;
      this.status = status;
      this.plantForm = plantForm;
      this.plantSize = plantSize;
      setHeight(minHeight, maxHeight);
      setWidth(minWidth, maxWidth);
      setLocation(latitude, longitude);
   }
   
   /**
   * Generates and sets random height using min/max heights.
   * @param minH Minimum height.
   * @param maxH Maximum height.
   */
   private void setHeight(double minH, double maxH) {
      Random rand = new Random();
      this.height = minH + (maxH - minH) * rand.nextDouble();
   }
   
   /**
   * Generates and sets random width using min/max widths.
   * @param minW Minimum width.
   * @param maxW Maximum width.
   */
   private void setWidth(double minW, double maxW) {
      Random rand = new Random();
      this.width = minW + (maxW - minW) * rand.nextDouble();
   }

   /** 
   * Sets location of plant.
   * @param lat Latitude of plant location.
   * @param lon Longitude of plant location.
   */
   private void setLocation(double lat, double lon) {
      this.latitude = lat;
      this.longitude = lon;
   }
   
   /**
   * Sets user-given name for the plant.
   * @param newNameTag New name tag for plant.
   */
   public void setNameTag(String newNameTag) {
      this.nameTag = newNameTag;
   }
   
   /**
   * @return Scientific plant family name
   */
   public String getSciFamilyName() {
      return this.sciFamilyName;
   }
   
   /**
   * @return Common plant family name
   */
   public String getCommonFamilyName() {
      return this.commonFamilyName;
   }
   
   /**
   * @return Genera count of plant family
   */
   public int getGeneraCount() {
      return this.generaCount;
   }
   
   /**
   * @return Species count of plant family
   */
   public int getSpeciesCount() {
      return this.speciesCount;
   }
   
   /**
   * @return Scientific plant name
   */
   public String getSciPlantName() {
      return this.sciPlantName;
   }
   
   /**
   * @return Common plant name
   */
   public String getCommonPlantName() {
      return this.commonPlantName;
   }
   
   /**
   * @return Hawaiian plant name
   */
   public String getHiPlantName() {
      return this.hiPlantName;
   }
   
   /**
   * @return User-given name for the plant
   */
   public String getNameTag() {
      return this.nameTag;
   }
   
   /**
   * @return Origin of the plant
   */
   public String getOrigin() {
      return this.origin;
   }
   
   /**
   * @return Conservation status of the plant
   */
   public String getStatus() {
      return this.status;
   }
   
   /**
   * @return Form of the plant
   */
   public String getPlantForm() {
      return this.plantForm;
   }
   
   /**
   * @return Size of the plant
   */
   public String getPlantSize() {
      return this.plantSize;
   }
   
   /**
   * @return Height of the plant
   */
   public double getHeight() {
      return this.height;
   }
   
   /**
   * @return Width of the plant
   */
   public double getWidth() {
      return this.width;
   }
   
   /**
   * @return Latitude of plant's location
   */
   public double getLatitude() {
      return this.latitude;
   }
   
   /**
   * @return Longitude of plant's location
   */
   public double getLongitude() {
      return this.longitude;
   }
   
   /**
   * @return True if plant can be found at KCC
   */
   public boolean foundAtKCC() {
      return this.latitude >= kccWest && this.latitude <= kccEast 
          && this.longitude >= kccNorth && this.longitude <= kccSouth;
   }
   
   /**
   * @return Description of plant.
   */
   public String toString() {
      DecimalFormat sizeFormat = new DecimalFormat("0.00m");
      DecimalFormat coordinatesFormat = new DecimalFormat("###.000000");
      
      String result = "";
      result += "Scientific Name: " + getSciPlantName() + "\n";
      result += "Common Name: " + getCommonPlantName();
      if (!this.hiPlantName.equals("")) {
         result += " | Hawaiian Name: " + getHiPlantName();
      }
      result += "\n";
      if (!this.nameTag.equals("")) {
         result += "Name Tag: " + getNameTag() + "\n";
      }
      result += "Size and form: " + getPlantSize();
      result += " " + getPlantForm() + "\n";       
      result += "Height: " + sizeFormat.format(getHeight()) + "\n";
      result += "Width/Spread: " + sizeFormat.format(getWidth()) + "\n"; 
      result += "Origin: " + getOrigin() + "\n";
      result += "Status: " + getStatus();
      if (foundAtKCC()) {
         result += "\n" + getSciPlantName();
         result += " can be found at Kapiolani Community College";
         result += "\nLatitude: " + coordinatesFormat.format(getLatitude());
         result += " | Longitude: " + coordinatesFormat.format(getLongitude());
      } else {
         result += "\n" + getSciPlantName();
         result += " cannot be found at Kapiolani Community College";
      }
      result += "\n";
      result += "Family: " + getSciFamilyName();
      result += " (" + getCommonFamilyName() + " family)\n";
      result += getCommonFamilyName() + " genera count: ";
      result += getGeneraCount() + "\n";
      result += getCommonFamilyName() + " species count: " + getSpeciesCount();
      return result;
   }
   /**
   * @return Description of plant in HTML.
   */
   public String toStringHTML() {
      String result = "<html><div style='text-align: left;'>";
      result += "Common Name: " + getCommonPlantName() + "<br>";
      if (!this.hiPlantName.equals("")) {
         result += "Hawaiian Name: " + getHiPlantName() + "<br>";
      }
      result += "Scientific Name: <i>" + getSciPlantName() + "</i><br>";
      result += "Size and form: " + getPlantSize();
      result += " " + getPlantForm() + "<br>";       
      result += "Origin: " + getOrigin() + "<br>";
      result += "Status: " + getStatus() + "<br>";
      if (this.hiPlantName.equals("")) {
         result += "<br>";
      }
      result += "<br>";
      result += "</html>";
      return result;
   }
   /** 
   * @return Coordinates of plant in HTML.
   */
   public String coordinatesHTML() {
      DecimalFormat coordinatesFormat = new DecimalFormat("###.000000");
      String result = "<html><div style='text-align: left;'>";
      if (foundAtKCC()) {
         result += "<b>Latitude: " + coordinatesFormat.format(getLatitude());
         result += "</b>";
         result += "<br><b>Longitude: ";
         result += coordinatesFormat.format(getLongitude()) + "</b>";
      } else {
         result += "Not found at Kapiolani Community College<br>";
      }
      result += "<br><br><br><br><br><br></html>";
      return result;
   }               
   
   /**
   * @return Class name, parent class name, and implemented interfaces.
   */
   public String classDependencies() {
      String result = "<html><div style='text-align: left;'>";
      result += "Plant object " + this.getClass().getName();
      result += "<br><br>extends parent class ";
      result += this.getClass().getSuperclass().getName();
      result += "<br><br>implements " + this.getClass().getInterfaces()[0];
      result += "<br><br><br></html>";
      return result;
   }
}