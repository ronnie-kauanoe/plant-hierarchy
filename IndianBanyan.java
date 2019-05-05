/**
* Indian banyan plant class.
* @author Ronnie Kauanoe
* @since 3/8/2019
*/

public class IndianBanyan extends Mulberry implements Evergreen {
   
   /** Scientific plant name. */
   private static String sciPlantName = "Ficus benghalensis";
   /** Common plant name. */
   private static String commonPlantName = "Indian banyan";
   /** Hawaiian plant name. */
   private static String hiPlantName = "";
   /** Plant origin. */
   private static String origin = "exotic";
   /** Conservation status. */
   private static String status = "safe";
   /** Plant form. */
   private static String plantForm = EVERGREEN_TYPE;
   /** Size of plant. */
   private static String plantSize = "large";
   /** Latitude of plant's location. */
   private static double latitude = 21.271789;
   /** Longitude of plant's location. */
   private static double longitude = -157.800513;

   /**
   * Indian banyan constructor without name tag.
   */
   public IndianBanyan() {
      super(sciPlantName, commonPlantName, hiPlantName, "",
      origin, status, plantForm, plantSize,
      Evergreen.getMinHeightFromSize(plantSize),
      Evergreen.getMaxHeightFromSize(plantSize),
      Evergreen.getMinWidthFromSize(plantSize),
      Evergreen.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }
      
   /**
   * Indian banyan constructor with name tag.
   * @param nameTag user-defined name for plant
   */
   public IndianBanyan(String nameTag) {
      super(sciPlantName, commonPlantName, hiPlantName, nameTag,
      origin, status, plantForm, plantSize,
      Evergreen.getMinHeightFromSize(plantSize),
      Evergreen.getMaxHeightFromSize(plantSize),
      Evergreen.getMinWidthFromSize(plantSize),
      Evergreen.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }   
}