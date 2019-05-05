/**
* Giant elephant ear plant class.
* @author Ronnie Kauanoe
* @since 3/8/2019
*/

public class GiantElephantEar extends Arum implements Bulb {
   
   /** Scientific plant name. */
   private static String sciPlantName = "Alocasia macrorrhiza";
   /** Common plant name. */
   private static String commonPlantName = "giant elephant ear";
   /** Hawaiian plant name. */
   private static String hiPlantName = "\'ape";
   /** Plant origin. */
   private static String origin = "Polynesian introduced";
   /** Conservation status. */
   private static String status = "safe";
   /** Plant form. */
   private static String plantForm = BULB_TYPE;
   /** Size of plant. */
   private static String plantSize = "large";
   /** Latitude of plant's location. */
   private static double latitude = 21.270106;
   /** Longitude of plant's location. */
   private static double longitude = -157.801726;

   /**
   * Giant elephant ear constructor without name tag.
   */
   public GiantElephantEar() {
      super(sciPlantName, commonPlantName, hiPlantName, "",
      origin, status, plantForm, plantSize,
      Bulb.getMinHeightFromSize(plantSize),
      Bulb.getMaxHeightFromSize(plantSize),
      Bulb.getMinWidthFromSize(plantSize),
      Bulb.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }
      
   /**
   * Giant elephant ear constructor with name tag.
   * @param nameTag user-defined name for plant
   */
   public GiantElephantEar(String nameTag) {
      super(sciPlantName, commonPlantName, hiPlantName, nameTag,
      origin, status, plantForm, plantSize,
      Bulb.getMinHeightFromSize(plantSize),
      Bulb.getMaxHeightFromSize(plantSize),
      Bulb.getMinWidthFromSize(plantSize),
      Bulb.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }   
}