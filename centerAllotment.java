// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class centerAllotment {
   public centerAllotment() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      String[] var2 = new String[]{"Indore", "Bhopal", "Rewa", "Jabalpur", "Manpur"};
      int[] var3 = new int[5];

      for(int var4 = 0; var4 < var3.length; ++var4) {
         var3[var4] = 2;
      }

      candidate[] var9 = new candidate[10];
      int[] var10 = new int[5];
      int var11 = 0;
      boolean var15 = false;
      boolean var16 = false;

      label100:
      while(true) {
         System.out.println("1 : Profile Registration!");
         System.out.println("2 : Exit!");
         int var8 = var1.nextInt();
         if (var8 == 1) {
            System.out.println("Enter name!");
            String var21 = var1.next();
            System.out.println("Enter mobile number!");
            long var5 = var1.nextLong();
            System.out.println("Enter DOB!");
            String var7 = var1.next();
            System.out.println("Registration successfully! ");
            var16 = true;

            while(true) {
               if (var16) {
                  System.out.println("1 : Choose Centers! ");
               }

               System.out.println("2 : View All Candidates! ");
               System.out.println("3 : View All Centers! ");
               System.out.println("4 : Exit! ");
               int var12 = var1.nextInt();
               switch (var12) {
                  case 1:
                     if (!var16) {
                        break;
                     }

                     System.out.println("Centers List! ");

                     for(int var24 = 0; var24 < var2.length; ++var24) {
                        System.out.println(var24 + 1 + " -- " + var2[var24]);
                     }

                     System.out.println("Select Centers sequentially based on preferance");

                     for(int var25 = 0; var25 < var2.length; ++var25) {
                        System.out.println("Select number of " + (var25 + 1) + " center! ");
                        int var14 = var1.nextInt();
                        var10[var25] = var14 - 1;
                     }

                     for(int var26 = 0; var26 < var10.length; ++var26) {
                        if (var3[var10[var26]] > 0) {
                           --var3[var10[var26]];
                           String var13 = var2[var10[var26]];
                           var9[var11++] = new candidate(var21, var5, var7, var13);
                           System.out.println("Center alloted! ");
                           var15 = true;
                           break;
                        }
                     }

                     if (!var15) {
                        var9[var11++] = new candidate(var21, var5, var7);
                        System.out.println("All seats are full in every selected centers!");
                     }

                     var16 = false;
                     break;
                  case 2:
                     for(candidate var20 : var9) {
                        if (var20 == null) {
                           break;
                        }

                        System.out.println(var20);
                     }
                     break;
                  case 3:
                     for(int var17 = 0; var17 < var2.length; ++var17) {
                        System.out.println(var17 + 1 + " -- " + var2[var17]);
                     }
                     break;
                  case 4:
                     continue label100;
                  default:
                     System.out.println("Invalid Choise! ");
               }
            }
         } else {
            if (var8 == 2) {
               return;
            }

            System.out.println("Invalid choice!");
         }
      }
   }
}
