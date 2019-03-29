public class test {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        str.append("hello world");
        System.out.print(replaceSpace(str));
    }
    public static String replaceSpace(StringBuffer str) {
        char a[] = str.toString().toCharArray();
        int j = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==' ')
            {
                j = j + 2;
            }
        }
        int m = 0;
        char[] b = new char[a.length+j];
        for (int i = 0;i < b.length; i++){
            if (a[m] == ' '){
                b[i] = '%';
                b[i+1] = '2';
                b[i+2] = '0';
                i = i+2;
                m++;
            }
            else {
                b[i] = a[m];
                m++;
            }
        }
        String s = new String(b);
        return s;
    }
}
