/**
* Taro plant class.
* @author Ronnie Kauanoe
* @since 3/8/2019
*/

public class Taro extends Arum implements Bulb {
   
   /** Scientific plant name. */
   private static String sciPlantName = "Colocasia esculenta";
   /** Common plant name. */
   private static String commonPlantName = "taro";
   /** Hawaiian plant name. */
   private static String hiPlantName = "kalo";
   /** Plant origin. */
   private static String origin = "Polynesian introduced";
   /** Conservation status. */
   private static String status = "safe";
   /** Plant form. */
   private static String plantForm = BULB_TYPE;
   /** Size of plant. */
   private static String plantSize = "medium";
   /** Latitude of plant's location. */
   private static double latitude = 21.271164;
   /** Longitude of plant's location. */
   private static double longitude = -157.801621;

   /**
   * Taro constructor without name tag.
   */
   public Taro() {
      super(sciPlantName, commonPlantName, hiPlantName, "",
      origin, status, plantForm, plantSize,
      Bulb.getMinHeightFromSize(plantSize),
      Bulb.getMaxHeightFromSize(plantSize),
      Bulb.getMinWidthFromSize(plantSize),
      Bulb.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }
      
   /**
   * Taro constructor with name tag.
   * @param nameTag user-defined name for plant
   */
   public Taro(String nameTag) {
      super(sciPlantName, commonPlantName, hiPlantName, nameTag,
      origin, status, plantForm, plantSize,
      Bulb.getMinHeightFromSize(plantSize),
      Bulb.getMaxHeightFromSize(plantSize),
      Bulb.getMinWidthFromSize(plantSize),
      Bulb.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }   
}