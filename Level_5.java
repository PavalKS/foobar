import java.math.BigDecimal;
import java.math.BigInteger;
class Solution {
    public static final BigInteger TWO = BigInteger.valueOf(2);
    public static final BigDecimal FACTOR = new BigDecimal("1.4142135623730950488016887242096980785696718753769480731766797379907324784621070388503875343276415727350138462309122970249248360558507372126441214971").subtract(BigDecimal.ONE);

    public static BigInteger beattySequence(BigInteger n) 
    {
        if (n.equals(BigInteger.ZERO)) 
        {
            return BigInteger.ZERO;
        } 
        else 
        {
            BigInteger prime = FACTOR.multiply(new BigDecimal(n)).toBigInteger();
            BigInteger a = n.multiply(prime);
            BigInteger b = n.multiply(n.add(BigInteger.ONE)).divide(TWO);
            BigInteger c = prime.multiply(prime.add(BigInteger.ONE)).divide(TWO);
            return a.add(b).subtract(c).subtract(beattySequence(prime));
        }
    }

    public static String solution(String s) 
    {
        return beattySequence(new BigInteger(s)).toString();
    }
    public static void main(String[] args)
    {
    	System.out.println(solution("77"));
    	System.out.println(solution("5"));
    }
}