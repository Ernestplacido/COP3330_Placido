
public class Encrypter
{

    public static String encrypt(String number)
    {

        int[] m= makeArray(number);
        int[] j = encryptForm(m);
        int[] l = swapNum(j);
        return readEnc(l);

    }
    private static int[] makeArray(String number)
    {
        int[] arr = new int[4];
        for(int i = 0; i < 4; i++)
        {
            char ch = number.charAt(i);
            arr[i] = Character.getNumericValue(ch);
        }
        return arr;
    }

    private static int[] encryptForm(int[] arr)
    {
        for(int i = 0; i < 4; i++)
        {
            int temp = arr[i];
            temp += 7;
            temp = temp % 10;
            arr[i]=temp;
        }
        return arr;
    }

    private static int[] swapNum(int[] arr)
    {
        int temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;
        temp = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;

        return arr;
    }

    private static String readEnc(int[] arr)
    {
        int num = 0;
        for(int i = 0; i < 4; i++)
            num = num * 10 + arr[i];
        String output = Integer.toString(num);
        if(arr[0] == 0) {
            output = "0" + output;
        }
        return output;
    }
}
