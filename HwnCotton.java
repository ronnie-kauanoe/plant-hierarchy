/**
* Hawaiian cotton plant class.
* @author Ronnie Kauanoe
* @since 3/1/2019
*/

public class HwnCotton extends Mallow implements Shrub {
   
   /** Scientific plant name. */
   private static String sciPlantName = "Gossypium tomentosum";
   /** Common plant name. */
   private static String commonPlantName = "Hawaiian cotton";
   /** Hawaiian plant name. */
   private static String hiPlantName = "ma\'o";
   /** Plant origin. */
   private static String origin = "endemic";
   /** Conservation status. */
   private static String status = "safe";
   /** Plant form. */
   private static String plantForm = SHRUB_TYPE;
   /** Size of plant. */
   private static String plantSize = "small";
   /** Latitude of plant's location. */
   private static double latitude = 21.270602;
   /** Longitude of plant's location. */
   private static double longitude = -157.802039;
    
   /**
   * Hawaiian cotton constructor without name tag.
   */
   public HwnCotton() {
      super(sciPlantName, commonPlantName, hiPlantName, "",
      origin, status, plantForm, plantSize,
      Shrub.getMinHeightFromSize(plantSize),
      Shrub.getMaxHeightFromSize(plantSize),
      Shrub.getMinWidthFromSize(plantSize),
      Shrub.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }
      
   /**
   * Hawaiian cotton constructor with name tag.
   * @param nameTag user-defined name for plant
   */
   public HwnCotton(String nameTag) {
      super(sciPlantName, commonPlantName, hiPlantName, nameTag,
      origin, status, plantForm, plantSize,
      Shrub.getMinHeightFromSize(plantSize),
      Shrub.getMaxHeightFromSize(plantSize),
      Shrub.getMinWidthFromSize(plantSize),
      Shrub.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }   
}