/**
* Bayhops plant class.
* @author Ronnie Kauanoe
* @since 3/8/2019
*/

public class Bayhops extends MorningGlory implements Perennial {
   
   /** Scientific plant name. */
   private static String sciPlantName = "Ipomoea pes-caprae";
   /** Common plant name. */
   private static String commonPlantName = "bayhops";
   /** Hawaiian plant name. */
   private static String hiPlantName = "puhuehue";
   /** Plant origin. */
   private static String origin = "indigenous";
   /** Conservation status. */
   private static String status = "safe";
   /** Plant form. */
   private static String plantForm = PERENNIAL_TYPE;
   /** Size of plant. */
   private static String plantSize = "medium";
   /** Latitude of plant's location. */
   private static double latitude = 0;
   /** Longitude of plant's location. */
   private static double longitude = 0;
   
   /**
   * Bayhops constructor without name tag.
   */
   public Bayhops() {
      super(sciPlantName, commonPlantName, hiPlantName, "",
      origin, status, plantForm, plantSize,
      Perennial.getMinHeightFromSize(plantSize),
      Perennial.getMaxHeightFromSize(plantSize),
      Perennial.getMinWidthFromSize(plantSize),
      Perennial.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }
      
   /**
   * Bayhops constructor with name tag.
   * @param nameTag user-defined name for plant
   */
   public Bayhops(String nameTag) {
      super(sciPlantName, commonPlantName, hiPlantName, nameTag,
      origin, status, plantForm, plantSize,
      Perennial.getMinHeightFromSize(plantSize),
      Perennial.getMaxHeightFromSize(plantSize),
      Perennial.getMinWidthFromSize(plantSize),
      Perennial.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }   
}