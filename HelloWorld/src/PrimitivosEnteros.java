public class PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 7;
        System.out.println("numero_Byte = " + numeroByte);
        System.out.println("numero Byte corresponde a " + Byte.BYTES);
        System.out.println("numero Byte corresponde a " + Byte.SIZE);
        System.out.println("valor maximo corresponde a " + Byte.MAX_VALUE);
        System.out.println("valor minimo corresponde a " + Byte.MIN_VALUE);

        short numeroShort=127;
        System.out.println("numero_Short = " + numeroShort);
        System.out.println("numero Short corresponde a " + Short.BYTES);
        System.out.println("numero Short corresponde a " + Short.SIZE);
        System.out.println("valor maximo corresponde a " + Short.MAX_VALUE);
        System.out.println("valor minimo corresponde a " + Short.MIN_VALUE);

        int numeroInt = 32767;
        System.out.println("numero_int = " + numeroInt);
        System.out.println("numero Int corresponde a " + Integer.BYTES);
        System.out.println("numero Int corresponde a " + Integer.SIZE);
        System.out.println("valor maximo corresponde a " + Integer.MAX_VALUE);
        System.out.println("valor minimo corresponde a " + Integer.MIN_VALUE);

        long numeroLong = 2147483648L;
        System.out.println("numero_long = " + numeroLong);
        System.out.println("numero Long corresponde a " + Long.BYTES);
        System.out.println("numero Long corresponde a " + Long.SIZE);
        System.out.println("valor maximo corresponde a " + Long.MAX_VALUE);
        System.out.println("valor minimo corresponde a " + Long.MIN_VALUE);
    }
}
