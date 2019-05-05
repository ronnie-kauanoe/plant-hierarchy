/**
* Oahu Riverhemp plant class.
* @author Ronnie Kauanoe
* @since 3/8/2019
*/

public class OahuRiverhemp extends Legume implements Tree {
   
   /** Scientific plant name. */
   private static String sciPlantName = "Sesbania tomentosa";
   /** Common plant name. */
   private static String commonPlantName = "O\'ahu riverhemp";
   /** Hawaiian plant name. */
   private static String hiPlantName = "\'ohai";
   /** Plant origin. */
   private static String origin = "endemic";
   /** Conservation status. */
   private static String status = "endangered";
   /** Plant form. */
   private static String plantForm = TREE_TYPE;
   /** Size of plant. */
   private static String plantSize = "small";
   /** Latitude of plant's location. */
   private static double latitude = 21.271481;
   /** Longitude of plant's location. */
   private static double longitude = -157.801261;
   
   /**
   * Oahu Riverhemp constructor without name tag.
   */
   public OahuRiverhemp() {
      super(sciPlantName, commonPlantName, hiPlantName, "",
      origin, status, plantForm, plantSize,
      Tree.getMinHeightFromSize(plantSize),
      Tree.getMaxHeightFromSize(plantSize),
      Tree.getMinWidthFromSize(plantSize),
      Tree.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }
      
   /**
   * Oahu Riverhemp constructor with name tag.
   * @param nameTag user-defined name for plant
   */
   public OahuRiverhemp(String nameTag) {
      super(sciPlantName, commonPlantName, hiPlantName, nameTag,
      origin, status, plantForm, plantSize,
      Tree.getMinHeightFromSize(plantSize),
      Tree.getMaxHeightFromSize(plantSize),
      Tree.getMinWidthFromSize(plantSize),
      Tree.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }   
}