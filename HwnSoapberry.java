/**
* Hawaiian Soapberry plant class.
* @author Ronnie Kauanoe
* @since 3/1/2019
*/

public class HwnSoapberry extends Soapberry implements Tree {
   
   /** Scientific plant name. */
   private static String sciPlantName = "Sapindus saponaria";
   /** Common plant name. */
   private static String commonPlantName = "Hawaiian soapberry";
   /** Hawaiian plant name. */
   private static String hiPlantName = "m&#257;nele";
   /** Plant origin. */
   private static String origin = "endemic";
   /** Conservation status. */
   private static String status = "safe";
   /** Plant form. */
   private static String plantForm = TREE_TYPE;
   /** Size of plant. */
   private static String plantSize = "large";
   /** Latitude of plant's location. */
   private static double latitude = 21.272078;
   /** Longitude of plant's location. */
   private static double longitude = -157.799451;
   
   /**
   * Hawaiian Soapberry constructor without name tag.
   */
   public HwnSoapberry() {
      super(sciPlantName, commonPlantName, hiPlantName, "",
      origin, status, plantForm, plantSize,
      Tree.getMinHeightFromSize(plantSize),
      Tree.getMaxHeightFromSize(plantSize),
      Tree.getMinWidthFromSize(plantSize),
      Tree.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }
      
   /**
   * Hawaiian Soapberry constructor with name tag.
   * @param nameTag user-defined name for plant
   */
   public HwnSoapberry(String nameTag) {
      super(sciPlantName, commonPlantName, hiPlantName, nameTag,
      origin, status, plantForm, plantSize,
      Tree.getMinHeightFromSize(plantSize),
      Tree.getMaxHeightFromSize(plantSize),
      Tree.getMinWidthFromSize(plantSize),
      Tree.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }   
}