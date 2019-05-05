/**
* Koa plant class.
* @author Ronnie Kauanoe
* @since 3/1/2019
*/

public class Koa extends Legume implements Tree {
   
   /** Scientific plant name. */
   private static String sciPlantName = "Acacia koa";
   /** Common plant name. */
   private static String commonPlantName = "koa";
   /** Hawaiian plant name. */
   private static String hiPlantName = "";
   /** Plant origin. */
   private static String origin = "endemic";
   /** Conservation status. */
   private static String status = "safe";
   /** Plant form. */
   private static String plantForm = TREE_TYPE;
   /** Size of plant. */
   private static String plantSize = "large";
   /** Latitude of plant's location. */
   private static double latitude = 21.271663;
   /** Longitude of plant's location. */
   private static double longitude = -157.801179;
   
   /**
   * Koa constructor without name tag.
   */
   public Koa() {
      super(sciPlantName, commonPlantName, hiPlantName, "",
      origin, status, plantForm, plantSize,
      Tree.getMinHeightFromSize(plantSize),
      Tree.getMaxHeightFromSize(plantSize),
      Tree.getMinWidthFromSize(plantSize),
      Tree.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }
      
   /**
   * Koa constructor with name tag.
   * @param nameTag user-defined name for plant
   */
   public Koa(String nameTag) {
      super(sciPlantName, commonPlantName, hiPlantName, nameTag,
      origin, status, plantForm, plantSize,
      Tree.getMinHeightFromSize(plantSize),
      Tree.getMaxHeightFromSize(plantSize),
      Tree.getMinWidthFromSize(plantSize),
      Tree.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }   
}