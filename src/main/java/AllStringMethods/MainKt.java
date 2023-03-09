package AllStringMethods;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.io.ConsoleKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(
   mv = {1, 8, 0},
   k = 2,
   d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0004"},
   d2 = {"N_FIRST_SYMBOLS", "", "main", "", "Topics-When_expression-Strings_as_objects"}
)
public final class MainKt {
   public static final int N_FIRST_SYMBOLS = 1;

   public static void main() {
      String input = ConsoleKt.readln();
      CharSequence var1 = (CharSequence)input;
      String var10000;
      String var2;
      if (var1.length() > 0) {
         var10000 = input.toLowerCase(Locale.ROOT);
         Intrinsics.checkNotNullExpressionValue(var10000, "this as java.lang.String).toLowerCase(Locale.ROOT)");
         if (StringsKt.first((CharSequence)var10000) == 'i') {
            var2 = StringsKt.drop(input, 1);
            var2 = String.valueOf(Integer.parseInt(var2) + 1);
            System.out.println(var2);
            return;
         }
      }

      var1 = (CharSequence)input;
      if (var1.length() > 0) {
         var10000 = input.toLowerCase(Locale.ROOT);
         Intrinsics.checkNotNullExpressionValue(var10000, "this as java.lang.String).toLowerCase(Locale.ROOT)");
         if (StringsKt.first((CharSequence)var10000) == 's') {
            var2 = StringsKt.drop(input, 1);
            var2 = String.valueOf(StringsKt.reversed((CharSequence)var2).toString());
            System.out.println(var2);
            return;
         }
      }

      System.out.println(input);
   }

   // $FF: synthetic method
   public static void main(String[] var0) {
      main();
   }
}
