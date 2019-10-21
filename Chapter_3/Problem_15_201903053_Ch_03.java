// need Java 9 or upper for sqrt method 

import java.math.*;

public class Main
{
  public static void main (String[]args)
  {
    MathContext mc = new MathContext (4);	// 4 precision
    MathContext mc1 = new MathContext (10);


    // create 2 BigDecimal Objects
    BigDecimal Me, G, R, tenPow, tmp, ans, ans2, ans3;

      Me = new BigDecimal ("5.98");
      G = new BigDecimal ("6.67");
      R = new BigDecimal ("6.98");
      tenPow = new BigDecimal ("10");
      ans3 = new BigDecimal (0, mc);

    // apply pow method on bg1 using mc
      tmp = tenPow.pow (24, mc);

      Me = Me.multiply (tmp);
      tmp = tenPow.pow (-11, mc);

      G = G.multiply (tmp);

      tmp = tenPow.pow (6, mc);
      R = R.multiply (tmp);

      ans = G.multiply (Me);
      ans2 = ans.divide (R, MathContext.DECIMAL64);

      ans3 = ans2.sqrt (mc);

      System.out.print (ans2);
  }
}
