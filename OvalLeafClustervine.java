/**
* Oval leaf clustervine plant class.
* @author Ronnie Kauanoe
* @since 3/8/2019
*/

public class OvalLeafClustervine extends MorningGlory implements Perennial {
   
   /** Scientific plant name. */
   private static String sciPlantName = "Jacquemontia sandwicensis";
   /** Common plant name. */
   private static String commonPlantName = "oval leaf clustervine";
   /** Hawaiian plant name. */
   private static String hiPlantName = "p&#257;\'&#363;ohi\'iaka";
   /** Plant origin. */
   private static String origin = "indigenous";
   /** Conservation status. */
   private static String status = "safe";
   /** Plant form. */
   private static String plantForm = PERENNIAL_TYPE;
   /** Size of plant. */
   private static String plantSize = "small";
   /** Latitude of plant's location. */
   private static double latitude = 21.271360;
   /** Longitude of plant's location. */
   private static double longitude = -157.801371;

   /**
   * Oval leaf clustervine constructor without name tag.
   */
   public OvalLeafClustervine() {
      super(sciPlantName, commonPlantName, hiPlantName, "",
      origin, status, plantForm, plantSize,
      Perennial.getMinHeightFromSize(plantSize),
      Perennial.getMaxHeightFromSize(plantSize),
      Perennial.getMinWidthFromSize(plantSize),
      Perennial.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }
      
   /**
   * Oval leaf clustervine constructor with name tag.
   * @param nameTag user-defined name for plant
   */
   public OvalLeafClustervine(String nameTag) {
      super(sciPlantName, commonPlantName, hiPlantName, nameTag,
      origin, status, plantForm, plantSize,
      Perennial.getMinHeightFromSize(plantSize),
      Perennial.getMaxHeightFromSize(plantSize),
      Perennial.getMinWidthFromSize(plantSize),
      Perennial.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }   
}