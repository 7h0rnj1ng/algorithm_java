public class Solution002 {
    public String replaceSpace(StringBuffer str) {
        /* 统计出空格的个数*/
        int spacenum = 0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i) ==' '){
                spacenum++;
            }
        }
        /*将str设置为新长度的字符串，设置两个指针，从后向前复制*/
        int oldstrlength = str.length();
        int newstrlenlength = oldstrlength+spacenum*2;
        str.setLength(newstrlenlength);
        int oldindex = oldstrlength-1;
        int newindex = newstrlenlength-1;
        for (;oldindex>=0&&oldindex<newstrlenlength;oldindex--) {
            if (str.charAt(oldindex) == ' ') {
                str.setCharAt(newindex--, '0');
                str.setCharAt(newindex--, '2');
                str.setCharAt(newindex--, '%');
            } else {
                str.setCharAt(newindex--, str.charAt(oldindex));
            }

        }
        return str.toString();

    }

    public static void main(String[] args) {

        StringBuffer str = new StringBuffer();
        str.append("hello world ! ");
        Solution002 solution = new Solution002();
        System.out.print(solution.replaceSpace(str));

    }
}
