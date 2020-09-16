public class app
{

    public static void main(String[] arg)
    {
        Encrypter encrypter1 = new Encrypter();
       String k = Encrypter.encrypt("0189");
        System.out.println(k);

        Decrypter decrypter1 = new Decrypter();
        String l = Decrypter.decrypt("1234");
        System.out.println(l);


    }

}
