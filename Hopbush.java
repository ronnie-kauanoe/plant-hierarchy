/**
* Hopbush plant class.
* @author Ronnie Kauanoe
* @since 3/1/2019
*/

public class Hopbush extends Soapberry implements Tree {
   
   /** Scientific plant name. */
   private static String sciPlantName = "Dodonaea viscosa";
   /** Common plant name. */
   private static String commonPlantName = "hopbush";
   /** Hawaiian plant name. */
   private static String hiPlantName = "\'a\'ali\'i";
   /** Plant origin. */
   private static String origin = "endemic";
   /** Conservation status. */
   private static String status = "safe";
   /** Plant form. */
   private static String plantForm = TREE_TYPE;
   /** Size of plant. */
   private static String plantSize = "small";
   /** Latitude of plant's location. */
   private static double latitude = 21.270726;
   /** Longitude of plant's location. */
   private static double longitude = -157.802251;

   /**
   * Hopbush constructor without name tag.
   */
   public Hopbush() {
      super(sciPlantName, commonPlantName, hiPlantName, "",
      origin, status, plantForm, plantSize,
      Tree.getMinHeightFromSize(plantSize),
      Tree.getMaxHeightFromSize(plantSize),
      Tree.getMinWidthFromSize(plantSize),
      Tree.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }
      
   /**
   * Hopbush constructor with name tag.
   * @param nameTag user-defined name for plant
   */
   public Hopbush(String nameTag) {
      super(sciPlantName, commonPlantName, hiPlantName, nameTag,
      origin, status, plantForm, plantSize,
      Tree.getMinHeightFromSize(plantSize),
      Tree.getMaxHeightFromSize(plantSize),
      Tree.getMinWidthFromSize(plantSize),
      Tree.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }   
}