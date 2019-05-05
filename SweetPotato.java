/**
* Sweet potato plant class.
* @author Ronnie Kauanoe
* @since 3/8/2019
*/

public class SweetPotato extends MorningGlory implements Perennial {
   
   /** Scientific plant name. */
   private static String sciPlantName = "Ipomoea batatas";
   /** Common plant name. */
   private static String commonPlantName = "sweet potato";
   /** Hawaiian plant name. */
   private static String hiPlantName = "\'uala";
   /** Plant origin. */
   private static String origin = "Polynesian introduced";
   /** Conservation status. */
   private static String status = "safe";
   /** Plant form. */
   private static String plantForm = PERENNIAL_TYPE;
   /** Size of plant. */
   private static String plantSize = "small";
   /** Latitude of plant's location. */
   private static double latitude = 21.270545;
   /** Longitude of plant's location. */
   private static double longitude = -157.801432;

   /**
   * Sweet potato constructor without name tag.
   */
   public SweetPotato() {
      super(sciPlantName, commonPlantName, hiPlantName, "",
      origin, status, plantForm, plantSize,
      Perennial.getMinHeightFromSize(plantSize),
      Perennial.getMaxHeightFromSize(plantSize),
      Perennial.getMinWidthFromSize(plantSize),
      Perennial.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }
      
   /**
   * Sweet potato constructor with name tag.
   * @param nameTag user-defined name for plant
   */
   public SweetPotato(String nameTag) {
      super(sciPlantName, commonPlantName, hiPlantName, nameTag,
      origin, status, plantForm, plantSize,
      Perennial.getMinHeightFromSize(plantSize),
      Perennial.getMaxHeightFromSize(plantSize),
      Perennial.getMinWidthFromSize(plantSize),
      Perennial.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }   
}