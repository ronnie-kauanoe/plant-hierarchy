/**
* Arum family class.
* @author Ronnie Kauanoe
* @since 3/1/2019
*/

public abstract class Arum extends Plant {
   
   /** Scientific family name. */
   private static String sciFamilyName = "Araceae";
   /** Common family name. */
   private static String commonFamilyName = "Arum";
   /** Genera count. */
   private static int generaCount = 114;
   /** Species count. */
   private static int speciesCount = 3750;

   /**
   * Arum constructor.
   * @param sciPlantName Scientific plant name.
   * @param commonPlantName Common plant name.
   * @param hiPlantName Hawaiian plant name.
   * @param nameTag user-given name for the plant.
   * @param origin Origin of the plant.
   * @param status Conservation status of the plant.
   * @param plantForm Form of the plant.
   * @param plantSize Size of the plant.
   * @param minHeight Minimum height of the plant.
   * @param maxHeight Maximum height of the plant.
   * @param minWidth Minimum width/spread of the plant.
   * @param maxWidth Maximum width/spread of the plant.
   * @param latitude Latitude of plant's location.
   * @param longitude Longitude of plant's location. 
   */
   public Arum(String sciPlantName, String commonPlantName,
       String hiPlantName, String nameTag, String origin,
       String status, String plantForm, String plantSize, 
       double minHeight, double maxHeight, double minWidth,
       double maxWidth, double latitude, double longitude) {
      
      super(sciFamilyName, commonFamilyName, generaCount, speciesCount,
       sciPlantName, commonPlantName, hiPlantName, 
       nameTag, origin, status, plantForm, plantSize, minHeight, 
       maxHeight, minWidth, maxWidth, latitude, longitude);
   }
}