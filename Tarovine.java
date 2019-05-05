/**
* Tarovine plant class.
* @author Ronnie Kauanoe
* @since 3/8/2019
*/

public class Tarovine extends Arum implements Vine {
   
   /** Scientific plant name. */
   private static String sciPlantName = "Monstera deliciosa";
   /** Common plant name. */
   private static String commonPlantName = "tarovine";
   /** Hawaiian plant name. */
   private static String hiPlantName = "";
   /** Plant origin. */
   private static String origin = "exortic";
   /** Conservation status. */
   private static String status = "safe";
   /** Plant form. */
   private static String plantForm = VINE_TYPE;
   /** Size of plant. */
   private static String plantSize = "large";
   /** Latitude of plant's location. */
   private static double latitude = 21.271181;
   /** Longitude of plant's location. */
   private static double longitude = -157.801542;

   /**
   * Tarovine constructor without name tag.
   */
   public Tarovine() {
      super(sciPlantName, commonPlantName, hiPlantName, "",
      origin, status, plantForm, plantSize,
      Vine.getMinHeightFromSize(plantSize),
      Vine.getMaxHeightFromSize(plantSize),
      Vine.getMinWidthFromSize(plantSize),
      Vine.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }
      
   /**
   * Tarovine constructor with name tag.
   * @param nameTag user-defined name for plant
   */
   public Tarovine(String nameTag) {
      super(sciPlantName, commonPlantName, hiPlantName, nameTag,
      origin, status, plantForm, plantSize,
      Vine.getMinHeightFromSize(plantSize),
      Vine.getMaxHeightFromSize(plantSize),
      Vine.getMinWidthFromSize(plantSize),
      Vine.getMaxWidthFromSize(plantSize),
      latitude, longitude);
   }   
}