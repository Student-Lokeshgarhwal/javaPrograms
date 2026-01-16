
public class longestCommonPrefix {
   public longestCommonPrefix() {
   }

   public static String getlongestCommonPrefix(String[] var0) {
      String var1 = "";
      if (var0.length > 1) {
         for(int var3 = 0; var3 < var0[0].length(); ++var3) {
            char var2 = var0[0].charAt(var3);

            for(int var4 = 1; var4 < var0.length; ++var4) {
               if (var0[var4].length() <= var3) {
                  return var1;
               }

               if (var2 != var0[var4].charAt(var3)) {
                  return var1;
               }
            }

            var1 = var1 + var2;
         }
      } else {
         var1 = var0[0];
      }

      return var1;
   }

   public static void main(String[] var0) {
      String var1 = getlongestCommonPrefix(new String[]{""});
      System.out.println(var1);
   }
}
