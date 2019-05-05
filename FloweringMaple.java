/**
* Flowering maple plant class.
* @author Ronnie Kauanoe
* @since 3/1/2019
*/

public class FloweringMaple extends Mallow implements Shrub {
   
   /** Scientific plant name. */
   private static String sciPlantName = "Abutilon menziesii";
   /** Common plant name. */
   private static String commonPlantName = "flowering maple";
   /** Hawaiian plant name. */
   private static String hiPlantName = "ko\'oloa \'ula";
   /** Plant origin. */
   private static String origin = "endemic";
   /** Conservation status. */
   private static String status = "safe";
   /** Plant form. */
   private static String plantForm = SHRUB_TYPE;
   /** Size of plant. */
   private static String plantSize = "medium";
   /** Latitude of plant's location. */
   private static double latitude = 0;
   /** Longitude of plant's location. */
   private static double longitude = 0;
   
   /**
   * Flowering maple constructor without name tag.
   */
   public FloweringMaple() {
      super(sciPlantName, commonPlantName, hiPlantName, "",
      origin, status, plantForm, plantSize,
      Shrub.getMinHeightFromSize(plantSize),
      Shrub.getMaxHeightFromSize(plantSize),
      Shrub.getMinWidthFromSize(plantSize),
      Shrub.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }
      
   /**
   * Flowering maple constructor with name tag.
   * @param nameTag user-defined name for plant
   */
   public FloweringMaple(String nameTag) {
      super(sciPlantName, commonPlantName, hiPlantName, nameTag,
      origin, status, plantForm, plantSize,
      Shrub.getMinHeightFromSize(plantSize),
      Shrub.getMaxHeightFromSize(plantSize),
      Shrub.getMinWidthFromSize(plantSize),
      Shrub.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }   
}