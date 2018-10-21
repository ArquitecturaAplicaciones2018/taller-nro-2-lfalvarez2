import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testRational {
    @Test(expected = IllegalArgumentException.class)
    public void test() {
        Rational r = new Rational(1, 0);
    }

    @Test
    public void testtoString() {
        Rational r = new Rational(1, 5);
        assertEquals("La salida deber ser: 1/5", "1/5", r.toString());
    }

    @Test
    public void testisLessThan(){
        Rational r1 = new Rational(1,6);
        Rational r2 = new Rational(1,2);
        assertEquals("El número menor es: 1/6",true, r1.isLessThan(r2));
    }

    @Test
    public void testgetGreater(){
        Rational r1 = new Rational(1,4);
        Rational r2 = new Rational(1,2);
        assertEquals("El número mayor es: 1/2", r2, r1.getGreater(r2));
    }

    @Test
    public void testplus(){
        Rational r1 = new Rational(2,5);
        Rational r2 = new Rational(3,6);
        assertEquals("El suma es: 9/10","9/10",r1.plus(r2).toString());
    }

    @Test
    public void testminus(){
        Rational r1 = new Rational(3,5);
        Rational r2 = new Rational(2,5);
        assertEquals("La resta es: 1/5","1/5",r1.minus(r2).toString());
    }

    @Test
    public void testtimes(){
        Rational r1 = new Rational(3,2);
        Rational r2 = new Rational(2,5);
        assertEquals("El resultado de la multiplicacion es: 3/5","3/5",r1.times(r2).toString());
    }

    @Test
    public void testdivides(){
        Rational r1 = new Rational(3,2);
        Rational r2 = new Rational(1,8);
        assertEquals("El resultado de la división es: 12","12",r1.divides(r2).toString());
    }


}
