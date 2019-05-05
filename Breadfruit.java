/**
* Breadfruit plant class.
* @author Ronnie Kauanoe
* @since 3/8/2019
*/

public class Breadfruit extends Mulberry implements Evergreen {
   
   /** Scientific plant name. */
   private static String sciPlantName = "Artocarpus altilis";
   /** Common plant name. */
   private static String commonPlantName = "breadfruit";
   /** Hawaiian plant name. */
   private static String hiPlantName = "\'ulu";
   /** Plant origin. */
   private static String origin = "Polynesian introduced";
   /** Conservation status. */
   private static String status = "safe";
   /** Plant form. */
   private static String plantForm = EVERGREEN_TYPE;
   /** Size of plant. */
   private static String plantSize = "medium";
   /** Latitude of plant's location. */
   private static double latitude = 21.271330;
   /** Longitude of plant's location. */
   private static double longitude = -157.801168; 

   /**
   * Breadfruit constructor without name tag.
   */
   public Breadfruit() {
      super(sciPlantName, commonPlantName, hiPlantName, "",
      origin, status, plantForm, plantSize,
      Evergreen.getMinHeightFromSize(plantSize),
      Evergreen.getMaxHeightFromSize(plantSize),
      Evergreen.getMinWidthFromSize(plantSize),
      Evergreen.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }
      
   /**
   * Breadfruit constructor with name tag.
   * @param nameTag user-defined name for plant
   */
   public Breadfruit(String nameTag) {
      super(sciPlantName, commonPlantName, hiPlantName, nameTag,
      origin, status, plantForm, plantSize,
      Evergreen.getMinHeightFromSize(plantSize),
      Evergreen.getMaxHeightFromSize(plantSize),
      Evergreen.getMinWidthFromSize(plantSize),
      Evergreen.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }   
}