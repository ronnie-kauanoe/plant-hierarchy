/**
* Hawaiian Red Hibiscus plant class.
* @author Ronnie Kauanoe
* @since 3/1/2019
*/

public class HwnRedHibiscus extends Mallow implements Tree {
   
   /** Scientific plant name. */
   private static String sciPlantName = "Hibiscus kokio";
   /** Common plant name. */
   private static String commonPlantName = "Hawaiian red hibiscus";
   /** Hawaiian plant name. */
   private static String hiPlantName = "koki\'o";
   /** Plant origin. */
   private static String origin = "endemic";
   /** Conservation status. */
   private static String status = "safe";
   /** Plant form. */
   private static String plantForm = TREE_TYPE;
   /** Size of plant. */
   private static String plantSize = "small";
   /** Latitude of plant's location. */
   private static double latitude = 21.270611;
   /** Longitude of plant's location. */
   private static double longitude = -157.802021;

   /**
   * Hawaiian Red Hibiscus constructor without name tag.
   */
   public HwnRedHibiscus() {
      super(sciPlantName, commonPlantName, hiPlantName, "",
      origin, status, plantForm, plantSize,
      Tree.getMinHeightFromSize(plantSize),
      Tree.getMaxHeightFromSize(plantSize),
      Tree.getMinWidthFromSize(plantSize),
      Tree.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }
      
   /**
   * Hawaiian Red Hibiscus constructor with name tag.
   * @param nameTag user-defined name for plant
   */
   public HwnRedHibiscus(String nameTag) {
      super(sciPlantName, commonPlantName, hiPlantName, nameTag,
      origin, status, plantForm, plantSize,
      Tree.getMinHeightFromSize(plantSize),
      Tree.getMaxHeightFromSize(plantSize),
      Tree.getMinWidthFromSize(plantSize),
      Tree.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }   
}