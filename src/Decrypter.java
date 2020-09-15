public class Decrypter
{
    public static String decrypt(String number)
    {
        int[] m= makeArray(number);
        int[] l = swapNum(m);
        int[] j = checkNum(l);
        return readDec(j);

    }

    public static int[] makeArray(String number)
    {
        int[] arr = new int[4];
        for(int i = 0; i < 4; i++)
        {
            char ch = number.charAt(i);
            arr[i] = Character.getNumericValue(ch);
        }
        return arr;
    }


    public static int[] swapNum(int[] arr)
    {
        int temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;
        temp = arr[1];
        arr[1] = arr[3];
        arr[3] = temp;

        return arr;
    }

    public static int[] checkNum(int[] arr)
    {
        for(int i = 0; i < 4; i ++)
        {
            int digit = arr[i];
            switch(digit)
            {
                case 0:
                    arr[i] = 3;
                    break;
                case 1:
                    arr[i] = 4;
                    break;
                case 2:
                    arr[i] = 5;
                    break;
                case 3:
                    arr[i] = 6;
                    break;
                case 4:
                    arr[i] = 7;
                    break;
                case 5:
                    arr[i] = 8;
                    break;
                case 6:
                    arr[i] = 9;
                    break;
                case 7:
                    arr[i] = 0;
                    break;
                case 8:
                    arr[i] = 1;
                    break;
                case 9:
                    arr[i] = 2;
                    break;
            }
        }
        return arr;
    }

    public static String readDec(int[] arr)
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
