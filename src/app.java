public class app
{
    public static void main(String[] arg)
    {
        Encryptor encrypter1 = new Encryptor();
        String k = Encryptor.encrypt("1234");
        System.out.println(k);

        Decrypter decrypter1 = new Decrypter();
        String l = Decrypter.decrypt("0189");
        System.out.println(l);


    }

}
