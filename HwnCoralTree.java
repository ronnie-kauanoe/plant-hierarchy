/**
* Hawaiian Coral Tree plant class.
* @author Ronnie Kauanoe
* @since 3/1/2019
*/

public class HwnCoralTree extends Legume implements Tree {
   
   /** Scientific plant name. */
   private static String sciPlantName = "Erythrina sandwicensis";
   /** Common plant name. */
   private static String commonPlantName = "Hawaiian coral tree";
   /** Hawaiian plant name. */
   private static String hiPlantName = "wiliwili";
   /** Plant origin. */
   private static String origin = "endemic";
   /** Conservation status. */
   private static String status = "endangered";
   /** Plant form. */
   private static String plantForm = TREE_TYPE;
   /** Size of plant. */
   private static String plantSize = "large";
   /** Latitude of plant's location. */
   private static double latitude = 21.272036;
   /** Longitude of plant's location. */
   private static double longitude = -157.800035;
   
   /**
   * Hawaiian Coral Tree constructor without name tag.
   */
   public HwnCoralTree() {
      super(sciPlantName, commonPlantName, hiPlantName, "",
      origin, status, plantForm, plantSize,
      Tree.getMinHeightFromSize(plantSize),
      Tree.getMaxHeightFromSize(plantSize),
      Tree.getMinWidthFromSize(plantSize),
      Tree.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }
      
   /**
   * HwnCoralTree constructor with name tag.
   * @param nameTag user-defined name for plant
   */
   public HwnCoralTree(String nameTag) {
      super(sciPlantName, commonPlantName, hiPlantName, nameTag,
      origin, status, plantForm, plantSize,
      Tree.getMinHeightFromSize(plantSize),
      Tree.getMaxHeightFromSize(plantSize),
      Tree.getMinWidthFromSize(plantSize),
      Tree.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }   
}